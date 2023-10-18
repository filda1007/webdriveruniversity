package webdriveruniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class contact {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();
		
		WebElement Fname = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]"));
		Fname.sendKeys("Filda");
		WebElement Lname= driver.findElement(By.name("last_name"));
		Lname.sendKeys("Rodrigues");
		WebElement Email = driver.findElement(By.name("email"));
		Email.sendKeys("fildarose@gmail.com");
		WebElement comment = driver.findElement(By.name("message"));
		comment.sendKeys("This is a test");
		/*WebElement reset = driver.findElement(By.className("contact_button"));
		reset.click();*/
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
		submit.click();
		
		driver.close();
		
		

	}

}
