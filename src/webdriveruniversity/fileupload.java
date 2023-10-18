package webdriveruniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		driver.manage().window().maximize();
		WebElement file = driver.findElement(By.id("myFile"));
		file.sendKeys("C:\\Users\\user\\Downloads\\butterfly.jpg");
		
	WebElement submit = driver.findElement(By.id("submit-button"));
	submit.click();
	try
	{
		Thread.sleep(3000);
	}
	catch (InterruptedException e) {
		e.printStackTrace();
	}
		
		driver.switchTo().alert().accept();
		
		
	
		
	}

}
