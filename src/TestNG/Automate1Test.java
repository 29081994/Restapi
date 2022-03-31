package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Automate1Test {
	
	
	
	
	
	@Test(dataProvider="getdata")
	public void ValidateLogin(String email,String password) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mayur\\Downloads\\driver\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		
		
		
		
		d1.get("https://www.facebook.com/");
		d1.findElement(By.cssSelector("input[name='email']")).sendKeys(email);
		d1.findElement(By.cssSelector("div#passContainer")).click();
		WebDriverWait w=new WebDriverWait(d1,10);
		w.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#pass"))).click();
		d1.findElement(By.cssSelector("input#pass")).sendKeys(password);
		
	}

	@DataProvider
	public Object[][] getdata() {
		
		Object[][] data=new Object[3][2];
		
		data[0][0]="firstname";
		data[0][1]="pass1";
		
		
		data[1][0]="secondname";
		data[1][1]="pass2";
		
		
		data[2][0]="thirdnaame";
		data[2][1]="pass3";
		return data;
		
		
		
		
		
	}
}

