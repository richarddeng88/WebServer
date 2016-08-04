package javasamples.one;

import java.util.Date;

import javax.jws.WebService;

@WebService(endpointInterface = "javasamples.one.TimeServer")

public class TimeServerImpl implements TimeServer {

    public String getTimeAsString() { 
    	return new Date().toString(); 
    	}
    
    public long getTimeAsElapsed() { 
    	return new Date().getTime(); 
    	}

}