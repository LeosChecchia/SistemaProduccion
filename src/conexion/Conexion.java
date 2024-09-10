package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    // Método para establecer conexión
    public static Connection conectar() {
        // Datos de conexión
        //String url = "jdbc:mysql://localhost:3306/tu_base_de_datos";  // Cambia 'tu_base_de_datos' por el nombre de tu base
        //String usuario = "root";  // Usuario de MySQL (cámbialo si es necesario)
        //String contrasena = "";   // Contraseña de MySQL

        //Connection conexion = null;

        try {
            // Intentar establecer conexión
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_sistema_ventas", "root", "123456");
            return cn;
        } catch (SQLException e) {
            // Manejar excepción si hay un error en la conexión
            System.err.println("Error en la conexión: " + e.getMessage());
        }

        return null;
    }
}