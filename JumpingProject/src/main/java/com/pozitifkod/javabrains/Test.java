package com.pozitifkod.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class Test {
	public static void main(String[] args) {
//		InstanceExample ins = new InstanceExample();
//		ins.getMyMethod();
//		
//		InstanceExample ins2 = InstanceExample.getInstance();
//		ins2.getExam();
//		ins2.getMyMethod();
//		
//		InstanceExample.getInstance().getExam();
//		InstanceExample.getInstance().getMyMethod();
		
		
//		BeanFactory bean  = new XmlBeanFactory(new FileSystemResource("src/main/resources/spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("/spring.xml");
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
		System.out.println(triangle.getType() + " - " + triangle.getHeight());
		System.out.println("PointA --> x : " + triangle.getPointA().getX());
		System.out.println("PointA --> y : " + triangle.getPointA().getY());
		System.out.println("PointB --> x : " + triangle.getPointB().getX());
		System.out.println("PointB --> y : " + triangle.getPointB().getY());
		System.out.println("PointC --> x : " + triangle.getPointC().getX());
		System.out.println("PointC --> y : " + triangle.getPointC().getY());
	}
}
