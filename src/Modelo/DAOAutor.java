package Modelo;

import java.util.*;

public class DAOAutor {

// Método para insertar un nuevo autor en la base de datos
    public Autor Insertar(String cedula, String nombres, String apellidos,
            String email, java.sql.Date FechaNac) {
        // Define la consulta SQL para insertar un nuevo registro en la tabla "Autor"
        String transaccion = "INSERT INTO Autor (nombres,apellidos,email,cedula,fechaNac) VALUES ('"
                + nombres + "','"
                + apellidos + "','"
                + email + "','"
                + cedula + "','"
                + FechaNac + "')";

        // Llama al método "Actualizar" de la clase "DataBase" para ejecutar la consulta
        if (new DataBase().Actualizar(transaccion) > 0) {
            // Si la operación fue exitosa, crea y retorna un objeto "Autor" con los datos ingresados
            return new Autor(cedula, nombres, apellidos, email, FechaNac);
        }
        // Si la operación falla, retorna null
        return null;
    }

    // Método para actualizar un registro existente en la tabla "Autor"
    public int Actualizar(int id, String nombres, String Apellidos,
            String email, String cedula, java.sql.Date FechaNac) {
        // Define la consulta SQL para actualizar un registro en la tabla "Autor"
        String transaccion = "UPDATE Autor SET nombres='"
                + nombres + "', apellidos='"
                + Apellidos + "', email= '"
                + email + "', fechaNac='"
                + FechaNac + "', cedula='"
                + cedula + "' WHERE id_autor="
                + id;

        // Llama al método "Actualizar" de la clase "DataBase" para ejecutar la consulta y retorna el resultado
        return new DataBase().Actualizar(transaccion);
    }

    // Método para obtener todos los registros de la tabla "Autor"
    public List <Autor> ObtenerDatos() {
        // Define la consulta SQL para seleccionar todos los registros de la tabla "Autor"
        String transaccion = "SELECT * FROM Autor";

        // Llama al método "Listar" de la clase "DataBase" y obtiene una lista de mapas con los registros
        List<Map> registros = new DataBase().Listar(transaccion);

        // Crea una lista para almacenar objetos "Autor"
        List<Autor> autores = new ArrayList();

        // Recorre cada registro del resultado y lo convierte en un objeto "Autor"
        for (Map registro : registros) {
            Autor aut = new Autor((int) registro.get("id_autor"), // Obtiene y asigna el ID del autor
                    (String) registro.get("nombres"), // Obtiene y asigna los nombres del autor
                    (String) registro.get("apellidos"), // Obtiene y asigna los apellidos del autor
                    (String) registro.get("email"), // Obtiene y asigna el email del autor
                    (String) registro.get("cedula"), // Obtiene y asigna la cédula del autor
                    (java.sql.Date) registro.get("fechaNac")); // Obtiene y asigna la fecha de nacimiento
            autores.add(aut); // Agrega el objeto "Autor" a la lista
        }
        // Retorna la lista de autores
        return autores;
    }

    // Método para eliminar un registro de la tabla "Autor" por su ID
    public int Eliminar(int id) {
        // Define la consulta SQL para eliminar un registro en la tabla "Autor"
        String transaccion = "DELETE FROM Autor WHERE id_autor='" + id + "'";

        // Llama al método "Actualizar" de la clase "DataBase" para ejecutar la consulta y retorna el resultado
        return new DataBase().Actualizar(transaccion);
    }
}
