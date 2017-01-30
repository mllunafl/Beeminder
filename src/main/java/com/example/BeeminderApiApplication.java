package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BeeminderApiApplication {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		SpringApplication.run(BeeminderApiApplication.class, args);
		
		
//		HttpHeaders headers = new HttpHeaders();
//        headers.set("Authorization","Bearer VA2ZHQGTPP5GGULWBBDV");
//        HttpEntity<String> entity = new HttpEntity<>(headers);
//        System.out.println(restTemplate.exchange("https://www.eventbriteapi.com/v3/users/me/",HttpMethod.GET,entity,String.class));


		
		HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization","Bearer VsDCD3pJ7QVegFFGUoF");
        HttpEntity<String> entity = new HttpEntity<>(headers);
        System.out.println(restTemplate.exchange("https://www.beeminder.com/api/v1/users/me.json/",HttpMethod.GET,entity,String.class));
	}
}
