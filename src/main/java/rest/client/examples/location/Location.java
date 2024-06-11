package rest.client.examples.location;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Location {
	
	private String code;
	
	@JsonProperty("city_name")
	private String cityName;
	
	@JsonProperty("region_name")
	private String regionName;
	
	@JsonProperty("country_name")
	private String countryName;
	
	@JsonProperty("country_code")
	private String countryCode;
	
	private boolean enabled;
	
	private boolean trashed;
	

}
