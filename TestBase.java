package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import pom.*;
import pom.Movimiento.AdministrarNominaElectronicaPage;
import pom.Movimiento.ReporteNominaPage;

public class TestBase {

    protected WebDriver driver = Hooks.getDriver();
    protected ToolsQAPage toolsQAPage = new ToolsQAPage(driver);

}
