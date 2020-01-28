package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
	
static WebDriver driver;
	
	@Test
	public void runSelenium() {
//		driver=new FirefoxDriver();
//		   driver.manage().window().maximize();
//		   System.setProperty("webdriver.gecko.driver","C:\\junit\\geckodriver.exe");
//		    
//		   driver.get("https://app.fluxday.io/users/sign_in");
//		    //driver.navigate().to("https://selenium.dev/documentation/en/getting_started/");
//		    
//		    //WebElement search = driver.findElement(By.id("search-by"));
//		    WebElement search = driver.findElement(By.xpath("//*[@id=\"user_email\"]"));
//		    search.sendKeys("admin@fluxday.io");
//		    WebElement search1=driver.findElement(By.xpath("//*[@id=\"user_password\"]"));
//		    search1.sendKeys("password");
//		    WebElement searchL=driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[2]/div[3]/button"));
//		    searchL.click();
		    
		  //*[@id="new_user"]/div[2]/div[3]/button
		    
//		    String result = driver.getTitle();
//		    assertEquals("Getting started :: Documentation for Selenium", result);
		    //driver.close();
		    System.out.println("Fluxday starting");
	        System.setProperty("webdriver.gecko.driver","C:\\junit\\geckodriver.exe");
			driver = new FirefoxDriver();
	        driver.get("https://app.fluxday.io/");
	        driver.manage().window().maximize();
//	        WebElement search = driver.findElement(By.xpath("//*[@id='user_email']"));
	        driver.findElement(By.xpath("//*[@id=\'user_email\']")).sendKeys("lead@fluxday.io");
	        driver.findElement(By.xpath("//*[@id=\'user_password\']")).sendKeys("password");
	        driver.findElement(By.xpath("/html/body/div[1]/div/form/div[2]/div[3]/button")).click();
	        try {
	            Thread.sleep(3000); //wait for 3 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        driver.close();
	    }

}
