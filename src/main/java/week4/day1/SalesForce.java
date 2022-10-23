package week4.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//1.Launch the browser
//2.Load the url as https://login.salesforce.com/
//3.Enter the username as ramkumar.ramaiah@testleaf.com
//4. Enter the password as Password#123
//5.click on the login button
//6.click on the learn more option in the Mobile publisher
//7.Switch to the next window using Windowhandles.
//8.click on the confirm button in the redirecting page
//9.Get the title
//10.Get back to the parent window
//11.close the browser

public class SalesForce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		WebElement elementUser=driver.findElement(By.id("username"));
		elementUser.sendKeys("ramkumar.ramaiah@testleaf.com");
		
		WebElement elementPwd= driver.findElement(By.id("password"));
		elementPwd.sendKeys("Password#123");
		
		WebElement elementLogin= driver.findElement(By.id("Login"));
		elementLogin.click();
		
		WebElement elementLearnmore=driver.findElement(By.xpath("//span[text()='Learn More']"));
		elementLearnmore.click();
		
		Set<String> windSet1 = driver.getWindowHandles();
		List<String> windList1 = new ArrayList<String>(windSet1);
		
		driver.switchTo().window(windList1.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		String conftitle=driver.getTitle();
		System.out.println("Redirecting page titel"+conftitle);
		
		driver.switchTo().window(windList1.get(0));
		String parentTitle=driver.getTitle();
		System.out.println("parent page titel"+parentTitle);
		driver.close();
	}

}
