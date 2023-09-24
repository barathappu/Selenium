import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoEdge {
    public static void main(String[] args){

        System.out.println("Execution after setting EdgeDriver path in System Variables on Windows!!");
        WebDriver driver = new EdgeDriver();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.instagram.com/");
        WebElement l = driver. findElement(By.name("username"));
        l.sendKeys("appu_barath");
        //Thread.sleep(3000);
        //driver.quit();
        System.out.println("Execution complete on Windows");

    }
}