package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Test;


public class Test_TootlsQA extends TestBase{

    @Test
        @Given("^Ingresar al sitio ToolsQA")
        public void ingresar_al_sitio_ToolsQA() throws Throwable {
            toolsQAPage.welcome();
        }
    @Test
        @When("^Escribir el usuario$")
        public void escribir_el_usuario() throws Throwable {
            toolsQAPage.ingresarUsuario();
        }
    @Test
        @And("^Escribir la contraseña")
        public void escribir_la_contraseña() throws Throwable {
            toolsQAPage.ingresarContrasena();
        }

        @Then("^Validar la pantalla principal de ToolsQA$")
        public void validar_la_pantalla_principal_de_ToolsQA() throws Throwable {
            toolsQAPage.ingresarLogin();
        }

        @Given("^Ir a la tienda de libros Go to Book Store$")
        public void ir_a_la_tienda_de_libros_Go_to_Book_Store() throws Throwable {
            toolsQAPage.seleccionarTiendaLibros();
        }

        @And("^Buscar en la tienda de libros, los libros que tengan la palabra1 \"([^\"]*)\"$")
        public void buscar_en_la_tienda_de_libros_los_libros_que_tengan_la_palabra1(String palabra1) throws Throwable {
            toolsQAPage.BuscarLibroSpeaking(palabra1);
        }

        @When("^Seleccionar el libro Speaking")
        public void seleccionar_el_libro_Speaking() throws Throwable {
            toolsQAPage.SeleccionarLibroSpeaking();
        }

        @And("^Adicionar a la colección del usuario Add to Your Collection$")
        public void adicionar_a_la_colección_del_usuario_Add_to_Your_Collection() throws Throwable {
            toolsQAPage.añadirLibroSpeaking();
        }

        @And("^Regresar a la canasta o colección Profile$")
        public void regresar_a_la_canasta_o_colección_Profile() throws Throwable {
            toolsQAPage.ClickPerfil();
        }

        @And("^Buscar en la tienda de libros, los libros que tengan la palabra2 \"([^\"]*)\"$")
        public void buscar_en_la_tienda_de_libros_los_libros_que_tengan_la_palabra2(String palabra2) throws Throwable {
            toolsQAPage.BuscarLibroJavaScript(palabra2);
        }

        @And("^Seleccionar el libro Programming JavaScript Applications$")
        public void seleccionar_el_libro_Programming_JavaScript_Applications() throws Throwable {
            toolsQAPage.SeleccionarLibroJava();
            toolsQAPage.añadirLibroJavaScript();
            toolsQAPage.ClickPerfil();
        }

        @And("^Eliminar de la canasta o coleccion Speaking JavaScript")
        public void eliminar_de_la_canasta_o_coleccion_Speaking_JavaScript() throws Throwable {
            toolsQAPage.eliminar();
        }

        @Then("^Se deben visualizar los libros  seleccionados Speaking JavaScript y Programming JavaScript Applications$")
        public void se_deben_visualizar_los_libros_seleccionados_Speaking_JavaScript_y_Programming_JavaScript_Applications() throws Throwable {
            toolsQAPage.validate();
        }

        @Then("^Salir del sitio Log out$")
        public void salir_del_sitio_Log_out() throws Throwable {
            toolsQAPage.cerrarSesion();
        }
}
