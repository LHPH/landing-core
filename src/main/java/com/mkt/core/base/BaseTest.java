package com.mkt.core.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseTest {
	
	private final static Logger LOGGER = LogManager.getLogger();
	
	public static Logger getLogger() {
		
		return LOGGER;
	}

}
