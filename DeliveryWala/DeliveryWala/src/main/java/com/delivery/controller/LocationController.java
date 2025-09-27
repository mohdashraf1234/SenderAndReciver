package com.delivery.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.service.KafkaService;

@RestController
@RequestMapping("/location")
public class LocationController {
	@Autowired
	private KafkaService kafkaService ;
	
//	@PostMapping("/update")
//	public ResponseEntity<?> updateLocation() {
//	    String location = "( " + Math.round(Math.random() * 100) + " , " + Math.round(Math.random() * 100) + " )";
//	    
//	    // Call KafkaService to send the location
//	    //kafkaService.sendLocation(location);  // make sure you have a sendLocation(String) method in KafkaService
//
//	    return new ResponseEntity<>(Map.of("message", "Location Updated"), HttpStatus.OK);
//	}
	
	
//	@PostMapping("/update")
//	public ResponseEntity<?> updateLocation() {
//		for(int i=1;i<=100000;i++)
//		{
//			   String location = "( " + Math.round(Math.random() * 100) + " , " + Math.round(Math.random() * 100) + " )";
//			    kafkaService.updateLocation(location);
//		}
//	 
//	    return new ResponseEntity<>(Map.of("message", "Location Updated"), HttpStatus.OK);
//	}
	
	
	@PostMapping("/update")
	public ResponseEntity<?> updateLocation() {
	    new Thread(() -> {
	        for (int i = 1; i <= 100000; i++) {
	            String location = "( " + Math.round(Math.random() * 100) + " , " + Math.round(Math.random() * 100) + " )";
	            kafkaService.updateLocation(location);
	        }
	    }).start();

	    return new ResponseEntity<>(Map.of("message", "Producing 100k messages in background"), HttpStatus.OK);
	}




}
