import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by antosukesh on 4/21/17.
 */
public class Test_Page {


    @Test
    public void run(){
        System.setProperty("webdriver.gecko.driver","/Users/antosukesh/Downloads/geckodriver");
        //System.setProperty("webdriver.firefox.driver","/Users/antosukesh/Downloads/geckodriver");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(capabilities);
        driver.get("https://google.com");
        System.out.println("startsssssss");
    }
}
