/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LOGICA;

import DATOS.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Marcee
 */
public class ProductoDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean insertarProducto(Producto producto) {
        String sql = "INSERT INTO productos (nombre) VALUES (?)";
            try {
                con = cn.conectar();
                ps = con. prepareStatement(sql);
                ps.setString(1, producto.getNombre());
                ps.executeUpdate();
                return true;
            } catch (SQLException e) {
                System.out.println("❌ Error al insertar producto:" + e.getMessage());
                return false;
            }
    }
    
    public List<Producto> listaProductos() {
        List<Producto> lista = new ArrayList<>();
        String sql = "SELECT * FROM productos";
            try {
                con = cn.conectar();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    Producto p = new Producto();
                    p.setId(rs.getInt("id"));
                    p.setNombre(rs.getString("nombre"));
                    lista.add(p);
                }
            } catch (SQLException e) {
                System.out.println("❌ Error al listar productos: " + e.getMessage());
            }
            return lista;
    }

    public Iterable<Producto> listarProductos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
