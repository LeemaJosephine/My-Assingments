package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;


public class OpenUrl {

	public static void main(String[] args) {
		
		//set up the path
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		//Chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//to maximize - driver will manage to maximize the window.
		driver.manage().window().maximize();
		
		//To find the element by using locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//To click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//Lead and create leads
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Leema");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Josephine");
		
		//Web element
		WebElement tool = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//Object for select class - To select the value from the drop sown
		Select drop= new Select(tool);
		
		drop.selectByVisibleText("Employee");
		
		WebElement tool1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		Select drop1 = new Select(tool1);
		
		drop1.selectByValue("9001");
		
		WebElement tool2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		
		Select drop2 = new Select(tool2);
		
		drop2.selectByIndex(5);
		
		WebElement tool3 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		
		Select drop3 = new Select(tool3);
		
		drop3.selectByVisibleText("India");
		
		driver.findElement(By.name("submitButton")).click();
		
		
		//To get the title
		String title = driver.getTitle();
		System.out.println(title);
		
		//close the browser
		driver.close();
	}

}
