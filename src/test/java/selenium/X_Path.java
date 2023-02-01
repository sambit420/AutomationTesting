package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class X_Path {
	public WebDriver driver;
	@BeforeMethod
	public void driver()
	{
		System.setProperty("webdriver.chrome.driver ","C:\\Users\\user-1\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver();
}
	@Test
	
	public void xpathLocator() throws InterruptedException {

		 driver.get("https://www.google.com/");	 
   	 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
   	 driver.navigate().to("https://demo.actitime.com/login.do");
   	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("trainee");
   	 Thread.sleep(2000);
   	 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("trainee");
   	 Thread.sleep(2000);
   	 //clock image
    	driver.findElement(By.xpath("//div[@class='atLogoImg']")).click();
    	 Thread.sleep(2000);
   	 driver.findElement(By.xpath("//input[@type='checkbox']")).click();
   	 Thread.sleep(2000);
   	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	}
	@Test
	
	public void textMethodofLoginButton () throws InterruptedException {
		driver.get("https://www.google.com/");	 
   	          Thread.sleep(2000);
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
	   	 driver.navigate().to("https://demo.actitime.com/login.do");
		   	 Thread.sleep(2000);
		   	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("trainee");
		   	 Thread.sleep(2000);
		   	 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("trainee");
		   	 Thread.sleep(2000);
		   	 driver.findElement(By.xpath("//div[text()='Login']")).click();
		   	 
	
	}
	@Test
	public void actiTIMEIncTEStMethod() throws InterruptedException {
		driver.get("https://www.google.com/");	 
	          Thread.sleep(2000);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
 	 driver.navigate().to("https://demo.actitime.com/login.do");
	   	 Thread.sleep(2000);
	   	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("trainee");
	   	 Thread.sleep(2000);
	   	 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("trainee");
	   	 Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
	}
	@Test
	public void actiTIME2020OnlineTestMethod() throws InterruptedException {
		driver.get("https://www.google.com/");	 
        Thread.sleep(2000);
	     driver.manage().window().maximize();
	    Thread.sleep(2000);
         driver.navigate().to("https://demo.actitime.com/login.do");
 	      Thread.sleep(2000);
 	      driver.findElement(By.xpath("//nobr[text()='actiTIME 2020 Online']")).click();
	}
	@Test
	public void actiTIME2020OnlineUsingContainsFunctionWithTextMethod() throws InterruptedException {
		driver.get("https://www.google.com/");	 
        Thread.sleep(2000);
	     driver.manage().window().maximize();
	    Thread.sleep(2000);
         driver.navigate().to("https://demo.actitime.com/login.do");
 	      Thread.sleep(2000);
 	      driver.findElement(By.xpath("//nobr[contains(text(),'actiTIME 2020 Online')]")).click();
	}
	@Test
	public void clockImageUsingContainsWithAttribute() throws InterruptedException {
		driver.get("https://www.google.com/");	 
        Thread.sleep(2000);
	     driver.manage().window().maximize();
	    Thread.sleep(2000);
         driver.navigate().to("https://demo.actitime.com/login.do");
 	      Thread.sleep(2000);
          driver.findElement(By.xpath("//div[contains(@class,'atLogoImg')]")).click();
	
}
	@Test
	public void groupIndex() throws InterruptedException {
		driver.get("file:///C:/Users/user-1/reletivexpath.html");
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("-sambit");
		 Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("-sam");
		 Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("-liku");
		 Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("-sandip");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input)[last()]")).sendKeys("-liku");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input)[last()-1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input[1])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input[1])[2]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input[1])[last()]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[2]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input[2])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input[2])[2]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input[2])[last()]")).click();
	}
}