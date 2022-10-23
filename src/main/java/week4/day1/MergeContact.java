package week4.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement elementUser=driver.findElement(By.id("username"));
		elementUser.sendKeys("Demosalesmanager");
		
		WebElement elementPwd= driver.findElement(By.id("password"));
		elementPwd.sendKeys("crmsfa");
		
		WebElement elementLogin= driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		
		WebElement elementCRMFSA=driver.findElement(By.linkText("CRM/SFA"));
		elementCRMFSA.click();
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		//Select from 'From Contact'
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/form/table/tbody/tr[1]/td[2]/a/img")).click();
		Set<String> windSet=driver.getWindowHandles();
		List<String> windList=new ArrayList<String>(windSet);
		driver.switchTo().window(windList.get(1));
		driver.manage().window().maximize();
		WebElement frmContact=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		driver.executeScript("arguments[0].click()", frmContact);
		//frmContact.click();
		
		//back to main window control
		driver.switchTo().window(windList.get(0));
		
		//Select from 'To Contact'
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/form/table/tbody/tr[2]/td[2]/a/img")).click();
		
		Set<String> windSet1=driver.getWindowHandles();
		List<String> windList1=new ArrayList<String>(windSet1);
		driver.switchTo().window(windList1.get(1));
		driver.manage().window().maximize();
		//WebElement toContact=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		Thread.sleep(3000);
		WebElement toContact=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		driver.executeScript("arguments[0].click()", toContact);
		
		 //WebElement element = driver.findElement(By.xpath("your xpath"));
	      //JavascriptExecutor executor = (JavascriptExecutor)driver;
	      //executor.executeScript("arguments[1].click();", toContact);
		
	      //((JavascriptExecutor) driver).executeScript("arguments[0].click();", toContact);
	      
		//driver.executeScript("arguments[1].click()", toContact);
		//toContact.click();
		
		
		
		
		
		//back to main window control
		driver.switchTo().window(windList1.get(0));
		
		
		
		
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		driver.switchTo().alert().accept();
		driver.switchTo().window(windList1.get(0));
		String titlePage= driver.getTitle();
		System.out.println("Title of Home page is "+ titlePage);
		
		
		
	}

}
