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
    private By eliminar = By.cssSelector(".rt-tbody .-even [d='M864 256H736v-80c0-35.3-28.7-64-64-64H352c-35.3 0-64 28.7-64 64v80H160c-17.7 0-32 14.3-32 32v32c0 4.4 3.6 8 8 8h60.4l24.7 523c1.6 34.1 29.8 61 63.9 61h454c34.2 0 62.3-26.8 63.9-61l24.7-523H888c4.4 0 8-3.6 8-8v-32c0-17.7-14.3-32-32-32zm-200 0H360v-72h304v72z']");
    private By closeModalOK = By.id("closeSmallModal-ok");
    private By cerrarSesion = By.id("submit");
    private By validateBookSpeak = By.xpath("//a[.='Speaking JavaScript']");
    private By validateBookJavaScript = By.xpath("//a[.='Programming JavaScript Applications']");

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
        update();
        cerrarModales();
        Thread.sleep(3000);
        waitImplicit(link_perfil);
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
        cerrarModales();
        Thread.sleep(3000);
        waitImplicit(link_perfil);
    }

    public void validate() throws InterruptedException {
        textEquals("Speaking JavaScript",validateBookSpeak);
        Thread.sleep(2000);
        textEquals("Programming JavaScript Applications",validateBookJavaScript);
    }

    public void eliminar() throws Exception {
        click(eliminar);
        Thread.sleep(2000);
        click(closeModalOK);
        update();
        Thread.sleep(3000);
    }

    public void cerrarSesion() throws Exception {
        click(cerrarSesion);
    }


}
