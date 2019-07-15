package com.example.demo.component;

import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.models.Student;
import com.example.demo.repository.SampleRepository;

import reactor.core.publisher.Flux;

@Component
public class StudentComponent {

	@Autowired
	private SampleRepository sampleRepository;
	

    @PostConstruct
	public void load() {
		        sampleRepository.deleteAll().thenMany(
				Flux.just("karthik", "senthil", "srinath", "raj","madhav")
				     .map(name -> new Student(UUID.randomUUID(), name))
				     .flatMap(sampleRepository::save))
				.thenMany(sampleRepository.findAll())
				.subscribe(System.out::println);
	}
}
