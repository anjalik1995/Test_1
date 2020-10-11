import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("admin");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_tips']")).click();
		
		//System.out.println(driver.findElement(By.xpath("//td[@class=\"noprint\"]")).getText());
		
		System.out.println(driver.findElement(By.xpath("//div[@class='popup_menu_icon tips_icon_light_on']")).getText());
		
		
		Thread.sleep(2000);
		driver.close();
}
}
