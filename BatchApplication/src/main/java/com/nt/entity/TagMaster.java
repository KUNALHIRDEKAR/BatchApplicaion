package com.nt.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;


@Data
@Entity
@Table(name="tag_Mstr_tbl1")
@SequenceGenerator(name = "seq1", initialValue = 1, allocationSize = 50)
public class TagMaster {
	 @Id
	 @Column(name="tagSeq")
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	 private long tagSeq;
	 
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name="tagId")
	 private int tagId;
	 
	 @Column(name = "vehicleRegNum")
	 private String vehicleRegNum;
	 
	 @Column(name="vehicleType")
	 private String vehicleType;
	 
	 @Column(name="tagStartDt")
	 private String tagStartDt;
	 
	 @Column(name="tagExpiryDt")
	 private String tagExpiryDt;
	 
	 @Column(name="bal")
	 private int bal;
	 
	 @OneToOne(targetEntity=UserMasterEntity.class)
	 @JoinColumn(name="ownerID")
	 private UserMasterEntity details;

	 @CreationTimestamp
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "createdDt")
		private Date createdDt;
		
		@UpdateTimestamp
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "updatedDt")
		private Date updatedDt;
		
		@Column(name = "createdBy")
		private String createdBy;
		
		@Column(name = "updatedBy")
		private String updatedBy;
}
