package com.anno.beans;

public class Toy {
	
	
	private senser senser;
	
	public void setSenser(senser senser) {
		this.senser = senser;
	}
	
	public void play(){
		
		System.out.println("Toy play with : "+senser);
	}
}
