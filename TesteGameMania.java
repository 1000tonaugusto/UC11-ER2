package br.localhost.testeGameMania;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TesteGameMania {
	
	private WebDriver driver;
	
	@Before
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void Teste() throws InterruptedException {

		driver.get("http://localhost:4200");
		
		
		WebElement tagLogin  = driver.findElement(By.id("iconeUsuario"));
		tagLogin.click();
		Thread.sleep(2000);
		
		WebElement tagEmail  = driver.findElement(By.name("campoEmail"));
		tagEmail.sendKeys("milton@milton.com.br");
		Thread.sleep(2000);
		
		WebElement tagPassword  = driver.findElement(By.name("campoPassword"));
		tagPassword.sendKeys("teste");
		Thread.sleep(2000);
		
		WebElement botaoLogin   = driver.findElement(By.name("botaoLogin"));
		botaoLogin.click();
		Thread.sleep(2000);
		
		WebElement tagMensagem  = driver.findElement(By.id("mensagemUsuario"));
		
		System.out.println(tagMensagem.getText());
		Thread.sleep(5000);	

	}
	
	@After
	public void fechaNavegador() {
		driver.quit();
	}
}