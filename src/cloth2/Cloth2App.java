/*
 * Cloth2App.java
 */

package cloth2;
import java.sql.*;
import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class Cloth2App extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        show(new Cloth2View(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of Cloth2App
     */
    public static Cloth2App getApplication() {
        return Application.getInstance(Cloth2App.class);
    }

    /**
     * Main method launching the application.
     */
    public static Statement stmt;
    public static void main(String[] args) {
   

try{  
Class.forName("com.mysql.jdbc.Driver");  
  
Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/sanky","root","root");  
  
//here sonoo is database name, root is username and password  
  
 stmt=con.createStatement();  
  
}catch(Exception E)
{
    System.out.println("Error  "+E);
}

        launch(Cloth2App.class, args);
    }
}
