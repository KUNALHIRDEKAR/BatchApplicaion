package com.nt.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "Usr_Mstr_tbl1")
public class UserMasterEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_Id")
	private int user_Id;
	
	@Column(name = "first_Name")
	private String first_Name;
	
	@Column(name = "last_Name")
	private String last_Name;
	
	@Column(name = "email_Id")
	private String email_Id;
	
	@Column(name = "mobile_Num")
	private int mobile_Num;
	
	@Column(name = "gender")
	private String gender;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_Dt")
	private Date created_Dt;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_Dt")
	private Date updated_Dt;
	
	@Column(name = "created_By")
	private String created_By;
	
	@Column(name = "updated_By")
	private String updated_By;
}
