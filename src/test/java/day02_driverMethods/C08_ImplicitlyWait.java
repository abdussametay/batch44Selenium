package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C08_ImplicitlyWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // implicitly wait testimiz boyunca sayfa acilmasi ve element bulunmasi konusunda driverin
        // bekleyecegi max sureyi belirler
        // bu sure icinde gorevini bitirir bitirmez bir sonraki adima gecer
        // bu sure icinde gorevini bitiremezse o zaman hata verir.

        // belirlenen maksimum sure thread.sleep deki gibi mutlak bekleme suresi degildir.
        //goevini bitirdigi zaman kapatir. bitiremezse maximum sureyi bekler.


        driver.get("https://www.techproeducation.com");

        driver.close();










    }
}
