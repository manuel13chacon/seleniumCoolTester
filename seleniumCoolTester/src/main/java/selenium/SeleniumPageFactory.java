package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commons.LeerProperties;

public class SeleniumPageFactory {
	
	static LeerProperties prop = new LeerProperties();
	static WebDriver driver;
	static String path = System.getProperty("user.dir");
	
	@FindBy(id="txtUsername")
	WebElement userNameById;
	
	@FindBy(css = "input[name='txtPassword']")
	WebElement txtPasswordByCssSelector;
	
	@FindBy(id = "btnLogin")
	WebElement btnLogin;
	
	@FindBy(id = "spanMessage")
	WebElement textMensajeDeError;
	
	@FindBy(xpath = "//a[@id='welcome']")
	WebElement linkWelcome;
	
	@BeforeTest
	public  void startDriver() {
		try {
		prop.getSystemProperties();
		
		String browser = System.getProperty("BROWSER");
		String url = System.getProperty("URL");
		
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
		
		PageFactory.initElements(driver, this);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		Reporter.log("El driver fue inicializado [ "+browser+ "]");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("El driver no pudo ser iniciado");
		}
		
	}// end metodo
	
	@Test
	public void loginFallido() {
		WebElement userNameById = driver.findElement(By.id("txtUsername"));
		WebElement txtPasswordByCssSelector = driver.findElement(By.cssSelector("input[name='txtPassword']"));
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		
				
		userNameById.clear();
		txtPasswordByCssSelector.clear();
		
		userNameById.sendKeys("Admin");
		Reporter.log("Username ingresado correctamente");
		txtPasswordByCssSelector.sendKeys("admin1234");
		Reporter.log("Password ingresado correctamente");
		btnLogin.click();
		Reporter.log("Boton login seleccionado");
		
		WebElement textMensajeDeError = driver.findElement(By.id("spanMessage"));
		
		Assert.assertEquals(textMensajeDeError.getText(), "Invalid credentials");
		Reporter.log(textMensajeDeError.getText(),true);
	}
	
	@Test
	public void loginSinUsuario() {
		WebElement userNameById = driver.findElement(By.id("txtUsername"));
		WebElement txtPasswordByCssSelector = driver.findElement(By.cssSelector("input[name='txtPassword']"));
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		
		WebElement textMensajeDeError = driver.findElement(By.id("spanMessage"));
		
		userNameById.clear();
		txtPasswordByCssSelector.clear();
		
		txtPasswordByCssSelector.sendKeys("admin1234");
		Reporter.log("Password ingresado correctamente");
		btnLogin.click();
		Reporter.log("Boton login seleccionado");
		
		Assert.assertEquals(textMensajeDeError.getText(), "Username cannot be empty");
		Reporter.log(textMensajeDeError.getText(),true);
	}
	
	@Test
	public void loginSinPassword() {
		WebElement userNameById = driver.findElement(By.id("txtUsername"));
		WebElement txtPasswordByCssSelector = driver.findElement(By.cssSelector("input[name='txtPassword']"));
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		
		WebElement textMensajeDeError = driver.findElement(By.id("spanMessage"));
		
		userNameById.clear();
		txtPasswordByCssSelector.clear();
		
		userNameById.sendKeys("Admin");
		
		btnLogin.click();
		
		Assert.assertEquals(textMensajeDeError.getText(), "Password cannot be empty");
		Reporter.log(textMensajeDeError.getText(),true);
	}
	
//	@Test
//	public void loginExitoso() {
//		WebElement userNameById = driver.findElement(By.id("txtUsername"));
//		WebElement txtPasswordByCssSelector = driver.findElement(By.cssSelector("input[name='txtPassword']"));
//		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
//		
//				
//		userNameById.clear();
//		txtPasswordByCssSelector.clear();
//		
//		userNameById.sendKeys("Admin");
//		Reporter.log("Username ingresado correctamente");
//		txtPasswordByCssSelector.sendKeys("admin123");
//		Reporter.log("Password ingresado correctamente");
//		btnLogin.click();
//		Reporter.log("Boton login seleccionado");
//		
//		WebElement textMensajeDeError = driver.findElement(By.id("spanMessage"));
//		
//		Assert.assertEquals(textMensajeDeError.getText(), "Invalid credentials");
//		Reporter.log(textMensajeDeError.getText(),true);
//	}

}
