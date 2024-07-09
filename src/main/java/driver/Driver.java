package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    public static WebDriver driver;

    public static void chromeDriver(String url){

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");

        options.addArguments("--ignore-certificate-errors");

        options.addArguments("--disable-infobars");

        driver = new ChromeDriver(options);

        driver.get(url);

    }

    public static void quitBrowser(){
        driver.quit();
    }

}
