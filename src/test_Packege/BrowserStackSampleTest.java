package test_Packege;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

public class BrowserStackSampleTest {
  public static final String USERNAME = "vikassharma12";
  public static final String AUTOMATE_KEY = "rduy6SByCdH5o4qFphkq";
  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
  public static void main(String[] args) throws Exception {
    DesiredCapabilities caps = new DesiredCapabilities();
    
    caps.setCapability("browserName", "iPhone");
    caps.setCapability("device", "iPhone 11");
    caps.setCapability("realMobile", "true");
    caps.setCapability("os_version", "14");
    
    caps.setCapability("name", "vikassharma12's First Test");
    
    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    driver.get("http://www.google.com");
    WebElement element = driver.findElement(By.name("q"));

    element.sendKeys("BrowserStack");
    element.submit();

    System.out.println(driver.getTitle());
    driver.quit();
  }
}
