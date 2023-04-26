package practise_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4_5 {
	WebDriverManager.edgedriver().setup();
	EdgeOptions co = new EdgeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver = new EdgeDriver(co);
	driver.manage().window().maximize();
	driver.get("https://j2store.net/free/");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,350)","");
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String url1 = driver.getCurrentUrl();
	if(url1.equals("https://j2store.net/free/")) {
		System.out.println("url validated");
	}
	WebElement clothing = driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a"));
	clothing.click();
	url1 = driver.getCurrentUrl();
	if(url1.equals("https://j2store.net/free/index.php/shop?filter_catid=11")) {
		System.out.println("url validated");
	}
	
	
}
