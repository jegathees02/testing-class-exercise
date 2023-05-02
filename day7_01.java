package day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day7_01 {
  @Test
  public void method1() {
	  WebDriverManager.edgedriver().setup();
		EdgeOptions co = new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new EdgeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		String expectedTitle = "Guest Registration Form – User Registration";
		System.out.println(expectedTitle);
		Assert.assertEquals(pageTitle,expectedTitle);
  }
 
}
