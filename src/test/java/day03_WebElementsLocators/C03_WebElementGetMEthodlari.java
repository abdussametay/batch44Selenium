package day03_WebElementsLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.time.Duration;

public class C03_WebElementGetMEthodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //    a. http://a.testaddressbook.com adresine gidiniz.

        driver.get("http://a.testaddressbook.com");

        // sign in linkini locate ediniz

        WebElement signInLinki= driver.findElement(By.id("sign-in"));

        System.out.println("Size : " + signInLinki.getSize());
        System.out.println("AriaRole : " + signInLinki.getAriaRole());
        System.out.println("accessible name : " + signInLinki.getAccessibleName());
        System.out.println("id attribute valuesu : " + signInLinki.getAttribute("id"));
        System.out.println("genislik : " + signInLinki.getRect().width);
        System.out.println("color : " + signInLinki.getCssValue("color"));

        driver.close();
    }
}
