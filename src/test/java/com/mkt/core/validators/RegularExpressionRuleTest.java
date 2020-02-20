package com.mkt.core.validators;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mkt.core.base.BaseRegularExpression;
import com.mkt.core.base.BaseTest;
import com.mkt.core.model.Message;

import static com.mkt.core.constants.ConstantsRegularExpression.REGEX_NUMERICS;

public class RegularExpressionRuleTest extends BaseTest{
	
	private BaseRegularExpression exp;
	private RegularExpressionRule rule;
	
	@Before
	public void setUp() {
		exp = new BaseRegularExpression();
		exp.setExpression(REGEX_NUMERICS);
		exp.setMinLength(2);
		exp.setMaxLength(5);
		exp.setOptional(false);
		
		rule = new RegularExpressionRule();
		
	}
	
	@Test
	public void testNullText() {
		
		Message msg = rule.evaluate(null, exp);
		Boolean ind = (Boolean)msg.getData();
		Assert.assertTrue(!ind);
	}
	
	@Test
	public void testEmptyText() {
		
		Message msg = rule.evaluate("", exp);
		Boolean ind = (Boolean)msg.getData();
		Assert.assertTrue(!ind);
	}

	@Test
	public void testFailMinLength() {
		
		Message msg = rule.evaluate("0", exp);
		Boolean ind = (Boolean)msg.getData();
		Assert.assertTrue(!ind);
		
	}
	
	@Test
	public void testFailMaxLength() {
		
		Message msg = rule.evaluate("0123456", exp);
		Boolean ind = (Boolean)msg.getData();
		Assert.assertTrue(!ind);
	}
	
	@Test
	public void testFailExpression() {
		
		Message msg = rule.evaluate("abc", exp);
		Boolean ind = (Boolean)msg.getData();
		Assert.assertTrue(!ind);
	}
	
	@Test
	public void testOptional() {
		
		exp.setOptional(true);
		Message msg = rule.evaluate(null, exp);
		Boolean ind = (Boolean)msg.getData();
		Assert.assertTrue(ind);
	}
}
