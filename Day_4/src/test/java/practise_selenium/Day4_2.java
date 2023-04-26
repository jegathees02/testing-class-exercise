package practise_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4_2 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions co = new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new EdgeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		WebElement fname = driver.findElement(By.id("input-firstname"));
		fname.sendKeys("jegathees");
		WebElement lname = driver.findElement(By.id("input-lastname"));
		lname.sendKeys("5555");
		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys("jegathees@gmail.com");
		WebElement password = driver.findElement(By.id("input-password"));
		password.sendKeys("jegathees");
//		JavascriptExecutor js =(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,250)","");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,150)","");
		WebElement button = driver.findElement(By.id("input-newsletter-yes"));
		button.click();

	}

}
