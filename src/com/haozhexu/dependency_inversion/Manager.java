package com.haozhexu.dependency_inversion;

public class Manager {
	private Worker worker;
	
	public void setWorker(final Worker worker) {
		this.worker = worker;
	}
	
	public void orderToWork() {
		worker.work();
	}
}
