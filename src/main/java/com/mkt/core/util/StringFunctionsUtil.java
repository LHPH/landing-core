package com.mkt.core.util;

import com.mkt.core.base.BaseUtil;

public class StringFunctionsUtil extends BaseUtil{
	
	public static String notNull(String cad) {
		
		return cad==null?"":cad;
	}

}
