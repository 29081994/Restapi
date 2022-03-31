package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

public class Automate3Test {
	
	
	@BeforeTest
	public void FindLargest() {
		
	
		
		int a[]= {10,89,556,45,34};
		int largest=a[0];
		
		
		for(int i=0;i<a.length;i++) 
		{
			
				if(a[i]>largest) {
				
					
					largest=a[i];
				}
				
			}
			
			
		System.out.println("max number is" +largest );
	}
	@AfterSuite
	public void failure() {
		
		System.out.println("failing");
		Assert.assertTrue(false);
	}
}

