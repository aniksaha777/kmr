
package StepDefinations;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import cucumber.api.java.en.Given;
import edu.emory.mathcs.backport.java.util.Arrays;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import runner.highlighter;
import org.openqa.selenium.*;


public class TestSteps {
	
	WebDriver driver;	
	
	@Given("^The User is on the AFM Online join Page$")
	public void the_User_is_on_the_AFM_Online_join_Page(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMMSALAPTOP1\\Desktop\\AutomationDrivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get(data.get(0).get(0));
		driver.manage().window().maximize();
		runner.highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@id=\"content-H\"]//div[contains(text(),\" Online Join Form\")]")));
		boolean isPresent = driver.findElement(By.xpath("//*[@id=\"content-H\"]//div[contains(text(),\" Online Join Form\")]")).isDisplayed();
		if(isPresent) {
			System.out.println("User is in AFM Online Join Page");
			runner.Screenshots.capture(driver, "Homepage");
		}
		else {
				System.out.println("User is not on  AFM Online Join Page");
				driver.quit();
		}
	}

	@When("^User Enters the Member Details$")
	public void user_Enters_the_Member_Details(DataTable args2) throws Throwable {
		List<Map<String, String>> data = args2.asMaps(String.class, String.class);
		String val = data.get(0).get("SSN");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"MSSN\"]"));
		element.clear();
		element.sendKeys(Keys.ENTER);
		for (int i =0;i<val.length();i++)
		{
			char c = val.charAt(i);
			String s = new StringBuilder().append(c).toString();
			element.sendKeys(s);
			Thread.sleep(250);
		}
		driver.findElement(By.xpath("//input[@value =\"HEALTHCARE\"]")).click();
		Thread.sleep(10000);
		
		
		String reasons = data.get(0).get("JoiningReason");
		
		String[] reasonSplit = reasons.split(",");
		System.out.println("Splitted Reasons:");
		for (int j=0;j< reasonSplit.length;j++) {
			System.out.print(reasonSplit[j]+"||");	
		}
		List <WebElement> Reason = driver.findElements(By.name("REASONFORJOINING[]"));
		System.out.println("\n"+"WebElement Reasons:");
		for (int i = 0; i < Reason.size(); i++) {
			String sreason = Reason.get(i).getAttribute("value");
			System.out.print(sreason +"||");
			if(Arrays.asList(reasonSplit).contains(sreason)) {
			Reason.get(i).click();
			
			}
		}
		
		Thread.sleep(2000);
		WebElement OtherR = driver.findElement(By.xpath("//input[@value =\"OTHER\"]"));
		if(OtherR.isSelected()) {
			WebElement OtherReason = driver.findElement(By.xpath("//*[@id=\"REASONOTHER\"]"));
			Boolean IsPresent = OtherReason.isDisplayed();
			if(IsPresent) {
				OtherReason.sendKeys(data.get(0).get("OtherReason"));
				System.out.println("\n"+"Other Reason field is Displayed");
			}
		
			else {
				System.out.println("Other Reason field is not Displayed");
				driver.quit();
			}
		}
		driver.findElement(By.xpath("//*[@id=\"LNAME\"]")).sendKeys(data.get(0).get("LastName"));
		driver.findElement(By.xpath("//*[@id=\"FNAME\"]")).sendKeys(data.get(0).get("FirstName"));
		driver.findElement(By.xpath("//*[@id=\"INIT\"]")).sendKeys(data.get(0).get("Initial"));
		driver.findElement(By.xpath("//*[@id=\"DIRNAME\"]")).sendKeys(data.get(0).get("DirName"));
		Select Gender = new Select(driver.findElement(By.xpath("//*[@id=\"SEX\"]")));
			Gender.selectByVisibleText(data.get(0).get("Gender"));
		WebElement dob = driver.findElement(By.xpath("//*[@id=\"DOB\"]"));
		String DateofBirth = data.get(0).get("DOB");
		
		element.clear();
		element.sendKeys(Keys.ENTER);
		for (int i =0;i<DateofBirth.length();i++)
		{
			char d = val.charAt(i);
			String a = new StringBuilder().append(d).toString();
			dob.sendKeys(a);
			Thread.sleep(250);
		}	
		//driver.findElement(By.xpath("//*[@id=\"DOB\"]")).sendKeys(data.get(0).get("DOB"));	
		
		
/*		driver.findElement(By.xpath("//*[@id=\"onlineJoin\"]/div[8]/img")).click();
		Select Year = new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]//select[@data-handler =\"selectYear\"]")));
			Year.selectByVisibleText("1970");
		Select Month = new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]//select[@data-handler =\"selectMonth\"]")));
			Month.selectByVisibleText("May");
			Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]//a[text()=\"4\"]")).sendKeys(Keys.ENTER);*/
		Thread.sleep(2000);
		runner.Screenshots.capture(driver,"MemberDetails");
	}

	@When("^Clicks on Continue$")
	public void clicks_on_Continue() throws Throwable {
		Boolean IsClickable = driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).isDisplayed();
		
		if(IsClickable) {
			
			System.out.println("Continue Button Found");
			Thread.sleep(2000);	
			driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
			Thread.sleep(2000);	
			System.out.println("Clicked on Continue Button");
			
		}
		else {
			System.out.println("Continue Button Not Present.Terminating Automation");
			driver.quit();
		}
		
	    
	    
	}

	@When("^User Enters the Contact Details$")
	public void user_Enters_the_Contact_Details(DataTable args3) throws Throwable {
		List<Map<String, String>> data = args3.asMaps(String.class, String.class);
		driver.findElement(By.xpath("//*[@id=\"ADDR1\"]")).sendKeys(data.get(0).get("Address1"));
		driver.findElement(By.xpath("//*[@id=\"ADDR2\"]")).sendKeys(data.get(0).get("Address2"));
		
		WebElement zip =driver.findElement(By.xpath("//*[@id=\"address-zip1\"]"));
		String val1 = data.get(0).get("Zip");
		zip.clear();
		for (int i =0;i<val1.length();i++)
		{
			char c = val1.charAt(i);
			String s = new StringBuilder().append(c).toString();
			zip.sendKeys(s);
			Thread.sleep(500);
		}
		driver.findElement(By.xpath("//*[@id=\"address-zip1\"]")).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"PPHONE\"]")).sendKeys("1234567890");
		driver.findElement(By.xpath("//*[@id=\"CELLPHONE\"]")).sendKeys("1234567891");
		driver.findElement(By.xpath("//*[@id=\"WORKPHONE\"]")).sendKeys("1234567892");
		Select PhoneType = new Select(driver.findElement(By.xpath("//*[@id=\"primary_phone\"]")));
		PhoneType.selectByVisibleText("Home");
		driver.findElement(By.xpath("//*[@id=\"EMAIL\"]")).sendKeys("babebiv711@mail8app.com");
		driver.findElement(By.xpath("//*[@id=\"WEBADDR\"]")).sendKeys("www.google.com");
		driver.findElement(By.xpath("//input[@type=\"radio\" and @value=\"N\"]")).click();
		Thread.sleep(2000);
		runner.Screenshots.capture(driver, "ContactDetails");
	}

	@When("^User Enters Instrument Details$")
	public void user_Enters_Instrument_Details(DataTable args4) throws Throwable {
		List<Map<String, String>> data = args4.asMaps(String.class, String.class);
		Select Instrument = new Select(driver.findElement(By.xpath("//*[@id=\"PrimaryInstrument\"]")));
		Instrument.selectByVisibleText("AFRICAN DRUM");
		driver.findElement(By.xpath("//input[@value=\"Add Instrument\"]")).click();
	  	Thread.sleep(2000);
	  	boolean isPresent = driver.findElement(By.xpath("//*[@id=\"OtherInstrument2\"]")).isDisplayed();
	  	if(isPresent) {
	  		System.out.println("Other Instrument Section is displayed");
	  		Select secInstrument = new Select(driver.findElement(By.xpath("//*[@id=\"OtherInstrument2\"]")));
	  		secInstrument.selectByVisibleText("AFRICAN LUKEMBI");
	  		driver.findElement(By.xpath("//*[@id=\"CurrentMusicalGroup\"]")).sendKeys("musical group");
	  		driver.findElement(By.xpath("//*[@id=\"CurrentManagersAgent\"]")).sendKeys("test ensemble agent");
	  		List <WebElement> cba = driver.findElements(By.name("working_under_cba"));
	  		//System.out.println(data.get(0).get("CBA"));
	  		for(int i= 0; i<=cba.size();i++)
	  		{
	  			String sValue = cba.get(i).getAttribute("value");
	  			System.out.println(sValue);
	  			if(sValue.equals(data.get(0).get("CBA"))) {
	  				System.out.println(sValue);
	  				cba.get(i).click();
	  				break;
	  			}
	  		}
	  		driver.findElement(By.xpath("//*[@id=\"ensemble_brand_organization\"]")).sendKeys("test ensemble org");
	  		Thread.sleep(2000);
	  		runner.Screenshots.capture(driver, "InstrumentDetails");

		
	  }
	}

	@When("^User Accepts Terms and Conditions with Signature$")
	public void user_Accepts_Terms_and_Conditions_with_Signature(DataTable args5) throws Throwable {
		List<Map<String, String>> data = args5.asMaps(String.class, String.class);
		
	    driver.findElement(By.xpath("//*[@id=\"terms_signature\"]")).sendKeys(data.get(0).get("sign1"));
	    driver.findElement(By.xpath("//*[@id=\"authorization_signature\"]")).sendKeys(data.get(0).get("sign2"));
	    driver.findElement(By.xpath("//*[@id=\"agree_terms\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"agree_authorization\"]")).click();
	    Thread.sleep(4000);
	    runner.Screenshots.capture(driver, "Terms&Conditions");
	}

	@When("^User Verifies the Payment Page$")
	public void user_Verifies_the_Payment_Page(DataTable args6) throws Throwable {
		List<Map<String, String>> data = args6.asMaps(String.class, String.class);
		Select Quarters = new Select(driver.findElement(By.xpath("//*[@id=\"Periods\"]")));
				Quarters.selectByVisibleText(data.get(0).get("Quarters"));
		Thread.sleep(5000);
		
		List <WebElement> tempo1 = driver.findElements(By.name("tempo"));
		for(int i= 0; i<=tempo1.size();i++)
  		{
  			String tValue = tempo1.get(i).getAttribute("value");
  			System.out.println(tValue);
  			if(tValue.equals(data.get(0).get("tempo802Fed"))) {
  				//System.out.println(tValue);
  				tempo1.get(i).click();
  				break;
  			}
  		}
		List <WebElement> tempo_ny = driver.findElements(By.name("tempo_ny"));
		for(int i= 0; i<=tempo_ny.size();i++)
  		{
  			String nValue = tempo_ny.get(i).getAttribute("value");
  			System.out.println(nValue);
  			if(nValue.equals(data.get(0).get("tempo_ny"))) {
  				//System.out.println(tValue);
  				tempo_ny.get(i).click();
  				break;
  			}
  		}
		List <WebElement> merf = driver.findElements(By.name("map"));
		for(int i= 0; i<=tempo_ny.size();i++)
  		{
  			String oValue = tempo_ny.get(i).getAttribute("value");
  			System.out.println(oValue);
  			if(oValue.equals(data.get(0).get("musicianfund"))) {
  				//System.out.println(tValue);
  				merf.get(i).click();
  				break;
  			}
  		}
		List <WebElement> awsf = driver.findElements(By.name("scl_fund"));
		for(int i= 0; i<=tempo_ny.size();i++)
  		{
  			String aValue = awsf.get(i).getAttribute("value");
  			System.out.println(aValue);
  			if(aValue.equals(data.get(0).get("anniewalkerfund"))) {
  				//System.out.println(tValue);
  				awsf.get(i).click();
  				break;
  			}
  		}		
		Thread.sleep(5000);
		runner.Screenshots.capture(driver,"PaymentDetails");
	    
	}

	@When("^Checks out to Pay through Paypal$")
	public void checks_out_to_Pay_through_Paypal() throws Throwable{
		runner.Screenshots.capture(driver,"PaypalImage");
	    driver.findElement(By.xpath("//input[@type =\"image\" and @src=\"/afmlocal802/public/img/paypal-button2.png\"]")).click();
	    
	    Thread.sleep(10000);
	}

	@When("^Logs into paypal$")
	public void logs_into_paypal(DataTable args7) throws Throwable {
		List<Map<String, String>> data = args7.asMaps(String.class, String.class);
		runner.Screenshots.capture(driver,"Paypalid");
	    driver.findElement(By.name("login_email")).sendKeys(data.get(0).get("Paypalid"));
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"btnNext\"]")).click();
	    Thread.sleep(2000);
	    runner.Screenshots.capture(driver,"PaypalPw");
	    driver.findElement(By.name("login_password")).sendKeys(data.get(0).get("PaypalPassword"));
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	    Thread.sleep(10000);
	    
	    
	}

	@When("^Completes payment through Paypal$")
	public void completes_payment_through_Paypal() throws Throwable {
		runner.Screenshots.capture(driver, "Paypal_Payment");
		runner.highlighter.highLightElement(driver, driver.findElement(By.id("confirmButtonTop")));
		driver.findElement(By.xpath("//*[@id=\"confirmButtonTop\"]")).click();
		runner.Screenshots.capture(driver, "Paypal_Payment_continue");
	    Thread.sleep(7000);
	}
	
	
	

	@Then("^The user should be Registered Successfully$")
	public void the_user_should_be_Registered_Successfully() throws Throwable {
	   runner.Screenshots.capture(driver, "Payment_Success");
	   if(driver.findElement(By.xpath("//div[contains(text(),\"Thank you!\")]")).isDisplayed()){
		   System.out.println("Payment is Successful");
		   runner.highlighter.highLightElement(driver, driver.findElement(By.xpath("//div[contains(text(),\"Thank you!\")]")));
		   runner.Screenshots.capture(driver, "Payment_Success_Hl");
		   String Expected = "Thank you, your payment has been processed. We will assign your membership card number and mail your new card out within 1 to 2 business days. Please check your email for login instructions to access the Local 802 Member Portal. ";
		   String Actual = driver.findElement(By.xpath("//*[@id=\"content-H\"]//div[2]//div[6]")).getText();
		   if(Expected==Actual) {
			   System.out.println("Registration is Successful");
			   driver.quit();
		   }
		   //Assert.assertEquals(Expected, Actual);
		   
	   }
	   else {
		   System.out.println("Registration is not Successful");
		   runner.Screenshots.capture(driver,"Registration Issue");
		   driver.quit();
	   }
	  driver.quit();  
	}
}
