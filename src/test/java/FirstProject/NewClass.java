package FirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewClass {
	
	public static void common()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Naveenaa\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		common();
		
		WebDriver driver = new ChromeDriver();
			
		driver.get("http://demo.automationtesting.in/Register.html");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement d = driver.findElement(By.xpath("//div[contains(text(),'2016')]"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", d);
		
		//WebElement country = driver.findElement(By.id("country"));
		
		WebElement countrySelect = driver.findElement(By.xpath("//span[@class = 'select2-selection select2-selection--single']"));
		
		countrySelect.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("India",Keys.ENTER);
		
		//js.executeScript("arguments[0].click()", countrySelect);
			
		//Thread.sleep(500);
		
		//WebElement India = driver.findElement(By.xpath("(//option[@value='India'])[2]"));
		
		//Select se = new Select (countrySelect);
		
		//se.selectByVisibleText("India");
		
		//Thread.sleep(500);
		
		//countrySelect.sendKeys(Keys.ENTER);
			
		//js.executeScript("arguments[0].setAttribute('value','India')", India);
					
		//js.executeScript("arguments[0].click()", India);
		
		Thread.sleep(1000);
		
		Object obj = js.executeScript("return arguments[0].getAttribute('value')", countrySelect);
		
		String s = (String) obj;
		
		System.out.println(s);
		
		driver.quit();
		
		
	}

}
