import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoking browser
		System.setProperty("webdriver.edge.driver", "driver\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://google.com");
		WebElement Search = driver.findElement(By.className("gLFyf"));
		Search.sendKeys("Op");
		Search.sendKeys("pen");
		Search.sendKeys("hei");
		Search.sendKeys("mer");
		Search.sendKeys(Keys.ENTER);
		//driver.quit();
	}
}