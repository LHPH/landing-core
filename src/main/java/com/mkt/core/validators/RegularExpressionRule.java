package com.mkt.core.validators;

import com.mkt.core.base.BaseRegularExpression;
import com.mkt.core.base.BaseRule;
import com.mkt.core.model.Message;

import static com.mkt.core.constants.ConstantsRegularExpression.MESSAGE_ERROR_REQUIRED;

import org.springframework.stereotype.Component;

import static com.mkt.core.constants.ConstantsRegularExpression.MESSAGE_ERROR_PATTERN;
import static com.mkt.core.constants.ConstantsRegularExpression.MESSAGE_ERROR_MAX_MIN_LENGTH;

@Component
public class RegularExpressionRule extends BaseRule {
	

	@Override
	public Message evaluate(String text,BaseRegularExpression exp) {
		
		if(text!=null && !text.isEmpty()) {
			
			if(exp.getMaxLength()<text.length() || exp.getMinLength()>text.length()) {
				
				return new Message().setData(Boolean.FALSE).setDescription(MESSAGE_ERROR_MAX_MIN_LENGTH);
			}
			
			if(!text.matches(exp.getExpression())) {
				
				return new Message().setData(Boolean.FALSE).setDescription(MESSAGE_ERROR_PATTERN);
				
			}
			
		}
		else {
			if(!exp.getOptional()) {
				return new Message().setData(Boolean.FALSE).setDescription(MESSAGE_ERROR_REQUIRED);
			}
		}
		return new Message().setData(Boolean.TRUE);
		
	}
	
}
