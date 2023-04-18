package runner.browser_manager;


import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;


public class IEDriverServerManager extends DriverManager {

    @Override
    public void createDriver(){
//        System.setProperty("webdriver.ie.driver", "./src/test/resources/IEDriverServer/IEDriverServer.exe");
//        DesiredCapabilities ieCapabilities=DesiredCapabilities.internetExplorer();
//        ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
//        //       File ie_temp = new File("C:\\Selenium\\IEDrivertemp");
//        InternetExplorerDriverService.Builder ies= new InternetExplorerDriverService.Builder();
//        //       ies.withExtractPath(ie_temp);
//        InternetExplorerDriverService service=ies.build();
//        driver = new  InternetExplorerDriver(service,ieCapabilities);
//        driver = new InternetExplorerDriver();
    }
}
