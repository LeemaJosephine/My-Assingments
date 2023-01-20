package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

		public static void main(String[] args) {
			
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			
			driver.findElement(By.partialLinkText("CRM/SFA")).click();
			//driver.findElement(By.xpath("(//input[@name='USERNAME'])[1]")).sendKeys("demosalesmanager");
			//driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
			//driver.findElement(By.xpath("(//input[@class='loginButton'])[1]")).click();
			driver.findElement(By.xpath("//a[text()='Accounts']")).click();
			driver.findElement(By.linkText("Create Account")).click();
			
			driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
			driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
			driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("DebitLimit");
			driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("DebitLimitsite");
			driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("500000");
			
			WebElement tool=driver.findElement(By.name("industryEnumId"));
			Select drop=new Select(tool);
			drop.selectByValue("IND_SOFTWARE");
			
			WebElement tool1=driver.findElement(By.name("ownershipEnumId"));
			Select drop1=new Select(tool1);
			drop1.selectByVisibleText("S-Corporation");
			
			WebElement tool2=driver.findElement(By.id("dataSourceId"));
			Select drop2=new Select(tool2);
			drop2.selectByValue("LEAD_EMPLOYEE");
			
			WebElement tool3=driver.findElement(By.id("marketingCampaignId"));
			Select drop3=new Select(tool3);
			drop3.selectByIndex(6);
			
			WebElement tool4=driver.findElement(By.id("generalStateProvinceGeoId"));
			Select drop4=new Select(tool4);
			drop4.selectByValue("TX");
			
			driver.findElement(By.xpath("//input[@value='Create Account']")).click();
			
			driver.findElement(By.className("buttonDangerous")).click();
			
			
			
					
			
		}
}
