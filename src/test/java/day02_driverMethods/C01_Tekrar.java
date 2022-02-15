package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {
    //normalde selenium un kendi ideasi var fakat biz daha kullanisli oldugu icin intellij kullaniyoruz.
    //intelij de yeni bir proje actigimizda oncelikle selenium kutuphanelerini projeye eklememiz gerekir.
    //biz en ilkel haliyle projemize kutuphaneleri jar dosyalarin olarak yukledik
    // bu ekledigimiz dosyalarla driverin ayarlarini yapabiliriz.
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver_win32 (1)/chromedriver.exe");

        //setProperty methodu iki parametre idter.
        //ilki kullanacagimiz browsere ait driver
        //ikinci parametre ise selnium sitesinden indirip projemizze ekledigimiz  chromedriverin pathi
        //windows kullanicilari sona .exe eklerken apple kullananlar eklemiyor

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        Thread.sleep(5000);
        //javadan gelir ,icinde yazan mili saniye kadar kodlarin calismasini durdurur.
        // yani 5 saniye sonra acilan sayfayi kapat demek.

        driver.close();
        //bu kod clasin sonuna yazilir. cunku bu kod calisinca driverimiz kapanir.
        // bu koddan sonra yeniden bir browser acmak istiyorsak drivera yeni bir deger atamamiz gerekir.





    }
}
