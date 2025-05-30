package com.example.CourseRegisterationSystem.repository;

import com.example.CourseRegisterationSystem.model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRegistryRepo extends JpaRepository<CourseRegistry, Integer> {
}
