package com.sofkau.stepdefinitions;
import com.sofkau.pages.FormPage;
import com.sofkau.setup.WebUI;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;


public class FormStepDefinitions  extends WebUI {

    public static Logger LOGGER = Logger.getLogger (FormStepDefinitions.class);

    @Given("el adminsitrador esta en la pagina principal")
    public void elAdminsitradorEstaEnLaPaginaPrincipal() {
        generalSetUp();
        // Se debe crear cosntantes en mensajes , sin quemar valores en el codigo
        LOGGER.info("Por fin pude correr esto");


    }
    @When("navega hasta la opcion de formulario")
    public void navegaHastaLaOpcionDeFormulario()throws InterruptedException{
        FormPage formPage = new FormPage(super.driver );
       // formPage.FillMandatoryFields();
       // formPage.inicioPagina();


    }
    @When("completa los campos con  la informacion de un estudiante")
    public void completaLosCamposConLaInformacionDeUnEstudiante() {
        FormPage formPage = new FormPage(super.driver);
        formPage.FillMandatoryFields();


    }
    @Then("debe observar una ventana con la informacion ingresada")
    public void debeObservarUnaVentanaConLaInformacionIngresada() {
       /*
        Thread.sleep (2000);
        Assertions.asserrEquals (
                "Santy",
                "Santy",
                String.format ("El nombre no es el esperado, se esperaba %s y se obtuvo %s", "Santy", "Santy")
        );
                quiteDriver();

                */
    }

    private void generateStudent () {
        estudiante.setNombre("Santy");
        estudiante.setApellido("Ramirez");
        estudiante.setCorreo("


}
