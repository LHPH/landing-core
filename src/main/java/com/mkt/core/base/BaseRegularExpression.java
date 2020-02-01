package com.mkt.core.base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BaseRegularExpression {
	
	private String expression;
	private Integer minLength;
	private Integer maxLength;
	private Boolean optional;

}
