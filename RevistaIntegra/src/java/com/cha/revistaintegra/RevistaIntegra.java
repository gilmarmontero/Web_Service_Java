/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cha.revistaintegra;

import dao.DepartamentoDAO;
import dao.PeriodicosDAO;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.Departamento;
import modelo.Publicacao;

/**
 *
 * @author Montero
 */
@WebService(serviceName = "RevistaIntegra")
public class RevistaIntegra {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "pesquisarDepartamento")
    public ArrayList<Departamento> pesquisrDepartamento() {
        DepartamentoDAO dep = new DepartamentoDAO();
        ArrayList<Departamento> dados = new ArrayList();
        try {
            dados = dep.listarDepartamento();
            return dados;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    @WebMethod(operationName = "listarDados")
    public ArrayList<Publicacao> listarDados() {
        PeriodicosDAO publicar = new PeriodicosDAO();
        ArrayList<Publicacao> dados = new ArrayList();
        try {
            dados = publicar.listarDados();
            return dados;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    
    
}
