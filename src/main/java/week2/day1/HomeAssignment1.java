package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeAssignment1 {
	public static void main(String[] args) {
	WebDriverManager.chromiumdriver().setup();
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	driver.manage().window().maximize();
	
	WebElement elementUser=driver.findElement(By.id("username"));
	elementUser.sendKeys("Demosalesmanager");
	
	WebElement elementPwd= driver.findElement(By.id("password"));
	elementPwd.sendKeys("crmsfa");
	
	WebElement elementLogin= driver.findElement(By.className("decorativeSubmit"));
	elementLogin.click();
	
	WebElement elementCRMFSA=driver.findElement(By.linkText("CRM/SFA"));
	elementCRMFSA.click();
	
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Raj Info Tech");
	
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rajkumar");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("RK");
	driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("RJ");
	driver.findElement(By.name("departmentName")).sendKeys("HomeLob");
	//driver.findElement(By.id("createLeadForm_description")).sendKeys("Manage Home team");
	WebElement elementDescription=driver.findElement(By.name("description"));
	elementDescription.sendKeys("Manage Home Team");
	
	driver.findElement(By.name("primaryEmail")).sendKeys("RK.RJ@RRR.com");
	
	WebElement elementCreateLead=driver.findElement(By.className("smallSubmit"));
	elementCreateLead.click();
	//WebElement eleLeadPgeTit= 
	System.out.println("Lead Creation Page title is :"+driver.getTitle());
	

	
	
	}

}
