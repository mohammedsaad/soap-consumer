package com.soapconsumer;

import com.soapconsumer.services.DeleteCourseResponse;
import com.soapconsumer.services.GetAllCoursesDetailsResponse;
import com.soapconsumer.services.GetCourseDetailsResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.ws.soap.client.SoapFaultClientException;

@SpringBootApplication
public class SoapconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapconsumerApplication.class, args);
	}
	 @Bean
	 CommandLineRunner lookup(CourseClient client) {
		return args -> {
			int id = 1;

			if (args.length > 0) {
				id = Integer.valueOf(args[0]);
			}
			try {
				GetCourseDetailsResponse response =  client.getcourse(id);

			if (response.getCourseDetails().getName()!=null){
			System.err.println(response.getCourseDetails().getName());
			System.err.println(response.getCourseDetails().getDescription());
			System.err.println(response.getCourseDetails().getId());
			DeleteCourseResponse deleteCourseResponse= client.deleteCourse(id);

			System.out.println("course with id 1 deletion result: "+deleteCourseResponse.getStatus());}}catch (SoapFaultClientException e){
				System.out.println(e.getMessage());
			}
			GetAllCoursesDetailsResponse allCourses =  client.getAllCourses();
			allCourses.getCourseDetails().forEach(courseDetails->{
				System.err.println(courseDetails.getId());
				System.err.println(courseDetails.getName());
				System.err.println(courseDetails.getDescription());
				} );
		};

	}
}
