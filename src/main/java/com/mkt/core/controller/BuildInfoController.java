package com.mkt.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mkt.core.base.BaseRestController;
import com.mkt.core.model.BuildInfo;
import com.mkt.core.service.BuildInfoService;

import static com.mkt.core.constants.ConstantsGeneral.ENDPOINT_BUILD_INFO;

@RestController
public class BuildInfoController extends BaseRestController{

	@Autowired
	private BuildInfoService buildInfoService;
	
	@GetMapping(ENDPOINT_BUILD_INFO)
	public BuildInfo getBuildInfo() {
		getLogger().info("Consultando version del servicio");
		return buildInfoService.getBuildInfo();
	}
	
}
