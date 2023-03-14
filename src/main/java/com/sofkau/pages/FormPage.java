package com.sofkau.pages;

import com.sofkau.models.Estudiante;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.sikuli.script.support.Device.delay;

public class FormPage extends CommonActionOnPages{
// Se debe corregir los clicks en la pagina de inicio, no me da por alguna razón
    private final By inicio = By.xpath("//div[@class='card mt-4 top-card'][2]");
    private final By clickForm = By.xpath("//*[text()='Practice Form']");
    private final By name = By.id ("firstName");
    private final By lastName = By.id ("lastName");
    private final By email = By.id ("userEmail");
    private final By userNumber = By.id ("userNumber");
    private final  By selectMale = By.id ("gender-radio-1");
    private final By selectFemale= By.id("gender-radio-2");
    private final By selectOther = By.id("gender-radio-3");
    private final By dateofBirth = By.id("dateOfBirthInput");
    private final By hobbieSport = By.id("hobbies-checkbox-1");
    private final By hobbieReading = By.id("hobbies-checkbox-2");
    private final By hobbieMusic = By.id("hobbies-checkbox-3");
    private final By subjects = By.id("subjectsInput");
    private final By state = By.id("react-select-3-input");
    private final By city = By.id("react-select-4-input");
    private final By submit = By.cssSelector("#submit");
    private  final  By adressUsuario   = By.id("currentAddress");
    public FormPage(WebDriver driver) {
        super(driver);
        final Estudiante estudiante = new Estudiante();
    }

    private final Estudiante estudiante = new Estudiante();

// Mala practica de usar constantes, no quemar valores en el codigo
    public void FillMandatoryFields () {
        setZoom(40);
        //clearText( name);
        typeInto(name, "Santy");
        //clearText( lastName);
        typeInto(lastName, "Ramirez");
        //clearText( email);
        typeInto(email, "correo@jemplo.com");
        //clearText( userNumber);
        typeInto(userNumber, "230920001");
        pressSpace(selectMale);
        calendar(dateofBirth, "23/09/2001");
        pressSpace(hobbieSport);
        typeInto(subjects, "Math");
        pressEnter(subjects);
        typeInto(subjects, "English");
        pressEnter(subjects);
        pressSpace(state);
        typeInto(state, "NCR");
        pressEnter(state);
        pressSpace(city);
        typeInto(city, "Delhi");
        pressEnter(city);
        typeInto(adressUsuario, "Calle 123");
        pressSpace(submit);

    }




    public void inicioPagina () throws InterruptedException {
        setZoom(75);
        click (inicio);
        Thread.sleep (2000);
        click (clickForm);
    }
}
