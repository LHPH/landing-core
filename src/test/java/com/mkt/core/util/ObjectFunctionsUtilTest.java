package com.mkt.core.util;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.mkt.core.base.BaseTest;
import com.mkt.core.model.LandingApplication;

public class ObjectFunctionsUtilTest extends BaseTest{
	
	@Test
	public void testIsNull() {
		Assert.assertTrue(!ObjectFunctionsUtil.isNull(new Date()));
	}
	
	@Test
	public void testIsNullWhenIsNull() {
		Assert.assertTrue(ObjectFunctionsUtil.isNull(null));
	}
	
	@Test
	public void testSetIfNotNull() {
		
		LandingApplication model = new LandingApplication();
		ObjectFunctionsUtil.setIfNotNull(model::setFolio, 1213);
		Assert.assertTrue(1213==model.getFolio());
	}
	
	@Test
	public void testSetIfNotNullWhenIsNull() {
		
		LandingApplication model = new LandingApplication();
		model.setFolio(1111);
		ObjectFunctionsUtil.setIfNotNull(model::setFolio, null);
		Assert.assertTrue(1111==model.getFolio());
	}

}
