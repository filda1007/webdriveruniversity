package webdriveruniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class click {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
		driver.manage().window().maximize();
		
		/*WebElement click1 = driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
		click1.click();*/
		
		/*WebElement click2 = driver.findElement(By.id("button2"));
		click2.click();*/
		
		Actions ac = new Actions(driver);
		WebElement click2 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[2]/div/div[2]/span"));

		ac.moveToElement(click2).build().perform();

		WebElement click3 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[3]/div/div[2]/span"));
		click3.click();	
		
	
		

	}

}
