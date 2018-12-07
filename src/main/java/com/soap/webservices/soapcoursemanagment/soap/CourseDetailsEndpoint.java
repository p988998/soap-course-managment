package com.soap.webservices.soapcoursemanagment.soap;

import com.sample.courses.CourseDetails;
import com.sample.courses.GetCourseDetailsRequest;
import com.sample.courses.GetCourseDetailsResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CourseDetailsEndpoint {

    @PayloadRoot(namespace = "http://sample.com/courses", localPart = "GetCourseDetailsRequest")

    @ResponsePayload
    public GetCourseDetailsResponse processCourseDetailsRequest(@RequestPayload GetCourseDetailsRequest request){
        GetCourseDetailsResponse response = new GetCourseDetailsResponse();

        CourseDetails courseDetails = new CourseDetails();
        courseDetails.setId(request.getId());
        courseDetails.setName("Microservices course");
        courseDetails.setDescription("a good course");
        response.setCourseDetails(courseDetails);

        return response;
    }
}
