package com.factory;


public class URIFactory {
	
	public static PSLUri getURI(String module)
	{
		 if(module == null){
	         return null;
	      }		
	      if(module.equalsIgnoreCase("student")){
	         return new StudentServiceURI();
	         
	      } else if(module.equalsIgnoreCase("test")){
	         return new TestServiceURI();
	         
	      } 
	      
	      return null;
	}

}
