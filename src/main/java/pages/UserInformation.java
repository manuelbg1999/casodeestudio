package pages;

import org.openqa.selenium.By;

public class UserInformation {


    By InputName=By.xpath("/html/body/section/div/div/div/form/div[1]/input");
    By InputUserName=By.xpath("/html/body/section/div/div/div/form/div[2]/input");
    By InputCountry=By.xpath("/html/body/section/div/div/div/form/div[3]/div[1]/select");
    By InputCity=By.xpath("/html/body/section/div/div/div/form/div[3]/div[2]/div/input");
    By InputId=By.xpath("/html/body/section/div/div/div/form/div[4]/div[1]/div/input");
    By InputPhone=By.xpath("/html/body/section/div/div/div/form/div[4]/div[2]/div/input");
    By InputEmail=By.xpath("/html/body/section/div/div/div/form/div[5]/input");
    By InputPassWord=By.xpath("/html/body/section/div/div/div/form/div[6]/input");
    By InputVerifyPassWord=By.xpath("/html/body/section/div/div/div/form/div[7]/input");
    By ButtonRegister=By.xpath("/html/body/section/div/div/div/form/div[8]/button");
    By ButtonUser=By.xpath("/html/body/section/div[1]/div/div[2]/ul/li[3]/div/button");
    By UserLabel=By.xpath("/html/body/section/div[1]/div/div[2]/ul/li[3]/div/ul/a");



    public By getUserLabel() {
        return UserLabel;
    }

    public void setUserLabel(By userLabel) {
        UserLabel = userLabel;
    }


    public By getButtonUser() {
        return ButtonUser;
    }

    public void setButtonUser(By buttonUser) {
        ButtonUser = buttonUser;
    }




    public By getInputUserName() {
        return InputUserName;
    }

    public void setInputUserName(By inputUserName) {
        InputUserName = inputUserName;
    }

    public By getInputCountry() {
        return InputCountry;
    }

    public void setInputCountry(By inputCountry) {
        InputCountry = inputCountry;
    }

    public By getInputCity() {
        return InputCity;
    }

    public void setInputCity(By inputCity) {
        InputCity = inputCity;
    }

    public By getInputId() {
        return InputId;
    }

    public void setInputId(By inputId) {
        InputId = inputId;
    }

    public By getInputPhone() {
        return InputPhone;
    }

    public void setInputPhone(By inputPhone) {
        InputPhone = inputPhone;
    }

    public By getInputEmail() {
        return InputEmail;
    }

    public void setInputEmail(By inputEmail) {
        InputEmail = inputEmail;
    }

    public By getInputPassWord() {
        return InputPassWord;
    }

    public void setInputPassWord(By inputPassWord) {
        InputPassWord = inputPassWord;
    }

    public By getInputVerifyPassWord() {
        return InputVerifyPassWord;
    }

    public void setInputVerifyPassWord(By inputVerifyPassWord) {
        InputVerifyPassWord = inputVerifyPassWord;
    }

    public By getButtonRegister() {
        return ButtonRegister;
    }

    public void setButtonRegister(By buttonRegister) {
        ButtonRegister = buttonRegister;
    }


    public By getInputName() {
        return InputName;
    }

    public void setInputName(By inputName) {
        InputName = inputName;
    }
}
