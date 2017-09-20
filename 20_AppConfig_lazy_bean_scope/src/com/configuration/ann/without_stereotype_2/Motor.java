package com.configuration.ann.without_stereotype_2;

public class Motor {
	private Chain chain;

	public Chain getChain() {
		return chain;
	}

	public void setChain(Chain chain) {
		this.chain = chain;
	}

	@Override
	public String toString() {
		return "Motor [chain=" + chain + "]";
	}
	
	
}
