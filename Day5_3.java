package day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_3 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions co = new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new EdgeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		WebElement cust = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		cust.sendKeys("401");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement button = driver.findElement(By.name("submit"));
		button.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
		cust.clear();
		
		cust.sendKeys("402");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		button.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
//		alert2.dismiss();
		Alert alert3 = driver.switchTo().alert();
		String txt = alert3.getText();
		alert3.accept();
		System.out.println(txt);

	}

}
