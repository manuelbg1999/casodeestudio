package steps;

import driver.Driver;

public class Browser {



    public static void OpenBrowser(String Url){

        Driver.chromeDriver(Url);
    }

    public static void QuitBrowser(){
        Driver.quitBrowser();
    }
}
