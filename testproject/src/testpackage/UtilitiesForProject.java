package testpackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilitiesForProject {
	
	public UtilitiesForProject()
	{
		
	}
	
	public void takescreenshotnow(WebDriver driver, int countname) throws IOException {
		// Code to capture the screenshot
	  	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // Code to copy the screenshot in the desired location
	  	FileUtils.copyFile(scrFile, new File("C:\\CaptureScreenshot\\screenshot" + countname + ".jpg"));                  
  }
}
