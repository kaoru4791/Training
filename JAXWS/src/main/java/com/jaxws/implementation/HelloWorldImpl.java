package com.jaxws.implementation;

import com.jaxws.endpointinterface.HelloWorld;

import javax.jws.WebService;

/**
 * Created by thiennt on 5/26/14.
 */
@WebService(endpointInterface = "com.jaxws.endpointinterface.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    @Override
    public String getHelloWorldMessage(String name) {
        return "Hello JAX-WS, "+name;
    }
}
