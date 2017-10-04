package com.imaginea.jsonparser;

import org.apache.commons.codec.binary.Base64;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.imaginea.jsonparser.dto.JsonResponse;

@Controller
public class JsonParserController {

	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	@RequestMapping("/")
	public @ResponseBody JsonResponse parsePatientResponse() {
		JsonResponse response = null;
		
		  String url = String.format("https://apiconnect-dev.mountsinai.org/fhir/stu3/api/Patient?firstname=FIRST_NAME 1&lastname=LAST_NAME 1&cinid=CIN_ID 1&client_id=14e60cdb333b40bc94bebf6b3cb57bfe&client_secret=eeEAFb8A9Ec0441c80171c521Af2104C");
		  	
		  String creds = "apibasic:Password123";
		  String base64Creds = new String (Base64.encodeBase64(creds.getBytes()));
		  
		  HttpHeaders headers = new HttpHeaders(); 
		  headers.add("Authorization", "Basic "+ base64Creds);
		  
		  HttpEntity<String> request =  new HttpEntity<String>(headers);
		  
		  ResponseEntity<JsonResponse> results = 
				  restTemplate().exchange(url, HttpMethod.GET, request, new ParameterizedTypeReference<JsonResponse>(){});
	        
        response = results.getBody();
		
		return response;
	}
	
	
	
}
