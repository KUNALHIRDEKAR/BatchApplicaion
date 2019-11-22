package com.nt.batch;

import org.springframework.stereotype.Service;

@Service
public interface Batch {

	public void preProcess();
	
	public void start();
	
	public void process();
	
	public void postProcess();
	
}
