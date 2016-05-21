package test;



import static com.jayway.restassured.RestAssured.given;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import com.jayway.restassured.http.ContentType;

import Utils.utility;
import properties.Constant;



public class TestPost2 {

	utility u = new utility();
	Constant c = new Constant();
	
	public void post() throws IOException {
	   
		String jsonBody = u.generateStringFromResource("/Users/irfannadir/Documents/workspace/RestAssured_Furlenco/src/main/java/properties/generated.json");
		String content = null;

		

		
		given().
		body(jsonBody)
		.with()
		.contentType(ContentType.JSON)
		
		
.when()
.
		post(c.BaseUrl + c.new_orders).
then().
		statusCode(201);
		
	    


	}

}
