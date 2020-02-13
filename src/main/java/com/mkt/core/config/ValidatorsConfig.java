package com.mkt.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mkt.core.validators.RegularExpressionRule;

@Configuration
public class ValidatorsConfig {
	
	@Bean
	public RegularExpressionRule regularExpressionRule() {
		return new RegularExpressionRule();
	}

}
