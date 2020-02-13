package com.mkt.core.base;

import com.mkt.core.model.Message;

public interface BaseRule {
	
	Message evaluate(String text,BaseRegularExpression exp);

}
