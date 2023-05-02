package day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day7_05 {
	WebDriver driver;
//  @SuppressWarnings("deprecation")
@Test
  public void test1() {
	  String a_title = "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy";
	  String e_title = driver.getTitle();
	  Assert.assertEquals(a_title, e_title);
	  
	  String a_url = "https://www.godaddy.com/";
	  String e_url = driver.getCurrentUrl();
	  Assert.assertEquals(a_url, e_url);
	  driver.quit();
	  driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS));
  }
  
  @Test(dependsOnMethods = "test1")
  public void test2() {
	  
	  
  }
  
  @Test
  @BeforeSuite
  public void before() {
	  WebDriverManager.edgedriver().setup();
		EdgeOptions co = new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new EdgeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.godaddy.com/");
  }
}
