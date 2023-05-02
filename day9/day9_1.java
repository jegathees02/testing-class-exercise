package day9;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class day9_1 {
	int a,b,c;
  @Test(dataProvider = "dp")
  public void add(Integer a, Integer b) {
	  c = a + b;
	  System.out.println(c);
  }
  @Test(dataProvider = "dp")
  public void sub(Integer a, Integer b) {
	  c = a - b;
	  System.out.println(c);
  }
  @Test(dataProvider = "dp")
  public void mul(Integer a, Integer b) {
	  c = a * b;
	  System.out.println(c);
  }
  @Test(dataProvider = "dp")
  public void div(Integer a, Integer b) {
	  c = a / b;
	  System.out.println(c);
  }
  

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 10, 5 },
      new Object[] { 2, 1},
    };
  }
}
