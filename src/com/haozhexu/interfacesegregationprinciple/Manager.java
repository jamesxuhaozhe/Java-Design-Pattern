package com.haozhexu.interfacesegregationprinciple;

public class Manager {
	private Workable workable;
	
	public void setWorkable(final Workable workable) {
		this.workable = workable;
	}
	
	public void orderToWork() {
		workable.work();
	}
}
