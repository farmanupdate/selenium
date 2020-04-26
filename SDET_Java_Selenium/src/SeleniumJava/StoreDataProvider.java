package SeleniumJava;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class StoreDataProvider {
  @DataProvider(name="dpTest")
		  
  public Object[][] dp() {
	  
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "xyz", "b" },
    };
  }
}
