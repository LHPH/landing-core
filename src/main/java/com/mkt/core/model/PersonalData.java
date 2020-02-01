package com.mkt.core.model;

import com.mkt.core.base.BaseModel;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PersonalData extends BaseModel{

	private String firstName;
	private String secondName;
	private String lastName;
	private String secondLastName;
	private String email;
	private String homePhone;
	private String cellPhone;
	
}
