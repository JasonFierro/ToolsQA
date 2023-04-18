package seleniumgluecode;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features = "src/test/java/features/testWebTable.feature", // se pueden ejecutar directamente llamando los features junto con los tags
        features = "src/test/java/features/",
        glue = {"seleniumgluecode"},
        plugin = {"json:Report/Test/cucumber_report.json"},
        tags = {"@Consulta"} // Se pueden ejecutar desde los tags de los features que desean
)
public class Testrunner {
    // Para los reportes es necesario tener instalado NodeJS en su PC
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