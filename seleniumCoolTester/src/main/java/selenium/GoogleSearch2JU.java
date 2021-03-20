//package selenium;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class GoogleSearch2JU {
//
//	private WebDriver driver = new ChromeDriver();
//
//	@before
//	public void setUp() {
//
//		String rutaChrome4 = "C:\\Users\\Manuel\\eclipse-workspace\\seleniumCoolTester\\chromedriver\\chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", rutaChrome4);
//		
//		driver.manage().window().maximize();
//		String urlGoogle = "https://www.google.co.ve/";
//		
//		driver.get(urlGoogle);
//
//	}
//	
//	@Test
//	public void testGoogleYoutube() {
//		
//		WebElement searchBox = driver.findElement(By.name("q"));
//		searchBox.clear();
//		searchBox.sendKeys("youtube");
//		searchBox.submit();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		
//		//assertEquals("youtube - Buscar con google", driver.getTitle());
//	}
//	
//	@After
//	public void tearDown() {
//		driver.quit();
//	}
//}
