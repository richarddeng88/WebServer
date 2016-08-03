package org.jaxws.server;

import javax.jws.WebMethod;

public interface halloInterface {

	public abstract String getHelloWorldAsString(String name);

	public abstract String getHelloWorld(String name);

	public abstract String getAbc();

}