package com.st.beans;

import org.springframework.stereotype.Component;

// if we not give any name in @component it cnfigure bean in ioc with the class name;
// and we use component-scan for stereoType. 

// if we give name in @component(value="abc"), the bean register in ioc contener with 
// name abc and whwn we do getBean(). ue use id abc for getting the object of toy. 

@Component("abc")
public class Toy {
	public void play(){
		System.out.println("play music ");
	}
}
