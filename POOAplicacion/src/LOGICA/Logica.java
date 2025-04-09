/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LOGICA;

import DATOS.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Logica {
    
    public List<String[]> obtenerRegistros(){
        List<String[]> registros = new ArrayList<>();
        
        try(Connection cnx = Conexion.obtenerConexion();
                PreparedStatement statement=
                        cnx.prepareStatement("SELECT id_producto, nombre, precio, stock, lote, usuario, fecha_ingreso FROM productos"))
                {
                    ResultSet rs = statement.executeQuery();
                    while(rs.next()){
                        String[] registro=new String[7];
                        registro[0]=rs.getString("id_producto");
                        registro[1]=rs.getString("nombre");
                        registro[2]=rs.getString("precio");
                        registro[3]=rs.getString("stock");
                        registro[4]=rs.getString("lote");
                        registro[5]=rs.getString("usuario");
                        registro[6]=rs.getString("fecha_ingreso");
                        registros.add(registro);
                    }
                }catch(SQLException e){
                    e.printStackTrace();
                }
                
            return registros;
    }
    
    public void insertarRegistros(String nombre,String precio,String stock,String lote,String usuario, String fecha_ingreso){
        try(Connection cnx=Conexion.obtenerConexion();
                PreparedStatement st=
                cnx.prepareStatement("INSERT INTO productos (nombre,precio,stock,lote,usuario,fecha_ingreso) VALUES(?,?,?,?,?,?)"))
        {
            st.setString(1,nombre);
            st.setString(2,precio);
            st.setString(3,stock);
            st.setString(4,lote);
            st.setString(5,usuario);
            st.setString(6,fecha_ingreso);
            st.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace();
        }          
    }
    
    public void actualizarRegistro(int id_producto, String nombre,String precio,String stock,String lote, String usuario, String fecha_ingreso){
        try (Connection cnx = Conexion.obtenerConexion();
                PreparedStatement st = cnx.prepareStatement("UPDATE productos SET nombre = ?, precio = ?, stock = ?, lote = ?, usuario = ?, fecha_ingreso = ? WHERE id_producto = ?")) {
            
            st.setString(1,nombre);
            st.setString(2,precio);
            st.setString(3,stock);
            st.setString(4,lote);
            st.setString(5,usuario);
            st.setString(6,fecha_ingreso);
            st.setInt(7, id_producto);
            
            st.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void eliminarRegistro(int id_producto) {
        String sql = "DELETE FROM productos WHERE id_producto = ?";
        
        try (Connection conexion = Conexion.obtenerConexion();
        PreparedStatement st = conexion.prepareStatement(sql)){
            
            st.setInt(1,id_producto);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
