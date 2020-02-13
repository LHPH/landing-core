package com.mkt.core.config;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.ConfigurationFactory;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.builder.api.AppenderComponentBuilder;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilder;
import org.apache.logging.log4j.core.config.builder.api.LayoutComponentBuilder;
import org.apache.logging.log4j.core.config.builder.api.LoggerComponentBuilder;
import org.apache.logging.log4j.core.config.builder.api.RootLoggerComponentBuilder;
import org.apache.logging.log4j.core.config.builder.impl.BuiltConfiguration;


public class LoggerConfig extends ConfigurationFactory {
	
	public static final Level [] LEVEL_DEV = {Level.INFO,Level.INFO,Level.INFO,Level.DEBUG,Level.TRACE,Level.TRACE};
	private Level  []  levelChoose;
	
	public LoggerConfig(Level [] level) {
		levelChoose = level;
	}
	
	@Override
	protected String[] getSupportedTypes() {
		// TODO Auto-generated method stub
		return new String[] {"*"};
	}

	@Override
	public Configuration getConfiguration(LoggerContext loggerContext, ConfigurationSource source) {
		
		ConfigurationBuilder<BuiltConfiguration> builder = super.newConfigurationBuilder();
		
		LayoutComponentBuilder standard = builder.newLayout("PatternLayout");
		standard.addAttribute("pattern", "%d{yyyy-MM-dd HH:mm:ss.SSS} [%t] [%-5level] %c{1.} - %msg%n");
		
		AppenderComponentBuilder console = builder.newAppender("console", "Console");
		
		console.add(standard);
		builder.add(console);
		
		RootLoggerComponentBuilder rootLogger = builder.newRootLogger(levelChoose[0]);
		rootLogger.add(builder.newAppenderRef("console"));
		builder.add(rootLogger);
		
		LoggerComponentBuilder logger = builder.newLogger("com.mkt", levelChoose[1]);
		logger.add(builder.newAppenderRef("console"));
		logger.addAttribute("additivity", false);
		builder.add(logger);
		
		LoggerComponentBuilder logger2 = builder.newLogger("org.springframework", levelChoose[2]);
		logger2.add(builder.newAppenderRef("console"));
		logger2.addAttribute("additivity", false);
		builder.add(logger2);
		
		LoggerComponentBuilder logger3 = builder.newLogger("org.hibernate.SQL", levelChoose[3]);
		logger3.add(builder.newAppenderRef("console"));
		logger3.addAttribute("additivity", false);
		builder.add(logger3);
		
		LoggerComponentBuilder logger4 = builder.newLogger("org.hibernate.type.descriptor.sql", levelChoose[4]);
		logger4.add(builder.newAppenderRef("console"));
		logger4.addAttribute("additivity", false);
		builder.add(logger4);
		
		LoggerComponentBuilder logger5 = builder.newLogger("org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping", levelChoose[5]);
		logger5.add(builder.newAppenderRef("console"));
		logger5.addAttribute("additivity", false);
		builder.add(logger5);
		
		
		return builder.build();
	}
	
}
