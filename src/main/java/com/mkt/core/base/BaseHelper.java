package com.mkt.core.base;

import java.util.List;
import java.util.stream.Collectors;

public abstract class BaseHelper<I,O>{
	
	public abstract O toEntity(I i);
	
	public abstract I toModel(O o);
	
	public abstract void toUpdateEntity(I i, O o);
	
	public List<O> toListEntities(List<I> list){
		
		return list.stream().map(e->toEntity(e)).collect(Collectors.toList());
		
	}
	
	public List<I> toListModels(List<O> list){
		
		return list.stream().map(e->toModel(e)).collect(Collectors.toList());
	}

}
