package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Automate2Test {
	
	@Parameters({"BaseURL","ApiKey"})
	@BeforeClass
	public void Testn(String urlname, String key)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mayur\\Downloads\\driver\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
	
	
	System.out.println("before suite");
	System.out.println(urlname);
	System.out.println(key);
	
}
	
	@BeforeClass
	public void Beforeclass() {
		
		System.out.println("before class");
		
	}
}

//from cloned guy