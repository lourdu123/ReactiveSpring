package com.example.demo.controller;

import java.time.Duration;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

import com.example.demo.models.Student;
import com.example.demo.repository.SampleRepository;

@RestController
public class Sample {
	
	@Autowired
	private SampleRepository sampleRepository;

	@GetMapping(value="/test", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<Student> test(){
		return sampleRepository.findAll()
				.delayElements(Duration.ofSeconds(1));
	}
	
}
