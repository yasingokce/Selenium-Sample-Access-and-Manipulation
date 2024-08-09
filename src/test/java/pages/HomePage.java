package pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.example.KeyValueName;
public class HomePage extends Pages{

    public final Map<String, KeyValueName<String, String>> map = new HashMap<>();
    public final String testHomePageUrl = "https://www.automationexercise.com/";

      public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
      //buttons
      map.put("logo", new KeyValueName<>("logo", "//img[@alt='Website for automation practice']", "xpath"));
      map.put("homeButton", new KeyValueName<>("homeButton", "//a[contains(.,'Home')]", "xpath"));
      map.put("productButton", new KeyValueName<>("productButton", "//a[.=' Products']", "xpath"));
      map.put("cartButton", new KeyValueName<>("cartButton", "//ul[@class='nav navbar-nav']//a[contains(.,'Cart')]", "xpath"));
      map.put("signUpLoginButton", new KeyValueName<>("signUpLoginButton", "//a[contains(.,'Signup / Login')]", "xpath"));
      map.put("testCasesButton", new KeyValueName<>("testCasesButton", "//ul[@class='nav navbar-nav']//a[contains(.,'Test Cases')]", "xpath"));
      map.put("apiTestingButton", new KeyValueName<>("apiTestingButton", "//a[contains(.,'API Testing')]", "xpath"));
      map.put("videoTutorialsButton", new KeyValueName<>("videoTutorialsButton", "//a[contains(.,'Video Tutorials')]", "xpath"));
      map.put("contactUsButton", new KeyValueName<>("contactUsButton", "//a[contains(.,'Contact us')]", "xpath"));
      
      //category
      map.put("categoryText", new KeyValueName<>("categoryText", "//h2[.='Category']", "xpath"));
      map.put("women", new KeyValueName<>("women", "[href='#Women']", "CssSelector"));
      map.put("men", new KeyValueName<>("men", "[href='#Men']", "CssSelector"));
      map.put("kids", new KeyValueName<>("kids", "[href='#Kids']", "CssSelector"));


      //brands
      map.put("brandsText", new KeyValueName<>("brandsText", ".brands_products > h2", "CssSelector"));
      map.put("polo", new KeyValueName<>("polo", "//a[contains(.,'(6)Polo')]", "xpath"));
      map.put("hm", new KeyValueName<>("hm", "//a[contains(.,'(5)H&M')]", "xpath"));
      map.put("madame", new KeyValueName<>("madame", "//a[contains(.,'(5)Madame')]", "xpath"));
      map.put("mastHarbour", new KeyValueName<>("mastHarbour", "//a[contains(.,'(3)Mast & Harbour')]", "xpath"));
      map.put("babyHug", new KeyValueName<>("babyHug", "//a[contains(.,'(4)Babyhug')]", "xpath"));
      map.put("allenSolly", new KeyValueName<>("allenSolly", "//a[contains(.,'(3)Allen Solly Junior')]", "xpath"));
      map.put("kookieKids", new KeyValueName<>("kookieKids", "//a[contains(.,'(3)Kookie Kids')]", "xpath"));
      map.put("biba", new KeyValueName<>("biba", "//a[contains(.,'(5)Biba')]", "xpath"));


    }
    
}
