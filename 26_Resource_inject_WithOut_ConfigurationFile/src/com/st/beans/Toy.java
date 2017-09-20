package com.st.beans;


import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Toy {
	private Sensor sensor;

	public Sensor getSensor() {
		return sensor;
	}
	
	
//	@Resource(name="sensor")                 // This is working...... It is like @Inject and @Autowired
	@Resource                        //it will check bytype and byname.
	@Qualifier(value="toy1e")
//	@Inject
	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}

	@Override
	public String toString() {
		return "Toy [sensor=" + sensor + "]";
	}
}
