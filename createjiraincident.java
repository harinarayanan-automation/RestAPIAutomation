package JIRAAssignment;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class createjiraincident {
	
	@Test	
	public void createincident()
	{
		RestAssured.baseURI="https://harirestapi2023.atlassian.net/rest/api/2/";
		
		RestAssured.authentication= RestAssured.preemptive().basic("harinarayanan.ooty@gmail.com", "ATATT3xFfGF0JI8exPy1ITOTOzYUF9uyD33CpiU6kjXRJcpS7jxV98BDKFrBuQV2IfNkjD80ODXIboM4hJI_Wp021tPiwHSYkPoI9Jo2p7PrP7dcH2Ey4iG4ysGhBNdEgeOHI9Hkz8w9DWwOtTa2LzuVvavpqJmyJho8anFLKx7wcX94jQ677hE=72B9AE2B");
		
		RequestSpecification body = RestAssured.given().contentType("application/json").accept("application/json").given().contentType("application/json").when().body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "        \"project\": {\r\n"
				+ "            \"key\": \"TMTNPRJCT\"\r\n"
				+ "        },\r\n"
				+ "        \"summary\": \"create issue in RA project\",\r\n"
				+ "        \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n"
				+ "        \"issuetype\": {\r\n"
				+ "            \"name\": \"Bug\"\r\n"
				+ "        }\r\n"
				+ "    }\r\n"
				+ "}");
	
	   
		Response post = body.post("issue/");
		
		post.prettyPrint();
	}
	

}
