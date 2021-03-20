package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		
		//String rutaChrome2 = System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe";
		String rutaChrome3 = "C:\\Users\\Manuel\\eclipse-workspace\\seleniumCoolTester\\chromedriver\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", rutaChrome3);
		
		String url = "https://www.google.co.ve/";
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement searchBox = driver.findElement(By.name("q"));
		
		searchBox.clear();
		searchBox.sendKeys("youtube");
		searchBox.submit();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//assertEquals("youtube - Buscar con google", driver.getTitle());
		
		if(driver.getTitle().equalsIgnoreCase("youtube - Buscar con google")) {
			System.out.println("El Title Concuerda");
		}else {
			System.out.println("¡Error el Title NO concuerda!");
		}
		
		driver.quit();

	}

}
