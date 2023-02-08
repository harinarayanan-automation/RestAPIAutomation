package JIRAAssignment;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class updatejiraincident {
	
	@Test
	public void updateincident()
	{
		RestAssured.baseURI="https://harirestapi2023.atlassian.net/rest/api/2/";
		
		RestAssured.authentication=RestAssured.preemptive().basic("harinarayanan.ooty@gmail.com", "ATATT3xFfGF0JI8exPy1ITOTOzYUF9uyD33CpiU6kjXRJcpS7jxV98BDKFrBuQV2IfNkjD80ODXIboM4hJI_Wp021tPiwHSYkPoI9Jo2p7PrP7dcH2Ey4iG4ysGhBNdEgeOHI9Hkz8w9DWwOtTa2LzuVvavpqJmyJho8anFLKx7wcX94jQ677hE=72B9AE2B");
		
        RequestSpecification body = RestAssured.given().contentType("application/json").accept("application/json").when().body("{\r\n"
        		+ "    \"fields\": \r\n"
        		+ "    {\r\n"
        		+ "        \"description\": \"Bug creation Using REST API for testing\"\r\n"
        		+ "    }\r\n"
        		+ "}");		
        Response put = body.put("issue/10030");
   	 	int statusCode = put.getStatusCode();
   	 	System.out.println("Status code for jira Update incident is ----"+statusCode);
        put.prettyPrint();
        
	}

}
