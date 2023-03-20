package TestNG_Code_Samples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTests {

    @Test
    public void getFirefox(){
        //System.setProperty("webdriver.gecko.driver", "geckodriver.exe path");
        System.setProperty("webdriver.gecko.driver", "/Users/krishnakk/Library/CloudStorage/OneDrive-Personal/SeleniumWorkedExample/TestNG_Code_Samples/geckodriver");
        System.out.println("GetFirefox Method is running on Thread : " + Thread.currentThread().getId());
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.softwaretestingmaterial.com");
        driver.close();
    }

    @Test
    public void getChorme(){
        //System.setProperty("webdriver.chrome.driver", "chromedriver.exe path");
        System.setProperty("webdriver.chrome.driver", "/Users/krishnakk/Library/CloudStorage/OneDrive-Personal/SeleniumWorkedExample/TestNG_Code_Samples/chromedriver");
        System.out.println("GetChrome Method is running on Thread : " + Thread.currentThread().getId());
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.softwaretestingmaterial.com");
        driver.close();
    }

}