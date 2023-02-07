package week5.day1;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.chittorgarh.com/");
		driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();
		driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();
		
		System.out.println("Security names:-");
		List<WebElement> findElements = driver.findElements(By.xpath("//table[contains(@class,'table table-bordered table')]//tr//td[1]"));
		for (int i = 0; i < findElements.size(); i++) {
			System.out.println(findElements.get(i).getText());
		}
		
		Set<WebElement> dup=new LinkedHashSet<WebElement>(findElements);
		if (findElements.size()==dup.size()) {
			System.out.println("Contains duplicates");
		} else {
			System.out.println("No duplicate records");
		}
		}
	}


