package test;

	import com.jayway.restassured.RestAssured;
	import com.jayway.restassured.builder.RequestSpecBuilder;
	import com.jayway.restassured.http.ContentType;
	import com.jayway.restassured.path.json.JsonPath;
	import com.jayway.restassured.response.Response;
	import com.jayway.restassured.specification.RequestSpecification;
	import com.jayway.restassured.specification.ResponseSpecification;

import Utils.utility;
import properties.Constant;

import org.junit.Test;

	import static com.jayway.restassured.RestAssured.*;
	import static com.jayway.restassured.http.ContentType.JSON;
	import static com.jayway.restassured.http.ContentType.URLENC;
	import static java.util.Arrays.asList;
	import static org.apache.commons.lang3.ArrayUtils.toObject;
	import static org.apache.commons.lang3.StringUtils.join;
	import static org.hamcrest.Matchers.*;
	import static org.junit.Assert.assertThat;

	import java.io.File;
	public class testPost {
		Constant c = new Constant();
		utility u = new utility();

		
		
		
		public void test(){
			
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

	

