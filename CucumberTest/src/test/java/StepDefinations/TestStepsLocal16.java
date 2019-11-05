//
//package StepDefinations;
//import java.io.File;
//import java.io.IOException;
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.chrome.ChromeDriver;
////import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//import org.apache.commons.io.FileUtils;
//import org.junit.Assert;
//import cucumber.api.DataTable;
//import cucumber.api.java.en.*;
//import runner.highlighter;
//import org.openqa.selenium.*;
//
//
//public class TestStepsLocal16 {
//	
//	WebDriver driver;
//	
//	//WebDriverWait wait = new WebDriverWait(driver,30);
//	@Given("^I navigate to the login page$")
//	public void i_navigate_to_the_login_page() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMMSALAPTOP1\\Desktop\\AutomationDrivers\\chromedriver.exe");
//		driver =new ChromeDriver();
//		driver.get("http://69.2.53.57/local16/");
//		driver.manage().window().maximize();
//		String title = driver.getTitle();
//	    Assert.assertEquals("Login | Local-16", title);
//	}
//
//	@When("^I submit username and password$")
//	public void i_submit_username_and_password()  {
//	    WebElement uname = driver.findElement(By.xpath("//*[@id=\"email\"]"));
//	    highlighter.highLightElement(driver, uname);
//		uname.sendKeys("mgg");
//		highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@id=\"password\"]")));
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("sammsa@123");
//		runner.Screenshots.capture(driver, "LoginPage"); 
//	}
//
//	@Then("^I should be logged in$")
//	public void i_should_be_logged_in() {
//
//	}
//
//	
//	@Given("^The User is on Login Page$")
//	public void the_user_is_on_login_page() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMMSALAPTOP1\\Desktop\\AutomationDrivers\\chromedriver.exe");
//		driver =new ChromeDriver();
//		driver.get("http://69.2.53.57/local16/");
//		driver.manage().window().maximize();
//		String title = driver.getTitle();
//	    Assert.assertEquals("Login | Local-16", title);
//	}
//
//	@When("^The user enters userid and password$")
//	public void the_user_enters_userid_and_password() {
//	    WebElement uname = driver.findElement(By.xpath("//*[@id=\"email\"]"));
//	    highlighter.highLightElement(driver, uname);
//		uname.sendKeys("mgg");
//		highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@id=\"password\"]")));
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("sammsa@123");
//		runner.Screenshots.capture(driver, "LoginPage");
//		
//	}
//	
//	@When("^Clicks on Submit to Login$")
//	public void clicks_on_Submit_to_Login(){
//		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
//
//	}
//
//
//	@Then("^The User should be logged in$")
//	public void the_User_should_be_logged_in() {
//		boolean isPresent = driver.findElement(By.xpath("//*[@title=\"Log Out\"]")).isDisplayed();
//		if(isPresent) {
//			System.out.println("User is Logged in Successfully");
//			runner.Screenshots.capture(driver, "LoggedinUser");
//		}
//		else {
//				System.out.println("User is Not Logged In");	
//		}
//	}
//
//	@Given("^User is on Apps Builder Create Classification Page$")
//	public void user_is_on_Apps_Builder_Create_Classification_Page() throws InterruptedException {
//		
//		WebElement AppsBuiler =driver.findElement(By.xpath("//*[@id=\"build_a_2\"]"));
//		highlighter.highLightElement(driver, AppsBuiler);
//		runner.Screenshots.capture(driver, "AppsBuilder");
//		AppsBuiler.click();
//		
//		driver.switchTo().frame("functionContent");
//		highlighter.highLightElement(driver, driver.findElement(By.xpath("//td[contains(text(),\"Manage Classification\")]")));
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		driver.findElement(By.xpath("//td[contains(text(),\"Manage Classification\")]")).click();
//		runner.Screenshots.capture(driver, "ManageClassification");
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		driver.switchTo().defaultContent();
//		Thread.sleep(5000);
//		//highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")));
//		WebElement WestPaneOpen = driver.findElement(By.xpath("//*[@id=\"west-closer\"]"));
//		boolean isPresent = WestPaneOpen.isDisplayed();
//		if(!isPresent) {
//			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//			driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")).click();	
//		}
//		
//		highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@id=\"function_111\"]/span/a")));
//		driver.findElement(By.xpath("//*[@id=\"function_111\"]/span/a")).click();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		driver.switchTo().frame("functionContent");
//	}
//
//	@When("^the user enters valid data and clicks on Submit$")
//	public void the_user_enters_valid_data_and_clicks_on_Submit(DataTable CreateClassification) throws InterruptedException {
//		List<Map<String, String>> list = CreateClassification.asMaps(String.class, String.class);
//		Select cf_grp = new Select(driver.findElement(By.xpath("//*[@id=\"ClassificationGroupID\"]")));
//		cf_grp.selectByVisibleText(list.get(0).get("Classification_Group"));
//		driver.findElement(By.xpath("//*[@id=\"ClassificationCode\"]")).sendKeys(list.get(0).get("Classification_Code"));
//		driver.findElement(By.xpath("//*[@id=\"ClassificationDescription\"]")).sendKeys(list.get(0).get("Classification_Desc"));
//		driver.findElement(By.xpath("//*[@id=\"Short\"]")).sendKeys(list.get(0).get("Short"));
//		System.out.println("Data Entered Successfully");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"Submit\"]")).click();
//		System.out.println("User clicked on Submit");
//		
//	}
//
//	@Then("^new classification is displayed in grid$") 
//	public void new_classification_is_displayed_in_grid(DataTable VerifyClassification) {
//		List<Map<String, String>> lista = VerifyClassification.asMaps(String.class, String.class);
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		List <?> rows = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr/td[1]")); 
//        boolean isFound = false;
//        for(int i=2;i<=rows.size();i++) {    	 
//        	String gid = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[1]")).getText();
//        	String cdesc = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[2]")).getText();
//        	String Short = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[3]")).getText();
//        	String cgrp = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[4]")).getText();
//        	
//        	
//        	if(lista.get(0).get("Classification_Code").equals(gid)) {
//        		System.out.println("Classification Code Matched:"+gid);       		
//        		if(lista.get(0).get("Classification_Desc").equals(cdesc)) {
//        			System.out.println("Classification desc Matched:"+cdesc);
//        			if(lista.get(0).get("Short").equals(Short)) {
//        				System.out.println("Classification Short Matched:"+Short);	
//        				if(lista.get(0).get("Classification_Group").equals(cgrp))
//        					System.out.println("Classification_Group Matched:"+cgrp);
//        					isFound = true;
//        	        		break;
//        					
//        				}
//        			}
//            	}
//        }
//        driver.switchTo().defaultContent();
//        driver.findElement(By.xpath("//a[@href=\"/local13test/index/logout\"]")).click();
//		String title = driver.getTitle();
//	    Assert.assertEquals("Login | Local-13", title);    
//	    driver.close();
//	    if(isFound==false) {
//        	System.out.println("Row Not found");
//        	Assert.fail("Data is not Present");
//        }   
//	}
//	
//	
//	@Given("^User is on Apps Builder Edit Classification Page$")
//	public void user_is_on_Apps_Builder_Edit_Classification_Page() throws InterruptedException{
//		WebElement AppsBuiler =driver.findElement(By.xpath("//*[@id=\"build_a_2\"]"));
//		highlighter.highLightElement(driver, AppsBuiler);
//		AppsBuiler.click();
//		driver.switchTo().frame("functionContent");
//		highlighter.highLightElement(driver, driver.findElement(By.xpath("//td[contains(text(),\"Manage Classification\")]")));
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		driver.findElement(By.xpath("//td[contains(text(),\"Manage Classification\")]")).click();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		driver.switchTo().defaultContent();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")).click();
//		highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@id=\"function_112\"]/span/a")));
//		driver.findElement(By.xpath("//*[@id=\"function_112\"]/span/a")).click();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		driver.switchTo().frame("functionContent");	
//
//	}
//
//	@When("^User selects classification and clicks on Edit$")
//	public void user_selects_classification_and_clicks_on_Edit(DataTable ReadCl) throws InterruptedException  {
//		List<Map<String, String>> lista = ReadCl.asMaps(String.class, String.class);
//		Thread.sleep(5000);
//        List <?> rows = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr/td[1]")); 
//        for(int i=1;i<=rows.size();i++) {
//        	String gid = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[1]")).getText();
//        	String cdesc = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[2]")).getText();
//        	if(lista.get(0).get("Classification_Code").equals(gid)) {
//        		if(lista.get(0).get("Classification_Desc").equals(cdesc)) {
//        			driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr["+i+"]/td[6]/a[@href]")).click();
//        			System.out.println("Clicked on the Edit Button Successfully");
//        			break;
//        		}
//        	}
//        }
//	}
//
//	@When("^User Edits classification data and clicks on Submit$")
//	public void user_Edits_classification_data_and_clicks_on_Submit(DataTable EditCl) throws InterruptedException {
//		List<Map<String, String>> liste = EditCl.asMaps(String.class, String.class);
//		Select cf_grp = new Select(driver.findElement(By.xpath("//*[@id=\"ClassificationGroupID\"]")));
//		cf_grp.selectByVisibleText(liste.get(0).get("Classification_Group"));
//		driver.findElement(By.xpath("//*[@id=\"ClassificationCode\"]")).sendKeys(Keys.chord(Keys.CONTROL, "a"), liste.get(0).get("Classification_Code"));
//		//driver.findElement(By.xpath("//*[@id=\"ClassificationCode\"]")).sendKeys(liste.get(0).get("Classification_Code"));
//		driver.findElement(By.xpath("//*[@id=\"ClassificationDescription\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"ClassificationDescription\"]")).sendKeys(liste.get(0).get("Classification_Desc"));
//		driver.findElement(By.xpath("//*[@id=\"Short\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"Short\"]")).sendKeys(liste.get(0).get("Short"));
//		driver.findElement(By.xpath("//*[@id=\"Wages\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"Wages\"]")).sendKeys(liste.get(0).get("Wages"));
//		System.out.println("Data Edited Successfully");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"Submit\"]")).click();
//		System.out.println("User clicked on Submit");		
//	}
//	
//	@When("^User selects classification and clicks on Delete$")
//	public void user_selects_classification_and_clicks_on_Delete(DataTable DelCl) throws InterruptedException  {
//		List<Map<String, String>> lista = DelCl.asMaps(String.class, String.class);
//		Thread.sleep(5000);
//        List <?> rows = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr/td[1]")); 
//        Boolean IsPresent =false;
//        for(int i=1;i<=rows.size();i++) {
//        	String gid = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[1]")).getText();
//        	String cdesc = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr["+ i+"]/td[2]")).getText();
//        	if(lista.get(0).get("Classification_Code").equals(gid)) {
//        		highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr["+ i+"]/td[2]")));
//        		if(lista.get(0).get("Classification_Desc").equals(cdesc)) {
//        			driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr["+ i+"]/td[6]/a[2]")).click();	
///*        			Actions actions = new Actions(driver);
//       				WebElement elem = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr["+ i+"]/td[6]/a[2]"));
//        			highlighter.highLightElement(driver, elem);
//        			actions.moveToElement(elem).perform();
//        			elem.click();*/
//        			IsPresent =true;
//        			break;
//        		}	
//        	}
//        }
//        if(!IsPresent) {
//        	Assert.fail("Failed to Click the Delete Button");
//        	System.out.println("Delete Button Not Found");
//        }
//	}
//
//	@When("^User Clicks on Ok in Alert$")
//	public void user_Clicks_on_Ok_in_Alert() {
//		String atxt =driver.switchTo().alert().getText();
//		if(atxt.equals("Are you sure, you want to delete this record?")) {
//			driver.switchTo().alert().accept();	
//			System.out.println("Record is deleted");
//			File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			try {
//				FileUtils.copyFile(src, new File ("C:\\selenium\\error.png"));
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		else {
//			driver.switchTo().alert().dismiss();
//			Assert.fail("Alert Not found.Hence Cannot Be Deleted");
//		}
//	}
//
//	@Then("^new classification is not displayed in grid$")
//	public void new_classification_is_not_displayed_in_grid(DataTable DltChk) throws InterruptedException {
//		List<Map<String, String>> lista = DltChk.asMaps(String.class, String.class);
//		Thread.sleep(5000);
//        List <?> rows = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr/td[1]")); 
//        boolean isFound = false;
//        for(int i=2;i<=rows.size();i++) { 	   	 
//        	String gid = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[1]")).getText();
//        	String cdesc = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[2]")).getText();
//        	String Short = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[3]")).getText();
//        	String cgrp = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[4]")).getText();
//        	String Wages = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[5]")).getText();	
//        	if(lista.get(0).get("Classification_Code").equals(gid)) {
//        		System.out.println("Classification Code Matched:"+gid);       		
//        		if(lista.get(0).get("Classification_Desc").equals(cdesc)) {
//        			System.out.println("Classification desc Matched:"+cdesc);
//        			if(lista.get(0).get("Short").equals(Short)) {
//        				System.out.println("Classification Short Matched:"+Short);	
//        				if(lista.get(0).get("Classification_Group").equals(cgrp)) {
//        					System.out.println("Classification_Group Matched:"+cgrp);
//        					if(lista.get(0).get("Wages").equals(Wages)){
//        						System.out.println("Wages Matched:"+Wages);
//        						isFound = true;
//        	        			 break;
//        					}
//        				}
//        			}
//            	}
//        	}
//        }
//        driver.switchTo().defaultContent();
//        driver.findElement(By.xpath("//a[@href=\"/local13test/index/logout\"]")).click();
//		String title = driver.getTitle();
//	    Assert.assertEquals("Login | Local-13", title);    
//	    driver.close();
//	    if(isFound==true) {
//        	System.out.println("Data is Present");
//        	Assert.fail("Data is Present");
//        }
//	}
//	
//	
//	@When("^User is on Manage Attendance Create Category Page$")
//	public void user_is_on_Manage_Attendance_Create_Category_Page(){
//		WebElement Training =driver.findElement(By.xpath("//*[@id=\"build_a_9\"]"));
//		highlighter.highLightElement(driver, Training);
//		Training.click();
//		driver.switchTo().frame("functionContent");
//		highlighter.highLightElement(driver, driver.findElement(By.xpath("//td[contains(text(),\"Attendance Category\")]")));
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//		driver.findElement(By.xpath("//td[contains(text(),\"Attendance Category\")]")).click();
//		driver.switchTo().defaultContent();
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		//highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")));
//		driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")).click();
//		highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@id=\"function_116\"]/span/a")));
//		driver.findElement(By.xpath("//*[@id=\"function_116\"]/span/a")).click();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		driver.switchTo().frame("functionContent");
//		boolean isPresent = driver.findElement(By.xpath("//*[@id=\"frm5\"]//td[contains(text(),\"Create Attendance\")]")).isDisplayed();
//		if(!isPresent) {
//			System.out.println("User is not in Create Attendance Page");
//			Assert.fail("User is not in Create Attendance Page");
//		}
//
//	}
//	@When("^User Enters Valid Data and Clicks on Submit$")
//	public void user_Enters_Valid_Data_and_Clicks_on_Submit(DataTable CrtAttCat) {
//		List<Map<String, String>> listatt = CrtAttCat.asMaps(String.class, String.class);
//		
//		driver.findElement(By.xpath("//*[@id=\"AttendanceCategoryName\"]")).sendKeys(listatt.get(0).get("AttendanceCategory"));
//		driver.findElement(By.xpath("//*[@id=\"PointsApplied\"]")).sendKeys(listatt.get(0).get("Points_Applied"));
//		driver.findElement(By.xpath("//*[@id=\"PointsLost\"]")).sendKeys(listatt.get(0).get("Points_Lost"));
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Data Entered Successfully");
//		driver.findElement(By.xpath("//*[@id=\"Submit\"]")).click();
//		System.out.println("User Clicked on Submit");
//	}
//
//	@Then("^New Category is displayed in the grid$")
//	public void new_Category_is_displayed_in_the_grid(DataTable VerAttCat) {
//		List<Map<String, String>> lista = VerAttCat.asMaps(String.class, String.class);
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		//List  <?> col = driver.findElements(By.xpath("//*[@id=\"list\"]//tr[1]/td"));
//		//System.out.println("Col "+col.size());
//        List <?> rows = driver.findElements(By.xpath("//*[@id=\"list\"]//tr/td[1]")); 
//       // System.out.println("Rows "+rows.size());
//        boolean isFound = false;
//        for(int i=2;i<=rows.size();i++) {    	 
//        	String Attcat = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[1]")).getText();
//        	String Pappl = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[2]")).getText();
//        	String Plost = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[3]")).getText();
//        	
//        	if(lista.get(0).get("AttendanceCategory").equals(Attcat)) {
//        		System.out.println("Classification Code Matched:"+Attcat);       		
//        		if(lista.get(0).get("Points_Applied").equals(Pappl)) {
//        			System.out.println("Classification desc Matched:"+Pappl);
//        			if(lista.get(0).get("Points_Lost").equals(Plost)) {
//        				System.out.println("Classification Short Matched:"+Plost);	
//						isFound = true;
//	        			 break;				
//    				}
//        		}
//            }
//        }
//        driver.switchTo().defaultContent();
//        driver.findElement(By.xpath("//a[@href=\"/local13test/index/logout\"]")).click();
//		String title = driver.getTitle();
//	    Assert.assertEquals("Login | Local-13", title);    
//	    driver.close();
//	    if(isFound==false) {
//        	System.out.println("Row Not found");
//        	Assert.fail("Data is not Present");
//        } 	
//	}
//	
//
//	@When("^User is on Manage Attendance Category Page$")
//	public void user_is_on_Manage_Attendance_Category_Page(){
//		WebElement Training =driver.findElement(By.xpath("//*[@id=\"build_a_9\"]"));
//		highlighter.highLightElement(driver, Training);
//		Training.click();
//		driver.switchTo().frame("functionContent");
//		highlighter.highLightElement(driver, driver.findElement(By.xpath("//td[contains(text(),\"Attendance Category\")]")));
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//		driver.findElement(By.xpath("//td[contains(text(),\"Attendance Category\")]")).click();
//		driver.switchTo().defaultContent();
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		//highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")));
//		driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")).click();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@id=\"function_117\"]/span/a")));
//		driver.findElement(By.xpath("//*[@id=\"function_117\"]/span/a")).click();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		driver.switchTo().frame("functionContent");
//		boolean isPresent = driver.findElement(By.xpath("//div[contains(text(),\"Manage Attendance\")]")).isDisplayed();
//		if(!isPresent) {
//			System.out.println("User is not in Manage Attendance Page");
//			Assert.fail("User is not in Manage Attendance Page");
//		}
//	}
//	
//	@When("^User User selects Attendance Category and clicks on Edit$")
//	public void user_User_selects_Attendance_Category_and_clicks_on_Edit(DataTable fEditCat) {
//		List<Map<String, String>> lista = fEditCat.asMaps(String.class, String.class);
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//        List <?> rows = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr/td[1]")); 
//        for(int i=1;i<=rows.size();i++) {
//        	String Attcat = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[1]")).getText();
//        	String Pappl = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[2]")).getText();
//        	String Plost = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[3]")).getText();
//        	if(lista.get(0).get("AttendanceCategory").equals(Attcat)) {
//        		if(lista.get(0).get("Points_Applied").equals(Pappl)) {
//        			if(lista.get(0).get("Points_Lost").equals(Plost))
//        				driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr["+i+"]/td[4]/a[1]")).click();
//        				System.out.println("Clicked on the Edit Button Successfully");
//        				break;
//        		}
//        	}
//        }
//	}
//	@When("^User Edits Valid Data and Clicks on Submit$")
//	public void user_Edits_Valid_Data_and_Clicks_on_Submit(DataTable EdtAttCat) {
//		List<Map<String, String>> listedtatt = EdtAttCat.asMaps(String.class, String.class);
//		driver.findElement(By.xpath("//*[@id=\"AttendanceCategoryName\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"AttendanceCategoryName\"]")).sendKeys(listedtatt.get(0).get("AttendanceCategory"));
//		driver.findElement(By.xpath("//*[@id=\"PointsApplied\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"PointsApplied\"]")).sendKeys(listedtatt.get(0).get("Points_Applied"));
//		driver.findElement(By.xpath("//*[@id=\"PointsLost\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"PointsLost\"]")).sendKeys(listedtatt.get(0).get("Points_Lost"));
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Data Edited Successfully");
//		driver.findElement(By.xpath("//*[@id=\"Submit\"]")).click();
//		System.out.println("User Clicked on Submit");
//	}
//	@When("^User User selects Attendance Category and clicks on Delete$")
//	public void user_User_selects_Attendance_Category_and_clicks_on_Delete(DataTable DelAttCat) {
//		List<Map<String, String>> lista = DelAttCat.asMaps(String.class, String.class);
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//        List <?> rows = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr/td[1]")); 
//        Boolean IsFound =false;
//        for(int i=1;i<=rows.size();i++) {
//        	String Attcat = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[1]")).getText();
//        	String Pappl = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[2]")).getText();
//        	String Plost = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[3]")).getText();
//        	if(lista.get(0).get("AttendanceCategory").equals(Attcat)) {
//        		if(lista.get(0).get("Points_Applied").equals(Pappl)) {
//        			if(lista.get(0).get("Points_Lost").equals(Plost))
//        				driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr["+i+"]/td[4]/a[2]")).click();
//        				System.out.println("Clicked on the Delete Button Successfully");
//        				IsFound =true;
//        				break;
//        		}
//        	}
//        }
//        if(IsFound==false) {
//        	Assert.fail("Data Cannot be Found");
//        	System.out.println("Data Cannot be Found");
//        }
//	}
//
//	@When("^User Clicks on Ok in Deletion Alert$")
//	public void user_Clicks_on_Ok_in_Deletion_Alert() {
//		String atxt =driver.switchTo().alert().getText();
//		if(atxt.contains("Are you sure to delete this Attendance")) {
//			driver.switchTo().alert().accept();	
//			System.out.println("Record is deleted");
//		}
//		else {
//			driver.switchTo().alert().dismiss();
//			Assert.fail("Alert Not found.Hence Cannot Be Deleted");
//		}
//	}
//
//	@Then("^New Category is not displayed in the grid$")
//	public void new_Category_is_not_displayed_in_the_grid(DataTable DelCat) {
//		List<Map<String, String>> lista = DelCat.asMaps(String.class, String.class);
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		//List  col = driver.findElements(By.xpath("//*[@id=\"list\"]//tr[1]/td"));
//        List <?> rows = driver.findElements(By.xpath("//*[@id=\"list\"]//tr/td[1]")); 
//        boolean isFound = false;
//        for(int i=2;i<=rows.size();i++) {    	 
//        	String Attcat = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[1]")).getText();
//        	String Pappl = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[2]")).getText();
//        	String Plost = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[3]")).getText();
//        	
//        	if(lista.get(0).get("AttendanceCategory").equals(Attcat)) {
//        		System.out.println("Classification Code Matched:"+Attcat);       		
//        		if(lista.get(0).get("Points_Applied").equals(Pappl)) {
//        			System.out.println("Classification desc Matched:"+Pappl);
//        			if(lista.get(0).get("Points_Lost").equals(Plost)) {
//        				System.out.println("Classification Short Matched:"+Plost);	
//						isFound = true;
//	        			 break;				
//    				}
//        		}
//            }
//        }
//        driver.switchTo().defaultContent();
//        driver.findElement(By.xpath("//a[@href=\"/local13test/index/logout\"]")).click();
//		String title = driver.getTitle();
//	    Assert.assertEquals("Login | Local-13", title);    
//	    driver.close();
//	    if(isFound==true) {
//        	System.out.println("Row found, Not Deleted");
//        	Assert.fail("Data Not Deleted");
//        } 	
//	
//	}
//	@When("^User is on Create Applicant Page$")
//	public void user_is_on_Create_Applicant_Page() {
//		WebElement Training =driver.findElement(By.xpath("//*[@id=\"build_a_9\"]"));
//		highlighter.highLightElement(driver, Training);
//		Training.click();
//		driver.switchTo().frame("functionContent");
//		highlighter.highLightElement(driver, driver.findElement(By.xpath("//td[contains(text(),\"Manage Applicant\")]")));
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//		driver.findElement(By.xpath("//td[contains(text(),\"Manage Applicant\")]")).click();
//		driver.switchTo().defaultContent();
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		//highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")));
//		driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")).click();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@id=\"function_108\"]/span/a")));
//		driver.findElement(By.xpath("//*[@id=\"function_108\"]/span/a")).click();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		driver.switchTo().frame("functionContent");
//		boolean isPresent = driver.findElement(By.xpath("//*[@id=\"tabs\"]//a[contains(text(),\"Applicant Info\")]")).isDisplayed();
//		if(!isPresent) {
//			System.out.println("User is not in Create Page");
//			Assert.fail("User is not in Create Page");
//		}		
//	}
//
//	@When("^User Enters Valid Data for Contact Info Section$")
//	public void user_Enters_Valid_Data_for_Contact_Info_Section(DataTable ContactInfo) throws InterruptedException {
//		List<Map<String, String>> cntctInfo = ContactInfo.asMaps(String.class, String.class);
//		driver.findElement(By.xpath("//*[@id=\"45\"]")).sendKeys(cntctInfo.get(0).get("LastName"));
//		driver.findElement(By.xpath("//*[@id=\"46\"]")).sendKeys(cntctInfo.get(0).get("FirstName"));
//		driver.findElement(By.xpath("//*[@id=\"68\"]")).sendKeys(cntctInfo.get(0).get("MiddleName"));
//		driver.findElement(By.xpath("//*[@id=\"57\"]")).sendKeys(cntctInfo.get(0).get("CareOf"));
//		driver.findElement(By.xpath("//*[@id=\"54\"]")).sendKeys(cntctInfo.get(0).get("Address1"));
//		driver.findElement(By.xpath("//*[@id=\"55\"]")).sendKeys(cntctInfo.get(0).get("Address2"));
//		driver.findElement(By.xpath("//*[@id=\"tab1\"]//tr[9]/td[3]/span/input[1]")).sendKeys(cntctInfo.get(0).get("Zip"));
//		Thread.sleep(3000);
//		String zip =cntctInfo.get(0).get("Zip");
//		driver.findElement(By.xpath("//td[@field=\"ZipCode\"]/div[contains(text(),"+zip+")]")).click();
//		
//		Select country = new Select(driver.findElement(By.id("17")));
//		country.selectByVisibleText(cntctInfo.get(0).get("Country"));
//		Select State = new Select(driver.findElement(By.id("19")));
//		State.selectByVisibleText(cntctInfo.get(0).get("State"));
//		driver.findElement(By.xpath("//*[@id=\"49\"]")).sendKeys(cntctInfo.get(0).get("EmailAddress"));
//		driver.findElement(By.xpath("//*[@id=\"56\"]")).sendKeys(cntctInfo.get(0).get("AlternateEmail"));
//		driver.findElement(By.xpath("//*[@id=\"10180\"]")).sendKeys(cntctInfo.get(0).get("HomePhone"));
//		driver.findElement(By.xpath("//*[@id=\"10181\"]")).sendKeys(cntctInfo.get(0).get("CellPhone"));		
//	}
//
//	@When("^User Enters Valid Data for Applicant Census Info$")
//	public void user_Enters_Valid_Data_for_Applicant_Census_Info(DataTable AppCenInfo) {
//		List<Map<String, String>> AppCenIn = AppCenInfo.asMaps(String.class, String.class);
//		driver.findElement(By.xpath("//*[@id=\"50\"]")).sendKeys(AppCenIn.get(0).get("SSN"));
//		driver.findElement(By.xpath("//*[@id=\"52\"]")).sendKeys(AppCenIn.get(0).get("DOB"));
//		Select AppType = new Select(driver.findElement(By.xpath("//*[@id=\"10178\"]")));
//		AppType.selectByVisibleText(AppCenIn.get(0).get("ApplicantType"));
//		driver.findElement(By.xpath("//*[@id=\"10140\"]")).sendKeys(AppCenIn.get(0).get("ApplicationDate"));
//		Select gender = new Select(driver.findElement(By.xpath("//*[@id=\"65\"]")));
//		gender.selectByVisibleText(AppCenIn.get(0).get("Gender"));
//		Select mStatus = new Select(driver.findElement(By.xpath("//*[@id=\"66\"]")));
//		mStatus.selectByVisibleText(AppCenIn.get(0).get("MaritalStatus"));
//		Select Race = new Select(driver.findElement(By.xpath("//*[@id=\"67\"]")));
//		Race.selectByVisibleText(AppCenIn.get(0).get("Race"));
//		
//		
//	}
//
//	@When("^User Enters Misc Info$")
//	public void user_Enters_Misc_Info(DataTable MiscInf) {
//		List<Map<String, String>> MiscInfo = MiscInf.asMaps(String.class, String.class);
//		
//		Select military = new Select(driver.findElement(By.xpath("//*[@id=\"10131\"]")));
//		military.selectByVisibleText(MiscInfo.get(0).get("MILITARY"));
//		
//		Select over18 = new Select(driver.findElement(By.xpath("//*[@id=\"10132\"]")));
//		over18.selectByVisibleText(MiscInfo.get(0).get("OVER18"));
//		
//		Select Helmetstohardhats = new Select(driver.findElement(By.xpath("//*[@id=\"10133\"]")));
//		Helmetstohardhats.selectByVisibleText(MiscInfo.get(0).get("HelmetstoHardhats"));
//		
//		Select HsGdEq = new Select(driver.findElement(By.xpath("//*[@id=\"10134\"]")));
//		HsGdEq.selectByVisibleText(MiscInfo.get(0).get("HSGEDEquivalent"));
//		
//		Select Resident = new Select(driver.findElement(By.xpath("//*[@id=\"10135\"]")));
//		Resident.selectByVisibleText(MiscInfo.get(0).get("Resident"));
//		
//		driver.findElement(By.xpath("//*[@id=\"10136\"]")).sendKeys(MiscInfo.get(0).get("DriversLicense"));
//		
//		Select RulesSigned = new Select(driver.findElement(By.xpath("//*[@id=\"10137\"]")));
//		RulesSigned.selectByVisibleText(MiscInfo.get(0).get("RulesSigned"));
//		
//		Select CITIZEN = new Select(driver.findElement(By.xpath("//*[@id=\"10138\"]")));
//		CITIZEN.selectByVisibleText(MiscInfo.get(0).get("CITIZEN"));
//		
//		Select CanWork = new Select(driver.findElement(By.xpath("//*[@id=\"10139\"]")));
//		CanWork.selectByVisibleText(MiscInfo.get(0).get("CanWork"));
//		
//		driver.findElement(By.xpath("//*[@id=\"10160\"]")).sendKeys(MiscInfo.get(0).get("DirectEntry"));
//		driver.findElement(By.xpath("//*[@id=\"10177\"]")).sendKeys(MiscInfo.get(0).get("Folder"));
//		driver.findElement(By.xpath("//*[@id=\"10148\"]")).sendKeys(MiscInfo.get(0).get("RelatedWorkExperience"));
//		driver.findElement(By.xpath("//*[@id=\"10150\"]")).sendKeys(MiscInfo.get(0).get("ApplicantNumber"));
//		
//		Select Veteran =new Select(driver.findElement(By.xpath("//*[@id=\"10174\"]")));
//		Veteran.selectByVisibleText(MiscInfo.get(0).get("Veteran"));
//		
//		
//		
//	}
//
//	@When("^User Enters Training Group$")
//	public void user_Enters_Training_Group(DataTable TrInfo) {
//		List<Map<String, String>> TrInf = TrInfo.asMaps(String.class, String.class);
//		driver.findElement(By.xpath("//*[@id=\"10143\"]")).sendKeys(TrInf.get(0).get("StudentID"));
//		driver.findElement(By.xpath("//*[@id=\"10144\"]")).sendKeys(TrInf.get(0).get("DepartmentofLaborID"));
//		driver.findElement(By.xpath("//*[@id=\"10146\"]")).sendKeys(TrInf.get(0).get("ApprenticeshipNumber"));
//	}
//
//	@When("^Clicks on Submit$")
//	public void clicks_on_Submit() {
//		driver.findElement(By.xpath("//*[@id=\"dynamic_submit\"]")).click();
//		try {
//			Thread.sleep(15000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Then("^Applicant Details should be displayed in Grid on Search$")
//	public void applicant_Details_should_be_displayed_in_Grid_on_Search(DataTable VerifyData) {
//		List<Map<String,String>> Vdata = VerifyData.asMaps(String.class, String.class);	
//		driver.findElement(By.xpath("//*[@id=\"gs_LASTNAME\"]")).sendKeys(Vdata.get(0).get("LastName"));
//		driver.findElement(By.xpath("//*[@id=\"gs_SSN\"]")).sendKeys(Vdata.get(0).get("SSN"));
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//		List <?> rows = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr/td[1]")); 
//		boolean isFound = false;
//        
//		for(int i=2;i<=rows.size();i++) {    	 
//        	String LastName = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[2]")).getText();
//        	String FirstName = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[3]")).getText();
//        	String MiddleName = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[4]")).getText();
//        	String SSN = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[5]")).getText();	
//        	String ApplicationDate = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[2]/td[9]")).getText();
//        	
//        	if(Vdata.get(0).get("SSN").equals(SSN)) {
//        		System.out.println("SSN Matched:"+SSN);       		
//        		if(Vdata.get(0).get("LastName").equals(LastName)) {
//        			System.out.println("Last Name Matched:"+LastName);
//        			if(Vdata.get(0).get("FirstName").equals(FirstName)) {
//        				System.out.println("First Name Matched:"+FirstName);	
//        				if(Vdata.get(0).get("MiddleName").equals(MiddleName)) {
//        					System.out.println("Middle Name Matched:"+FirstName);
//        					if(Vdata.get(0).get("ApplicationDate").equals(ApplicationDate)) {
//        						System.out.println("Application Date Matched:"+ApplicationDate);
//        						isFound = true;
//        		        		break;				
//        					}
//        				}								
//    				}
//        		}
//            }
//        }
//		driver.switchTo().defaultContent();
//	    driver.findElement(By.xpath("//a[@href=\"/local13test/index/logout\"]")).click();
//		String title = driver.getTitle();
//		Assert.assertEquals("Login | Local-13", title);    
//		driver.close();
//		if(isFound==false) {
//			System.out.println("Data didnt Match.");
//			Assert.fail("Data didnt Match");
//		}
//	}
//	
//	
//	@When("^User is on Manage Applicant Page$")
//	public void user_is_on_Manage_Applicant_Page() {
//		WebElement Training =driver.findElement(By.xpath("//*[@id=\"build_a_9\"]"));
//		highlighter.highLightElement(driver, Training);
//		Training.click();
//		driver.switchTo().frame("functionContent");
//		highlighter.highLightElement(driver, driver.findElement(By.xpath("//td[contains(text(),\"Manage Applicant\")]")));
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//		driver.findElement(By.xpath("//td[contains(text(),\"Manage Applicant\")]")).click();
//		driver.switchTo().defaultContent();
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		//highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")));
//		driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")).click();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@id=\"function_109\"]/span/a")));
//		driver.findElement(By.xpath("//*[@id=\"function_109\"]/span/a")).click();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		driver.switchTo().frame("functionContent");
//		boolean isPresent = driver.findElement(By.xpath("//div[contains(text(),\"Manage Applicant\")]")).isDisplayed();
//		if(!isPresent) {
//			System.out.println("User is not in Manage Applicant Page");
//			Assert.fail("User is not in Manage Applicant Page");
//		}
//
//	}
//
//	@When("^User Selects Member and Click on Edit$")
//	public void user_Selects_Member_and_Click_on_Edit(DataTable FindData) {
//		List<Map<String,String>> Fdata = FindData.asMaps(String.class, String.class);	
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//		driver.findElement(By.xpath("//*[@id=\"gs_LASTNAME\"]")).sendKeys(Fdata.get(0).get("LastName"));
//		driver.findElement(By.xpath("//*[@id=\"gs_SSN\"]")).sendKeys(Fdata.get(0).get("SSN"));
//		driver.findElement(By.xpath("//*[@id=\"gs_SSN\"]")).sendKeys(Keys.ENTER);
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//		List <?> rows = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr/td[1]")); 
//		boolean isFound = false;
//        
//		for(int i=2;i<=rows.size();i++) {    	 
//        	String LastName = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[2]")).getText();
//        	String FirstName = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[3]")).getText();
//        	String MiddleName = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[4]")).getText();
//        	String SSN = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[5]")).getText();	
//        	String ApplicationDate = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[2]/td[9]")).getText();
//        	
//        	if(Fdata.get(0).get("SSN").equals(SSN)) {
//        		System.out.println("SSN Matched:"+SSN);       		
//        		if(Fdata.get(0).get("LastName").equals(LastName)) {
//        			System.out.println("Last Name Matched:"+LastName);
//        			if(Fdata.get(0).get("FirstName").equals(FirstName)) {
//        				System.out.println("First Name Matched:"+FirstName);	
//        				if(Fdata.get(0).get("MiddleName").equals(MiddleName)) {
//        					System.out.println("Middle Name Matched:"+FirstName);
//        					if(Fdata.get(0).get("ApplicationDate").equals(ApplicationDate)) {
//        						System.out.println("Application Date Matched:"+ApplicationDate);
//        						driver.findElement(By.xpath("//*[@id=\"list\"]//tr["+i+"]/td[12]/div[2]/a[@href]")).click();
//        						isFound = true;
//        		        		break;				
//        					}
//        				}								
//    				}
//        		}
//            }
//        }
//		if(isFound==false) {
//			System.out.println("Edit Button Not Clicked");
//			Assert.fail("Edit Button Not Clicked");
//		}
//
//	}
//
//	@When("^User Edits Data for Contact Info Section$")
//	public void user_Edits_Data_for_Contact_Info_Section(DataTable ContactInfo) {
//		List<Map<String,String>> Cdata = ContactInfo.asMaps(String.class, String.class);
//		
//		driver.findElement(By.xpath("//*[@id=\"45\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"45\"]")).sendKeys(Cdata.get(0).get("LastName"));
//		
//		driver.findElement(By.xpath("//*[@id=\"46\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"46\"]")).sendKeys(Cdata.get(0).get("FirstName"));
//		
//		driver.findElement(By.xpath("//*[@id=\"68\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"68\"]")).sendKeys(Cdata.get(0).get("MiddleName"));
//		
//		driver.findElement(By.xpath("//*[@id=\"57\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"57\"]")).sendKeys(Cdata.get(0).get("CareOf"));
//		
//		driver.findElement(By.xpath("//*[@id=\"54\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"54\"]")).sendKeys(Cdata.get(0).get("Address1"));
//		
//		driver.findElement(By.xpath("//*[@id=\"55\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"55\"]")).sendKeys(Cdata.get(0).get("Address2"));
//		
//		driver.findElement(By.xpath("//*[@id=\"tab1\"]//tr[9]/td[3]/span/input[1]")).clear();
///*		String zip =Cdata.get(0).get("Zip");
//		driver.findElement(By.xpath("//*[@id=\"tab1\"]//tr[9]/td[3]/span/input[1]")).sendKeys(zip);
//		driver.findElement(By.xpath("//td[@field=\"ZipCode\"]/div[contains(text(),"+zip+")]")).click();
//		Select country = new Select(driver.findElement(By.id("17")));
//		country.selectByVisibleText(Cdata.get(0).get("Country"));
//		Select State = new Select(driver.findElement(By.id("19")));
//		State.selectByVisibleText(Cdata.get(0).get("State"));*/
//		
//		driver.findElement(By.xpath("//*[@id=\"49\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"49\"]")).sendKeys(Cdata.get(0).get("EmailAddress"));
//		
//		driver.findElement(By.xpath("//*[@id=\"56\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"56\"]")).sendKeys(Cdata.get(0).get("AlternateEmail"));
//		
//		driver.findElement(By.xpath("//*[@id=\"10180\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"10180\"]")).sendKeys(Cdata.get(0).get("HomePhone"));
//		
//		driver.findElement(By.xpath("//*[@id=\"10181\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"10181\"]")).sendKeys(Cdata.get(0).get("CellPhone"));
//
//		
//	}
//
//	@When("^User Enters Edits Data for Applicant Census Info$")
//	public void user_Enters_Edits_Data_for_Applicant_Census_Info(DataTable CensusData) {
//		List<Map<String,String>> Cdata = CensusData.asMaps(String.class, String.class);
//		
//		
//		//driver.findElement(By.xpath("//*[@id=\"50\"]")).clear();
//		//driver.findElement(By.xpath("//*[@id=\"50\"]")).sendKeys(Cdata.get(0).get("SSN"));
//		
//		driver.findElement(By.xpath("//*[@id=\"52\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"52\"]")).sendKeys(Cdata.get(0).get("DOB"));
//		
//		Select AppType = new Select(driver.findElement(By.xpath("//*[@id=\"10178\"]")));
//		AppType.selectByVisibleText(Cdata.get(0).get("ApplicantType"));
//		
//		driver.findElement(By.xpath("//*[@id=\"10140\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"10140\"]")).sendKeys(Cdata.get(0).get("ApplicationDate"));
//		
//		Select gender = new Select(driver.findElement(By.xpath("//*[@id=\"65\"]")));
//		gender.selectByVisibleText(Cdata.get(0).get("Gender"));
//		
//		Select mStatus = new Select(driver.findElement(By.xpath("//*[@id=\"66\"]")));
//		mStatus.selectByVisibleText(Cdata.get(0).get("MaritalStatus"));
//		
//		Select Race = new Select(driver.findElement(By.xpath("//*[@id=\"67\"]")));
//		Race.selectByVisibleText(Cdata.get(0).get("Race"));
//	
//	}
//
//	@When("^User Edits Data for Misc Info$")
//	public void user_Edits_Data_for_Misc_Info(DataTable MiscInfo) {
//		List<Map<String,String>> Mdata = MiscInfo.asMaps(String.class, String.class);
//		
//		Select military = new Select(driver.findElement(By.xpath("//*[@id=\"10131\"]")));
//		military.selectByVisibleText(Mdata.get(0).get("MILITARY"));
//		
//		Select over18 = new Select(driver.findElement(By.xpath("//*[@id=\"10132\"]")));
//		over18.selectByVisibleText(Mdata.get(0).get("OVER18"));
//		
//		Select Helmetstohardhats = new Select(driver.findElement(By.xpath("//*[@id=\"10133\"]")));
//		Helmetstohardhats.selectByVisibleText(Mdata.get(0).get("HelmetstoHardhats"));
//		
//		Select HsGdEq = new Select(driver.findElement(By.xpath("//*[@id=\"10134\"]")));
//		HsGdEq.selectByVisibleText(Mdata.get(0).get("HSGEDEquivalent"));
//		
//		Select Resident = new Select(driver.findElement(By.xpath("//*[@id=\"10135\"]")));
//		Resident.selectByVisibleText(Mdata.get(0).get("Resident"));
//		
//		driver.findElement(By.xpath("//*[@id=\"10136\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"10136\"]")).sendKeys(Mdata.get(0).get("DriversLicense"));
//		
//		Select RulesSigned = new Select(driver.findElement(By.xpath("//*[@id=\"10137\"]")));
//		RulesSigned.selectByVisibleText(Mdata.get(0).get("RulesSigned"));
//		
//		Select CITIZEN = new Select(driver.findElement(By.xpath("//*[@id=\"10138\"]")));
//		CITIZEN.selectByVisibleText(Mdata.get(0).get("CITIZEN"));
//		
//		Select CanWork = new Select(driver.findElement(By.xpath("//*[@id=\"10139\"]")));
//		CanWork.selectByVisibleText(Mdata.get(0).get("CanWork"));
//		
//		driver.findElement(By.xpath("//*[@id=\"10160\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"10160\"]")).sendKeys(Mdata.get(0).get("DirectEntry"));
//		
//		driver.findElement(By.xpath("//*[@id=\"10177\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"10177\"]")).sendKeys(Mdata.get(0).get("Folder"));
//		
//		driver.findElement(By.xpath("//*[@id=\"10148\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"10148\"]")).sendKeys(Mdata.get(0).get("RelatedWorkExperience"));
//		
//		driver.findElement(By.xpath("//*[@id=\"10150\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"10150\"]")).sendKeys(Mdata.get(0).get("ApplicantNumber"));
//		
//		Select Veteran =new Select(driver.findElement(By.xpath("//*[@id=\"10174\"]")));
//		Veteran.selectByVisibleText(Mdata.get(0).get("Veteran"));
//		
//		
//	}
//
//	@When("^User Edits Data for Training Group$")
//	public void user_Edits_Data_for_Training_Group(DataTable TrGrp) {
//		List<Map<String,String>> TrInf  = TrGrp.asMaps(String.class, String.class);
//		driver.findElement(By.xpath("//*[@id=\"10143\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"10143\"]")).sendKeys(TrInf.get(0).get("StudentID"));
//		
//		driver.findElement(By.xpath("//*[@id=\"10144\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"10144\"]")).sendKeys(TrInf.get(0).get("DepartmentofLaborID"));
//		
//		driver.findElement(By.xpath("//*[@id=\"10146\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"10146\"]")).sendKeys(TrInf.get(0).get("ApprenticeshipNumber"));
//		
//		
//	}
//
//	@When("^User Selects Member and Click on Delete$")
//	public void user_Selects_Member_and_Click_on_Delete(DataTable SelData) {
//		List<Map<String,String>> Ddata = SelData.asMaps(String.class, String.class);	
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		driver.findElement(By.xpath("//*[@id=\"gs_LASTNAME\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"gs_LASTNAME\"]")).sendKeys(Ddata.get(0).get("LastName"));
//		driver.findElement(By.xpath("//*[@id=\"gs_SSN\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"gs_SSN\"]")).sendKeys(Ddata.get(0).get("SSN"));
//		driver.findElement(By.xpath("//*[@id=\"gs_SSN\"]")).sendKeys(Keys.ENTER);
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//		List <?> rows = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr/td[1]")); 
//		boolean isFound = false;
//        
//		for(int i=2;i<=rows.size();i++) {    	 
//        	String LastName = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[2]")).getText();
//        	String FirstName = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[3]")).getText();
//        	String MiddleName = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[4]")).getText();
//        	String SSN = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[5]")).getText();	
//        	String ApplicationDate = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[2]/td[9]")).getText();
//        	
//        	if(Ddata.get(0).get("SSN").equals(SSN)) {
//        		System.out.println("SSN Matched:"+SSN);       		
//        		if(Ddata.get(0).get("LastName").equals(LastName)) {
//        			System.out.println("Last Name Matched:"+LastName);
//        			if(Ddata.get(0).get("FirstName").equals(FirstName)) {
//        				System.out.println("First Name Matched:"+FirstName);	
//        				if(Ddata.get(0).get("MiddleName").equals(MiddleName)) {
//        					System.out.println("Middle Name Matched:"+FirstName);
//        					if(Ddata.get(0).get("ApplicationDate").equals(ApplicationDate)) {
//        						System.out.println("Application Date Matched:"+ApplicationDate);
//        						driver.findElement(By.xpath("//*[@id=\"list\"]//tr["+i+"]/td[12]/div[3]/a[@href]")).click();
//        						System.out.println("Delete Button Clicked");
//        						isFound = true;
//        		        		break;				
//        					}
//        				}								
//    				}
//        		}
//            }
//        }
//		if(isFound==false) {
//			System.out.println("Delete Button Not Clicked");
//			Assert.fail("Delete Button Not Clicked Clicked");
//		}
//
//	}
//
//	@When("^User Clicks on OK in Alert$")
//	public void user_Clicks_on_OK_in_Alert() {
//		String atxt =driver.switchTo().alert().getText();
//		if(atxt.equals("Are you sure, you want to delete this record?")) {
//			driver.switchTo().alert().accept();	
//			System.out.println("Record is deleted");
//			File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			try {
//				FileUtils.copyFile(src, new File ("C:\\selenium\\error.png"));
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		else {
//			driver.switchTo().alert().dismiss();
//			Assert.fail("Alert Not found.Hence Cannot Be Deleted");
//		}
//	}
//
//	@Then("^Applicant Details should not be displayed in Grid on Search$")
//	public void applicant_Details_should_not_be_displayed_in_Grid_on_Search(DataTable VerifyData) {
//		List<Map<String,String>> Vdata = VerifyData.asMaps(String.class, String.class);	
//		driver.findElement(By.xpath("//*[@id=\"gs_LASTNAME\"]")).sendKeys(Vdata.get(0).get("LastName"));
//		driver.findElement(By.xpath("//*[@id=\"gs_SSN\"]")).sendKeys(Vdata.get(0).get("SSN"));
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//		List <?> rows = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr/td[1]")); 
//		boolean isFound = false;
//        
//		for(int i=2;i<=rows.size();i++) {    	 
//        	String LastName = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[2]")).getText();
//        	String FirstName = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[3]")).getText();
//        	String MiddleName = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[4]")).getText();
//        	String SSN = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[5]")).getText();	
//        	String ApplicationDate = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[2]/td[9]")).getText();
//        	
//        	if(Vdata.get(0).get("SSN").equals(SSN)) {
//        		System.out.println("SSN Matched:"+SSN);       		
//        		if(Vdata.get(0).get("LastName").equals(LastName)) {
//        			System.out.println("Last Name Matched:"+LastName);
//        			if(Vdata.get(0).get("FirstName").equals(FirstName)) {
//        				System.out.println("First Name Matched:"+FirstName);	
//        				if(Vdata.get(0).get("MiddleName").equals(MiddleName)) {
//        					System.out.println("Middle Name Matched:"+FirstName);
//        					if(Vdata.get(0).get("ApplicationDate").equals(ApplicationDate)) {
//        						System.out.println("Application Date Matched:"+ApplicationDate);
//        						isFound = true;
//        		        		break;
//        		        
//        					}
//        				}								
//    				}
//        		}
//            }
//        }
//		driver.switchTo().defaultContent();
//	    driver.findElement(By.xpath("//a[@href=\"/local13test/index/logout\"]")).click();
//		String title = driver.getTitle();
//		Assert.assertEquals("Login | Local-13", title);    
//		driver.close();
//		if(isFound) {
//			System.out.println("Data Still present");
//			Assert.fail("Data Still present");
//		}
//
//	}
//
//	@Given("^User is in Manage Member Page$")
//	public void user_is_in_Manage_Member_Page()  {
//	    
//	    
//	}
//
//	@When("^User checks the International Initiation Date$")
//	public void user_checks_the_International_Initiation_Date()  {
//	    // Write code here that turns the phrase above into concrete actions
//	    
//	}
//
//	@Then("^the same date should be displayed in Member details$")
//	public void the_same_date_should_be_displayed_in_Member_details() {
//	    // Write code here that turns the phrase above into concrete actions
//	   
//	}
//	
//	
//}
//
//
///*package StepDefinations;
//import java.io.File;
//import java.io.IOException;
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.chrome.ChromeDriver;
////import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//import org.apache.commons.io.FileUtils;
//import org.junit.Assert;
//import cucumber.api.DataTable;
//import cucumber.api.java.en.*;
//import runner.highlighter;
//import org.openqa.selenium.*;
//
//
//public class TestSteps {
//	
//	WebDriver driver;
//	
//	//WebDriverWait wait = new WebDriverWait(driver,30);
//	
//	
//	@Given("^The User is on Login Page$")
//	public void the_user_is_on_login_page() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMMSALAPTOP1\\Desktop\\AutomationDrivers\\chromedriver.exe");
//		driver =new ChromeDriver();
//		driver.get("http://69.2.53.57/local16/");
//		driver.manage().window().maximize();
//		String title = driver.getTitle();
//	    Assert.assertEquals("Login | Local-16", title);
//	}
//
//	@When("^The user enters userid and password$")
//	public void the_user_enters_userid_and_password() {
//	    WebElement uname = driver.findElement(By.xpath("//*[@id=\"email\"]"));
//	    highlighter.highLightElement(driver, uname);
//		uname.sendKeys("mgg");
//		highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@id=\"password\"]")));
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("sammsa@123");
//		runner.Screenshots.capture(driver, "LoginPage");
//		
//	}
//	
//	@When("^Clicks on Submit to Login$")
//	public void clicks_on_Submit_to_Login(){
//		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
//
//	}
//
//
//	@Then("^The User should be logged in$")
//	public void the_User_should_be_logged_in() {
//		boolean isPresent = driver.findElement(By.xpath("//*[@title=\"Log Out\"]")).isDisplayed();
//		if(isPresent) {
//			System.out.println("User is Logged in Successfully");
//			runner.Screenshots.capture(driver, "LoggedinUser");
//		}
//		else {
//				System.out.println("User is Not Logged In");	
//		}
//	}
//
//	@Given("^User is on Apps Builder Create Classification Page$")
//	public void user_is_on_Apps_Builder_Create_Classification_Page() throws InterruptedException {
//		
//		WebElement AppsBuiler =driver.findElement(By.xpath("//*[@id=\"build_a_2\"]"));
//		highlighter.highLightElement(driver, AppsBuiler);
//		runner.Screenshots.capture(driver, "AppsBuilder");
//		AppsBuiler.click();
//		
//		driver.switchTo().frame("functionContent");
//		highlighter.highLightElement(driver, driver.findElement(By.xpath("//td[contains(text(),\"Manage Classification\")]")));
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		driver.findElement(By.xpath("//td[contains(text(),\"Manage Classification\")]")).click();
//		runner.Screenshots.capture(driver, "ManageClassification");
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		driver.switchTo().defaultContent();
//		Thread.sleep(5000);
//		//highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")));
//		WebElement WestPaneOpen = driver.findElement(By.xpath("//*[@id=\"west-closer\"]"));
//		boolean isPresent = WestPaneOpen.isDisplayed();
//		if(!isPresent) {
//			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//			driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")).click();	
//		}
//		
//		highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@id=\"function_111\"]/span/a")));
//		driver.findElement(By.xpath("//*[@id=\"function_111\"]/span/a")).click();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		driver.switchTo().frame("functionContent");
//	}
//
//	@When("^the user enters valid data and clicks on Submit$")
//	public void the_user_enters_valid_data_and_clicks_on_Submit(DataTable CreateClassification) throws InterruptedException {
//		List<Map<String, String>> list = CreateClassification.asMaps(String.class, String.class);
//		Select cf_grp = new Select(driver.findElement(By.xpath("//*[@id=\"ClassificationGroupID\"]")));
//		cf_grp.selectByVisibleText(list.get(0).get("Classification_Group"));
//		driver.findElement(By.xpath("//*[@id=\"ClassificationCode\"]")).sendKeys(list.get(0).get("Classification_Code"));
//		driver.findElement(By.xpath("//*[@id=\"ClassificationDescription\"]")).sendKeys(list.get(0).get("Classification_Desc"));
//		driver.findElement(By.xpath("//*[@id=\"Short\"]")).sendKeys(list.get(0).get("Short"));
//		System.out.println("Data Entered Successfully");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id=\"Submit\"]")).click();
//		System.out.println("User clicked on Submit");
//		
//	}
//
//	@Then("^new classification is displayed in grid$") 
//	public void new_classification_is_displayed_in_grid(DataTable VerifyClassification) {
//		List<Map<String, String>> lista = VerifyClassification.asMaps(String.class, String.class);
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		List <?> rows = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr/td[1]")); 
//        boolean isFound = false;
//        for(int i=2;i<=rows.size();i++) {    	 
//        	String gid = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[1]")).getText();
//        	String cdesc = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[2]")).getText();
//        	String Short = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[3]")).getText();
//        	String cgrp = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[4]")).getText();
//        	
//        	
//        	if(lista.get(0).get("Classification_Code").equals(gid)) {
//        		System.out.println("Classification Code Matched:"+gid);       		
//        		if(lista.get(0).get("Classification_Desc").equals(cdesc)) {
//        			System.out.println("Classification desc Matched:"+cdesc);
//        			if(lista.get(0).get("Short").equals(Short)) {
//        				System.out.println("Classification Short Matched:"+Short);	
//        				if(lista.get(0).get("Classification_Group").equals(cgrp))
//        					System.out.println("Classification_Group Matched:"+cgrp);
//        					isFound = true;
//        	        		break;
//        					
//        				}
//        			}
//            	}
//        }
//        driver.switchTo().defaultContent();
//        driver.findElement(By.xpath("//a[@href=\"/local13test/index/logout\"]")).click();
//		String title = driver.getTitle();
//	    Assert.assertEquals("Login | Local-13", title);    
//	    driver.close();
//	    if(isFound==false) {
//        	System.out.println("Row Not found");
//        	Assert.fail("Data is not Present");
//        }   
//	}
//	
//	
//	@Given("^User is on Apps Builder Edit Classification Page$")
//	public void user_is_on_Apps_Builder_Edit_Classification_Page() throws InterruptedException{
//		WebElement AppsBuiler =driver.findElement(By.xpath("//*[@id=\"build_a_2\"]"));
//		highlighter.highLightElement(driver, AppsBuiler);
//		AppsBuiler.click();
//		driver.switchTo().frame("functionContent");
//		highlighter.highLightElement(driver, driver.findElement(By.xpath("//td[contains(text(),\"Manage Classification\")]")));
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		driver.findElement(By.xpath("//td[contains(text(),\"Manage Classification\")]")).click();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		driver.switchTo().defaultContent();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")).click();
//		highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@id=\"function_112\"]/span/a")));
//		driver.findElement(By.xpath("//*[@id=\"function_112\"]/span/a")).click();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		driver.switchTo().frame("functionContent");	
//
//	}
//
//	@When("^User selects classification and clicks on Edit$")
//	public void user_selects_classification_and_clicks_on_Edit(DataTable ReadCl) throws InterruptedException  {
//		List<Map<String, String>> lista = ReadCl.asMaps(String.class, String.class);
//		Thread.sleep(5000);
//        List <?> rows = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr/td[1]")); 
//        for(int i=1;i<=rows.size();i++) {
//        	String gid = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[1]")).getText();
//        	String cdesc = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[2]")).getText();
//        	if(lista.get(0).get("Classification_Code").equals(gid)) {
//        		if(lista.get(0).get("Classification_Desc").equals(cdesc)) {
//        			driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr["+i+"]/td[6]/a[@href]")).click();
//        			System.out.println("Clicked on the Edit Button Successfully");
//        			break;
//        		}
//        	}
//        }
//	}
//
//	@When("^User Edits classification data and clicks on Submit$")
//	public void user_Edits_classification_data_and_clicks_on_Submit(DataTable EditCl) throws InterruptedException {
//		List<Map<String, String>> liste = EditCl.asMaps(String.class, String.class);
//		Select cf_grp = new Select(driver.findElement(By.xpath("//*[@id=\"ClassificationGroupID\"]")));
//		cf_grp.selectByVisibleText(liste.get(0).get("Classification_Group"));
//		driver.findElement(By.xpath("//*[@id=\"ClassificationCode\"]")).sendKeys(Keys.chord(Keys.CONTROL, "a"), liste.get(0).get("Classification_Code"));
//		//driver.findElement(By.xpath("//*[@id=\"ClassificationCode\"]")).sendKeys(liste.get(0).get("Classification_Code"));
//		driver.findElement(By.xpath("//*[@id=\"ClassificationDescription\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"ClassificationDescription\"]")).sendKeys(liste.get(0).get("Classification_Desc"));
//		driver.findElement(By.xpath("//*[@id=\"Short\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"Short\"]")).sendKeys(liste.get(0).get("Short"));
//		driver.findElement(By.xpath("//*[@id=\"Wages\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"Wages\"]")).sendKeys(liste.get(0).get("Wages"));
//		System.out.println("Data Edited Successfully");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"Submit\"]")).click();
//		System.out.println("User clicked on Submit");		
//	}
//	
//	@When("^User selects classification and clicks on Delete$")
//	public void user_selects_classification_and_clicks_on_Delete(DataTable DelCl) throws InterruptedException  {
//		List<Map<String, String>> lista = DelCl.asMaps(String.class, String.class);
//		Thread.sleep(5000);
//        List <?> rows = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr/td[1]")); 
//        Boolean IsPresent =false;
//        for(int i=1;i<=rows.size();i++) {
//        	String gid = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[1]")).getText();
//        	String cdesc = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr["+ i+"]/td[2]")).getText();
//        	if(lista.get(0).get("Classification_Code").equals(gid)) {
//        		highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr["+ i+"]/td[2]")));
//        		if(lista.get(0).get("Classification_Desc").equals(cdesc)) {
//        			driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr["+ i+"]/td[6]/a[2]")).click();	
//        			Actions actions = new Actions(driver);
//       				WebElement elem = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr["+ i+"]/td[6]/a[2]"));
//        			highlighter.highLightElement(driver, elem);
//        			actions.moveToElement(elem).perform();
//        			elem.click();
//        			IsPresent =true;
//        			break;
//        		}	
//        	}
//        }
//        if(!IsPresent) {
//        	Assert.fail("Failed to Click the Delete Button");
//        	System.out.println("Delete Button Not Found");
//        }
//	}
//
//	@When("^User Clicks on Ok in Alert$")
//	public void user_Clicks_on_Ok_in_Alert() {
//		String atxt =driver.switchTo().alert().getText();
//		if(atxt.equals("Are you sure, you want to delete this record?")) {
//			driver.switchTo().alert().accept();	
//			System.out.println("Record is deleted");
//			File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			try {
//				FileUtils.copyFile(src, new File ("C:\\selenium\\error.png"));
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		else {
//			driver.switchTo().alert().dismiss();
//			Assert.fail("Alert Not found.Hence Cannot Be Deleted");
//		}
//	}
//
//	@Then("^new classification is not displayed in grid$")
//	public void new_classification_is_not_displayed_in_grid(DataTable DltChk) throws InterruptedException {
//		List<Map<String, String>> lista = DltChk.asMaps(String.class, String.class);
//		Thread.sleep(5000);
//        List <?> rows = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr/td[1]")); 
//        boolean isFound = false;
//        for(int i=2;i<=rows.size();i++) { 	   	 
//        	String gid = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[1]")).getText();
//        	String cdesc = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[2]")).getText();
//        	String Short = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[3]")).getText();
//        	String cgrp = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[4]")).getText();
//        	String Wages = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[5]")).getText();	
//        	if(lista.get(0).get("Classification_Code").equals(gid)) {
//        		System.out.println("Classification Code Matched:"+gid);       		
//        		if(lista.get(0).get("Classification_Desc").equals(cdesc)) {
//        			System.out.println("Classification desc Matched:"+cdesc);
//        			if(lista.get(0).get("Short").equals(Short)) {
//        				System.out.println("Classification Short Matched:"+Short);	
//        				if(lista.get(0).get("Classification_Group").equals(cgrp)) {
//        					System.out.println("Classification_Group Matched:"+cgrp);
//        					if(lista.get(0).get("Wages").equals(Wages)){
//        						System.out.println("Wages Matched:"+Wages);
//        						isFound = true;
//        	        			 break;
//        					}
//        				}
//        			}
//            	}
//        	}
//        }
//        driver.switchTo().defaultContent();
//        driver.findElement(By.xpath("//a[@href=\"/local13test/index/logout\"]")).click();
//		String title = driver.getTitle();
//	    Assert.assertEquals("Login | Local-13", title);    
//	    driver.close();
//	    if(isFound==true) {
//        	System.out.println("Data is Present");
//        	Assert.fail("Data is Present");
//        }
//	}
//	
//	
//	@When("^User is on Manage Attendance Create Category Page$")
//	public void user_is_on_Manage_Attendance_Create_Category_Page(){
//		WebElement Training =driver.findElement(By.xpath("//*[@id=\"build_a_9\"]"));
//		highlighter.highLightElement(driver, Training);
//		Training.click();
//		driver.switchTo().frame("functionContent");
//		highlighter.highLightElement(driver, driver.findElement(By.xpath("//td[contains(text(),\"Attendance Category\")]")));
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//		driver.findElement(By.xpath("//td[contains(text(),\"Attendance Category\")]")).click();
//		driver.switchTo().defaultContent();
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		//highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")));
//		driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")).click();
//		highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@id=\"function_116\"]/span/a")));
//		driver.findElement(By.xpath("//*[@id=\"function_116\"]/span/a")).click();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		driver.switchTo().frame("functionContent");
//		boolean isPresent = driver.findElement(By.xpath("//*[@id=\"frm5\"]//td[contains(text(),\"Create Attendance\")]")).isDisplayed();
//		if(!isPresent) {
//			System.out.println("User is not in Create Attendance Page");
//			Assert.fail("User is not in Create Attendance Page");
//		}
//
//	}
//	@When("^User Enters Valid Data and Clicks on Submit$")
//	public void user_Enters_Valid_Data_and_Clicks_on_Submit(DataTable CrtAttCat) {
//		List<Map<String, String>> listatt = CrtAttCat.asMaps(String.class, String.class);
//		
//		driver.findElement(By.xpath("//*[@id=\"AttendanceCategoryName\"]")).sendKeys(listatt.get(0).get("AttendanceCategory"));
//		driver.findElement(By.xpath("//*[@id=\"PointsApplied\"]")).sendKeys(listatt.get(0).get("Points_Applied"));
//		driver.findElement(By.xpath("//*[@id=\"PointsLost\"]")).sendKeys(listatt.get(0).get("Points_Lost"));
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Data Entered Successfully");
//		driver.findElement(By.xpath("//*[@id=\"Submit\"]")).click();
//		System.out.println("User Clicked on Submit");
//	}
//
//	@Then("^New Category is displayed in the grid$")
//	public void new_Category_is_displayed_in_the_grid(DataTable VerAttCat) {
//		List<Map<String, String>> lista = VerAttCat.asMaps(String.class, String.class);
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		//List  <?> col = driver.findElements(By.xpath("//*[@id=\"list\"]//tr[1]/td"));
//		//System.out.println("Col "+col.size());
//        List <?> rows = driver.findElements(By.xpath("//*[@id=\"list\"]//tr/td[1]")); 
//       // System.out.println("Rows "+rows.size());
//        boolean isFound = false;
//        for(int i=2;i<=rows.size();i++) {    	 
//        	String Attcat = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[1]")).getText();
//        	String Pappl = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[2]")).getText();
//        	String Plost = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[3]")).getText();
//        	
//        	if(lista.get(0).get("AttendanceCategory").equals(Attcat)) {
//        		System.out.println("Classification Code Matched:"+Attcat);       		
//        		if(lista.get(0).get("Points_Applied").equals(Pappl)) {
//        			System.out.println("Classification desc Matched:"+Pappl);
//        			if(lista.get(0).get("Points_Lost").equals(Plost)) {
//        				System.out.println("Classification Short Matched:"+Plost);	
//						isFound = true;
//	        			 break;				
//    				}
//        		}
//            }
//        }
//        driver.switchTo().defaultContent();
//        driver.findElement(By.xpath("//a[@href=\"/local13test/index/logout\"]")).click();
//		String title = driver.getTitle();
//	    Assert.assertEquals("Login | Local-13", title);    
//	    driver.close();
//	    if(isFound==false) {
//        	System.out.println("Row Not found");
//        	Assert.fail("Data is not Present");
//        } 	
//	}
//	
//
//	@When("^User is on Manage Attendance Category Page$")
//	public void user_is_on_Manage_Attendance_Category_Page(){
//		WebElement Training =driver.findElement(By.xpath("//*[@id=\"build_a_9\"]"));
//		highlighter.highLightElement(driver, Training);
//		Training.click();
//		driver.switchTo().frame("functionContent");
//		highlighter.highLightElement(driver, driver.findElement(By.xpath("//td[contains(text(),\"Attendance Category\")]")));
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//		driver.findElement(By.xpath("//td[contains(text(),\"Attendance Category\")]")).click();
//		driver.switchTo().defaultContent();
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		//highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")));
//		driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")).click();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@id=\"function_117\"]/span/a")));
//		driver.findElement(By.xpath("//*[@id=\"function_117\"]/span/a")).click();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		driver.switchTo().frame("functionContent");
//		boolean isPresent = driver.findElement(By.xpath("//div[contains(text(),\"Manage Attendance\")]")).isDisplayed();
//		if(!isPresent) {
//			System.out.println("User is not in Manage Attendance Page");
//			Assert.fail("User is not in Manage Attendance Page");
//		}
//	}
//	
//	@When("^User User selects Attendance Category and clicks on Edit$")
//	public void user_User_selects_Attendance_Category_and_clicks_on_Edit(DataTable fEditCat) {
//		List<Map<String, String>> lista = fEditCat.asMaps(String.class, String.class);
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//        List <?> rows = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr/td[1]")); 
//        for(int i=1;i<=rows.size();i++) {
//        	String Attcat = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[1]")).getText();
//        	String Pappl = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[2]")).getText();
//        	String Plost = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[3]")).getText();
//        	if(lista.get(0).get("AttendanceCategory").equals(Attcat)) {
//        		if(lista.get(0).get("Points_Applied").equals(Pappl)) {
//        			if(lista.get(0).get("Points_Lost").equals(Plost))
//        				driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr["+i+"]/td[4]/a[1]")).click();
//        				System.out.println("Clicked on the Edit Button Successfully");
//        				break;
//        		}
//        	}
//        }
//	}
//	@When("^User Edits Valid Data and Clicks on Submit$")
//	public void user_Edits_Valid_Data_and_Clicks_on_Submit(DataTable EdtAttCat) {
//		List<Map<String, String>> listedtatt = EdtAttCat.asMaps(String.class, String.class);
//		driver.findElement(By.xpath("//*[@id=\"AttendanceCategoryName\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"AttendanceCategoryName\"]")).sendKeys(listedtatt.get(0).get("AttendanceCategory"));
//		driver.findElement(By.xpath("//*[@id=\"PointsApplied\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"PointsApplied\"]")).sendKeys(listedtatt.get(0).get("Points_Applied"));
//		driver.findElement(By.xpath("//*[@id=\"PointsLost\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"PointsLost\"]")).sendKeys(listedtatt.get(0).get("Points_Lost"));
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Data Edited Successfully");
//		driver.findElement(By.xpath("//*[@id=\"Submit\"]")).click();
//		System.out.println("User Clicked on Submit");
//	}
//	@When("^User User selects Attendance Category and clicks on Delete$")
//	public void user_User_selects_Attendance_Category_and_clicks_on_Delete(DataTable DelAttCat) {
//		List<Map<String, String>> lista = DelAttCat.asMaps(String.class, String.class);
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//        List <?> rows = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr/td[1]")); 
//        Boolean IsFound =false;
//        for(int i=1;i<=rows.size();i++) {
//        	String Attcat = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[1]")).getText();
//        	String Pappl = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[2]")).getText();
//        	String Plost = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[3]")).getText();
//        	if(lista.get(0).get("AttendanceCategory").equals(Attcat)) {
//        		if(lista.get(0).get("Points_Applied").equals(Pappl)) {
//        			if(lista.get(0).get("Points_Lost").equals(Plost))
//        				driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr["+i+"]/td[4]/a[2]")).click();
//        				System.out.println("Clicked on the Delete Button Successfully");
//        				IsFound =true;
//        				break;
//        		}
//        	}
//        }
//        if(IsFound==false) {
//        	Assert.fail("Data Cannot be Found");
//        	System.out.println("Data Cannot be Found");
//        }
//	}
//
//	@When("^User Clicks on Ok in Deletion Alert$")
//	public void user_Clicks_on_Ok_in_Deletion_Alert() {
//		String atxt =driver.switchTo().alert().getText();
//		if(atxt.contains("Are you sure to delete this Attendance")) {
//			driver.switchTo().alert().accept();	
//			System.out.println("Record is deleted");
//		}
//		else {
//			driver.switchTo().alert().dismiss();
//			Assert.fail("Alert Not found.Hence Cannot Be Deleted");
//		}
//	}
//
//	@Then("^New Category is not displayed in the grid$")
//	public void new_Category_is_not_displayed_in_the_grid(DataTable DelCat) {
//		List<Map<String, String>> lista = DelCat.asMaps(String.class, String.class);
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		//List  col = driver.findElements(By.xpath("//*[@id=\"list\"]//tr[1]/td"));
//        List <?> rows = driver.findElements(By.xpath("//*[@id=\"list\"]//tr/td[1]")); 
//        boolean isFound = false;
//        for(int i=2;i<=rows.size();i++) {    	 
//        	String Attcat = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[1]")).getText();
//        	String Pappl = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[2]")).getText();
//        	String Plost = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[3]")).getText();
//        	
//        	if(lista.get(0).get("AttendanceCategory").equals(Attcat)) {
//        		System.out.println("Classification Code Matched:"+Attcat);       		
//        		if(lista.get(0).get("Points_Applied").equals(Pappl)) {
//        			System.out.println("Classification desc Matched:"+Pappl);
//        			if(lista.get(0).get("Points_Lost").equals(Plost)) {
//        				System.out.println("Classification Short Matched:"+Plost);	
//						isFound = true;
//	        			 break;				
//    				}
//        		}
//            }
//        }
//        driver.switchTo().defaultContent();
//        driver.findElement(By.xpath("//a[@href=\"/local13test/index/logout\"]")).click();
//		String title = driver.getTitle();
//	    Assert.assertEquals("Login | Local-13", title);    
//	    driver.close();
//	    if(isFound==true) {
//        	System.out.println("Row found, Not Deleted");
//        	Assert.fail("Data Not Deleted");
//        } 	
//	
//	}
//	@When("^User is on Create Applicant Page$")
//	public void user_is_on_Create_Applicant_Page() {
//		WebElement Training =driver.findElement(By.xpath("//*[@id=\"build_a_9\"]"));
//		highlighter.highLightElement(driver, Training);
//		Training.click();
//		driver.switchTo().frame("functionContent");
//		highlighter.highLightElement(driver, driver.findElement(By.xpath("//td[contains(text(),\"Manage Applicant\")]")));
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//		driver.findElement(By.xpath("//td[contains(text(),\"Manage Applicant\")]")).click();
//		driver.switchTo().defaultContent();
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		//highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")));
//		driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")).click();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@id=\"function_108\"]/span/a")));
//		driver.findElement(By.xpath("//*[@id=\"function_108\"]/span/a")).click();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		driver.switchTo().frame("functionContent");
//		boolean isPresent = driver.findElement(By.xpath("//*[@id=\"tabs\"]//a[contains(text(),\"Applicant Info\")]")).isDisplayed();
//		if(!isPresent) {
//			System.out.println("User is not in Create Page");
//			Assert.fail("User is not in Create Page");
//		}		
//	}
//
//	@When("^User Enters Valid Data for Contact Info Section$")
//	public void user_Enters_Valid_Data_for_Contact_Info_Section(DataTable ContactInfo) throws InterruptedException {
//		List<Map<String, String>> cntctInfo = ContactInfo.asMaps(String.class, String.class);
//		driver.findElement(By.xpath("//*[@id=\"45\"]")).sendKeys(cntctInfo.get(0).get("LastName"));
//		driver.findElement(By.xpath("//*[@id=\"46\"]")).sendKeys(cntctInfo.get(0).get("FirstName"));
//		driver.findElement(By.xpath("//*[@id=\"68\"]")).sendKeys(cntctInfo.get(0).get("MiddleName"));
//		driver.findElement(By.xpath("//*[@id=\"57\"]")).sendKeys(cntctInfo.get(0).get("CareOf"));
//		driver.findElement(By.xpath("//*[@id=\"54\"]")).sendKeys(cntctInfo.get(0).get("Address1"));
//		driver.findElement(By.xpath("//*[@id=\"55\"]")).sendKeys(cntctInfo.get(0).get("Address2"));
//		driver.findElement(By.xpath("//*[@id=\"tab1\"]//tr[9]/td[3]/span/input[1]")).sendKeys(cntctInfo.get(0).get("Zip"));
//		Thread.sleep(3000);
//		String zip =cntctInfo.get(0).get("Zip");
//		driver.findElement(By.xpath("//td[@field=\"ZipCode\"]/div[contains(text(),"+zip+")]")).click();
//		
//		Select country = new Select(driver.findElement(By.id("17")));
//		country.selectByVisibleText(cntctInfo.get(0).get("Country"));
//		Select State = new Select(driver.findElement(By.id("19")));
//		State.selectByVisibleText(cntctInfo.get(0).get("State"));
//		driver.findElement(By.xpath("//*[@id=\"49\"]")).sendKeys(cntctInfo.get(0).get("EmailAddress"));
//		driver.findElement(By.xpath("//*[@id=\"56\"]")).sendKeys(cntctInfo.get(0).get("AlternateEmail"));
//		driver.findElement(By.xpath("//*[@id=\"10180\"]")).sendKeys(cntctInfo.get(0).get("HomePhone"));
//		driver.findElement(By.xpath("//*[@id=\"10181\"]")).sendKeys(cntctInfo.get(0).get("CellPhone"));		
//	}
//
//	@When("^User Enters Valid Data for Applicant Census Info$")
//	public void user_Enters_Valid_Data_for_Applicant_Census_Info(DataTable AppCenInfo) {
//		List<Map<String, String>> AppCenIn = AppCenInfo.asMaps(String.class, String.class);
//		driver.findElement(By.xpath("//*[@id=\"50\"]")).sendKeys(AppCenIn.get(0).get("SSN"));
//		driver.findElement(By.xpath("//*[@id=\"52\"]")).sendKeys(AppCenIn.get(0).get("DOB"));
//		Select AppType = new Select(driver.findElement(By.xpath("//*[@id=\"10178\"]")));
//		AppType.selectByVisibleText(AppCenIn.get(0).get("ApplicantType"));
//		driver.findElement(By.xpath("//*[@id=\"10140\"]")).sendKeys(AppCenIn.get(0).get("ApplicationDate"));
//		Select gender = new Select(driver.findElement(By.xpath("//*[@id=\"65\"]")));
//		gender.selectByVisibleText(AppCenIn.get(0).get("Gender"));
//		Select mStatus = new Select(driver.findElement(By.xpath("//*[@id=\"66\"]")));
//		mStatus.selectByVisibleText(AppCenIn.get(0).get("MaritalStatus"));
//		Select Race = new Select(driver.findElement(By.xpath("//*[@id=\"67\"]")));
//		Race.selectByVisibleText(AppCenIn.get(0).get("Race"));
//		
//		
//	}
//
//	@When("^User Enters Misc Info$")
//	public void user_Enters_Misc_Info(DataTable MiscInf) {
//		List<Map<String, String>> MiscInfo = MiscInf.asMaps(String.class, String.class);
//		
//		Select military = new Select(driver.findElement(By.xpath("//*[@id=\"10131\"]")));
//		military.selectByVisibleText(MiscInfo.get(0).get("MILITARY"));
//		
//		Select over18 = new Select(driver.findElement(By.xpath("//*[@id=\"10132\"]")));
//		over18.selectByVisibleText(MiscInfo.get(0).get("OVER18"));
//		
//		Select Helmetstohardhats = new Select(driver.findElement(By.xpath("//*[@id=\"10133\"]")));
//		Helmetstohardhats.selectByVisibleText(MiscInfo.get(0).get("HelmetstoHardhats"));
//		
//		Select HsGdEq = new Select(driver.findElement(By.xpath("//*[@id=\"10134\"]")));
//		HsGdEq.selectByVisibleText(MiscInfo.get(0).get("HSGEDEquivalent"));
//		
//		Select Resident = new Select(driver.findElement(By.xpath("//*[@id=\"10135\"]")));
//		Resident.selectByVisibleText(MiscInfo.get(0).get("Resident"));
//		
//		driver.findElement(By.xpath("//*[@id=\"10136\"]")).sendKeys(MiscInfo.get(0).get("DriversLicense"));
//		
//		Select RulesSigned = new Select(driver.findElement(By.xpath("//*[@id=\"10137\"]")));
//		RulesSigned.selectByVisibleText(MiscInfo.get(0).get("RulesSigned"));
//		
//		Select CITIZEN = new Select(driver.findElement(By.xpath("//*[@id=\"10138\"]")));
//		CITIZEN.selectByVisibleText(MiscInfo.get(0).get("CITIZEN"));
//		
//		Select CanWork = new Select(driver.findElement(By.xpath("//*[@id=\"10139\"]")));
//		CanWork.selectByVisibleText(MiscInfo.get(0).get("CanWork"));
//		
//		driver.findElement(By.xpath("//*[@id=\"10160\"]")).sendKeys(MiscInfo.get(0).get("DirectEntry"));
//		driver.findElement(By.xpath("//*[@id=\"10177\"]")).sendKeys(MiscInfo.get(0).get("Folder"));
//		driver.findElement(By.xpath("//*[@id=\"10148\"]")).sendKeys(MiscInfo.get(0).get("RelatedWorkExperience"));
//		driver.findElement(By.xpath("//*[@id=\"10150\"]")).sendKeys(MiscInfo.get(0).get("ApplicantNumber"));
//		
//		Select Veteran =new Select(driver.findElement(By.xpath("//*[@id=\"10174\"]")));
//		Veteran.selectByVisibleText(MiscInfo.get(0).get("Veteran"));
//		
//		
//		
//	}
//
//	@When("^User Enters Training Group$")
//	public void user_Enters_Training_Group(DataTable TrInfo) {
//		List<Map<String, String>> TrInf = TrInfo.asMaps(String.class, String.class);
//		driver.findElement(By.xpath("//*[@id=\"10143\"]")).sendKeys(TrInf.get(0).get("StudentID"));
//		driver.findElement(By.xpath("//*[@id=\"10144\"]")).sendKeys(TrInf.get(0).get("DepartmentofLaborID"));
//		driver.findElement(By.xpath("//*[@id=\"10146\"]")).sendKeys(TrInf.get(0).get("ApprenticeshipNumber"));
//	}
//
//	@When("^Clicks on Submit$")
//	public void clicks_on_Submit() {
//		driver.findElement(By.xpath("//*[@id=\"dynamic_submit\"]")).click();
//		try {
//			Thread.sleep(15000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Then("^Applicant Details should be displayed in Grid on Search$")
//	public void applicant_Details_should_be_displayed_in_Grid_on_Search(DataTable VerifyData) {
//		List<Map<String,String>> Vdata = VerifyData.asMaps(String.class, String.class);	
//		driver.findElement(By.xpath("//*[@id=\"gs_LASTNAME\"]")).sendKeys(Vdata.get(0).get("LastName"));
//		driver.findElement(By.xpath("//*[@id=\"gs_SSN\"]")).sendKeys(Vdata.get(0).get("SSN"));
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//		List <?> rows = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr/td[1]")); 
//		boolean isFound = false;
//        
//		for(int i=2;i<=rows.size();i++) {    	 
//        	String LastName = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[2]")).getText();
//        	String FirstName = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[3]")).getText();
//        	String MiddleName = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[4]")).getText();
//        	String SSN = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[5]")).getText();	
//        	String ApplicationDate = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[2]/td[9]")).getText();
//        	
//        	if(Vdata.get(0).get("SSN").equals(SSN)) {
//        		System.out.println("SSN Matched:"+SSN);       		
//        		if(Vdata.get(0).get("LastName").equals(LastName)) {
//        			System.out.println("Last Name Matched:"+LastName);
//        			if(Vdata.get(0).get("FirstName").equals(FirstName)) {
//        				System.out.println("First Name Matched:"+FirstName);	
//        				if(Vdata.get(0).get("MiddleName").equals(MiddleName)) {
//        					System.out.println("Middle Name Matched:"+FirstName);
//        					if(Vdata.get(0).get("ApplicationDate").equals(ApplicationDate)) {
//        						System.out.println("Application Date Matched:"+ApplicationDate);
//        						isFound = true;
//        		        		break;				
//        					}
//        				}								
//    				}
//        		}
//            }
//        }
//		driver.switchTo().defaultContent();
//	    driver.findElement(By.xpath("//a[@href=\"/local13test/index/logout\"]")).click();
//		String title = driver.getTitle();
//		Assert.assertEquals("Login | Local-13", title);    
//		driver.close();
//		if(isFound==false) {
//			System.out.println("Data didnt Match.");
//			Assert.fail("Data didnt Match");
//		}
//	}
//	
//	
//	@When("^User is on Manage Applicant Page$")
//	public void user_is_on_Manage_Applicant_Page() {
//		WebElement Training =driver.findElement(By.xpath("//*[@id=\"build_a_9\"]"));
//		highlighter.highLightElement(driver, Training);
//		Training.click();
//		driver.switchTo().frame("functionContent");
//		highlighter.highLightElement(driver, driver.findElement(By.xpath("//td[contains(text(),\"Manage Applicant\")]")));
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//		driver.findElement(By.xpath("//td[contains(text(),\"Manage Applicant\")]")).click();
//		driver.switchTo().defaultContent();
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		//highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")));
//		driver.findElement(By.xpath("//*[@title=\"Open West Pane\"]")).click();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		highlighter.highLightElement(driver, driver.findElement(By.xpath("//*[@id=\"function_109\"]/span/a")));
//		driver.findElement(By.xpath("//*[@id=\"function_109\"]/span/a")).click();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
//		driver.switchTo().frame("functionContent");
//		boolean isPresent = driver.findElement(By.xpath("//div[contains(text(),\"Manage Applicant\")]")).isDisplayed();
//		if(!isPresent) {
//			System.out.println("User is not in Manage Applicant Page");
//			Assert.fail("User is not in Manage Applicant Page");
//		}
//
//	}
//
//	@When("^User Selects Member and Click on Edit$")
//	public void user_Selects_Member_and_Click_on_Edit(DataTable FindData) {
//		List<Map<String,String>> Fdata = FindData.asMaps(String.class, String.class);	
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//		driver.findElement(By.xpath("//*[@id=\"gs_LASTNAME\"]")).sendKeys(Fdata.get(0).get("LastName"));
//		driver.findElement(By.xpath("//*[@id=\"gs_SSN\"]")).sendKeys(Fdata.get(0).get("SSN"));
//		driver.findElement(By.xpath("//*[@id=\"gs_SSN\"]")).sendKeys(Keys.ENTER);
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//		List <?> rows = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr/td[1]")); 
//		boolean isFound = false;
//        
//		for(int i=2;i<=rows.size();i++) {    	 
//        	String LastName = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[2]")).getText();
//        	String FirstName = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[3]")).getText();
//        	String MiddleName = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[4]")).getText();
//        	String SSN = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[5]")).getText();	
//        	String ApplicationDate = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[2]/td[9]")).getText();
//        	
//        	if(Fdata.get(0).get("SSN").equals(SSN)) {
//        		System.out.println("SSN Matched:"+SSN);       		
//        		if(Fdata.get(0).get("LastName").equals(LastName)) {
//        			System.out.println("Last Name Matched:"+LastName);
//        			if(Fdata.get(0).get("FirstName").equals(FirstName)) {
//        				System.out.println("First Name Matched:"+FirstName);	
//        				if(Fdata.get(0).get("MiddleName").equals(MiddleName)) {
//        					System.out.println("Middle Name Matched:"+FirstName);
//        					if(Fdata.get(0).get("ApplicationDate").equals(ApplicationDate)) {
//        						System.out.println("Application Date Matched:"+ApplicationDate);
//        						driver.findElement(By.xpath("//*[@id=\"list\"]//tr["+i+"]/td[12]/div[2]/a[@href]")).click();
//        						isFound = true;
//        		        		break;				
//        					}
//        				}								
//    				}
//        		}
//            }
//        }
//		if(isFound==false) {
//			System.out.println("Edit Button Not Clicked");
//			Assert.fail("Edit Button Not Clicked");
//		}
//
//	}
//
//	@When("^User Edits Data for Contact Info Section$")
//	public void user_Edits_Data_for_Contact_Info_Section(DataTable ContactInfo) {
//		List<Map<String,String>> Cdata = ContactInfo.asMaps(String.class, String.class);
//		
//		driver.findElement(By.xpath("//*[@id=\"45\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"45\"]")).sendKeys(Cdata.get(0).get("LastName"));
//		
//		driver.findElement(By.xpath("//*[@id=\"46\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"46\"]")).sendKeys(Cdata.get(0).get("FirstName"));
//		
//		driver.findElement(By.xpath("//*[@id=\"68\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"68\"]")).sendKeys(Cdata.get(0).get("MiddleName"));
//		
//		driver.findElement(By.xpath("//*[@id=\"57\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"57\"]")).sendKeys(Cdata.get(0).get("CareOf"));
//		
//		driver.findElement(By.xpath("//*[@id=\"54\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"54\"]")).sendKeys(Cdata.get(0).get("Address1"));
//		
//		driver.findElement(By.xpath("//*[@id=\"55\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"55\"]")).sendKeys(Cdata.get(0).get("Address2"));
//		
//		driver.findElement(By.xpath("//*[@id=\"tab1\"]//tr[9]/td[3]/span/input[1]")).clear();
//		String zip =Cdata.get(0).get("Zip");
//		driver.findElement(By.xpath("//*[@id=\"tab1\"]//tr[9]/td[3]/span/input[1]")).sendKeys(zip);
//		driver.findElement(By.xpath("//td[@field=\"ZipCode\"]/div[contains(text(),"+zip+")]")).click();
//		Select country = new Select(driver.findElement(By.id("17")));
//		country.selectByVisibleText(Cdata.get(0).get("Country"));
//		Select State = new Select(driver.findElement(By.id("19")));
//		State.selectByVisibleText(Cdata.get(0).get("State"));
//		
//		driver.findElement(By.xpath("//*[@id=\"49\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"49\"]")).sendKeys(Cdata.get(0).get("EmailAddress"));
//		
//		driver.findElement(By.xpath("//*[@id=\"56\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"56\"]")).sendKeys(Cdata.get(0).get("AlternateEmail"));
//		
//		driver.findElement(By.xpath("//*[@id=\"10180\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"10180\"]")).sendKeys(Cdata.get(0).get("HomePhone"));
//		
//		driver.findElement(By.xpath("//*[@id=\"10181\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"10181\"]")).sendKeys(Cdata.get(0).get("CellPhone"));
//
//		
//	}
//
//	@When("^User Enters Edits Data for Applicant Census Info$")
//	public void user_Enters_Edits_Data_for_Applicant_Census_Info(DataTable CensusData) {
//		List<Map<String,String>> Cdata = CensusData.asMaps(String.class, String.class);
//		
//		
//		//driver.findElement(By.xpath("//*[@id=\"50\"]")).clear();
//		//driver.findElement(By.xpath("//*[@id=\"50\"]")).sendKeys(Cdata.get(0).get("SSN"));
//		
//		driver.findElement(By.xpath("//*[@id=\"52\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"52\"]")).sendKeys(Cdata.get(0).get("DOB"));
//		
//		Select AppType = new Select(driver.findElement(By.xpath("//*[@id=\"10178\"]")));
//		AppType.selectByVisibleText(Cdata.get(0).get("ApplicantType"));
//		
//		driver.findElement(By.xpath("//*[@id=\"10140\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"10140\"]")).sendKeys(Cdata.get(0).get("ApplicationDate"));
//		
//		Select gender = new Select(driver.findElement(By.xpath("//*[@id=\"65\"]")));
//		gender.selectByVisibleText(Cdata.get(0).get("Gender"));
//		
//		Select mStatus = new Select(driver.findElement(By.xpath("//*[@id=\"66\"]")));
//		mStatus.selectByVisibleText(Cdata.get(0).get("MaritalStatus"));
//		
//		Select Race = new Select(driver.findElement(By.xpath("//*[@id=\"67\"]")));
//		Race.selectByVisibleText(Cdata.get(0).get("Race"));
//	
//	}
//
//	@When("^User Edits Data for Misc Info$")
//	public void user_Edits_Data_for_Misc_Info(DataTable MiscInfo) {
//		List<Map<String,String>> Mdata = MiscInfo.asMaps(String.class, String.class);
//		
//		Select military = new Select(driver.findElement(By.xpath("//*[@id=\"10131\"]")));
//		military.selectByVisibleText(Mdata.get(0).get("MILITARY"));
//		
//		Select over18 = new Select(driver.findElement(By.xpath("//*[@id=\"10132\"]")));
//		over18.selectByVisibleText(Mdata.get(0).get("OVER18"));
//		
//		Select Helmetstohardhats = new Select(driver.findElement(By.xpath("//*[@id=\"10133\"]")));
//		Helmetstohardhats.selectByVisibleText(Mdata.get(0).get("HelmetstoHardhats"));
//		
//		Select HsGdEq = new Select(driver.findElement(By.xpath("//*[@id=\"10134\"]")));
//		HsGdEq.selectByVisibleText(Mdata.get(0).get("HSGEDEquivalent"));
//		
//		Select Resident = new Select(driver.findElement(By.xpath("//*[@id=\"10135\"]")));
//		Resident.selectByVisibleText(Mdata.get(0).get("Resident"));
//		
//		driver.findElement(By.xpath("//*[@id=\"10136\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"10136\"]")).sendKeys(Mdata.get(0).get("DriversLicense"));
//		
//		Select RulesSigned = new Select(driver.findElement(By.xpath("//*[@id=\"10137\"]")));
//		RulesSigned.selectByVisibleText(Mdata.get(0).get("RulesSigned"));
//		
//		Select CITIZEN = new Select(driver.findElement(By.xpath("//*[@id=\"10138\"]")));
//		CITIZEN.selectByVisibleText(Mdata.get(0).get("CITIZEN"));
//		
//		Select CanWork = new Select(driver.findElement(By.xpath("//*[@id=\"10139\"]")));
//		CanWork.selectByVisibleText(Mdata.get(0).get("CanWork"));
//		
//		driver.findElement(By.xpath("//*[@id=\"10160\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"10160\"]")).sendKeys(Mdata.get(0).get("DirectEntry"));
//		
//		driver.findElement(By.xpath("//*[@id=\"10177\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"10177\"]")).sendKeys(Mdata.get(0).get("Folder"));
//		
//		driver.findElement(By.xpath("//*[@id=\"10148\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"10148\"]")).sendKeys(Mdata.get(0).get("RelatedWorkExperience"));
//		
//		driver.findElement(By.xpath("//*[@id=\"10150\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"10150\"]")).sendKeys(Mdata.get(0).get("ApplicantNumber"));
//		
//		Select Veteran =new Select(driver.findElement(By.xpath("//*[@id=\"10174\"]")));
//		Veteran.selectByVisibleText(Mdata.get(0).get("Veteran"));
//		
//		
//	}
//
//	@When("^User Edits Data for Training Group$")
//	public void user_Edits_Data_for_Training_Group(DataTable TrGrp) {
//		List<Map<String,String>> TrInf  = TrGrp.asMaps(String.class, String.class);
//		driver.findElement(By.xpath("//*[@id=\"10143\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"10143\"]")).sendKeys(TrInf.get(0).get("StudentID"));
//		
//		driver.findElement(By.xpath("//*[@id=\"10144\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"10144\"]")).sendKeys(TrInf.get(0).get("DepartmentofLaborID"));
//		
//		driver.findElement(By.xpath("//*[@id=\"10146\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"10146\"]")).sendKeys(TrInf.get(0).get("ApprenticeshipNumber"));
//		
//		
//	}
//
//	@When("^User Selects Member and Click on Delete$")
//	public void user_Selects_Member_and_Click_on_Delete(DataTable SelData) {
//		List<Map<String,String>> Ddata = SelData.asMaps(String.class, String.class);	
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		driver.findElement(By.xpath("//*[@id=\"gs_LASTNAME\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"gs_LASTNAME\"]")).sendKeys(Ddata.get(0).get("LastName"));
//		driver.findElement(By.xpath("//*[@id=\"gs_SSN\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"gs_SSN\"]")).sendKeys(Ddata.get(0).get("SSN"));
//		driver.findElement(By.xpath("//*[@id=\"gs_SSN\"]")).sendKeys(Keys.ENTER);
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//		List <?> rows = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr/td[1]")); 
//		boolean isFound = false;
//        
//		for(int i=2;i<=rows.size();i++) {    	 
//        	String LastName = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[2]")).getText();
//        	String FirstName = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[3]")).getText();
//        	String MiddleName = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[4]")).getText();
//        	String SSN = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[5]")).getText();	
//        	String ApplicationDate = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[2]/td[9]")).getText();
//        	
//        	if(Ddata.get(0).get("SSN").equals(SSN)) {
//        		System.out.println("SSN Matched:"+SSN);       		
//        		if(Ddata.get(0).get("LastName").equals(LastName)) {
//        			System.out.println("Last Name Matched:"+LastName);
//        			if(Ddata.get(0).get("FirstName").equals(FirstName)) {
//        				System.out.println("First Name Matched:"+FirstName);	
//        				if(Ddata.get(0).get("MiddleName").equals(MiddleName)) {
//        					System.out.println("Middle Name Matched:"+FirstName);
//        					if(Ddata.get(0).get("ApplicationDate").equals(ApplicationDate)) {
//        						System.out.println("Application Date Matched:"+ApplicationDate);
//        						driver.findElement(By.xpath("//*[@id=\"list\"]//tr["+i+"]/td[12]/div[3]/a[@href]")).click();
//        						System.out.println("Delete Button Clicked");
//        						isFound = true;
//        		        		break;				
//        					}
//        				}								
//    				}
//        		}
//            }
//        }
//		if(isFound==false) {
//			System.out.println("Delete Button Not Clicked");
//			Assert.fail("Delete Button Not Clicked Clicked");
//		}
//
//	}
//
//	@When("^User Clicks on OK in Alert$")
//	public void user_Clicks_on_OK_in_Alert() {
//		String atxt =driver.switchTo().alert().getText();
//		if(atxt.equals("Are you sure, you want to delete this record?")) {
//			driver.switchTo().alert().accept();	
//			System.out.println("Record is deleted");
//			File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			try {
//				FileUtils.copyFile(src, new File ("C:\\selenium\\error.png"));
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		else {
//			driver.switchTo().alert().dismiss();
//			Assert.fail("Alert Not found.Hence Cannot Be Deleted");
//		}
//	}
//
//	@Then("^Applicant Details should not be displayed in Grid on Search$")
//	public void applicant_Details_should_not_be_displayed_in_Grid_on_Search(DataTable VerifyData) {
//		List<Map<String,String>> Vdata = VerifyData.asMaps(String.class, String.class);	
//		driver.findElement(By.xpath("//*[@id=\"gs_LASTNAME\"]")).sendKeys(Vdata.get(0).get("LastName"));
//		driver.findElement(By.xpath("//*[@id=\"gs_SSN\"]")).sendKeys(Vdata.get(0).get("SSN"));
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//		List <?> rows = driver.findElements(By.xpath("//*[@id=\"list\"]/tbody/tr/td[1]")); 
//		boolean isFound = false;
//        
//		for(int i=2;i<=rows.size();i++) {    	 
//        	String LastName = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[2]")).getText();
//        	String FirstName = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[3]")).getText();
//        	String MiddleName = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[4]")).getText();
//        	String SSN = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[" + i+ "]/td[5]")).getText();	
//        	String ApplicationDate = driver.findElement(By.xpath("//*[@id=\"list\"]/tbody/tr[2]/td[9]")).getText();
//        	
//        	if(Vdata.get(0).get("SSN").equals(SSN)) {
//        		System.out.println("SSN Matched:"+SSN);       		
//        		if(Vdata.get(0).get("LastName").equals(LastName)) {
//        			System.out.println("Last Name Matched:"+LastName);
//        			if(Vdata.get(0).get("FirstName").equals(FirstName)) {
//        				System.out.println("First Name Matched:"+FirstName);	
//        				if(Vdata.get(0).get("MiddleName").equals(MiddleName)) {
//        					System.out.println("Middle Name Matched:"+FirstName);
//        					if(Vdata.get(0).get("ApplicationDate").equals(ApplicationDate)) {
//        						System.out.println("Application Date Matched:"+ApplicationDate);
//        						isFound = true;
//        		        		break;
//        		        
//        					}
//        				}								
//    				}
//        		}
//            }
//        }
//		driver.switchTo().defaultContent();
//	    driver.findElement(By.xpath("//a[@href=\"/local13test/index/logout\"]")).click();
//		String title = driver.getTitle();
//		Assert.assertEquals("Login | Local-13", title);    
//		driver.close();
//		if(isFound) {
//			System.out.println("Data Still present");
//			Assert.fail("Data Still present");
//		}
//
//	}
//
//	@Given("^User is in Manage Member Page$")
//	public void user_is_in_Manage_Member_Page()  {
//	    
//	    
//	}
//
//	@When("^User checks the International Initiation Date$")
//	public void user_checks_the_International_Initiation_Date()  {
//	    // Write code here that turns the phrase above into concrete actions
//	    
//	}
//
//	@Then("^the same date should be displayed in Member details$")
//	public void the_same_date_should_be_displayed_in_Member_details() {
//	    // Write code here that turns the phrase above into concrete actions
//	   
//	}
//	
//	
//}
//
//*/