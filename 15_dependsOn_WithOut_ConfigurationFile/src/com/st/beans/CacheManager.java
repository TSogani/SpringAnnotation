package com.st.beans;

import org.springframework.stereotype.Component;

@Component
public class CacheManager {
	public CacheManager() {

		System.out.println("cacheManager Created");
		System.out.println("data loaded...");
	}
}
