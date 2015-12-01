package com.filters;

import javax.ws.rs.core.Response;

import org.apache.cxf.configuration.security.AuthorizationPolicy;
import org.apache.cxf.jaxrs.ext.RequestHandler;
import org.apache.cxf.jaxrs.model.ClassResourceInfo;
import org.apache.cxf.message.Message;

import com.utils.PSLStringUtil;

public class AuthenticationHandler implements RequestHandler {
	 
    public Response handleRequest(Message m, ClassResourceInfo resourceClass) {
        AuthorizationPolicy policy = (AuthorizationPolicy)m.get(AuthorizationPolicy.class);
        String username = policy.getUserName();
        String password = policy.getPassword(); 
        if (isAuthenticated(username, password)) {
        	
        	/* Enable this code when HttpOverride.java enabled in web.xml
        	String reqURL = (String)m.get(Message.REQUEST_URL);
        	int index = PSLStringUtil.ordinalIndexOf(reqURL, '/', 5);
        	if(index >0){
        		return Response.status(404).header("Not Found", reqURL).build();
        	}  */
        	
        	return null;
        	
        } else {
            // authentication failed, request the authetication, add the realm name if needed to the value of WWW-Authenticate 
            return Response.status(401).header("WWW-Authenticate", "Basic").build();
        }
    }
    
    private boolean isAuthenticated(String userName,String password){
    	
    	if(userName.equals("name") && password.equals("pass"))
    		return true;
    	else
    	return false;
    	
    }
}
