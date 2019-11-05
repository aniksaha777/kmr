package runner;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

 
public class highlighter {
	
	public static void highLightElement(WebDriver driver, WebElement element){
	JavascriptExecutor js=(JavascriptExecutor)driver;  
	js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", element);
	try {
	Thread.sleep(1000);
	} 
	catch (InterruptedException e) {
	 
	System.out.println(e.getMessage());
	} 
	js.executeScript("arguments[0].setAttribute('style','border: 0px');", element); 
	}

}
