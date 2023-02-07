package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment5 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement drag = driver.findElement(By.xpath("//span[text()='Drag me around']"));
		// System.out.println(drag.getLocation()); //to get the location 
		
		Actions move=new Actions(driver);
		move.dragAndDropBy(drag, 200, 0).perform();
		
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		WebElement dest = driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		move.dragAndDrop(source, dest).perform();
		
		WebElement source1 = driver.findElement(By.xpath("(//table[@role='grid'])[1]//th[3]"));
		WebElement dest1 = driver.findElement(By.xpath("(//table[@role='grid'])[1]//th[1]"));
		
		move.dragAndDrop(source1, dest1).perform();

		WebElement row1 = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr[5]"));
		WebElement row2 = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr[2]"));
		
		move.dragAndDrop(row1, row2).perform();
		
		//driver.close();
		
	}

}
