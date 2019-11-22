package com.nt.batch;

import java.util.Date;

import com.nt.entity.BatchRunDetailsEntity;
import com.nt.repository.BatchRunDetailsRepo;

public class BatchImpl implements Batch {

	private BatchRunDetailsRepo batchRunDetailsRepo;  
	@Override
	public void preProcess() {
		// TODO Auto-generated method stub
		BatchRunDetailsEntity entity=new BatchRunDetailsEntity(); 
		entity.setBatchName("Batch_Name");
		entity.setRunStatus("ST");
		entity.setStartDate(new Date());
		entity.setCreated_By("Batch_Name");
		BatchRunDetailsEntity savedEntity=batchRunDetailsRepo.save(entity);
		long runId=savedEntity.getRunId();
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void process() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postProcess() {
		// TODO Auto-generated method stub
		
	}

}
