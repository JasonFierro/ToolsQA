package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class consultaObligacionDefinition extends TestBase {


    @Given("^Ingresar al sitio DIAN$")
    public void ingresarAlSitioDIAN() throws InterruptedException {
        ConsultaObligacionPage.pageDIAN();
    }

    @When("^Hacer click sobre usuario registrado$")
    public void hacerClickSobreUsuarioRegistrado() throws Exception {
        ConsultaObligacionPage.clic_usuarioRegistrado();
    }

    @And("^Seleccionar acepto terminos y condiciones$")
    public void seleccionarAceptoTerminosYCondiciones() throws Exception {
        ConsultaObligacionPage.aceptarTerminos();
    }

    @And("^Hacer click en continuar Recomendaciones$")
    public void hacerClickEnContinuar() throws Exception {
        ConsultaObligacionPage.clickRecomendacionesContinuar();
    }

    @And("^Seleccionar a nombre de \"([^\"]*)\"$")
    public void seleccionarANombreDe(String nombreDe) throws Throwable {
        ConsultaObligacionPage.seleccionar_nombreDe(nombreDe);
    }

    @And("^Seleccionar tipo de documento \"([^\"]*)\"$")
    public void seleccionarTipoDeDocumento(String tipoDocumento) throws Throwable {
        ConsultaObligacionPage.seleccionar_documento(tipoDocumento);
    }

    @And("^Ingresar numero de documento \"([^\"]*)\"$$")
    public void ingresarNumeroDeDocumento(String numDocumento) throws Exception {
        ConsultaObligacionPage.ingresar_documento(numDocumento);
    }

    @And("^Ingresar contrasena \"([^\"]*)\"$$")
    public void ingresarContrasena(String contrasena) throws Exception {
        ConsultaObligacionPage.ingresar_Contrasena(contrasena);
    }

    @And("^click en el boton ingresar$")
    public void clickEnElBotonIngresar() throws Exception {
        ConsultaObligacionPage.clic_ingresar();
    }

    @And("^Validar$")
    public void validar() {
    }
}
