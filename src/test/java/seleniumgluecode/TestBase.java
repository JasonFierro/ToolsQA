package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import pom.*;
public class TestBase {

    protected WebDriver driver = Hooks.getDriver();
    protected ToolsQAPage toolsQAPage = new ToolsQAPage(driver);

}