package RestAPIPackage;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class RestAPITest {

	public static void main(String[] args) 
	{
		
		RestAssured.baseURI = "http://parabank.parasoft.com:443/parabank/services/bank?_wadl&_type=xml";
		
		Response Res = RestAssured.request(Method.GET);
		System.out.println("Response code = " + Res.getStatusCode());
		System.out.println("Respose body = " + Res.getBody().asString());
					

	}

}
