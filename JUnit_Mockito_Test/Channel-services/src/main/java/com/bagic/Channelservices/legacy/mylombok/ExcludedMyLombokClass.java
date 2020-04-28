package com.bagic.Channelservices.legacy.mylombok;

import lombok.Data;
import lombok.Generated;

@Data
public class ExcludedMyLombokClass {
	
	private int testInt;
	
	private String testString;
	
	@Generated
	public void myMethod() {
		System.out.println("Hi");
	}
	
	 
}
