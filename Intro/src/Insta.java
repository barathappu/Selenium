import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Insta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver insta = new EdgeDriver();
		insta.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		insta.get("https://www.instagram.com/");
		WebElement name = insta.findElement(By.name("username"));
		name.sendKeys("appu_barath");
		insta.findElement(By.name("password")).sendKeys("Mbk@6242");
		insta.findElement(By.cssSelector("button div")).click();
//		
		

	}

}
