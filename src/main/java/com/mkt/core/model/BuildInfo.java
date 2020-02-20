package com.mkt.core.model;

import com.mkt.core.base.BaseModel;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BuildInfo extends BaseModel{
	
	private String version;
	private String name;
	private String time;
	private String dateDeploy;
	private String dateBuild;
	private String profile;

}
