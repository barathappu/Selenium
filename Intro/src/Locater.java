import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Locater {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "driver\\msedgedriver.exe");
		
		  WebDriver mk = new EdgeDriver();
		  mk.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  mk.get("https://rahulshettyacademy.com/locatorspractice");
		  mk.findElement(By.id("inputUsername")).sendKeys("rahul");
		  mk.findElement(By.name("inputPassword")).sendKeys("hello123");
		  mk.findElement(By.className("signInBtn")).click();
		  System.out.println(mk.findElement(By.cssSelector("p.error")).getText());
		  mk.findElement(By.linkText("Forgot your password?")).click();
		  Thread.sleep(1000);
		  mk.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Barath");
		  mk.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("barath@gamil.com");
		  mk.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9876543210");
		  mk.findElement(By.cssSelector(".reset-pwd-btn")).click();
		  mk.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  System.out.println(mk.findElement(By.cssSelector(".infoMsg")).getText());
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
//		  WebDriver mk1 = new EdgeDriver();
//		  mk.get("https://www.netflix.com/in/");
//		  WebElement netflix = mk.findElement(By.name("email"));
//		  netflix.sendKeys("barathbelieve08@gmail.com"); netflix.sendKeys(Keys.ENTER);
//		  Thread.sleep(3000);
//		  netflix.findElement(By.xpath("//button[@placeholder='registration_button_continue']")).click();		 
//		  Thread.sleep(3000);
		  }

}
