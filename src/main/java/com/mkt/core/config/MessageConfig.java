package com.mkt.core.config;

import static com.mkt.core.constants.ConstantsGeneral.YML_APP_CONFIG_PREFIX;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.mkt.core.model.Message;

@Component
@ConfigurationProperties(prefix=YML_APP_CONFIG_PREFIX)
public class MessageConfig {
	
	private Map<String,Message> messages;

	public Map<String, Message> getMessages() {
		return messages;
	}

	public void setMessages(Map<String, Message> messages) {
		this.messages = messages;
	}
	
	public Message getMessage(String key) {
		return messages.get(key);
	}

}
