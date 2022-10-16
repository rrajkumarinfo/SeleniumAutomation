package week2.day2.assignments;

import java.time.Duration;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignments2aEditLead {
public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();

	
driver.get("http://leaftaps.com/opentaps/control/main");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	WebElement elementUser=driver.findElement(By.id("username"));
	elementUser.sendKeys("Demosalesmanager");
	
	WebElement elementPwd= driver.findElement(By.id("password"));
	elementPwd.sendKeys("crmsfa");
	
	WebElement elementLogin= driver.findElement(By.className("decorativeSubmit"));
	elementLogin.click();
	
	WebElement elementCRMFSA=driver.findElement(By.linkText("CRM/SFA"));
	elementCRMFSA.click();
	
	driver.findElement(By.linkText("Leads")).click();
	
	driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	
	driver.findElement(By.xpath("//a[text()='10111']")).click();
	String pageTitle= driver.getTitle();
	System.out.println
	("Click on first resulting lead & Verify title of the page is :" +pageTitle);
	
	
	driver.findElement(By.xpath("//a[text()='Edit']")).click();
	WebElement companyEdit=driver.findElement(By.id("updateLeadForm_companyName"));
	companyEdit.clear();
	
	String newCompanyName="Ram2 tech";
	companyEdit.sendKeys(newCompanyName);
	
	driver.findElement(By.className("smallSubmit")).click();
	
	WebElement companyUpdateTxt=driver.findElement(By.id("viewLead_companyName_sp"));
	String compText=companyUpdateTxt.getText();
	System.out.println("Updated company name is "+compText);
	
	if(compText.contains("Ram2 tech"))
	//if(compText.equals(newCompanyName))
	
		System.out.println("Changed name appears is correctly ");
	else
		System.out.println("No changed name is dispayed ");
	Thread.sleep(3000);
	driver.close();

}
}
