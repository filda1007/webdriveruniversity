package webdriveruniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
		driver.manage().window().maximize();
		
		WebElement firstclick = driver.findElement(By.id("button1"));
		firstclick.click();
		driver.switchTo().alert().accept();
		
		/*WebElement secondclick = driver.findElement(By.id("button2"));
		secondclick.click();*/
		
		WebElement fourthclick = driver.findElement(By.id("button4"));
		fourthclick.click();
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
	}

}
