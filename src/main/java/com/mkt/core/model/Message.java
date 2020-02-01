package com.mkt.core.model;

import org.springframework.http.HttpStatus;

import com.mkt.core.base.BaseModel;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(chain=true)
public class Message extends BaseModel{

	private String code;
	private String type;
	private String description;
	private HttpStatus status;
	private Object data;
	
}
