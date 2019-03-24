package StepDefinations;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import junit.framework.Assert;

@SuppressWarnings("deprecation")

public class CreateClassification {
	
	WebDriver driver;
	@Given("^The User is logged in$")
	public void the_User_is_logged_in() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMMSALAPTOP1\\Desktop\\AutomationDrivers\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://ua13.kmrapplications.com/local13test/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
	    Assert.assertEquals("Login | Local-13", title);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("mgg");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mgg1105");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click(); 
		boolean isPresent = driver.findElement(By.xpath("//*[@title=\"Log Out\"]")).isDisplayed();
		if(isPresent= true) {
			System.out.println("User is Logged in Successfully");
		}
		else {
				System.out.println("User is Not Logged In");	
		}
	}

	@When("^User is on Apps Builder Create Classification Page$")
	public void user_is_on_Apps_Builder_Create_Classification_Page() {
		driver.findElement(By.xpath("//*[@id=\"build_a_2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"build_div_2\"]//button[2]/img")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//*[text()=\"Manage Classification\"]")).click();
		driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"function_111\"]//a")).click();
		driver.switchTo().frame("functionContent");
		
		
	    
	    
	}

	@When("^the user enters valid data and clicks on Submit$")
	public void the_user_enters_valid_data_and_clicks_on_Submit() {

	}

	@Then("^new classification is displayed in grid$")
	public void new_classification_is_displayed_in_grid() {
	    // Write code here that turns the phrase above into concrete actions
	}

}
