package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
				
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.manage().window().maximize();
				
				driver.findElement(By.id("username")).sendKeys("demoSalesManager");
				
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				driver.findElement(By.className("decorativeSubmit")).click();
				
				WebElement crm = driver.findElement(By.linkText("CRM/SFA"));
				String crmTxt = crm.getText();
				System.out.println(crmTxt);
				crm.click();
				
				driver.findElement(By.linkText("Leads")).click();
				
				driver.findElement(By.linkText("Create Lead")).click();
				
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
				
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pramila");
				
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chandran");
				
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Prami");
				
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
				
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning Selenium in Testleaf");
				
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test123@gmail.com");
				
				driver.findElement(By.name("submitButton")).click();
							
				String title= driver.getTitle();
				System.out.println(title);
				
				Thread.sleep(4000);
				
				driver.close();	
			}


	}

