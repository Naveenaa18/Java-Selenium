package FirstProject;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Naveenaa\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		driver.manage().window().maximize();
	
		Actions a = new Actions(driver);
		
		WebElement para = driver.findElement(By.xpath("//div[@id='article-wrapper']//p[2]"));
		
		//String s= para.getText();
		
	//	System.out.println(s);
		
		WebElement cursor = driver.findElement(By.xpath("//p[contains(text(),'is a leading')]"));
		
		a.moveToElement(cursor).clickAndHold().moveByOffset(70, 30).release().build().perform();
		
		a.contextClick().perform();
		
		Thread.sleep(500);
		
		Robot r = new Robot();
		
		for(int i = 0; i <=2 ; i++)
		{
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//Thread.sleep(1000);
		
		//driver.quit();
	}
	
}
