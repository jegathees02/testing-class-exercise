package practise_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4_3 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions co = new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new EdgeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		WebElement rname = driver.findElement(By.id("input-to-name"));
		rname.sendKeys("jegathees");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,150)","");
		WebElement remail = driver.findElement(By.id("input-to-email"));
		remail.sendKeys("jegathees@gmail.com");
		WebElement name = driver.findElement(By.id("input-from-name"));
		name.sendKeys("jegathees");
		WebElement email = driver.findElement(By.id("input-from-email"));
		email.sendKeys("jegathees@gmail.com");
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,150)","");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement button = driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]"));
		button.click();
		WebElement msg = driver.findElement(By.id("input-message"));
		msg.sendKeys("Happy Birthday");
//		JavascriptExecutor js=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,50)","");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement button1 = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/form/div[8]/div/button"));
		button1.click();
		driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input"));
		

	}

}
