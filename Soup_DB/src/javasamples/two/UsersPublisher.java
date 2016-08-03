package javasamples.two;

import javax.xml.ws.Endpoint;

public class UsersPublisher {

    public static void main(String[] args) {

      // 1st argument is the publication URL
      // 2nd argument is an SIB instance

      Endpoint.publish("http://127.0.0.1:9876/two", new UsersImpl());

    }

}