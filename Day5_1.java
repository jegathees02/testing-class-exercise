package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_1 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions co = new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new EdgeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable/");
		
		Actions a = new Actions(driver);
		WebElement source_ele = driver.findElement(By.id("draggable"));
		WebElement dest_ele = driver.findElement(By.id("droppable"));
		a.clickAndHold(source_ele).release(dest_ele).build().perform();
		

	}

}
