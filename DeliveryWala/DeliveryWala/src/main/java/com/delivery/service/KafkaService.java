package com.delivery.service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.delivery.config.AppConstants;

import ch.qos.logback.classic.Logger;

@Service
public class KafkaService {
	
	@Autowired
	private KafkaTemplate<String,String> kafkaTemplate;
	
	private Logger logger=(Logger) LoggerFactory.getLogger(KafkaService.class);
	
	
	public  boolean updateLocation(String location)
	
	{
		
			this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME,location);
			this.logger.info("Message Produced.....!");
		
		
		return true;
	}

}
