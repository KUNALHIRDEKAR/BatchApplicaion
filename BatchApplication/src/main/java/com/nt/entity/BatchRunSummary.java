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
@Table(name="BATCH_RUN_SUMMARY")
public class BatchRunSummary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="summaryId")
	private long summaryId; 

	@Column(name="batchName")
	private String batchName;
	
	@Column(name="summaryDtls")
	private String summaryDtls;
	
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
