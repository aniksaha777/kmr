package StepDefinations;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import junit.framework.Assert;
import runner.highlighter;

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
	    WebElement uname = driver.findElement(By.xpath("//*[@id=\"email\"]"));
	    highlighter.highLightElement(driver, uname);
		uname.sendKeys("mgg");
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
	public void user_is_on_Apps_Builder_Create_Classification_Page() throws InterruptedException {
		
		WebElement AppsBuiler =driver.findElement(By.xpath("//*[@id=\"build_a_2\"]"));
		highlighter.highLightElement(driver, AppsBuiler);
		AppsBuiler.click();
		//highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@id=\"build_div_2\"]//button[2]/img")));
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		//driver.findElement(By.xpath("//*[@id=\"build_div_2\"]//button[2]/img")).click();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		highlighter.highLightElement(driver, driver.findElement(By.xpath("//a[text()=\"Manage Classification\"]")));
		driver.findElement(By.xpath("//a[text()=\"Manage Classification\"]")).click();
		Thread.sleep(5000);
		//highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")));
		driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")).click();
		highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@id=\"function_111\"]/span/a")));
		driver.findElement(By.xpath("//*[@id=\"function_111\"]/span/a")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		driver.switchTo().frame("functionContent");
	    
	}

	@When("^the user enters valid data and clicks on Submit$")
	public void the_user_enters_valid_data_and_clicks_on_Submit(DataTable CreateClassification) throws InterruptedException {
		List<Map<String, String>> list = CreateClassification.asMaps(String.class, String.class);
		Select cf_grp = new Select(driver.findElement(By.xpath("//*[@id=\"ClassificationGroupID\"]")));
		cf_grp.selectByVisibleText(list.get(0).get("Classification_Group"));
		driver.findElement(By.xpath("//*[@id=\"ClassificationCode\"]")).sendKeys(list.get(0).get("Classification_Code"));
		driver.findElement(By.xpath("//*[@id=\"ClassificationDescription\"]")).sendKeys(list.get(0).get("Classification_Desc"));
		driver.findElement(By.xpath("//*[@id=\"Short\"]")).sendKeys(list.get(0).get("Short"));
		driver.findElement(By.xpath("//*[@id=\"Wages\"]")).sendKeys(list.get(0).get("Wages"));
		System.out.println("Data Entered Successfully");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"Submit\"]")).click();
		System.out.println("User clicked on Submit");
		
	}

	@Then("^new classification is displayed in grid$")
	public void new_classification_is_displayed_in_grid(DataTable VerifyClassification) throws InterruptedException {
		List<Map<String, String>> lista = VerifyClassification.asMaps(String.class, String.class);
		Thread.sleep(5000);
		List  col = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr[2]/td"));
        List  rows = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr/td[1]")); 
        for(int i=2;i<=rows.size();i++) {    	 
        	String gid = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[1]")).getText();
        	String cdesc = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[2]")).getText();
        	String Short = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[3]")).getText(); 
        	String cgrp = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[4]")).getText();
        	String Wages = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[5]")).getText(); 
        	if(lista.get(0).get("Classification_Code").equals(gid)) {
        		System.out.println("Classification Code Matched:"+gid);
        		if(lista.get(0).get("Classification_Desc").equals(cdesc)) {
        			System.out.println("Classification desc Matched:"+cdesc);
        			if(lista.get(0).get("Short").equals(Short)) {
        				System.out.println("Classification Short Matched:"+Short);	
        				if(lista.get(0).get("Classification_Group").equals(cgrp))
        					System.out.println("Classification_Group Matched:"+cgrp);
        					if(lista.get(0).get("Wages").equals(Wages)){
        						System.out.println("Wages Matched:"+Wages);
        	        			 break;
        					}
        			}
        			
        		}
        		else {
            		Assert.fail();
            	}
        	break;
        	
        	} 	 
        }     
	}

}
