package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1FB {
public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver =new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

driver.findElement(By.name("firstname")).sendKeys("RKumar");
driver.findElement(By.name("lastname")).sendKeys("RJendran");
driver.findElement(By.name("reg_email__")).sendKeys("123456789");
driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("123456");

WebElement dayFb=driver.findElement(By.xpath("//Select[@id='day']"));
Select dd1= new Select(dayFb);
dd1.selectByIndex(18);

WebElement monthFb=driver.findElement(By.xpath("//select[@id='month']"));
Select dd2= new Select(monthFb);
dd2.selectByValue("11");

WebElement yearFb=driver.findElement(By.xpath("//select[@id='year']"));
Select dd3=new Select(yearFb);
dd3.selectByVisibleText("1983");

WebElement genderFb=driver.findElement(By.xpath("//label[text()='Female']"));
genderFb.click();


}
	
	
}
