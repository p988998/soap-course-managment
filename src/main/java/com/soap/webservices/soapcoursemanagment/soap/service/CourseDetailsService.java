package com.soap.webservices.soapcoursemanagment.soap.service;

import com.soap.webservices.soapcoursemanagment.soap.bean.Course;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class CourseDetailsService {
    public enum Status {
        SUCCESS, FAILURE;
    }

    private static List<Course> courses = new ArrayList<>();

    static {
        Course course1 = new Course(1, "Chinese", "yu wen");
        courses.add(course1);
        Course course2 = new Course(2, "Math", "shu xue");
        courses.add(course2);
        Course course3 = new Course(3, "English", "wai yu");
        courses.add(course3);
        Course course4 = new Course(4, "PE", "ti yu");
        courses.add(course4);
    }

    //course - 1
    public Course findById(int id){
        for(Course course:courses){
            if(course.getId() == id){
                return course;
            }
        }
        return null;
    }

    public List<Course> findAll(){
        return  courses;
    }

    public Status deleteById(int id){
        Iterator<Course> iterator = courses.iterator();

        while (iterator.hasNext()){
            Course course = iterator.next();
            if(course.getId() == id){
                iterator.remove();
                return Status.SUCCESS;
            }
        }
        return Status.FAILURE;
    }

}
