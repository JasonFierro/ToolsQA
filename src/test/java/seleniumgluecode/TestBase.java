package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import pom.*;
import pom.consultaObligacionPage;

public class TestBase {

    protected WebDriver driver = Hooks.getDriver();
    protected consultaObligacionPage ConsultaObligacionPage = new consultaObligacionPage(driver);

}