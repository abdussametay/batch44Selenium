package day03_WebElementsLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
//1. Yeni bir class olusturun (TekrarTesti)
public class C01_TekrarTesti {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


//2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify),
// eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.

        driver.navigate().to("https://www.youtube.com");
        String actualtitleYoutube= driver.getTitle();
        String expectedYoutubeTitle="youtube";

        if (actualtitleYoutube.equals(expectedYoutubeTitle)){
            System.out.println("Youtube Title testi PASS");
        }else{
            System.out.println("Youtube title testi FAILED \nactual sayfa basligi  : " + actualtitleYoutube);
        }


//3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın,
// içermiyorsa doğru URL'yi yazdırın.

        String actualYoutubeUrl= driver.getCurrentUrl();
        String arananKelimeYoutubeUrl="youtube";

        if (actualYoutubeUrl.contains(arananKelimeYoutubeUrl)){
            System.out.println("YouTube URL testi PASS");
        }else{
            System.out.println("YouTube URL testi FAILED \nactual youtube URL :"+actualYoutubeUrl);
        }


//4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/

        driver.navigate().to("https://www.amazon.com");

//5. Youtube sayfasina geri donun

        driver.navigate().back();

//6. Sayfayi yenileyin

        driver.navigate().refresh();

//7. Amazon sayfasina donun

        driver.navigate().forward();

//8. Sayfayi tamsayfa yapin

        driver.manage().window().fullscreen();

//9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
// Yoksa doğru başlığı(Actual Title) yazdırın.

        String actualTitleAmazon=driver.getTitle();
        String amazontitleArananKelime="Amazon";

        if (actualTitleAmazon.contains(amazontitleArananKelime)){
            System.out.println("Amazon Title Testi PASS");
        }else{
            System.out.println("Amazon Title Testi FAILED \nactual amazon title :" + actualTitleAmazon);
        }

//10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın

        String expectedAmazonURL="https://www.amazon.com";
        String actualAmazonURL= driver.getCurrentUrl();

        if (expectedAmazonURL.equals(actualAmazonURL)){
            System.out.println("Amazon URL Testi PASS");
        }else{
            System.out.println("AmazonURL Testi FAILED \nactual Amazon URL : " + actualAmazonURL);
        }


//11.Sayfayi kapatin

driver.close();








    }
}
