package com.codes.reflectiondemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
		ReflectionTest rTest = new ReflectionTest();
		
		Class cls = rTest.getClass();
		
		System.out.println(cls.getName());
		
		Constructor constructors = cls.getConstructor();
		
		System.out.println(constructors.getName());
		
		 Method[] methods = cls.getMethods(); 
		
	     for (Method method:methods) 
	          System.out.println(method.getName()); 
	     
	        // creates object of desired method by providing the 
	        // method name and parameter class as arguments to 
	        // the getDeclaredMethod 
	        Method methodcall1 = cls.getDeclaredMethod("secondMethod", int.class); 
	  
	        // invokes the method at runtime 
	        methodcall1.invoke(rTest, 19); 
	  
	        // creates object of the desired field by providing 
	        // the name of field as argument to the  
	        // getDeclaredField method 
	        Field field = cls.getDeclaredField("str"); 
	  
	        // allows the object to access the field irrespective 
	        // of the access specifier used with the field 
	        field.setAccessible(true); 
	  
	        // takes object and the new value to be assigned 
	        // to the field as arguments 
	        field.set(rTest, "JAVA"); 
	  
	        // Creates object of desired method by providing the 
	        // method name as argument to the getDeclaredMethod 
	        Method methodcall2 = cls.getDeclaredMethod("firstMethod"); 
	  
	        // invokes the method at runtime 
	        methodcall2.invoke(rTest); 
	  
	        // Creates object of the desired method by providing 
	        // the name of method as argument to the  
	        // getDeclaredMethod method 
	        Method methodcall3 = cls.getDeclaredMethod("privateMethod"); 
	  
	        // allows the object to access the method irrespective  
	        // of the access specifier used with the method 
	        methodcall3.setAccessible(true); 
	  
	        // invokes the method at runtime 
	        methodcall3.invoke(rTest); 
	}

}
