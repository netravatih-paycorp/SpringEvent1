package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass 
{
 public static void main(String[] args) 
 {
	ApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
	JspidersPublisher publisher = context.getBean("jspidersPublisher", JspidersPublisher.class);
	publisher.fullStackCourse("Java");
}
 
}
