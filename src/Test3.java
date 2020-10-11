import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/jewellery/diamond-rings.html");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[contains(.,'Locate')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='https://www.google.com/maps/search/?api=1&query=BlueStone+Jewellery&query_place_id=ChIJPZZLslLBwjsR13ctRfIu8j8']")).click();
		
		Thread.sleep(2000);
        Set<String> tabs=driver.getWindowHandles();
		
		for (String tab : tabs)
		{
			driver.switchTo().window(tab);
		}
		
     System.out.println(driver.findElement(By.xpath("//div[contains(.,'S No, F 71, First Floor, Phoenix Market City, 207, Viman Nagar Rd, Clover Park, Viman Nagar, Pune, Maharashtra 411014')]/div[@class=\"ugiz4pqJLAG__primary-text gm2-body-2\"]")).getText());
       
     Thread.sleep(1000);
     driver.close();
     
	}
}



