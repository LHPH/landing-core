package com.mkt.core.validators;

import com.mkt.core.base.BaseRegularExpression;
import com.mkt.core.base.BaseRule;
import com.mkt.core.model.Message;

import lombok.Getter;
import lombok.Setter;

public class RegularExpressionRule implements BaseRule {
	
	private Message result;
	
	@Setter
	@Getter
	private String text;

	@Override
	public Boolean evaluate(BaseRegularExpression exp) {
		
		if(text!=null && exp.getOptional()) {
			
			if(exp.getMaxLength()<text.length() || exp.getMinLength()>text.length()) {
				
			}
			
			if(!text.matches(exp.getExpression())) {
				
			}
			
			return Boolean.TRUE;
	
		}
		else {
			return !exp.getOptional();
		}
		
	}

	@Override
	public Message result() {
		// TODO Auto-generated method stub
		return result;
	}

}
