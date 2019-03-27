
package StepDefinations;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.jsoup.nodes.DataNode;
import org.junit.Assert;
import org.junit.Assert.*;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import cucumber.runtime.junit.Assertions;
import runner.highlighter;
import org.openqa.selenium.*;
@SuppressWarnings("deprecation")

public class TestSteps {
	
	WebDriver driver;
	
	//WebDriverWait wait = new WebDriverWait(driver,30);
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
		highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@id=\"password\"]")));
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
		driver.switchTo().frame("functionContent");
		highlighter.highLightElement(driver, driver.findElement(By.xpath("//td[contains(text(),\"Manage Classification\")]")));
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//td[contains(text(),\"Manage Classification\")]")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		driver.switchTo().defaultContent();
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Submit\"]")).click();
		System.out.println("User clicked on Submit");
		
	}

	@Then("^new classification is displayed in grid$") 
	public void new_classification_is_displayed_in_grid(DataTable VerifyClassification) throws InterruptedException {
		List<Map<String, String>> lista = VerifyClassification.asMaps(String.class, String.class);
		Thread.sleep(5000);
		List  col = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr[2]/td"));
        List  rows = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr/td[1]")); 
        boolean isFound = false;
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
        						isFound = true;
        	        			 break;
        					}
        				}
        			}
            	}
        }
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[@href=\"/local13test/index/logout\"]")).click();
		String title = driver.getTitle();
	    Assert.assertEquals("Login | Local-13", title);    
	    driver.close();
	    if(isFound==false) {
        	System.out.println("Row Not found");
        	Assert.fail("Data is not Present");
        }   
	}
	
	
	@When("^User is on Apps Builder Edit Classification Page$")
	public void user_is_on_Apps_Builder_Edit_Classification_Page() throws InterruptedException{
		WebElement AppsBuiler =driver.findElement(By.xpath("//*[@id=\"build_a_2\"]"));
		highlighter.highLightElement(driver, AppsBuiler);
		AppsBuiler.click();
		driver.switchTo().frame("functionContent");
		highlighter.highLightElement(driver, driver.findElement(By.xpath("//td[contains(text(),\"Manage Classification\")]")));
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//td[contains(text(),\"Manage Classification\")]")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")).click();
		highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@id=\"function_112\"]/span/a")));
		driver.findElement(By.xpath("//*[@id=\"function_112\"]/span/a")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		driver.switchTo().frame("functionContent");	

	}

	@When("^User selects classification and clicks on Edit$")
	public void user_selects_classification_and_clicks_on_Edit(DataTable ReadCl) throws InterruptedException  {
		List<Map<String, String>> lista = ReadCl.asMaps(String.class, String.class);
		Thread.sleep(5000);
        List  rows = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr/td[1]")); 
        for(int i=1;i<=rows.size();i++) {
        	String gid = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[1]")).getText();
        	String cdesc = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[2]")).getText();
        	if(lista.get(0).get("Classification_Code").equals(gid)) {
        		if(lista.get(0).get("Classification_Desc").equals(cdesc)) {
        			driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr["+i+"]/td[6]/a[@href]")).click();
        			System.out.println("Clicked on the Edit Button Successfully");
        			break;
        		}
        	}
        }
	}

	@When("^User Edits classification data and clicks on Submit$")
	public void user_Edits_classification_data_and_clicks_on_Submit(DataTable EditCl) throws InterruptedException {
		List<Map<String, String>> liste = EditCl.asMaps(String.class, String.class);
		Select cf_grp = new Select(driver.findElement(By.xpath("//*[@id=\"ClassificationGroupID\"]")));
		cf_grp.selectByVisibleText(liste.get(0).get("Classification_Group"));
		driver.findElement(By.xpath("//*[@id=\"ClassificationCode\"]")).sendKeys(Keys.chord(Keys.CONTROL, "a"), liste.get(0).get("Classification_Code"));
		//driver.findElement(By.xpath("//*[@id=\"ClassificationCode\"]")).sendKeys(liste.get(0).get("Classification_Code"));
		driver.findElement(By.xpath("//*[@id=\"ClassificationDescription\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"ClassificationDescription\"]")).sendKeys(liste.get(0).get("Classification_Desc"));
		driver.findElement(By.xpath("//*[@id=\"Short\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Short\"]")).sendKeys(liste.get(0).get("Short"));
		driver.findElement(By.xpath("//*[@id=\"Wages\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"Wages\"]")).sendKeys(liste.get(0).get("Wages"));
		System.out.println("Data Edited Successfully");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Submit\"]")).click();
		System.out.println("User clicked on Submit");		
	}
	
	@When("^User selects classification and clicks on Delete$")
	public void user_selects_classification_and_clicks_on_Delete(DataTable DelCl) throws InterruptedException  {
		List<Map<String, String>> lista = DelCl.asMaps(String.class, String.class);
		Thread.sleep(5000);
        List  rows = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr/td[1]")); 
        Boolean IsPresent =false;
        for(int i=1;i<=rows.size();i++) {
        	String gid = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[1]")).getText();
        	String cdesc = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr["+ i+"]/td[2]")).getText();
        	if(lista.get(0).get("Classification_Code").equals(gid)) {
        		highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr["+ i+"]/td[2]")));
        		if(lista.get(0).get("Classification_Desc").equals(cdesc)) {
        			driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr["+ i+"]/td[6]/a[2]")).click();	
/*        			Actions actions = new Actions(driver);
       				WebElement elem = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr["+ i+"]/td[6]/a[2]"));
        			highlighter.highLightElement(driver, elem);
        			actions.moveToElement(elem).perform();
        			elem.click();*/
        			IsPresent =true;
        			break;
        		}	
        	}
        }
        if(IsPresent=false) {
        	Assert.fail("Failed to Click the Delete Button");
        	System.out.println("Delete Button Not Found");
        }
	}

	@When("^User Clicks on Ok in Alert$")
	public void user_Clicks_on_Ok_in_Alert() {
		String atxt =driver.switchTo().alert().getText();
		if(atxt.equals("Are you sure, you want to delete this record?")) {
			driver.switchTo().alert().accept();	
			System.out.println("Record is deleted");
		}
		else {
			driver.switchTo().alert().dismiss();
			Assert.fail("Alert Not found.Hence Cannot Be Deleted");
		}
	}

	@Then("^new classification is not displayed in grid$")
	public void new_classification_is_not_displayed_in_grid(DataTable DltChk) throws InterruptedException {
		List<Map<String, String>> lista = DltChk.asMaps(String.class, String.class);
		Thread.sleep(5000);
        List  rows = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr/td[1]")); 
        boolean isFound = false;
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
        				if(lista.get(0).get("Classification_Group").equals(cgrp)) {
        					System.out.println("Classification_Group Matched:"+cgrp);
        					if(lista.get(0).get("Wages").equals(Wages)){
        						System.out.println("Wages Matched:"+Wages);
        						isFound = true;
        	        			 break;
        					}
        				}
        			}
            	}
        	}
        }
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[@href=\"/local13test/index/logout\"]")).click();
		String title = driver.getTitle();
	    Assert.assertEquals("Login | Local-13", title);    
	    driver.close();
	    if(isFound==true) {
        	System.out.println("Data is Present");
        	Assert.fail("Data is Present");
        }
	}
	
	
	@When("^User is on Manage Attendance Create Category Page$")
	public void user_is_on_Manage_Attendance_Create_Category_Page(){
		WebElement Training =driver.findElement(By.xpath("//*[@id=\"build_a_9\"]"));
		highlighter.highLightElement(driver, Training);
		Training.click();
		driver.switchTo().frame("functionContent");
		highlighter.highLightElement(driver, driver.findElement(By.xpath("//td[contains(text(),\"Attendance Category\")]")));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//td[contains(text(),\"Attendance Category\")]")).click();
		driver.switchTo().defaultContent();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")));
		driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")).click();
		highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@id=\"function_116\"]/span/a")));
		driver.findElement(By.xpath("//*[@id=\"function_116\"]/span/a")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		driver.switchTo().frame("functionContent");
		boolean isPresent = driver.findElement(By.xpath("//*[@id=\"frm5\"]//td[contains(text(),\"Create Attendance\")]")).isDisplayed();
		if(!isPresent) {
			System.out.println("User is not in Create Attendance Page");
			Assert.fail("User is not in Create Attendance Page");
		}

	}
	@When("^User Enters Valid Data and Clicks on Submit$")
	public void user_Enters_Valid_Data_and_Clicks_on_Submit(DataTable CrtAttCat) {
		List<Map<String, String>> listatt = CrtAttCat.asMaps(String.class, String.class);
		
		driver.findElement(By.xpath("//*[@id=\"AttendanceCategoryName\"]")).sendKeys(listatt.get(0).get("AttendanceCategory"));
		driver.findElement(By.xpath("//*[@id=\"PointsApplied\"]")).sendKeys(listatt.get(0).get("Points_Applied"));
		driver.findElement(By.xpath("//*[@id=\"PointsLost\"]")).sendKeys(listatt.get(0).get("Points_Lost"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Data Entered Successfully");
		driver.findElement(By.xpath("//*[@id=\"Submit\"]")).click();
		System.out.println("User Clicked on Submit");
	}

	@Then("^New Category is displayed in the grid$")
	public void new_Category_is_displayed_in_the_grid(DataTable VerAttCat) {
		List<Map<String, String>> lista = VerAttCat.asMaps(String.class, String.class);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		List  col = driver.findElements(By.xpath("//*[@id=\"list\"]//tr[1]/td"));
		//System.out.println("Col "+col.size());
        List  rows = driver.findElements(By.xpath("//*[@id=\"list\"]//tr/td[1]")); 
       // System.out.println("Rows "+rows.size());
        boolean isFound = false;
        for(int i=2;i<=rows.size();i++) {    	 
        	String Attcat = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[1]")).getText();
        	String Pappl = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[2]")).getText();
        	String Plost = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[3]")).getText();
        	
        	if(lista.get(0).get("AttendanceCategory").equals(Attcat)) {
        		System.out.println("Classification Code Matched:"+Attcat);       		
        		if(lista.get(0).get("Points_Applied").equals(Pappl)) {
        			System.out.println("Classification desc Matched:"+Pappl);
        			if(lista.get(0).get("Points_Lost").equals(Plost)) {
        				System.out.println("Classification Short Matched:"+Plost);	
						isFound = true;
	        			 break;				
    				}
        		}
            }
        }
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[@href=\"/local13test/index/logout\"]")).click();
		String title = driver.getTitle();
	    Assert.assertEquals("Login | Local-13", title);    
	    driver.close();
	    if(isFound==false) {
        	System.out.println("Row Not found");
        	Assert.fail("Data is not Present");
        } 	
	}
	

	@When("^User is on Manage Attendance Category Page$")
	public void user_is_on_Manage_Attendance_Category_Page(){
		WebElement Training =driver.findElement(By.xpath("//*[@id=\"build_a_9\"]"));
		highlighter.highLightElement(driver, Training);
		Training.click();
		driver.switchTo().frame("functionContent");
		highlighter.highLightElement(driver, driver.findElement(By.xpath("//td[contains(text(),\"Attendance Category\")]")));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//td[contains(text(),\"Attendance Category\")]")).click();
		driver.switchTo().defaultContent();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")));
		driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@id=\"function_117\"]/span/a")));
		driver.findElement(By.xpath("//*[@id=\"function_117\"]/span/a")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		driver.switchTo().frame("functionContent");
		boolean isPresent = driver.findElement(By.xpath("//div[contains(text(),\"Manage Attendance\")]")).isDisplayed();
		if(!isPresent) {
			System.out.println("User is not in Manage Attendance Page");
			Assert.fail("User is not in Manage Attendance Page");
		}
	}
	
	@When("^User User selects Attendance Category and clicks on Edit$")
	public void user_User_selects_Attendance_Category_and_clicks_on_Edit(DataTable fEditCat) {
		List<Map<String, String>> lista = fEditCat.asMaps(String.class, String.class);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        List  rows = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr/td[1]")); 
        for(int i=1;i<=rows.size();i++) {
        	String Attcat = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[1]")).getText();
        	String Pappl = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[2]")).getText();
        	String Plost = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[3]")).getText();
        	if(lista.get(0).get("AttendanceCategory").equals(Attcat)) {
        		if(lista.get(0).get("Points_Applied").equals(Pappl)) {
        			if(lista.get(0).get("Points_Lost").equals(Plost))
        				driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr["+i+"]/td[4]/a[1]")).click();
        				System.out.println("Clicked on the Edit Button Successfully");
        				break;
        		}
        	}
        }
	}
	@When("^User Edits Valid Data and Clicks on Submit$")
	public void user_Edits_Valid_Data_and_Clicks_on_Submit(DataTable EdtAttCat) {
		
		
		List<Map<String, String>> listedtatt = EdtAttCat.asMaps(String.class, String.class);
		driver.findElement(By.xpath("//*[@id=\"AttendanceCategoryName\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"AttendanceCategoryName\"]")).sendKeys(listedtatt.get(0).get("AttendanceCategory"));
		driver.findElement(By.xpath("//*[@id=\"PointsApplied\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"PointsApplied\"]")).sendKeys(listedtatt.get(0).get("Points_Applied"));
		driver.findElement(By.xpath("//*[@id=\"PointsLost\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"PointsLost\"]")).sendKeys(listedtatt.get(0).get("Points_Lost"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Data Edited Successfully");
		driver.findElement(By.xpath("//*[@id=\"Submit\"]")).click();
		System.out.println("User Clicked on Submit");
	}
	@When("^User User selects Attendance Category and clicks on Delete$")
	public void user_User_selects_Attendance_Category_and_clicks_on_Delete(DataTable DelAttCat) {
		List<Map<String, String>> lista = DelAttCat.asMaps(String.class, String.class);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        List  rows = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr/td[1]")); 
        Boolean IsFound =false;
        for(int i=1;i<=rows.size();i++) {
        	String Attcat = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[1]")).getText();
        	String Pappl = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[2]")).getText();
        	String Plost = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[3]")).getText();
        	if(lista.get(0).get("AttendanceCategory").equals(Attcat)) {
        		if(lista.get(0).get("Points_Applied").equals(Pappl)) {
        			if(lista.get(0).get("Points_Lost").equals(Plost))
        				driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr["+i+"]/td[4]/a[2]")).click();
        				System.out.println("Clicked on the Delete Button Successfully");
        				IsFound =true;
        				break;
        		}
        	}
        }
        if(IsFound==false) {
        	Assert.fail("Data Cannot be Found");
        	System.out.println("Data Cannot be Found");
        }
	}

	@When("^User Clicks on Ok in Deletion Alert$")
	public void user_Clicks_on_Ok_in_Deletion_Alert() {
		String atxt =driver.switchTo().alert().getText();
		if(atxt.contains("Are you sure to delete this Attendance")) {
			driver.switchTo().alert().accept();	
			System.out.println("Record is deleted");
		}
		else {
			driver.switchTo().alert().dismiss();
			Assert.fail("Alert Not found.Hence Cannot Be Deleted");
		}
	}

	@Then("^New Category is not displayed in the grid$")
	public void new_Category_is_not_displayed_in_the_grid(DataTable DelCat) {
		List<Map<String, String>> lista = DelCat.asMaps(String.class, String.class);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		List  col = driver.findElements(By.xpath("//*[@id=\"list\"]//tr[1]/td"));
        List  rows = driver.findElements(By.xpath("//*[@id=\"list\"]//tr/td[1]")); 
        boolean isFound = false;
        for(int i=2;i<=rows.size();i++) {    	 
        	String Attcat = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[1]")).getText();
        	String Pappl = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[2]")).getText();
        	String Plost = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[3]")).getText();
        	
        	if(lista.get(0).get("AttendanceCategory").equals(Attcat)) {
        		System.out.println("Classification Code Matched:"+Attcat);       		
        		if(lista.get(0).get("Points_Applied").equals(Pappl)) {
        			System.out.println("Classification desc Matched:"+Pappl);
        			if(lista.get(0).get("Points_Lost").equals(Plost)) {
        				System.out.println("Classification Short Matched:"+Plost);	
						isFound = true;
	        			 break;				
    				}
        		}
            }
        }
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[@href=\"/local13test/index/logout\"]")).click();
		String title = driver.getTitle();
	    Assert.assertEquals("Login | Local-13", title);    
	    driver.close();
	    if(isFound==true) {
        	System.out.println("Row found, Not Deleted");
        	Assert.fail("Data Not Deleted");
        } 	
	
	}

}
