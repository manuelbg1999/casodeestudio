package pages;

import org.openqa.selenium.By;

public class RegisterPage {



    By ButttonMenu=By.xpath("/html/body/div[3]/div[2]");
    By ButtonRegister=By.xpath("/html/body/div[3]/div[3]/div[1]/div[2]/ul[2]/li[2]/a");

    public By getButtonRegister() {
        return ButtonRegister;
    }

    public void setButtonRegister(By buttonRegister) {
        ButtonRegister = buttonRegister;
    }

    public By getButttonMenu() {
        return ButttonMenu;
    }

    public void setButttonMenu(By butttonMenu) {
        ButttonMenu = butttonMenu;
    }

}
