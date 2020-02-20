package com.mkt.core.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.mkt.core.base.BaseTest;

@RunWith(MockitoJUnitRunner.class)
public class StringFunctionsUtilTest extends BaseTest{
	
	@Test
	public void testNotNull() {
		Assert.assertNotNull(StringFunctionsUtil.notNull("hello"));
	}
	
	@Test
	public void testNotNullWhenIsNull() {
		Assert.assertNotNull(StringFunctionsUtil.notNull(null));
	}

}
