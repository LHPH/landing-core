package com.mkt.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mkt.core.controller.BuildInfoController;
import com.mkt.core.service.BuildInfoService;

@Configuration
@Profile({"dev","prod"})
public class BuildConfig {
	
	@Bean
	public BuildInfoController buildInfoController() {
		return new BuildInfoController();
	}
	
	@Bean
	public BuildInfoService buildInfoService() {
		return new BuildInfoService();
	}
	

}
