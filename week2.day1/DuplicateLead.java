package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			
			
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			
			driver.findElement(By.partialLinkText("CRM/SFA")).click();
			driver.findElement(By.partialLinkText("Lead")).click();
			driver.findElement(By.partialLinkText("Create Lead")).click();
			
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Leema");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Josephine");
			
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("LeemaJosephine");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
			
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Short description");
			
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("leemajosephine3@gmail.com");
			
			driver.findElement(By.name("submitButton")).click();
			
			String title=driver.getTitle();
			System.out.println(title);
			
			driver.findElement(By.partialLinkText("Duplicate Lead")).click();
			
			driver.findElement(By.id("createLeadForm_companyName")).clear();
			
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
			
			driver.findElement(By.id("createLeadForm_firstName")).clear();
			
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dania");
			
			driver.findElement(By.name("submitButton")).click();
			
			String title1=driver.getTitle();
			System.out.println(title1);
			
		}
}
