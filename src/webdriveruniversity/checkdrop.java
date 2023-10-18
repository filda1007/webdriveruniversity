package webdriveruniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class checkdrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		
		Select lang = new Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-1\"]")));
		lang.selectByValue("python");
		
		Select environment = new Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-2\"]")));
		environment.selectByValue("testng");
		
		Select frontend = new Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-3\"]")));
		frontend.selectByValue("jquery");
		
		WebElement check1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[2]/input"));
		check1.click();
		
		WebElement check2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[1]/input"));
		check2.click();
		
		WebElement radio1= driver.findElement(By.xpath("/html/body/div/div[4]/div/div/form/input[1]"));
		radio1.click();
	}

}
