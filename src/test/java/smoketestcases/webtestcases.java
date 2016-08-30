package smoketestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by Saha on 29/08/2016.
 */
public class webtestcases {

    @Test
    public void test1(){
        System.out.println("WebTestCase 1");
    }
    @Test
    public void test2(){
        System.out.println("WebTestCase 2");
    }
    @Test
    public void test3(){
        System.out.println("WebTestCase 3");
    }
    @Test
    public void test4(){
        System.out.println("WebTestCase 4");
    }
    @Test
    public void test5(){
        System.out.println("WebTestCase 5");
    }
    @Test
    public void test6(){
        System.out.println("WebTestCase 6");
    }
    @Test
    public void mtest6(){
        WebDriver driver;
        File ffpath = new File("c:\\firefox.exe");
        FirefoxBinary ffbinary = new FirefoxBinary(ffpath);
        FirefoxProfile ffprofile = new FirefoxProfile();
        driver = new FirefoxDriver(ffbinary,ffprofile);
        driver.get("https://www.thomascook.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}
