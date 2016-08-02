package com.envy.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class ApplyAfterMethod implements AfterReturningAdvice {

	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		
        System.out.println("ApplyAfterMethod : After method hijacked!");
		
	}
	
}
