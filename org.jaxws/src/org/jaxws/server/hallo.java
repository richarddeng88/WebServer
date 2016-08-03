package org.jaxws.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class hallo implements halloInterface {
	
	/* (non-Javadoc)
	 * @see org.jaxws.server.halloInterface#getHelloWorldAsString(java.lang.String)
	 */
	@Override
	@WebMethod
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}
	
	/* (non-Javadoc)
	 * @see org.jaxws.server.halloInterface#getHelloWorld(java.lang.String)
	 */
	@Override
	@WebMethod
	public String getHelloWorld(String name) {
		return "Webservice " + name;
	}
	
	/* (non-Javadoc)
	 * @see org.jaxws.server.halloInterface#getAbc()
	 */
	@Override
	public String getAbc() {
        return "abc";
    }
	
}
