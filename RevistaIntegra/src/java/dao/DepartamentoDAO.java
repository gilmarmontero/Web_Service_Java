/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Departamento;

/**
 *
 * @author Montero
 */
public class DepartamentoDAO {
    ConnectionFactory con;
    
    public ArrayList<Departamento> listarDepartamento(){
        try {
            ArrayList<Departamento> dados = new ArrayList();
            PreparedStatement stmt = con.getConnection().prepareStatement("select * from departamento");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                dados.add(new Departamento(rs.getInt("id"),
                rs.getString("nome")
                ));
            }
            rs.close();
            stmt.close();
            con.getConnection().close();
            
            return dados;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
            return null;
        }
    }
    
    
    
}
