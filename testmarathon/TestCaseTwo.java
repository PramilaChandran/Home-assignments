package testmarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseTwo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		
		driver.findElement(By.xpath("//span[text()=' for boys']")).click();
		
		String results = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println(results);
		
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]")).click();
		
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		
		driver.findElement(By.linkText("Newest Arrivals")).click();
		
        String name =driver.findElement(By.xpath("//h2[1]")).getText();
        System.out.println(name);
        
        String amount =driver.findElement(By.xpath("//span[@class='a-price-whole'][1]")).getText();
        System.out.println(amount);
        
        String title= driver.getTitle();
		System.out.println(title);
			
				
		Thread.sleep(4000);
		
		driver.close();
		
		
	
		
		
	
		
		
		
	}

}
