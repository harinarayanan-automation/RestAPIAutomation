package JIRAAssignment;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class deletejiraincident {
	@Test
	public void deleteincident()
	{
		RestAssured.baseURI="https://harirestapi2023.atlassian.net/rest/api/2/";
		
		RestAssured.authentication=RestAssured.preemptive().basic("harinarayanan.ooty@gmail.com", "ATATT3xFfGF0JI8exPy1ITOTOzYUF9uyD33CpiU6kjXRJcpS7jxV98BDKFrBuQV2IfNkjD80ODXIboM4hJI_Wp021tPiwHSYkPoI9Jo2p7PrP7dcH2Ey4iG4ysGhBNdEgeOHI9Hkz8w9DWwOtTa2LzuVvavpqJmyJho8anFLKx7wcX94jQ677hE=72B9AE2B");
		
        RequestSpecification body = RestAssured.given().contentType("application/json").accept("application/json");
        
        Response delete = body.delete("issue/10030");
        
        delete.prettyPrint();
        
   	 	int statusCode = delete.getStatusCode();
   	 	System.out.println("Status code for jira Update incident is ----"+statusCode);
        delete.prettyPrint();
	}

}
