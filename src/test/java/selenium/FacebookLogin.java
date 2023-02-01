package selenium;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookLogin 
	{
	public WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver ","C:\\Users\\user-1\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver();
	}
	@Test
	public void login_Page() throws InterruptedException
	{
		
		 driver.get("https://www.facebook.com/");
	
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 String title=driver.getTitle();
		 System.out.println(title);
		 String source =driver.getPageSource();
		 System.out.println(source);
		 String url =driver.getCurrentUrl();
		 System.out.println(url);
				// driver.close();
		// driver.quit();	 
	}
	@Test
	     public void navigate() throws InterruptedException {
		
	    	 driver.get("https://www.facebook.com/");	 
	    	 Thread.sleep(2000);
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
	    	 driver.navigate().to("https://www.youtube.com/");
	    	 Thread.sleep(2000);
	    	 driver.navigate().back();
	    	 Thread.sleep(2000);
	    	 driver.navigate().refresh();
	    	 Thread.sleep(2000);
	    	 driver.navigate().forward();
	     }
	@Test
	       public void login() throws InterruptedException {
	    	   driver.get("https://www.facebook.com/");	 
		    	 Thread.sleep(2000);
				 driver.manage().window().maximize();
	    	   
	    	  WebElement element= driver.findElement(By.id("email"));
	    	  element.sendKeys("sambitbehera23@yahoo.com");
	    	  element.clear();
	    	  element.sendKeys("sambitbehera23@yahoo.com");
	    	   driver.findElement(By.name("pass")).sendKeys("@23456");
	    	   driver.findElement(By.name("login")).click();
	}
	@Test
	    	   public void link() throws InterruptedException {
	    		   driver.get("https://www.facebook.com/");	 
			    	Thread.sleep(2000);
					 driver.manage().window().maximize();
		    	   //driver.findElement(By.linkText("Forgotten password?")).click();
		    	   driver.findElement(By.partialLinkText("Forgotten")).click();
	       }
	@Test
	public void css() throws InterruptedException {
		driver.get("https://www.facebook.com/");	 
   	 Thread.sleep(2000);  
		 driver.manage().window().maximize();
	   	 Thread.sleep(2000);
	  WebElement element= driver.findElement(By.cssSelector("input[type='text']"));
	  element.sendKeys("sambitbehera23@yahoo.com");
		
	}
	@Test
	public void screenShot() throws IOException{
		driver.get("https://www.facebook.com/");	 
			 driver.manage().window().maximize();
			 WebElement element= driver.findElement(By.id("email"));
	    	 element.sendKeys("sambitbehera23@yahoo.com");
	    	 TakesScreenshot ts =(TakesScreenshot)driver;
	    	  File sfile =ts.getScreenshotAs(OutputType.FILE);
	    	  File dfile = new File("D:\\Day1Problems\\CQA114\\FaceBook_ScreenShot\\"+"Facebook.png");
	    	  FileHandler.copy(sfile,dfile);	
	}
}