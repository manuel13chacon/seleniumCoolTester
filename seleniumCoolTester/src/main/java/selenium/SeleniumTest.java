package selenium;


import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commons.LeerProperties;

public class SeleniumTest {
	
	public static Logger log =  Logger.getLogger(SeleniumTest.class);
	static LeerProperties prop = new LeerProperties();
	
	
	public static void main(String[] args) {
		
		String rutaChrome = System.getProperty("user.dir")+ "\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", rutaChrome);
		
		//System.out.println(rutaChrome);
		
		// Options para abrir
		ChromeOptions option = new ChromeOptions();		
		option.addArguments("--start-maximized");
		option.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(option);
		
		// Implicit waits para demorar la ejecucion
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		
		prop.getSystemProperties();
		String url = System.getProperty("URL");
		
		
		log.info(" Se abrira una URL");
		
		//driver.get("https://www.google.co.ve/");
		driver.get(url);
		
		// Locators para el campo UserName
		WebElement userNameById = driver.findElement(By.id("txtUsername"));
		WebElement userNameByName = driver.findElement(By.name("txtUsername"));
		WebElement userNameByXpath = driver.findElement(By.xpath("//div[@id='divUsername']/input"));
		
		// Locators para el campo PassWord
		WebElement txtPasswordById = driver.findElement(By.id("txtPassword"));
		WebElement txtPasswordByXpath = driver.findElement(By.xpath("//div[@id='divPassword']/input"));
		
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
				
		userNameByXpath.sendKeys("Admin");
		txtPasswordByXpath.sendKeys("admin123");
		btnLogin.click();
		
		
		try {
			WebElement linkWelcome = driver.findElement(By.xpath("//a[@id='welome']"));

			if (linkWelcome.getSize()!= null) {
				System.out.println("Login Exitoso");
				log.info(" Resultado exitoso");
			}
		} catch (NoSuchElementException e) {
			System.out.println("Login Fallido");
			log.info(" Resultado Fallido");
		}
		
		log.info(" Ejecucion finalizada");
		
		//driver.manage().window().maximize();
				
		//driver.quit();

	}

}
