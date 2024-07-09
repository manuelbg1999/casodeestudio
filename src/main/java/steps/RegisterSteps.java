package steps;

import driver.Driver;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.seleniumhq.jetty9.server.Authentication;
import pages.RegisterPage;
import pages.UserInformation;

public class RegisterSteps {


    RegisterPage RegisterPage=new RegisterPage();
    UserInformation UserInformation=new UserInformation();
    Driver Driver=new Driver();


    @Step

    public void ClikcButtonRegister(){

        try {
            Driver.driver.findElement(RegisterPage.getButttonMenu()).click();
            Thread.sleep(5000);
            Driver.driver.findElement(RegisterPage.getButtonRegister()).click();

        }
        catch (InterruptedException e){
            throw new RuntimeException();
        }
    }

    @Step

    public void EnterName(String name){
        Driver.driver.findElement(UserInformation.getInputName()).sendKeys(name);
    }

    @Step

    public void EnterUserName(String username){
        Driver.driver.findElement(UserInformation.getInputUserName()).sendKeys(username);
    }

    @Step

    public void EnterCountry(String country){


        try {
            Driver.driver.findElement(UserInformation.getInputCountry()).click();
            Driver.driver.findElement(UserInformation.getInputCountry()).sendKeys(country);
            Thread.sleep(5000);
            Driver.driver.findElement(UserInformation.getInputCountry()).sendKeys(Keys.ENTER);



        }
        catch (InterruptedException e){
            throw new RuntimeException();
        }

    }

    @Step

    public void EnterCity(String city){


        try {
            Driver.driver.findElement(UserInformation.getInputCity()).sendKeys(city);
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            throw new RuntimeException();
        }

    }

    @Step

    public void EnterId(String id){


        try {
            Driver.driver.findElement(UserInformation.getInputId()).sendKeys(id);
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            throw new RuntimeException();
        }

    }


    @Step

    public void EnterPhone(String phone){


        try {
            Driver.driver.findElement(UserInformation.getInputPhone()).sendKeys(phone);
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            throw new RuntimeException();
        }

    }


    @Step

    public void EnterEmail(String email){


        try {
            Driver.driver.findElement(UserInformation.getInputEmail()).sendKeys(email);
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            throw new RuntimeException();
        }

    }


    @Step

    public void EnterPassWord(String password){


        try {
            Driver.driver.findElement(UserInformation.getInputPassWord()).sendKeys(password);
            Driver.driver.findElement(UserInformation.getInputVerifyPassWord()).sendKeys(password);
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            throw new RuntimeException();
        }

    }


    @Step

    public void ClickButtonRegister(){

        try {
            Thread.sleep(2000);
            Driver.driver.findElement(UserInformation.getButtonRegister()).click();
        }
        catch (InterruptedException e){
            throw new RuntimeException();
        }

    }



    @Step

    public void ClickButtonUser(){

        try {
            Thread.sleep(7000);
            Driver.driver.findElement(UserInformation.getButtonUser()).click();
        }
        catch (InterruptedException e){
            throw new RuntimeException();
        }

    }

    @Step

    public void VerifyUser(String mensaje){

        try {
            Thread.sleep(2000);

            String Label=Driver.driver.findElement(UserInformation.getUserLabel()).getText();

            Assert.assertEquals(mensaje,Label);



        }
        catch (InterruptedException e){
            throw new RuntimeException();
        }

    }





}
