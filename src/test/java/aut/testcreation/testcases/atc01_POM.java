package aut.testcreation.testcases;

import aut.testcreation.pages.GoogleHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class atc01_POM extends SeleniumTestBase {

    GoogleHomePage googleHomePage;

    @Test
    void busquedaGoogle(){
        googleHomePage = new GoogleHomePage(DriverFactory.getDriver());
        googleHomePage.buscarConBotonBuscar("Tsoft");
        Assertions.assertEquals("Tsoft - Buscar con Google",googleHomePage.getUrlTitle());
    }
}
