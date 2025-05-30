package com.example.CourseRegisterationSystem.controller;

import com.example.CourseRegisterationSystem.model.Course;
import com.example.CourseRegisterationSystem.model.CourseRegistry;
import com.example.CourseRegisterationSystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping("courses")
    public List<Course> availableCourse(){
        return courseService.availableCourses();
    }

    @GetMapping("courses/enrolled")
    public List<CourseRegistry> enrolledStudents(){
        return courseService.enrolledStudents();
    }

    @PostMapping("/courses/register")
    public String enrollCourse(@RequestParam("name") String name,
                               @RequestParam("emailId") String emailId,
                               @RequestParam("courseName") String courseName){
        courseService.enrollCourse(name, emailId, courseName);
        return "Cogratulations! " + name +" Enrollment successful for " + courseName;

    }
}
