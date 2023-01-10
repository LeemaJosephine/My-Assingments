package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/select.xhtml ");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.className("ui-selectonemenu"));
		
		Select a=new Select(drop);
		
		//select by index
		a.selectByIndex(3);
		drop.click();
		
		//select by visible text
	
		a.selectByVisibleText("Cypress");
		drop.click();
		
		//select by value
		
		a.selectByValue("ui-selectonemenu-label");
	
		driver.close();
			
		
	}
}
