/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Montero
 */
public class Publicacao {
    
    private int codigo_publicacao;
    private String titulo;
    private String area_pesquisa;
    private String data;
    
    public Publicacao(){
        
    }
    public Publicacao(int id, String titulo, String pesquisa, String data){
        this.codigo_publicacao = id;
        this.titulo = titulo;
        this.area_pesquisa = pesquisa;
        this.data = data;
        
    }

   

    public int getCodigo_publicacao() {
        return codigo_publicacao;
    }

    public void setCodigo_publicacao(int codigo_publicacao) {
        this.codigo_publicacao = codigo_publicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArea_pesquisa() {
        return area_pesquisa;
    }

    public void setArea_pesquisa(String area_pesquisa) {
        this.area_pesquisa = area_pesquisa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
}
