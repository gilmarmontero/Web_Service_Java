/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Publicacao;

/**
 *
 * @author Montero
 */
public class PeriodicosDAO {
     ConnectionFactory con;
    
    public ArrayList<Publicacao> listarDados(){
        try {
            ArrayList<Publicacao> dados = new ArrayList();
            PreparedStatement stmt = con.getConnection().prepareStatement("select publicacao.codigo_publicacao as 'Código', publicacao.titulo as 'Titulo da Publicação', area_topico.area_pesquisa as 'Área da pesquisa', publicacao_area_topico.data as 'Data'\n" +
"from publicacao\n" +
"inner join publicacao_area_topico \n" +
"on publicacao.codigo_publicacao = publicacao_area_topico.codigo_publicacao\n" +
"inner join area_topico\n" +
"on publicacao_area_topico.codigo_topico = area_topico.codigo_topico");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                dados.add(new Publicacao(rs.getInt("codigo_publicacao"),
                rs.getString("titulo"), rs.getString("area_pesquisa"), rs.getString("data")
                ));
            }
            rs.close();
            stmt.close();
            ConnectionFactory.getConnection().close();
            
            return dados;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            
            return null;
        }
    }
}
