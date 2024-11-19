package prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseExample {
    public static void main(String[] args) {
        // Cambia la ruta a donde quieras crear la base de datos
        String url = "jdbc:sqlite:C:\\Users\\kimberly\\Desktop\\ejemplo_de_base_de_datos.db";

        // Crear una conexión a la base de datos
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                // Crear una tabla
                Statement stmt = conn.createStatement();
                String createTableSql = "CREATE TABLE IF NOT EXISTS usuarios (\n" +
                                        " id INTEGER PRIMARY KEY,\n" +
                                        " nombre TEXT NOT NULL,\n" +
                                        " edad INTEGER\n" +
                                        ");";
                stmt.execute(createTableSql); // Ejecutar la creación de la tabla

                // Insertar datos en la tabla
                String insertDataSql1 = "INSERT INTO usuarios (nombre, edad) VALUES ('Juan', 25);";
                String insertDataSql2 = "INSERT INTO usuarios (nombre, edad) VALUES ('María', 30);";
                String insertDataSql3 = "INSERT INTO usuarios (nombre, edad) VALUES ('Kimberly', 20)";
                stmt.execute(insertDataSql1); // Insertar primer registro
                stmt.execute(insertDataSql2); // Insertar segundo registro
                stmt.execute(insertDataSql3);

                System.out.println("Base de datos creada, tabla 'usuarios' creada y datos insertados.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
