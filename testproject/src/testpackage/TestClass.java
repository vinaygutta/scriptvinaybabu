package testpackage;

import java.io.IOException;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestClass {
	WebDriver driver;
	UtilitiesForProject putil;
    @Before
    public void setUp() throws Exception {
         driver = new FirefoxDriver();
         putil=new UtilitiesForProject();
  }
  @After
  public void tearDown() throws Exception {
         driver.quit();
  }

  @Test
  public void test() throws IOException {
	  driver.get("https://www.google.com");
        putil.takescreenshotnow(driver, 1);                  
  }
  
  @Test
  public void test2() throws IOException {
	  driver.get("http://jsbin.com/usidix/1");
	  putil.takescreenshotnow(driver, 2);
      driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
      //putil.takescreenshotnow(driver, 3);
      String alertMessage = driver.switchTo().alert().getText();
      driver.switchTo().alert().accept();
     
      System.out.println(alertMessage);
  }
  }
