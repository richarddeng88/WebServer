package javasamples.two;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

class UsersClient {

    public static void main(String args[ ]) throws Exception {

        URL url = new URL("http://127.0.0.1:9876/two?wsdl");

        QName qname = new QName("http://two.javasamples/", "UsersImplService");

        // Create, in effect, a factory for the service.
        Service service = Service.create(url, qname);
        
        // Extract the endpoint interface, the service "port".

        UsersInterface eif = service.getPort(UsersInterface.class);
        System.out.println(eif.getUserCount());
  
   }

}