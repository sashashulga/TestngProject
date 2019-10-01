import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClasss {
    @Test
    public void TestClass() throws InterruptedException {
        // --- Enter to the system ---
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://mishpahug.co.il/");
        driver.findElement(By.id("closedIntro")).click();
        Thread.sleep(6000);
        driver.quit();
    }
}