package testmarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestcaseOne {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.abhibus.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='source']")).sendKeys("Chennai");
		
		driver.findElement(By.xpath("//li[@class='ui-menu-item ui-state-focus']")).click();
		
        driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Bangalore");
		
		driver.findElement(By.xpath("//li[@class='ui-menu-item ui-state-focus']")).click();
		
		driver.findElement(By.id("datepicker1")).click();
		
		driver.findElement(By.xpath("//a[@class='ui-state-default']")).click();
		
		driver.findElement(By.xpath("//div[@class='col-md-auto']/a")).click();
		
		WebElement firstname = driver.findElement(By.xpath("(//h2[@class='TravelAgntNm ng-binding'])[2]"));
		String firstbus = firstname.getText();
		System.out.println(firstbus);
		
		driver.findElement(By.id("Bustypes4")).click();
			
		WebElement seats =driver.findElement(By.xpath("(//p[contains(text(),'Seats Available')])"));
		String busseat= seats.getText();
		System.out.println(busseat);
		
		driver.findElement(By.xpath("(//span[@class='book'])[1]")).click();
		
		driver.findElement(By.xpath("(//div[@class='seats']//a[1])")).click();
		
		WebElement seatnumber =driver.findElement(By.xpath("//span[@id='seatnos']"));
		String busseatnumber= seatnumber.getText();
		System.out.println(busseatnumber);
		
		WebElement busfare =driver.findElement(By.xpath("//span[@id='ticketfare']"));
		String fare= busfare.getText();
		System.out.println(fare);
		
		WebElement boardingpt =driver.findElement(By.id("boardingpoint_id"));
		Select sel= new Select(boardingpt);
		sel.selectByIndex(1);	
		
		WebElement droppingpt =driver.findElement(By.id("droppingpoint_id"));
		Select seldrop= new Select(droppingpt);
		seldrop.selectByIndex(1);
		
		String title= driver.getTitle();
		System.out.println(title);
			
				
		Thread.sleep(4000);
		
		driver.close();
		
		
	}

}
