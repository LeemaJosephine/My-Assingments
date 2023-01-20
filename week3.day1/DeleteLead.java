package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.xpath("(//form[@id='login']//input)[1]")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//form/p[3]/input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.xpath("//div/a[contains(text(),' CRM/SFA')]")).click();
		driver.findElement(By.xpath("//div[@class='x-panel-header']/a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//div[@class='frameSectionBody']/ul/li[3]/a")).click();
		
		
		driver.findElement(By.xpath("//td[@class='x-btn-center']/em/button[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		driver.findElement(By.xpath("//div/input[@name='phoneAreaCode']")).sendKeys("042");
		
		driver.findElement(By.xpath("//div/input[@name='phoneNumber']")).sendKeys("2224218");
		
		driver.findElement(By.xpath("//td/em/button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3')]/a[text()='Krish']")).click();
	
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).sendKeys("Krish");
		
		driver.findElement(By.xpath("//td[@class='x-btn-center']/em/button[text()='Find Leads']")).click();
	
		//driver.close();
	}

}
