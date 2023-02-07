package week5.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://html.com/tags/table/");
		
		List<WebElement> findElements = driver.findElements(By.xpath("(//table)[1]//th"));
		System.out.println("First table coulumn count: " +findElements.size());
		
		List<WebElement> findElements1 = driver.findElements(By.xpath("(//table)[1]//tr"));
		System.out.println("First table row count: " +findElements1.size());
		
		List<WebElement> findElements2 = driver.findElements(By.xpath("(//table)[2]//th"));
		System.out.println("Second table coulumn count: " +findElements2.size());
		
		List<WebElement> findElements3 = driver.findElements(By.xpath("(//table)[2]//tr"));
		System.out.println("Second table row count: " +findElements3.size());
	}

}
