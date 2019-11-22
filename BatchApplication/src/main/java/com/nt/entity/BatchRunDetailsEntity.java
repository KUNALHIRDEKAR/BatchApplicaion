package com.nt.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "BATCH_RUN_tbls")
public class BatchRunDetailsEntity {
	 @Id
	 @Column(name="RUN_ID")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private long runId;
	 
	 @Column(name="BatchName")
	 private String BatchName;
	
	 @Column(name="startDate")
	 private Date startDate;
	 
	 @Column(name="runStatus")
	 private String runStatus;
	 
	 @Column(name="endDate")
	 private Date endDate;
	 
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
