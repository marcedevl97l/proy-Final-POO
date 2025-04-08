/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LOGICA;

import DATOS.Conexion;
import java.sql.*;

/**
 *
 * @author Marcee
 */
public class UsuarioDAO {
    public boolean login(String usuario, String contrasena) {
        boolean acceso = false;
        String sql = "SELECT * FROM usuarios WHERE usuario=? AND contrasena=?";
        try {
            try (Connection con = new Conexion().conectar()) {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, usuario);
                ps.setString(2, contrasena);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    acceso = true;
                }
            }
        } catch (SQLException e) {
            System.out.println("Error en login: " + e.getMessage());
        }
        return acceso;
    }
}

