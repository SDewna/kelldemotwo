package test_Packege;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sunil.x.kumar\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.goindigo.in"); // enter URL
		
		
			driver.findElement(By.xpath("*//div[@class='col-sm-5 col-5 padd-left']//input[@placeholder='Departure Date']")).click();
			
			String month= "December";
			String date ="22";
			while(true) {
				
				String mon= driver.findElement(By.xpath("//span[contains(text(),'December')]")).getText();
				if(mon.equals(month)) {
					break;
				}else
				{
					driver.findElement(By.xpath("//a[@title='Next']")).click();
				}
				
				List<WebElement>calendar1 = driver.findElements(By.xpath("//div[contains(@class,'ui-datepicker-group ui-datepicker-group-first')]"));
				for(WebElement l:calendar1) {
					
				String m = l.getText();	
				if(m.equals(date)) {
					l.click();
				}
				}
			    }
			
		}
		
		// TODO Auto-generated method stub

	}



