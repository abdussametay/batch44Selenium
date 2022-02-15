package day03_WebElementsLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

//1. Bir class oluşturun: LoginTest
public class C02_LoginTest {
    //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



        //    a. http://a.testaddressbook.com adresine gidiniz.

        driver.get("http://a.testaddressbook.com");

        //    b. Sign in butonuna basin

        WebElement signInLinki=driver.findElement(By.id("sign-in"));//sadece locate edip bir variableye assaign ettik
        signInLinki.click();

        //    c. email textbox,password textbox, and signin button elementlerini locate ediniz..

        WebElement emailtextBox = driver.findElement(By.id("session_email"));
        WebElement passwordBox = driver.findElement(By.id("session_password"));
        WebElement singInButton = driver.findElement(By.name("commit"));

        //    d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //        i. Username : testtechproed@gmail.com
        //        ii. Password : Test1234!

        emailtextBox.sendKeys("testtechproed@gmail.com");
        passwordBox.sendKeys("Test1234!");

        singInButton.click();

        //    e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).

        WebElement girisYazisiElementi= driver.findElement(By.tagName("h1"));
        System.out.println(girisYazisiElementi.getText());
        String actualgirisYazisi= girisYazisiElementi.getText();
        String expectedGirisYazisi="Welcome to Address Book";

        if (actualgirisYazisi.equals(expectedGirisYazisi)){
            System.out.println("Sayfaya Giris Testi PASS");
        }else{
            System.out.println("Sayfaya Giris Testi FAILED");
        }
                //locate yapildiginda mutlaka WEB ELEMENTI doner


        //    f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

        WebElement adressWebElementi=driver.findElement(By.linkText("Addresses"));
        WebElement signOutElementi=driver.findElement(By.linkText("Sign out"));

        System.out.println(adressWebElementi.isDisplayed());// true veya false dondurecek

        if (adressWebElementi.isDisplayed()){
            System.out.println("Adress elementi goruntuleme testi PASS");
        }else{
            System.out.println("Adress elementi goruntuleme testi FAILED");
        }

        if (signOutElementi.isDisplayed()){
            System.out.println("Sign Out elementi goruntuleme testi PASS");
        }else{
            System.out.println("Sign Out elementi goruntuleme testi FAILED");
        }


        //3. Sayfada kac tane link oldugunu bulun.

        List<WebElement> linklerListesi= driver.findElements(By.tagName("a"));

        System.out.println("sayfada " + linklerListesi.size() + " adet link bulunmaktadir");

        driver.close();































    }
}
