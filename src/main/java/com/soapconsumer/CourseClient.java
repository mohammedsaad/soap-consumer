package com.soapconsumer;

import com.soapconsumer.services.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.SoapFaultClientException;
import org.springframework.ws.soap.client.core.SoapActionCallback;


public class CourseClient extends WebServiceGatewaySupport {
 // wisdl uri :"http://localhost:8080/ws/courses"  // exactly:http://localhost:8080/ws/courses.wsdl
    public GetCourseDetailsResponse getcourse(int id){
        GetCourseDetailsRequest request= new GetCourseDetailsRequest();
        request.setId(id);
        GetCourseDetailsResponse response= (GetCourseDetailsResponse) getWebServiceTemplate()

                .marshalSendAndReceive("http://localhost:8080/ws",request,new SoapActionCallback("http://localhost:8080/ws/GetCourseDetailsRequest"));
        return response;
    }
    public GetAllCoursesDetailsResponse getAllCourses()throws SoapFaultClientException {
        GetAllCoursesDetailsRequest request= new GetAllCoursesDetailsRequest();

        GetAllCoursesDetailsResponse response= (GetAllCoursesDetailsResponse) getWebServiceTemplate()

                .marshalSendAndReceive("http://localhost:8080/ws",request,new SoapActionCallback("http://localhost:8080/ws/GetAllCoursesDetailsRequest"));
        return response;
    }

    public DeleteCourseResponse deleteCourse(int id){
        DeleteCourseRequest request= new DeleteCourseRequest();
        request.setId(1);

        DeleteCourseResponse response= (DeleteCourseResponse) getWebServiceTemplate()

                .marshalSendAndReceive("http://localhost:8080/ws",request,new SoapActionCallback("http://localhost:8080/ws/DeleteCourseRequest"));
        return response;
    }
}
