package webdriveruniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Datepicker/index.html");
		driver.manage().window().maximize();
		
		String month = "February 1996";
		//String day = "10";
		WebElement datePickerInput = driver.findElement(By.xpath("//*[@id=\"datepicker\"]/input"));
		datePickerInput.click();
		
		Thread.sleep(2000);
		
		while(true)
		{
			String monthyeartext = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]")).getText();
			if (monthyeartext.equals(month))
			{
				break;
			}
			else
			{
				WebElement leftarrow = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[1]"));
				leftarrow.click();
			}
		}
          WebElement day1 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[2]/td[7]"));
          day1.click();
	}


}
