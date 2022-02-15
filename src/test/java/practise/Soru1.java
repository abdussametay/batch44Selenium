package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Soru1 {
    //  ...Exercise2...

    public static void main(String[] args) {
        //  2-java class'imiza chromedriver.exe'yi tanitalim
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver_win32 (1)/chromedriver.exe");
        //  1-driver olusturalim
        WebDriver driver=new ChromeDriver();
        //  3-driver'in tum ekrani kaplamasini saglayalim
        driver.manage().window().maximize();
        //  4-driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesin söyleyelim.
        //  Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //  5-"sahibinden.com" adresine gidelim
        driver.get("https://www.sahibinden.com");
        //  6-bu web adresinin sayfa basligini(title) ve adres(url)ini alalim
        String shbTitle= driver.getTitle();
        String shbUrl= driver.getCurrentUrl();

        System.out.println("Sahibinden URL : " + shbUrl);
        System.out.println("Sahibnden Title : " + shbTitle);
        //  7-title ve url'nin "Oto" kelimesinin icerip icermedigini kontrol edelim
        if (shbTitle.contains("Oto") ){
            System.out.println("TITLE Oto kelimesi iceriyor");
        }else{
            System.out.println("TITLE Oto kelimesi icermiyor");
        }
        if ( shbUrl.contains("Oto")){
            System.out.println("URL Oto kelimesi iceriyor");
        }else{
            System.out.println("URL Oto kelimesi icermiyor");
        }

        //  8-Ardindan "gittigidiyor.com" adresine gidelim

        driver.get("https://www.gittigidiyor.com");

        //  9-bu adresin basligini alalim ve "Sitesi" kelismesini icerip icermedigini kontrol edelim

       /*
       //1.yol
        boolean isTrue=driver.getTitle().contains("Sitesi");
        if (isTrue){
            System.out.println("Test SUCCESS");
        }else{
            System.out.println("Test FAIL");
        }
        */
        //2.yol
        String gitTitle = driver.getTitle();
        System.out.println("giit title " + gitTitle);
        System.out.println(gitTitle.contains("Sitesi") ? "pass" : "Fail");

        //  10-Bi onceki web sayfamiza geri donelim
        driver.navigate().back();
        //  11-sayfayi yenileyelim
        driver.navigate().refresh();
        //  12-Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
        driver.navigate().forward();
        driver.close();
        //  13-En son adim olarak butun sayfalarimizi kapatmis olalim
        driver.quit();













    }



















}
