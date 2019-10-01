package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProfilePageTests {
    @Test
    public void lastNameOfFamilyChanging() throws InterruptedException {
        // --- Enter to the system ---
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://mishpahug.co.il/");
        driver.findElement(By.id("closedIntro")).click();
        Thread.sleep(6000);
        //--- Login to the system ---
        WebElement loginIcon = driver.findElement(By.id("idsignin"));
        loginIcon.click();
        Thread.sleep(3000);

        WebElement loginField = driver.findElement(By.id("logininput"));
        WebElement passwordField = driver.findElement(By.id("passwordinput"));
        loginField.click();
        loginField.sendKeys("sashasasha");
        passwordField.click();
        passwordField.sendKeys("Sasha111");

        driver.findElement(By.id("signinrequest")).click();

        Thread.sleep(5000);

        //--- Go to the Profile Page
        driver.findElement(By.id("profile")).click();
        Thread.sleep(3000);

        // --- Open in edit mode ----
        driver.findElement(By.id("idbtneditprofile")).click();
        Thread.sleep(7000);

        //--- Enter new last name ---
        WebElement lastNameField = driver
                .findElement(By.xpath("//span[@id='fieldobjfamilyName']//input"));
        lastNameField.click();
        lastNameField.clear();
        lastNameField.sendKeys("ShulgaFamily");

        Thread.sleep(5000);

        //--- Save profile ---
        driver.findElement(By.id("idbtnsaveprofile")).click();
        Thread.sleep(5000);

        // --- Go to the family page-----
        driver.findElement(By.id("family")).click();
        Thread.sleep(5000);

        System.out.println("Last name of the family verification: " + driver
                .findElement(By.id("titleprofile")).getText().contains("ShulgaFamily"));

        // ---- Return to the profile
        driver.findElement(By.id("profile")).click();
        Thread.sleep(3000);

        // --- Open in edit mode ----
        driver.findElement(By.id("idbtneditprofile")).click();
        Thread.sleep(7000);

        //--- Enter new last name ---
        lastNameField = driver
                .findElement(By.xpath("//span[@id='fieldobjfamilyName']//input"));
        lastNameField.click();
        lastNameField.clear();
        lastNameField.sendKeys("Shulga");

        Thread.sleep(5000);

        //--- Save profile ---
        driver.findElement(By.id("idbtnsaveprofile")).click();
        Thread.sleep(5000);

        System.out.println("Last name was changed: " + driver.findElement(By.linkText("Shulga")).isDisplayed());

        driver.quit();

    }
}
