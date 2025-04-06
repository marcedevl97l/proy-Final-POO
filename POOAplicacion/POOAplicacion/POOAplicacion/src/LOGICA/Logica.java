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
                        cnx.prepareStatement("SELECT * FROM productos"))
                {
                    ResultSet rs = statement.executeQuery();
                    while(rs.next()){
                        String[] registro=new String[5];
                        registro[0]=rs.getString("id_producto");
                        registro[1]=rs.getString("nombre");
                        registro[2]=rs.getString("precio");
                        registro[3]=rs.getString("stock");
                        registro[4]=rs.getString("lote");
                        registro[5]=rs.getString("fecha_ingreso");
                        registros.add(registro);
                    }
                }catch(SQLException e){
                    e.printStackTrace();
                }
                
            return registros;
    }
    
    public void insertarRegistros(String nombre,double precio,int stock,int lote,String fecha_ingreso){
        try(Connection cnx=Conexion.obtenerConexion();
                PreparedStatement st=
                cnx.prepareStatement("INSERT INTO productos (nombre,precio,stock,lote,fecha_ingreso)"
                        + "VALUES(?,?,?,?,?,?)"))
        {
            st.setString(1,nombre);
            st.setDouble(2,precio);
            st.setInt(3,stock);
            st.setInt(4,lote);
            st.setString(5,fecha_ingreso);
            st.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }          
    }
    
    public void actualizarRegistro(int id_producto, String nombre,double precio,int stock,int lote, String fecha_ingreso){
        try (Connection cnx = Conexion.obtenerConexion();
                PreparedStatement st = cnx.prepareStatement("UPDATE productos SET nombre = ?, precio = ?, stock = ?, lote = ?, fecha_ingreso = ?  WHERE id_producto = ?")) {
            
            st.setString(1,nombre);
            st.setDouble(2,precio);
            st.setInt(3,stock);
            st.setInt(4,lote);
            st.setString(5,fecha_ingreso);
            st.setInt(6, id_producto);
            
            st.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void eliminarRegistro(int id) {
        String sql = "DELETE FROM productos WHERE id_producto = ?";
        
        try (Connection conexion = Conexion.obtenerConexion();
        PreparedStatement st = conexion.prepareStatement(sql)){
            
            st.setInt(1,id);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
