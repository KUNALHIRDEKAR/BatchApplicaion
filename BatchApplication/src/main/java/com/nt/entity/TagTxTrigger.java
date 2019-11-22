package com.nt.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "TAG_TX_TRIGGERS1")
@SequenceGenerator(name = "seq", initialValue = 1, allocationSize = 50)
public class TagTxTrigger {

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@Id
	@Column(name = "trgId")
	private long trgId;

	@OneToOne(targetEntity = TagMaster.class)
	@JoinColumn(name = "tagId")
	private TagMaster detail;

	@Column(name = "vehicleRegNum")
	private String vehicleRegNum;

	@Column(name = "tollPlazaId")
	private String tollPlazaId;

	@Column(name = "tollAmt")
	private int tollAmt;

	@Column(name = "status")
	private String status;

	@Column(name = "txFailurRsn")
	private String txFailurRsn;

	@Column(name = "ReminderMsgSw")
	private String ReminderMsgSw;

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
