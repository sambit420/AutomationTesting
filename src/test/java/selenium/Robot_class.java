package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Robot_class {
	public WebDriver driver;
	@BeforeMethod
	public void driver()
	{
		System.setProperty("webdriver.chrome.driver ","C:\\Users\\user-1\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver();
}
	@Test
	public void usingRobot_class_Mouse() throws InterruptedException, AWTException
	{
		
		 driver.get("https://www.google.com/");	 
    	 Thread.sleep(2000);
    	 // maximize the window
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
    	 driver.navigate().to("https://www.myntra.com/");
    	 Thread.sleep(2000);
		  Robot robot = new Robot();
		  robot.mouseWheel(6);
		  Thread.sleep(4000);
		  robot.mouseWheel(-2);
		  Thread.sleep(4000);
		  robot.mouseMove(100, 500);
	}
	@Test
	public void usingRobot_class_Keyboard() throws InterruptedException, AWTException {
		driver.get("https://www.google.com/");	 
   	 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
   	 driver.navigate().to("https://www.facebook.com/");
   	 Thread.sleep(2000);
   	 driver.findElement(By.id("email")).click(); 
   	Robot robot = new Robot();
	  robot.keyPress(KeyEvent.VK_S);
	  robot.keyRelease(KeyEvent.VK_S);
	  robot.keyPress(KeyEvent.VK_A);
	  robot.keyRelease(KeyEvent.VK_A);
	  
	  robot.keyPress(KeyEvent.VK_CONTROL);
	  robot.keyPress(KeyEvent.VK_A);
	 
	  robot.keyRelease(KeyEvent.VK_CONTROL);
	  robot.keyRelease(KeyEvent.VK_A);
	 
	  
	  robot.keyPress(KeyEvent.VK_CONTROL);
	  robot.keyPress(KeyEvent.VK_C);
	 
	  robot.keyRelease(KeyEvent.VK_CONTROL);
	  robot.keyRelease(KeyEvent.VK_C);
	  //driver.findElement(By.name("pass")).click();
	  robot.keyPress(KeyEvent.VK_TAB);
	  robot.keyRelease(KeyEvent.VK_TAB);
	  
	  robot.keyPress(KeyEvent.VK_CONTROL);
	  robot.keyPress(KeyEvent.VK_V);
	 
	  robot.keyRelease(KeyEvent.VK_CONTROL);
	  robot.keyRelease(KeyEvent.VK_V);
	  
}
	}