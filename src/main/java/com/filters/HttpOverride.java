package com.filters;

import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.UriInfo;

import com.factory.PSLUri;
import com.factory.URIFactory;


//This will get exicute when enabled in web.xml

@PreMatching
public class HttpOverride implements ContainerRequestFilter  {

	
   public void filter(ContainerRequestContext ctx) {
      UriInfo method = ctx.getUriInfo();
      URI uri = method.getRequestUri();
      
      PSLUri pslURI = null;
      if(uri.toString().indexOf("student") > 0){
    	  pslURI = URIFactory.getURI("student");
      }else if(uri.toString().indexOf("test") > 0)
      {
    	  pslURI = URIFactory.getURI("test");
      }
      URI redirectURI = null;
	try {
		if(null != pslURI){
		redirectURI = new URI(pslURI.getURL());
		}
	} catch (URISyntaxException e) {
		e.printStackTrace();
	} 
	if(null != redirectURI){
      ctx.setRequestUri(redirectURI);
	}
   }
   
  
}
