package com.jaxws.client;

import com.jaxws.endpointinterface.HelloWorld;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by thiennt on 5/26/14.
 */
public class ClientTest {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:9999/ws/hello?wsdl");
            QName qName = new QName("http://implementation.jaxws.com/","HelloWorldImplService");
            Service service = Service.create(url,qName);
            HelloWorld helloWorld = service.getPort(HelloWorld.class);
            System.out.println("Call Service: "+ helloWorld.getHelloWorldMessage("Thien"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
