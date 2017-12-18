/*This is Maven project
 *TestNG is configured here
 *We can run the project direct by 
 * 1.Running this file
 * 2.Running testng.xml file
 * 3.By running pom.xml file(Right click on Project->Run As->Maven Test) which internally calls testng.xml file
 * 4.This project is configured in jenkins and we can run this project from jenkins by clicking on 'Build Now'(Build Now->pom.xml->testng.xml)  
 * 
 * 
 * How to convert existing java project to Maven Project?
 * Right click on Project->Configure->Convert To Maven Project->Enter Name->Finish
 * (Pom.xml file will be created. Enter the necessary dependencies(jars and plugins in pom.xml and save))
 * 
 * How to Run Maven Project?
 * First time Right click on Project-> Run As ->Maven install
 * Next time onwards Right click on Project ->Run As ->Maven test
 * 
 * 
 */

package myPackage8;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class openBrowser {

	String driverPath = "chromedriver.exe";
	public WebDriver driver;


	@Test
	public void login_FlipKart() {
		System.setProperty("webdriver.chrome.driver", driverPath);
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().to("https://www.flipkart.com");
	}


}

