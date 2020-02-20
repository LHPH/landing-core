package com.mkt.core.service;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.info.BuildProperties;
import org.springframework.stereotype.Service;

import com.mkt.core.base.BaseService;
import com.mkt.core.model.BuildInfo;
import com.mkt.core.util.DateFunctionsUtil;

import static com.mkt.core.constants.ConstantsGeneral.FORMAT_DATE_DAY_MONTH_YEAR_TIME_WITH_SLASH;

@Service
public class BuildInfoService extends BaseService{
	
	@Autowired
	private BuildProperties buildProperties;
	
	@Value("${spring.profiles.active}")
	private String activeProfile;
	
	private Date date;
	
	@PostConstruct
	public void init() {
		date = new Date();
	}
	
	public BuildInfo getBuildInfo() {
		
		BuildInfo buildInfo = new BuildInfo();
		buildInfo.setVersion(buildProperties.getVersion());
		buildInfo.setName(buildProperties.getName());
		buildInfo.setDateDeploy(DateFunctionsUtil.dateToString(date,FORMAT_DATE_DAY_MONTH_YEAR_TIME_WITH_SLASH));
		Date dateBuild = Date.from(buildProperties.getTime());
		buildInfo.setDateBuild(DateFunctionsUtil.dateToString(dateBuild,FORMAT_DATE_DAY_MONTH_YEAR_TIME_WITH_SLASH ));
		buildInfo.setProfile(activeProfile);
		
		getLogger().info("La informacion del build del servicio es {}",buildInfo);
		
		return buildInfo;
	}

}
