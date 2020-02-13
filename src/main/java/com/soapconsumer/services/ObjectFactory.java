
package com.soapconsumer.services;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soapconsumer.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soapconsumer.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteCourseResponse }
     * 
     */
    public DeleteCourseResponse createDeleteCourseResponse() {
        return new DeleteCourseResponse();
    }

    /**
     * Create an instance of {@link GetCourseDetailsRequest }
     * 
     */
    public GetCourseDetailsRequest createGetCourseDetailsRequest() {
        return new GetCourseDetailsRequest();
    }

    /**
     * Create an instance of {@link GetCourseDetailsResponse }
     * 
     */
    public GetCourseDetailsResponse createGetCourseDetailsResponse() {
        return new GetCourseDetailsResponse();
    }

    /**
     * Create an instance of {@link DeleteCourseRequest }
     * 
     */
    public DeleteCourseRequest createDeleteCourseRequest() {
        return new DeleteCourseRequest();
    }

    /**
     * Create an instance of {@link GetAllCoursesDetailsRequest }
     * 
     */
    public GetAllCoursesDetailsRequest createGetAllCoursesDetailsRequest() {
        return new GetAllCoursesDetailsRequest();
    }

    /**
     * Create an instance of {@link CourseDetails }
     * 
     */
    public CourseDetails createCourseDetails() {
        return new CourseDetails();
    }

    /**
     * Create an instance of {@link GetAllCoursesDetailsResponse }
     * 
     */
    public GetAllCoursesDetailsResponse createGetAllCoursesDetailsResponse() {
        return new GetAllCoursesDetailsResponse();
    }

}
