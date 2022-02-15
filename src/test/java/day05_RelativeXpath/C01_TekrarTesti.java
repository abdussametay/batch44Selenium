package day05_RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TekrarTesti {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //2--https://www.amazon.com adresine gidin


        driver.get("https://www.amazon.com");

        //3--browseri tam sayfa yapin

        driver.manage().window().maximize();

        //4--sayfayi refresh yapin

        driver.navigate().refresh();

        //5--sayfa basliginin spend less icerdigini kontrol edin

        String actualTitle= driver.getTitle();
        String titleArananKelime="Spend less";

        if (actualTitle.contains(titleArananKelime)){
            System.out.println("Title Testi Passed");
        }else{
            System.out.println("Title testi failed \nActual title : " + actualTitle);
        }

        //6--Gift Card sekmesine basin

        driver.findElement(By.xpath("//a[text()='Gift Cards']")).click();

        //7--Birthday sekmesine gidin

        driver.findElement(By.xpath("//img[@alt='Birthday Gift Cards']")).click();

        //8--Best Seller bolumunden ilk urunu tiklayin

        //driver.findElement(By.xpath("//img[@data-a-hires='https://images-na.ssl-images-amazon.com/images/I/41kuPGnkG7L._AC_SX368_.jpg']")).click();

        driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[1]")).click();

        //9--Gift Cards detailden 25 dolar i secin

        driver.findElement(By.xpath("//button[@value='25.00']")).click();

        //10--ucretinin 25 dolar oldugunu test edin

        WebElement fiyatElementi= driver.findElement(By.xpath("//span[@class='a-color-price a-text-bold']"));
        String expectedFiyat="$25.00";
        String actualFiyat=fiyatElementi.getText();

        if (expectedFiyat.equals(actualFiyat)){
            System.out.println("Fiyat testi PASSED");
        }else{
            System.out.println("Fiyat testi FAILED");
        }

      //11--sayfayi kapatin

        driver.close();








    }

}
