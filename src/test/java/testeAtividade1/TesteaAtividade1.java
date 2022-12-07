package testeAtividade1;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteaAtividade1 {
	private WebDriver driver;
	
	@Before
	public void AbrirNavegador() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void TesteSiteSENAI() {
		driver.get("https://online.sp.senai.br/");
		driver.manage().timeouts().implicitlyWait( 3, TimeUnit.SECONDS);
		driver.findElement(By.id("btnCookieConsent")).click();
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("Tecnologia da Informação");
		driver.findElement(By.id("Busca1_btnBusca")).click();
		driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/a")).click();
		driver.findElement(By.cssSelector("a.carousel-control.right")).click();
		driver.findElement(By.cssSelector("a.carousel-control.left")).click();
		driver.findElement(By.cssSelector("div.carousel-inner")).click();
		driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"nav\"]/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/a")).click();
	
		
		
	}
	@After
	public void FecharNavegador() {
		driver.quit();
	}
		

}
