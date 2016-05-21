package testme;

import java.io.IOException;

import org.testng.annotations.Test;

import test.TestGet;
import test.TestPost2;
import test.testPost;

public class testing {

	TestGet t = new TestGet();
	TestPost2 tp = new TestPost2();
	testPost tp1 = new testPost();
	
	@Test (priority = 1)
	public void testmepost() throws Exception{
		
		tp.post();
		
	}
	
	
	@Test (priority = 2)
	public void testmeget() throws Exception{
		
		t.get1();
		
	}
	
	@Test (priority = 3)
	public void testmepost1(){
		tp1.test();
		
	}
		
	}
