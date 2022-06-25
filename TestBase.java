package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import pom.*;
import pom.Movimiento.AdministrarNominaElectronicaPage;
import pom.Movimiento.ReporteNominaPage;

public class TestBase {

    protected WebDriver driver = Hooks.getDriver();
    protected LoginPortalPage loginPortalPage = new LoginPortalPage(driver);
    protected AdministrarNominaElectronicaPage administrarNominaElectronicaPage = new AdministrarNominaElectronicaPage(driver);
    protected ReporteNominaPage reporteNominaPage = new ReporteNominaPage(driver);
    protected colsanitasPage colsanitasPage = new colsanitasPage(driver);
    protected ToolsQAPage toolsQAPage = new ToolsQAPage(driver);

}