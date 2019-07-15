package com.example.demo.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.example.demo.models.Student;

public interface SampleRepository extends ReactiveCrudRepository<Student, Integer>{

}
