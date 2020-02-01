package com.mkt.core.base;

public abstract class BaseHelper<I,O>{
	
	public abstract O toEntity(I i);
	
	public abstract I toModel(O o);

}
