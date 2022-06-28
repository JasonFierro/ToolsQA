package runner.browser_manager;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverManagerFactory{

    public static DriverManager getManager(DriverType type){

        DriverManager driverManager = null;

        switch (type){
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case FIREFOX:
                driverManager = new FirefoxDriverManager();
                break;
            case InternetExplorer:
                driverManager = new IEDriverServerManager();
            default:
                System.out.println("Browser no valido");
                break;
            case EDGE:
                driverManager = new EdgeDriverManager();
                break;
        }


        return driverManager;
    }
}


