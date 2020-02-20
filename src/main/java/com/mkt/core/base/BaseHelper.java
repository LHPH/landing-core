package com.mkt.core.base;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class BaseHelper<I,O>{
	
	private final static Logger LOGGER = LogManager.getLogger();
	
	public abstract O toEntity(I i);
	
	public abstract I toModel(O o);
	
	public abstract void toUpdateEntity(I i, O o);
	
	public List<O> toListEntities(List<I> list){
		
		return list.stream().map(e->toEntity(e)).collect(Collectors.toList());
		
	}
	
	public List<I> toListModels(List<O> list){
		
		return list.stream().map(e->toModel(e)).collect(Collectors.toList());
	}
	
	public static Logger getLogger() {
		return LOGGER;
	}

}
