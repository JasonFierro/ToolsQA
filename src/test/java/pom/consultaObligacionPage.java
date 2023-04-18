package pom;

import lombok.Getter;
import lombok.Setter;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class consultaObligacionPage extends BasePage {

    public consultaObligacionPage(WebDriver driver) {
        super(driver);
    }
    By lblTitulo=By.xpath("//div[.='Transaccional']");
    By check_terminosCondiciones=By.id("chkTC");
    By btn_continuar=By.id("continueNoRedirect");
    By btn_RecomendacionesContinuar=By.xpath("//*[@id=\"recomendations\"]/div/div/div[2]/div[2]/button");
    By lblUsuarioRegistrado=By.xpath("//div[@id='sliderHInner']//a[.='Usuario Registrado']");
    By select_nombre=By.id("vistaLogin:frmLogin:selNit");
    By select_documento=By.id("vistaLogin:frmLogin:selTipoDoc");
    By input_documento=By.xpath("//input[@id='vistaLogin:frmLogin:txtUsuario']");
    By input_password=By.xpath("//*[@id=\"vistaLogin:frmLogin:txtPassword\"]");
    By btn_ingresar=By.xpath("//*[@id=\"vistaLogin:frmLogin\"]/table[3]/tbody/tr/td/input");
    By moduloConsultaObligacion=By.xpath("//span[.='Consulta obligación']");
    By lblSaldoFavor=By.xpath("//tr[@class='dr-table-firstrow rich-table-firstrow ']/td[contains(.,'SALDO A FAVORObligación de Renta y Ventas, en donde la declaración se presentó c')]");
    By btnDetallesConsultaObligacion=By.xpath("//tr[@class='dr-table-firstrow rich-table-firstrow ']//input[1]");
    By lblNumObligacion=By.xpath("//*[@id=\"vistaConsultaContribuyente:frmConsultaContribuyente:tiposObligacion:0:obligaciones:0:_id77\"]/span");

    public void pageDIAN() throws InterruptedException {
        Thread.sleep(2000);
        textEquals("Transaccional",lblTitulo);
    }
    public void clic_usuarioRegistrado() throws Exception {
        Thread.sleep(2000);
        click(lblUsuarioRegistrado);
        Thread.sleep(2000);
    }
    public void aceptarTerminos() throws Exception {
        Thread.sleep(2000);
        locateObject(check_terminosCondiciones);
        scrollDown(check_terminosCondiciones);
        click(check_terminosCondiciones);
        Thread.sleep(2000);
        click(btn_continuar);
        Thread.sleep(2000);
    }
    public void clickRecomendacionesContinuar() throws Exception {
        Thread.sleep(2000);
        click(btn_RecomendacionesContinuar);
        Thread.sleep(2000);
    }
    public void seleccionar_nombreDe(String nombreDe) throws InterruptedException {
        Thread.sleep(2000);
        selectElement(nombreDe,select_nombre);
        Thread.sleep(2000);
    }
    public void seleccionar_documento(String tipoDocumento) throws Exception {
        Thread.sleep(2000);
        selectElement(tipoDocumento,select_documento);
        Thread.sleep(2000);
    }
    public void ingresar_documento(String numDocumento) throws Exception {
        Thread.sleep(2000);
        input(numDocumento,input_documento);
        Thread.sleep(2000);
    }
    public void ingresar_Contrasena(String contrasena) throws Exception {
        Thread.sleep(2000);
        input(contrasena,input_password);
        Thread.sleep(2000);
    }
    public void clic_ingresar() throws Exception {
       click(btn_ingresar);
        Thread.sleep(2000);
    }

    public void ingresarModuloConsultaObligacion() throws Exception {
        Thread.sleep(2000);
        click(moduloConsultaObligacion);
    }

    public void saldoFavor() throws Exception {
        Thread.sleep(2000);
        textEquals("SALDO A FAVOR",lblSaldoFavor);
        Thread.sleep(1000);
        click(btnDetallesConsultaObligacion);
    }

    public void validarNumObligacion(String numObligacion) throws InterruptedException {
        Thread.sleep(2000);
        textEquals(numObligacion,lblNumObligacion);
        Thread.sleep(2000);
    }
}
