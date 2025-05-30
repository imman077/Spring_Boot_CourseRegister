package com.example.CourseRegisterationSystem.repository;

import com.example.CourseRegisterationSystem.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course, String> { // <Entity(Table Name), Primary Key DataType(Int/String)>

}
