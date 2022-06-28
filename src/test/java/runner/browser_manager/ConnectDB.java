package runner.browser_manager;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileWriter;
import java.io.OutputStream;
import java.sql.*;
import java.sql.DriverManager;

public class ConnectDB {

    protected String con="jdbc:mysql://localhost:3306/";
    protected String db= "mercagro";
    protected String user="root";
    protected String password="";
    public WebDriver driver;

    @Test
    public void excecuteConsultQuery() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(con+db,user,password);
            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT" + " id, nombre, costo" + " FROM productos;");
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println(rsmd.getColumnLabel(1)+ ", " +rsmd.getColumnLabel(2)+ ", " +rsmd.getColumnLabel(3));
            //System.out.println("-------------------------------------------");
            String qr = "SELECT id, nombre, costo FROM productos";
            FileWriter fileWriter = new FileWriter(qr+".csv");
            fileWriter.append(rsmd.getColumnLabel(1)+","+rsmd.getColumnLabel(2)+","+rsmd.getColumnLabel(3));
            fileWriter.append("\n");
            while (rs.next()) {
                System.out.println(rs.getString(1) + ", " + rs.getString(2)+ ", " + rs.getString(3));
                fileWriter.append(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));
                fileWriter.append("\n");
                fileWriter.flush();
            }
            String srcPath = qr+".csv";
            String destPath = System.getProperty("user.dir")+"\\SQL\\test";

            File srcFile = new File(srcPath);
            File destFile = new File(destPath, srcFile.getName());
            if (!destFile.exists() || !FileUtils.contentEquals(srcFile, destFile)) {
                FileUtils.copyFile(srcFile, destFile);
            }
            if (!destFile.exists() || !FileUtils.contentEquals(srcFile, destFile)) {
                FileUtils.copyFile(srcFile, destFile);
            }
            conn.close();
        }catch (SQLException s){
            throw new Exception("no se pudo establecer la consulta en la base de datos");
        }
    }
   // @Test()
    public void excecuteUpdateQuery() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(con,user,password);
        Statement st = conn.createStatement();
        st.executeUpdate("update clientes set nombre='Andres' where id = 25;");

        ResultSet rs = st.executeQuery("SELECT * FROM clientes;");
        System.out.println("-------------------------------------------");
        while (rs.next()){
            System.out.println(rs.getString(1)+ " " + rs.getString(2)+ " "+rs.getString(3)+ " "+rs.getString(4)+ " "+rs.getString(5)+ " "+rs.getString(6)+ " "+rs.getString(7));
        }
        conn.close();
    }
   // @Test()
    public void excecuteInsertQuery() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(con, user, password);
        Statement st = conn.createStatement();
        st.executeUpdate("insert into mercagro.estados" + "(id_estados, descripcion)" + "values (4,'Bajo');");

        ResultSet rs = st.executeQuery("SELECT * FROM estados;");
        System.out.println("-------------------------------------------");
        while (rs.next()) {
            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7));
        }
        conn.close();
    }
    //@Test()
    public void excecuteDeleteQuery() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(con, user, password);
        Statement st = conn.createStatement();
        st.executeUpdate("DELETE FROM estados WHERE id_estados = 4;");

        ResultSet rs = st.executeQuery("SELECT * FROM estados;");
        System.out.println("-------------------------------------------");
        while (rs.next()) {
            System.out.println(rs.getString(1) + " " + rs.getString(2));
        }
        conn.close();
    }
}
