package restapi_test.rest_api_test;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestPostApiTest {
	
	@Test
	
	 void RegistrationSuccessful()
	 {
	  
	  //Specify base URI
	  RestAssured.baseURI="https://jsonplaceholder.typicode.com/";
	  
	  //Request object
	  RequestSpecification httpRequest=RestAssured.given();
	  
	   
	  //Request paylaod sending along with post request
	  JSONObject requestParams=new JSONObject();
	/*  
	  requestParams.put("FirstName","JohnXYZ");
	  requestParams.put("LastName","XYZJohn");
	  requestParams.put("UserName","JohnXYZ");
	  requestParams.put("Password","JohnXYZxyx");
	  requestParams.put("Email","JohnXYZ@gmail.com");*/
	  
	/*  "userId": 1,
	    "id": 1,
	    "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
	    "body": "quia
	  */
	  
	  
	  requestParams.put("userId", "88");
	  requestParams.put("id", "884");
	  
	  requestParams.put("title", "cgbcn");
	  requestParams.put("body", "dfgdf");
	  
	  
	  
	  httpRequest.header("Content-Type","application/json");
	  
	  httpRequest.body(requestParams.toJSONString()); // attach above data to the request
	  
	  //Response object
	  Response response=httpRequest.request(Method.POST,"/posts");
	    
	  
	  //print response in console window
	  
	  String responseBody=response.getBody().asString();
	  System.out.println("Response Body is:" +responseBody);
	  
	  //status code validation
	  int statusCode=response.getStatusCode();
	  System.out.println("Status code is: "+statusCode);
	  Assert.assertEquals(statusCode, 201);
	  
	  //success code validation
	  String IDaa=response.jsonPath().get("Id");
	  Assert.assertEquals("Idaa", "88");
	  
	 }

}
