package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/",
        glue = {"seleniumgluecode"},
        plugin = {"json:Reportes/Test/cucumber_report.json"}
        //tags = {"@AgregarLibros","@AgregarLibrosScript"}
)
public class Testrunner {

    @AfterClass
    public static void finish(){
        try {
            System.out.println("El reporte se esta generando");
            String [] cmd = {"cmd.exe","/c","npm run report"};
            Runtime.getRuntime().exec(cmd);
            System.out.println("Reporte Generado satisfactoriamente!!!");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}