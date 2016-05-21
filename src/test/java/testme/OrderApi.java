package testme;

import org.testng.annotations.Test;

import common.BuisnessLogic;

public class OrderApi {
	
	BuisnessLogic b = new BuisnessLogic();

	
	@Test
	
	public void test(){
		
		b.testPostGet();
		
	}
}
