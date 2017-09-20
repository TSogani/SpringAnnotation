package com.ann.beans;

import org.springframework.context.annotation.Configuration;

public class Bycle {
	private Chain chain;

	public Chain getChain() {
		return chain;
	}

	public void setChain(Chain chain) {
		this.chain = chain;
	}

	@Override
	public String toString() {
		return "Bycle [chain=" + chain + "]";
	}
	
	
}
