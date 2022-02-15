package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class C02_DriverGetMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver_win32 (1)/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle()); //sayfanin title ini getirir

        System.out.println(driver.getCurrentUrl());// sayfanin adresini getirir

        System.out.println(driver.getWindowHandle()); //CDwindow-AF2E7C7AAB452ACCD2DB260738049F3B

        System.out.println(driver.getPageSource()); // kaynak dosyaları getirir



    }

}
