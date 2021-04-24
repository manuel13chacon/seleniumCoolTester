package selenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import commons.LeerProperties;

public class SeleniumTest {
	
	public static Logger log =  Logger.getLogger(SeleniumTest.class);
	static LeerProperties prop = new LeerProperties();
	static WebDriver driver;
	static String path = System.getProperty("user.dir");
	
	
	public static void main(String[] args) {
		
//		//String rutaChrome = System.getProperty("user.dir")+ "\\chromedriver\\chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", rutaChrome);
//		
//		//System.out.println(rutaChrome);
//		
//		// Options para abrir
//		ChromeOptions option = new ChromeOptions();		
//		option.addArguments("--start-maximized");
//		option.addArguments("--incognito");
//		
//		WebDriver driver = new ChromeDriver(option);
//		
//		// Implicit waits para demorar la ejecucion
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		
		prop.getSystemProperties();
		String url = System.getProperty("URL");
		//WebDriver driver;
		driver = startDriver(url);
		
		log.info(" Se abrira una URL");
		
		//driver.get("https://www.google.co.ve/");
//		driver.get(url);
//		
//		// Locators para el campo UserName
		WebElement userNameById = driver.findElement(By.id("txtUsername"));
		WebElement userNameByName = driver.findElement(By.name("txtUsername"));
		WebElement userNameByXpath = driver.findElement(By.xpath("//div[@id='divUsername']/input"));
		
		WebElement userNameByCssSelector = driver.findElement(By.cssSelector("input[name='txtUsername']"));
		
		//List<WebElement> listUsernameTag = driver.findElements(By.tagName("//input"));
		List<WebElement> listofInputs = driver.findElements(By.tagName("input"));
		
		// Locators para el campo PassWord
		WebElement txtPasswordById = driver.findElement(By.id("txtPassword"));
		WebElement txtPasswordByXpath = driver.findElement(By.xpath("//div[@id='divPassword']/input"));
		
		WebElement txtPasswordByCssSelector = driver.findElement(By.cssSelector("input[name='txtPassword']"));
		//List<WebElement> listTxtPasswordTag = driver.findElements(By.tagName("//input"));
		
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		
		WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot your password?"));
				
		//userNameByXpath.sendKeys("Admin");
		//txtPasswordByXpath.sendKeys("admin123");
		
		//userNameByCssSelector.sendKeys("Admin");
		//txtPasswordByCssSelector.sendKeys("admin123");
		
		listofInputs.get(5).sendKeys("Admin");
		//listofInputs.get(5).
		listofInputs.get(6).sendKeys("admin123");
		btnLogin.click();
		
		
		try {
			WebElement linkWelcome = driver.findElement(By.xpath("//a[@id='welcome']"));

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
		//driver.close();
		
		//System.out.println(numeroRandom());

	}//end main
	
//	public static int numeroRandom() {
//		int numero = (int) Math.random() * 100;
//
//		return numero;
//	}
	
	public static WebDriver startDriver (String url) {
		try {
		prop.getSystemProperties();
		
		String browser = System.getProperty("BROWSER");
		
		switch(browser) {
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver", path+"\\chromedriver\\chromedriver.exe");
			ChromeOptions option = new ChromeOptions();		
			option.addArguments("--start-maximized");
			option.addArguments("--incognito");
			
			driver = new ChromeDriver(option);
			driver.get(url);
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", path+"\\geckodriver\\geckodriver.exe");
			FirefoxOptions foption = new FirefoxOptions();
			foption.addArguments("--start-maximized");
			foption.addArguments("--incognito");
			
			driver = new FirefoxDriver(foption);
			driver.get(url);
			break;
			
		case "edge":
			System.setProperty("webdriver.edge.driver", path+"\\edgedriver\\msedgedriver.exe");
			EdgeOptions eoption = new EdgeOptions();
			eoption.addArguments("--start-maximized");
			eoption.addArguments("--incognito");
			
			driver = new EdgeDriver(eoption);
			driver.get(url);
			break;
			
		default : System.out.println("El driver no esta [ "+browser+" ], no esta configurado en este proyecto");
		} // end switch
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("El driver no pudo ser iniciado");
		}
		return driver;
	}

}// end class
