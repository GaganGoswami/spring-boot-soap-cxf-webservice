package gagan.cxf.webservice.cxfwebservice.config;


// CxfConfig.java
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import gagan.cxf.webservice.cxfwebservice.service.HelloWorldService;

import javax.xml.ws.Endpoint;

@Configuration
public class CxfConfig {

    @Autowired
    private Bus bus;

    @Autowired
    private HelloWorldService helloWorldService;

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, helloWorldService);
        endpoint.publish("/helloWorld");
        return endpoint;
    }
}
