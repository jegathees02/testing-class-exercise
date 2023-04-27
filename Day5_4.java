package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_4 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions co = new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new EdgeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		
		WebElement source = driver.findElement(By.id("source"));
		WebElement destination = driver.findElement(By.id("destination"));
		
		source.sendKeys("Coimbatore");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		source.sendKeys(Keys.ENTER);
		destination.sendKeys("Chennai");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		destination.sendKeys(Keys.ENTER);
		
		WebElement datefield = driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		datefield.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].setAttribute('value','05-05-2023')",datefield);
//		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement search_button = driver.findElement(By.xpath("//*[@id=\"seo_search_btn\"]"));
		search_button.click();
	

	}

}
