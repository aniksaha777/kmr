package StepDefinations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class LoginSteps {
	
	WebDriver driver;
	
	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMMSALAPTOP1\\Desktop\\AutomationDrivers\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://ua13.kmrapplications.com/local13test/");
		driver.manage().window().maximize();
	}

	@When("^the title of Login page is Login$")
	public void the_title_of_Login_page_is_Login(){
	    String title = driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals("Login | Local-13", title);
	    
	    
	}

	@And("User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_Password(String username, String password )  {
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
	    
	   
	}

	@And("^User Clicks on Login button$")
	public void user_Clicks_on_Login_button() {
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click(); 
	   
	}
	
	@Then("^User is on Dashboard$")
	public void user_is_on_Dashboard()  {
	boolean isPresent = driver.findElement(By.xpath("//*[@title=\"Log Out\"]")).isDisplayed();
	if(isPresent= true) {
		System.out.println("User is Logged in Successfully");
	}
	else {
			System.out.println("User is Not Logged In");	
	}
	}
}

