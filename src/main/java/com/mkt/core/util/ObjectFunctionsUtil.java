package com.mkt.core.util;

import java.util.function.Consumer;

import com.mkt.core.base.BaseUtil;

public class ObjectFunctionsUtil extends BaseUtil{
	
	public static boolean isNull(Object obj) {
		return obj==null;
	}
	
	public static <T> void setIfNotNull(final Consumer<T> func, final T value){
		
		if(value!=null) {
			func.accept(value);
		}
		
	}

}
