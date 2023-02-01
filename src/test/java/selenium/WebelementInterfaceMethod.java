package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebelementInterfaceMethod {
	public WebDriver driver;
	@BeforeMethod
	public void driver()
	{
		System.setProperty("webdriver.chrome.driver ","C:\\Users\\user-1\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver();
		  
}
	@Test
	
	public void fbloginPage() throws InterruptedException
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
		 driver.navigate().to("https://www.youtube.com/");
    	 Thread.sleep(2000);
    	 driver.navigate().back();
    	 Thread.sleep(2000);
    	 driver.navigate().refresh();
    	 Thread.sleep(2000);
    	 driver.navigate().forward();
    	 driver.navigate().back();
	}
	@Test
    public void getlocationmethod() throws InterruptedException {	 
		 driver.get("https://www.amazon.com/");	 
    	 Thread.sleep(2000);
		 driver.manage().window().maximize();
    	  Point point = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).getLocation();
    	System.out.println("The x co-orinate position :"+ point.x); 
    	System.out.println("The y co-orinate position : "+ point.y); 
}
	@Test
    	public void getSizeofSerchFiled() throws InterruptedException {
    		driver.get("https://www.amazon.com/");	 
       	 Thread.sleep(2000);
   		 driver.manage().window().maximize();
         Dimension dimension = driver.findElement(By.id("twotabsearchtextbox")).getSize();
         System.out.println(dimension);       
         System.out.println("Height of the Serch Field  "+dimension.height);
         System.out.println("Width of the Serch Field  "+dimension.width);
    	}
	@Test
	public void isDisplayMethod() throws InterruptedException {
		driver.get("https://www.amazon.com/");	 
      	 Thread.sleep(2000);
      	 driver.manage().window().maximize();
      	System.out.println(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).isDisplayed());
	}
	@Test
	public void isEnable() throws InterruptedException {
		driver.get("https://www.amazon.com/");	 
     	 Thread.sleep(2000);
       	 driver.manage().window().maximize();
          System.out.println(driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isEnabled());
	}
	@Test
	public void isSelected() throws InterruptedException {
		driver.get("https://omayo.blogspot.com/");	
		 Thread.sleep(2000);
      	 driver.manage().window().maximize();
      	System.out.println(driver.findElement(By.xpath("//input[@id='checkbox1']")).isSelected());
	}
	@Test
	public void clearMethod() throws InterruptedException {
		driver.get("https://omayo.blogspot.com/");	
		 Thread.sleep(2000);
     	 driver.manage().window().maximize();
     	 Thread.sleep(5000);
     	 driver.findElement(By.id("textbox1")).clear();
	}	
	
	
}
	
	
     
    	

