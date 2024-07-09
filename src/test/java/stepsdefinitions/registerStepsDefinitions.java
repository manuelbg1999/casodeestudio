package stepsdefinitions;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterPage;
import steps.Browser;
import steps.RegisterSteps;

public class registerStepsDefinitions {



    ///Creamos el objeto para acceder a los metodos de la clase RegisterSteps
    ///Que hace las interacciones

    RegisterSteps RegisterSteps=new RegisterSteps();

    ///Creamos los parametros que vamos a pasar

    @ParameterType(".*")
    public String email(String email){

        return email;
    }

    @ParameterType(".*")
    public String name(String name){

        return name;
    }

    @ParameterType(".*")
    public String username(String username){

        return username;
    }

    @ParameterType(".*")
    public String password(String password){

        return password;
    }

    @ParameterType(".*")
    public String country(String country){

        return country;
    }


    @ParameterType(".*")
    public String city(String city){

        return city;
    }

    @ParameterType(".*")
    public String id(String id){

        return id;
    }

    @ParameterType(".*")
    public String phonenumber(String phonenumber){

        return phonenumber;
    }

    @ParameterType(".*")
    public String mensaje(String mensaje){

        return mensaje;
    }

    @Given("the user access a the platform click on register button")
    public void theUserAccessAThePlatformClickOnRegisterButton() {
        Browser.OpenBrowser("http://campusvirtual.izyacademy.com:8000/");
        RegisterSteps.ClikcButtonRegister();
    }


    @When("the user enter the {name} as name")
    public void theUserEnterTheManuelAsName(String name) {
        RegisterSteps.EnterName(name);

    }

    @When("the user enter the {username} as username")
    public void theUserEnterTheManuel123AsUsername(String username) {
        RegisterSteps.EnterUserName(username);

    }

    @When("the user enter the {country} as country")
    public void theUserEnterTheColombiaAsCountry(String country) {
        RegisterSteps.EnterCountry(country);


    }

    @When("the user enter the {city} as city")
    public void theUserEnterTheCereteAsCity(String city) {
        RegisterSteps.EnterCity(city);

    }

    @When("the user enter the {id} as id")
    public void theUserEnterTheAsId(String id) {
       RegisterSteps.EnterId(id);
    }

    @When("the user enter the {phonenumber} as phonenumber")
    public void theUserEnterTheAsPhonenumber(String phonenumber) {
      RegisterSteps.EnterPhone(phonenumber);
    }

    @When("the user enter the {email} as email")
    public void theUserEnterTheMbolanoQvisiUsComAsEmail(String email) {
         RegisterSteps.EnterEmail(email);
    }

    @When("the user enter the {password} as password")
    public void theUserEnterTheManuel123AsPassword(String password) {
     RegisterSteps.EnterPassWord(password);
    }

    @When("the user the click in the button register")
    public void theUserTheClickInTheButtonRegister() {

        RegisterSteps.ClickButtonRegister();


    }

    @Then("the user the click in the perfil y look your {mensaje}")
    public void theUserTheClickInThePerfilYLookYourUsername(String mensaje) {
        RegisterSteps.ClickButtonUser();
        RegisterSteps.VerifyUser(mensaje);

        Browser.QuitBrowser();

    }
}
