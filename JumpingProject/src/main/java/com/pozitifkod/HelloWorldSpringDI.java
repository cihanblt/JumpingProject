package com.pozitifkod;


import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringDI {
	private final static Logger log = Logger.getLogger(HelloWorldSpringDI.class.getCanonicalName());
	public static void main(String[] args) throws Exception{
		ApplicationContext ctx = new 
				ClassPathXmlApplicationContext("/app-context.xml");
		log.info("applicationxx");
		MessageRenderer mr = ctx.getBean("renderer",MessageRenderer.class);
		mr.render();
	}
}
