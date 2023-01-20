package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Leema");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Josephine");
		driver.findElement(By.xpath("(//input[contains(@name,'reg_email')])[1]")).sendKeys("9952923695");
		driver.findElement(By.xpath("//div/input[@name='reg_passwd__']")).sendKeys("Leema.2218");
		
		WebElement tool=driver.findElement(By.xpath("//span/select[@id='day']"));
		Select drop=new Select(tool);
		tool.click();
		drop.selectByIndex(17);
		
		WebElement tool1=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select drop1=new Select(tool1);
		tool1.click();
		drop1.selectByVisibleText("Mar");
		
		WebElement tool2=driver.findElement(By.xpath("(//span/select)[3]"));
		Select drop2=new Select(tool2);
		tool2.click();
		drop2.selectByValue("1999");
		
		//driver.findElement(By.xpath("(//input[@name='sex'])[1]/preceding-sibling::label")).click();
		driver.findElement(By.xpath("//input[@name='sex']/preceding-sibling::label[text()='Female']")).click();
		
		
		driver.close();

	}

}
