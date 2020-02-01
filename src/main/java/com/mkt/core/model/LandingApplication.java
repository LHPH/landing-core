package com.mkt.core.model;

import com.mkt.core.base.BaseModel;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LandingApplication extends BaseModel{

	private Integer folio;
	private PersonalData personalData;
	private String dateCreated;
	private String dateModified;
	
}
