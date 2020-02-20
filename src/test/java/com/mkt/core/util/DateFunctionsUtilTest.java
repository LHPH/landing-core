package com.mkt.core.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.mkt.core.base.BaseTest;
import com.mkt.core.util.DateFunctionsUtil;
import static com.mkt.core.constants.ConstantsGeneral.FORMAT_DATE_YEAR_MONTH_DAY_WITH_UNDERSCORE_SPANISH;
import static com.mkt.core.constants.ConstantsGeneral.FORMAT_DATE_DAY_MONTH_YEAR_TIME_WITH_SLASH;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@RunWith(MockitoJUnitRunner.class)
public class DateFunctionsUtilTest extends BaseTest {
	
	public static final String DATE = "10/10/1990";
	public static final String DATE_2 = "10-10-1990";
	
	@Test
	public void testStringToDate() {
		Assert.assertNotNull(DateFunctionsUtil.stringToDate(DATE));
	}
	
	@Test
	public void testStringToDate2() {
		Assert.assertNotNull(DateFunctionsUtil.stringToDate(DATE_2,FORMAT_DATE_YEAR_MONTH_DAY_WITH_UNDERSCORE_SPANISH));
	}
	
	@Test
	public void testStringToLocalDate() {
		Assert.assertNotNull(DateFunctionsUtil.stringToLocalDate(DATE_2,FORMAT_DATE_YEAR_MONTH_DAY_WITH_UNDERSCORE_SPANISH));
	}
	
	@Test
	public void testStringToLocalDate2() {
		Assert.assertNotNull(DateFunctionsUtil.stringToLocalDate(DATE));
	}
	
	@Test
	public void testStringToLocalDateTime() {
		Assert.assertNotNull(DateFunctionsUtil.stringToLocalDateTime(DATE+" 00:00:00",FORMAT_DATE_DAY_MONTH_YEAR_TIME_WITH_SLASH));
	}
	
	@Test
	public void testStringToLocalDateTime2() {
		Assert.assertNotNull(DateFunctionsUtil.stringToLocalDateTime(DATE+" 00:00:00"));
	}

	@Test
	public void testDateToString() {
		Assert.assertNotNull(DateFunctionsUtil.dateToString(new Date(),FORMAT_DATE_YEAR_MONTH_DAY_WITH_UNDERSCORE_SPANISH));
	}
	
	@Test
	public void testDateToString2() {
		Assert.assertNotNull(DateFunctionsUtil.dateToString(new Date()));
	}
	
	@Test
	public void testDateLocalToString() {
		Assert.assertNotNull(DateFunctionsUtil.dateLocalToString(LocalDate.now(),FORMAT_DATE_YEAR_MONTH_DAY_WITH_UNDERSCORE_SPANISH));
	}
	
	@Test
	public void testDateLocalToString2() {
		Assert.assertNotNull(DateFunctionsUtil.dateLocalToString(LocalDate.now()));
	}
	
	@Test
	public void testDateLocalTimeToString() {
		Assert.assertNotNull(DateFunctionsUtil.dateLocalTimeToString(LocalDateTime.now(),FORMAT_DATE_DAY_MONTH_YEAR_TIME_WITH_SLASH));
	}
	
	@Test
	public void testDateLocalTimeToString2() {
		Assert.assertNotNull(DateFunctionsUtil.dateLocalTimeToString(LocalDateTime.now()));
	}
	
	@Test
	public void testDateToLocalDate() {
		Assert.assertNotNull(DateFunctionsUtil.dateToLocalDate(new Date()));
	}
	
	@Test
	public void testDateToLocalDateTime() {
		Assert.assertNotNull(DateFunctionsUtil.dateToLocalDateTime(new Date()));
	}
	
	@Test
	public void testLocalDateToDate() {
		Assert.assertNotNull(DateFunctionsUtil.localDateToDate(LocalDate.now()));
	}
	
	@Test
	public void testLocalDateTimeToDate() {
		Assert.assertNotNull(DateFunctionsUtil.localDateTimeToDate(LocalDateTime.now()));
	}
}
