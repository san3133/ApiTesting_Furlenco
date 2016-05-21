package test;

import static com.jayway.restassured.RestAssured.given;

import org.junit.Test;

import com.jayway.restassured.http.ContentType;

import properties.Constant;

public class TestGet {
	
	Constant c = new Constant();

	
	public void get1(){
		
		given().
		accept(c.Content).
		
when().
		get(c.BaseUrl + c.new_orders).
then().//log().all().
		statusCode(c.ok);
	

	}
	
	
		
		
		
		
	}
	
	
	

