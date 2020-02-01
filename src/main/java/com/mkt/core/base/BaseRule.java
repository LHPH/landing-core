package com.mkt.core.base;

import com.mkt.core.model.Message;

public interface BaseRule {
	
	Boolean evaluate(BaseRegularExpression exp);
	Message result();

}
