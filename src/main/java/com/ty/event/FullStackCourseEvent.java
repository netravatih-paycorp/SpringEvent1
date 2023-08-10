package com.ty.event;

import org.springframework.context.ApplicationEvent;

public class FullStackCourseEvent extends ApplicationEvent
{
   private String course;

public FullStackCourseEvent(Object source,String course) 
{
	super(source);
	this.course=course;	
}

public String getCourse()
{
	return course;
}


   
}
