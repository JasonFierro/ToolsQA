package runner.browser_manager;


import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager extends DriverManager{

    @Override
    public void createDriver(){
        System.setProperty("webdriver.edge.driver","./src/test/resources/edgedriver/msedgedriver.exe");
        driver = new EdgeDriver();
    }
}

