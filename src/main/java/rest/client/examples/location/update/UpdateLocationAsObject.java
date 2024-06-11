package rest.client.examples.location.update;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import rest.client.examples.location.Location;

public class UpdateLocationAsObject {
	
	public static void main(String[] args) {
		
		String requestURI = "http://localhost:8080/v1/locations";
	
		RestTemplate restTemplate = new RestTemplate();
		
		Location newLocation = new Location();
		newLocation.setCode("BNGL_IN");
		newLocation.setCityName("Bangalore");
		newLocation.setRegionName("Karnataka");
		newLocation.setCountryCode("IN");
		newLocation.setCountryName("India");
		
		HttpEntity<Location> request = new HttpEntity<>(newLocation);
		
		ResponseEntity<Location> response = restTemplate.exchange(requestURI, HttpMethod.PUT, request, Location.class);
	
	
		if (response.getStatusCode().is2xxSuccessful()) {
			Location updatedLocation = response.getBody();
			
			System.out.println(updatedLocation);
		}
	
	}
}
