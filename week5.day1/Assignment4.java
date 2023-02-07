package week5.day1;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/table.xhtml");
		
		//Get the row and column count
		List<WebElement> rowcount = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr[1]//td"));
		List<WebElement> rowheading = driver.findElements(By.xpath("(//table[@role='grid'])[1]//th"));
		System.out.println("Row Headings: ");
		for (int i = 0; i < rowheading.size(); i++) {
			System.out.print(" " +rowheading.get(i).getText());
		}
		System.out.println("\n" + "Row count: " +rowcount.size());
		List<WebElement> columncount = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr//td[1]"));
		System.out.println("Column count: " +columncount.size());
		
		//Sort Names
		Set<String> sort=new TreeSet<String>();
		System.out.println("Names: (Assending)");
		for (int i = 1; i < columncount.size(); i++) {
			String text = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr["+i+"]//td[1]")).getText();
				sort.add(text);
		}
		System.out.println(sort);
		
		//Pick the person having country as India
		List<WebElement> rows = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr"));
		for (int i = 1; i < rows.size(); i++) {
			String text1 = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr["+i+"]//td[2]")).getText();

			if (text1.contains("India")) {
				
				System.out.println("This person belongs to India and the details as follows: " );
				System.out.println(rows.get(i).getText());
				
			} 
		}
		
		driver.close();
		
	}

}
