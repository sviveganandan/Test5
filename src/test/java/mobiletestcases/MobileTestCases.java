package mobiletestcases;

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
public class MobileTestCases {
    @Test
    public void mtest1(){
        System.out.println("Mobile TestCase 1");
    }
    @Test
    public void mtest2(){
        System.out.println("Mobile TestCase 2");
    }
    @Test
    public void mtest3(){
        System.out.println("Mobile TestCase 3");
    }
    @Test
    public void mtest4(){
        System.out.println("Mobile TestCase 4");
    }
    @Test
    public void mtest5(){
        System.out.println("Mobile TestCase 5");
    }

    @Test
    public void mtest6(){
        WebDriver driver;
        File ffpath = new File("c:\\firefox.exe");
        FirefoxBinary ffbinary = new FirefoxBinary(ffpath);
        FirefoxProfile ffprofile = new FirefoxProfile();
        driver = new FirefoxDriver(ffbinary,ffprofile);
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
