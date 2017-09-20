package com.configuration.ann.without_stereotype;

public class Radio {
	private Receiver receiver;

	public void listen(){
		receiver.switchOn();
		System.out.println("listening the songs...");
	}
	
	public Receiver getReceiver() {
		return receiver;
	}

	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public String toString() {
		return "Radio [receiver=" + receiver + "]";
	}
	
}
