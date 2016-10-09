package com.jaig.services;

public class ServiceOneImpl implements ServiceOne {

	@Override
	public String getServiceOne() throws Exception {
		System.out.println("ServiveOne :: restful endpoint hit.");
       
		return "<ATT><WARNING><ServiceOne>You have reached ServiceOne911. ServiceOne is currently not available now</ServiceOne></WARNING></ATT>";
		
	}

}
