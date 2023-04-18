package seleniumgluecode;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import static models.ScreenRecorder.MyScreenRecorder.*;

public class Hooks {

    private static WebDriver driver;
    private static int numberOfCase = 0;
    private DriverManager driverManager;

    @Before
    public void SetUp(){
    numberOfCase++;
    System.out.println("Se está ejecutando el escenario #" + numberOfCase);
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    System.out.println("Fecha y hora de ejecución: "+dtf.format(LocalDateTime.now()));
    driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
    driver = driverManager.getDriver();
    driver.get("https://www.dian.gov.co/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void TearDown(Scenario scenario) throws Exception {
        System.out.println("El escenario # "+ numberOfCase +" se ejecutó correctamente");
//        byte[] screenshot = ((TakesScreenshot)driverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
//        scenario.embed(screenshot, "image/png");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("Fecha y hora ejecución finalizada: "+dtf.format(LocalDateTime.now()));
        System.out.println("");
        System.out.println("");
        stopRecording();
        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}

