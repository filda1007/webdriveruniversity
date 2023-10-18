package webdriveruniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
		driver.manage().window().maximize();
		
		WebElement uname= driver.findElement(By.id("text"));
		uname.sendKeys("fildarose@gmail.com");
		
		WebElement pass =driver.findElement(By.id("password"));
		pass.sendKeys("filda");
		
		WebElement logbt =driver.findElement(By.id("login-button"));
		logbt.click();
	}

}
