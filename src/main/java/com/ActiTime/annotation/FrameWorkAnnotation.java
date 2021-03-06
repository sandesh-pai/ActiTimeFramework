package com.ActiTime.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.ActiTime.Enums.CategoryType;

@Documented
@Retention(RUNTIME)
@Target({ TYPE, METHOD })
public @interface FrameWorkAnnotation {
	
	
	public String[]  author() ;
	public CategoryType[] category() ;


}
