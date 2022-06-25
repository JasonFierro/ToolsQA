package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;

public class ToolsQAPage extends BasePage{
    public ToolsQAPage(WebDriver driver) {
        super(driver);
    }

    private By welcome = By.xpath("//h2[.='Welcome,']");
    private By text_username = By.id("userName");
    private By text_password = By.id("password");
    private By button_login = By.id("login");
    private By text_books = By.xpath("//label[contains(.,'Books :')]");
    private By link_bookStore = By.xpath("//li[.='Book Store']");
    private By text_searchBox = By.id("searchBox");
    private By link_boksSpeaking = By.xpath("//a[.='Speaking JavaScript']");
    private By link_boksJavaScript = By.linkText("Programming JavaScript Applications");
    private By button_Add = By.xpath("//button[.='Add To Your Collection']");
    private By link_perfil = By.xpath("//span[.='Profile']");
    private By ModalAdd = By.xpath("//li[.='Modal Dialogs']");
    private By eliminar = By.xpath("//div[@class='rt-tr -odd']/div[5]/div[@class='action-buttons']");
    private By cerrarSesion = By.id("submit");

    public void welcome(){
        textEquals("Welcome,",welcome);
    }

    public void ingresarUsuario() throws Exception {
        input("Prueba1",text_username);
    }

    public void ingresarContrasena() throws Exception {
        input("Prueba1*",text_password);
    }

    public void ingresarLogin() throws Exception {
        click(button_login);
    }

    public void seleccionarTiendaLibros() throws Exception {
        Thread.sleep(2000);
        locateObject(link_bookStore);
        scrollDown(link_bookStore);
        click(link_bookStore);
        Thread.sleep(2000);
    }

    public void BuscarLibroSpeaking(String palabra1) throws Exception {
        input(palabra1,text_searchBox);
    }

    public void SeleccionarLibroSpeaking() throws Exception {
        click(link_boksSpeaking);
    }

    public void añadirLibroSpeaking() throws Exception {
        click(button_Add);
        Thread.sleep(6000);
        //cerrarModales();
        update();
        Thread.sleep(2000);
    }

    public void ClickPerfil() throws Exception {
        locateObject(link_perfil);
        scrollDown(link_perfil);
        click(link_perfil);
        Thread.sleep(2000);
    }

    public void BuscarLibroJavaScript(String palabra2) throws Exception {
        input(palabra2,text_searchBox);
    }

    public void SeleccionarLibroJava() throws Exception {
        click(link_boksJavaScript);
    }

    public void añadirLibroJavaScript() throws Exception {
        click(button_Add);
        update();
        Thread.sleep(6000);
        //cerrarModales();
        Thread.sleep(2000);
    }

    public void eliminar() throws Exception {
        click(eliminar);
        Thread.sleep(2000);
        cerrarModales();
        Thread.sleep(2000);
        cerrarModales();
    }

    public void cerrarSesion() throws Exception {
        click(cerrarSesion);
    }


}
