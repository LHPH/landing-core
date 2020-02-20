package com.mkt.core.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mkt.core.model.Message;

public abstract class BaseRule {
	
	private final static Logger LOGGER = LogManager.getLogger();
	
	public static Logger getLogger() {
		
		return LOGGER;
	}
	
	public abstract Message evaluate(String text,BaseRegularExpression exp);

}
