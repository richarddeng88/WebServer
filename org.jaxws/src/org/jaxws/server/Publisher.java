package org.jaxws.server;

import javax.xml.ws.Endpoint;

public class Publisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1233/new", new hallo());
	    }
}
