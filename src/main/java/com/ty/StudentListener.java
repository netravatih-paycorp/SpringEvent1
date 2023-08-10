package com.ty;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.ty.event.FullStackCourseEvent;

@Component
public class StudentListener implements ApplicationListener<FullStackCourseEvent>
{
public void join(String course)
{
	System.out.println("Want to join the course for "+course);
}

@Override
public void onApplicationEvent(FullStackCourseEvent event)
{
	join(event.getCourse());
	
}

}
