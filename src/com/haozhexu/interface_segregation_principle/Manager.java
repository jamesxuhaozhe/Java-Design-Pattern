package com.haozhexu.interface_segregation_principle;

public class Manager {
	private Workable workable;
	
	public void setWorkable(final Workable workable) {
		this.workable = workable;
	}
	
	public void orderToWork() {
		workable.work();
	}
}
