package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchbrowser1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//Find the username and enter the username value(demosalesmanager)
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        //Find the password and enter the password value (crmsfa)
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        //click the button
        driver.findElement(By.className("decorativeSubmit")).click();
        //GetText
        String text = driver.findElement(By.tagName("h2")).getText();
        //print the tagname
        System.out.println(text);
        //verify by title
          String title =driver.getTitle(); //ctrl+2+l //Leaftaps - TestLeaf Automation Platform
         //print the title
         System.out.println(title);
         driver.findElement(By.linkText("CRM/SFA")).click();
         driver.findElement(By.linkText("Leads")).click();
         driver.findElement(By.linkText("Create Lead")).click();
         driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
         driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Brinny");
         
        
         driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Arun");
         
         driver.findElement(By.id("createLeadForm_description")).sendKeys("Hi this is form");
         
         driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Tester");
         
         driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("dd@gmail.com");
         
         driver.findElement(By.className("smallSubmit")).click();
        
         String title1 =driver.getTitle();
        System.out.println(title1);
	}
         
         
}
        
         
        
        