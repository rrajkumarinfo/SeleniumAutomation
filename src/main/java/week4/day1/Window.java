package week4.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Click and Confirm new Window Opens
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> windSet = driver.getWindowHandles();
		List<String> windList = new ArrayList<String>(windSet);
		if (windList.size() > 0) {
			System.out.println("More than one window opens");
		}

		// back to main window control
		driver.switchTo().window(windList.get(0));

		// Find the number of opened tabs
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();

		Set<String> windSet1 = driver.getWindowHandles();
		List<String> windList1 = new ArrayList<String>(windSet1);
		int totalopenTab = windList1.size();

		if (totalopenTab > 0) {
			System.out.println("Find the number of opened tabs: " + totalopenTab);

		}

		// back to main window control
		driver.switchTo().window(windList1.get(0));
		//Close all windows except Primary
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();

		for (String eachwind : windList1) {
			if (!eachwind.equals(windList1.get(0))) {
				driver.switchTo().window(eachwind);
				driver.close();
			}

		}

		
		// back to main window control
				driver.switchTo().window(windList1.get(0));
		//Wait for 2 new tabs to open
		WebElement elenewTab=driver.findElement(By.xpath("//span[text()='Open with delay']"));		
		Thread.sleep(3000);

		elenewTab.click();
					
		
	}

}
