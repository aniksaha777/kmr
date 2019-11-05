package runner;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Screenshots {
    static long cTime = System.currentTimeMillis();
    public static String scrshtFolder = "Screenshots_"+cTime;
	public static void capture(WebDriver driver, String ScreenshotName) {

		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    try {
      // Specify the destination where the image will be saved
    	
    	File dest = new File("./Screenshots/"+"\\"+scrshtFolder +"\\" + ScreenshotName + ".png");
      // Copy the screenshot to destination
      FileUtils.copyFile(src, dest);
      System.out.println("Screenshot Taken:"+ScreenshotName);
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
  }
}