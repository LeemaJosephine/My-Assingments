package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MenuRightClick {

	public static void main(String[] args) {
		
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.leafground.com/menu.xhtml");
				driver.manage().window().maximize();
				
				WebElement rightclick = driver.findElement(By.xpath("//h5[text()='Context Menu']"));
				
				Actions click=new Actions(driver);
				click.contextClick(rightclick).perform();
				
				driver.close();
	}

}
