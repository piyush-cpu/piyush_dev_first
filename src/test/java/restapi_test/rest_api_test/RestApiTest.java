package restapi_test.rest_api_test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class RestApiTest

{
	@Test
	public void Ass() kmk
	{
		System.out.println("dvzd");
		Assert.assertTrue(true);
	}
	
	
	/*@Test
	public void Ass()
	{
		System.out.println("dvzd");
		Assert.assertTrue(true);
	}
	*/
	
	

	
	@Test
	
	public void Restapitest() {
		//Specify base URI
		  RestAssured.baseURI="https://jsonplaceholder.typicode.com/";
		  
		  //Request object
		  RequestSpecification httpRequest=RestAssured.given();
		  
		  //Response object
		  Response response=httpRequest.request(Method.GET,"/posts/1/comments");
		  
		  //print response in console window
		  
		  String responseBody=response.getBody().asString();
		  System.out.println("Response Body is:" +responseBody);
		  
		  //status code validation
		  int statusCode=response.getStatusCode();
		  System.out.println("Status code is: "+statusCode);
		  Assert.assertEquals(statusCode, 200);
		  
		  //status line verification
		  String statusLine=response.getStatusLine();
		  System.out.println("Status line is:"+statusLine);
		  Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		
	}
}
