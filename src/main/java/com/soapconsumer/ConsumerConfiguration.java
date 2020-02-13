package com.soapconsumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration

public class ConsumerConfiguration {
    @Bean
    Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller= new Jaxb2Marshaller();
        /// this package must match the package in the <generatePackage> specified in
        //    // pom.xml
        marshaller.setContextPath("com.soapconsumer.services");
        return marshaller;
    }
    @Bean
    public CourseClient getInstance(Jaxb2Marshaller marshaller){
        CourseClient courseClient= new CourseClient();
        courseClient.setDefaultUri("http://localhost:8080/ws");
        courseClient.setMarshaller(marshaller);
        courseClient.setUnmarshaller(marshaller);
        return courseClient;
    }
}
