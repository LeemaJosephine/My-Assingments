package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		
		driver.findElement(By.xpath("(//div[@class='x-form-element']/input[@name='firstName'])[3]")).sendKeys("Leema");
		
		driver.findElement(By.xpath("//td[@class='x-btn-center']/em/button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3')])[1]/a[1]")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Edit']")).click();
		
		driver.findElement(By.xpath("//td/input[@name='companyName']")).sendKeys("CTS");
		
		driver.findElement(By.xpath("//tr/td/input[@value='Update']")).click();
		
		driver.close();

	}

}
