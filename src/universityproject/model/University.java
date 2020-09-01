/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityproject.model;

import universityproject.persistencia.DataBase;

/**
 *
 * @author leand
 */
public class University {
    private static DataBase database ;
    private String name;
    
    public University(String name){
        this.database = DataBase.getInstance();
        this.name = name;
    }
    
    public void addDepartment(String name, String code, int quantEmployee){
        Department d = new Department(name, code, quantEmployee);
        database.addDepartment(d);
    }
    
    public String viewDepartments(){
        String relatorio = "";
        Department departments[] = database.getDepartments();
        int qtdDepart = database.getContDepart();
        for(int i=0; i < qtdDepart; i++){
            relatorio += departments[i].view();
        }
        return relatorio;
    }
    
}
