package com.ty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.ty.event.FullStackCourseEvent;

@Component
public class JspidersPublisher
{
	@Autowired
	ApplicationEventPublisher publisher;
	
    public void fullStackCourse(String course)
    {
    	System.out.println("Full Stack Course is Starting for "+course);
    
	    publisher.publishEvent(new FullStackCourseEvent(this,course));
    	
    	
    }
    
}