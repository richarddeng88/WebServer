package javasamples.one;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC) // more on this later
public interface TimeServer {

    @WebMethod String getTimeAsString();
    @WebMethod long getTimeAsElapsed();
	
}
