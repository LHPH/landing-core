package com.mkt.core.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mkt.core.base.BaseEntity;
import com.mkt.core.model.LandingApplication;
import com.mkt.core.model.PersonalData;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="DATALANDING")
public class Landing extends BaseEntity{
	
	@Id
	@Column(name="FOLIO")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer folio;
	@Column(name="FIRSTNAME")
	private String firstName;
	@Column(name="SECONDNAME")
	private String secondName;
	@Column(name="LASTNAME")
	private String lastName;
	@Column(name="SECONDLASTNAME")
	private String secondLastName;
	@Column(name="EMAIL")
	private String email;
	@Column(name="HOMEPHONE")
	private String homePhone;
	@Column(name="CELLPHONE")
	private String cellPhone;
	@Column(name="DATECREATED")
	private Date dateCreated;
	@Column(name="DATEMODIFIED")
	private Date dateModified;
	
	

}
