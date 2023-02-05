package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://leaftaps.com/opentaps/control/login");
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.partialLinkText("Contacts")).click();
	driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
	driver.findElement(By.xpath("//img[@alt='Lookup'][1]")).click();
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> wind=new ArrayList<String>(windowHandles);
	driver.switchTo().window(wind.get(1));
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
	driver.switchTo().window(wind.get(0));
	driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	Set<String> windowHandles1 = driver.getWindowHandles();
	List<String> wind1=new ArrayList<String>(windowHandles1);
	driver.switchTo().window(wind1.get(1));
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
	driver.switchTo().window(wind.get(0));
	driver.findElement(By.xpath("//a[text()='Merge']")).click();
	
	Alert alert = driver.switchTo().alert();
	alert.accept();
	
	System.out.println(driver.getTitle());
	
	/*if(driver.getTitle()=="Merge Contacts | opentaps CRM") {
		System.out.println("Contact merged suscessfully");
	}
	else {
		System.out.println("Failed");
	}
	*/
	
	}

}
