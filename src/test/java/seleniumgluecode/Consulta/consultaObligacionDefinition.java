package seleniumgluecode.Consulta;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import seleniumgluecode.TestBase;

import static models.ScreenRecorder.MyScreenRecorder.*;

public class consultaObligacionDefinition extends TestBase {

    @Given("^Ingresar al sitio DIAN \"([^\"]*)\"$")
    public void ingresarAlSitioDIAN(String recorder) throws Exception {
        startRecording(recorder);
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

    @When("Ingresar al modulo Consulta Obligacion")
    public void ingresarAlModuloConsultaObligacion() throws Exception {
        ConsultaObligacionPage.ingresarModuloConsultaObligacion();
    }

    @And("Validar el saldo a favor")
    public void validarElSaldoAFavor() throws Exception {
        ConsultaObligacionPage.saldoFavor();
    }

    @And("Click en ver detalle y validar el numero obligacion {string}")
    public void clickEnVerDetalleYValidarElNumeroObligacion(String numObligacion) throws InterruptedException {
        ConsultaObligacionPage.validarNumObligacion(numObligacion);
    }
}
