package gagan.cxf.webservice.cxfwebservice.service.impl;

// HelloWorldServiceImpl.java
import javax.jws.WebService;

import gagan.cxf.webservice.cxfwebservice.service.HelloWorldService;

@WebService(endpointInterface = "com.example.HelloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}
