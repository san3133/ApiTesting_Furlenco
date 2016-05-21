package properties;

import java.io.File;

import com.jayway.restassured.http.ContentType;

import Utils.utility;

public class Constant {
	
	utility u = new utility();
	
	
	
	
	
	//public String BaseUrl = "https://furlenco-alfred-staging-1.herokuapp.com/api/orders/new_orders";
	public String BaseUrl = "https://furlenco-alfred-staging-1.herokuapp.com/api/orders/";

	public String new_orders = "new_orders/";
    public String Content = "ContentType.JSON";
    public int ok = 200;
    public int created = 201;
 //   public File new_orders = new File("/Users/irfannadir/Documents/workspace/RestAssured_Furlenco/src/main/java/properties/generated.json");
    public File testOrders1 = new File("/Users/irfannadir/Documents/workspace/RestAssured_Furlenco/src/main/java/properties/testOrders1.json");


 
 
}
