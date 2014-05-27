package com.jaxws.publisher;

import com.jaxws.implementation.HelloWorldImpl;

import javax.xml.ws.Endpoint;

/**
 * Created by thiennt on 5/26/14.
 */
public class HelloWorldPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
    }
}
