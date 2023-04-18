package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class siisimpodefinition extends TestBase{

    @Given("^El usuario ingresa a la aplicacion DIAN \"([^\"]*)\" con el pais \"([^\"]*)\" y la funcionalidad \"([^\"]*)\"$")
    public void elUsuarioIngresaALaAplicacionDIANConElPaisYLaFuncionalidad(String arg0, String arg1, String arg2) throws Throwable {
        System.out.println("Hola");;
    }
}
