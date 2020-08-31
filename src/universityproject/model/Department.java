/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityproject.model;

/**
 *
 * @author leand
 */
public class Department {
    private String name;
    private String code;
    //private Employee employee[];
    private int cont;
    private int qtdEmployee;
    
    public Department(String name, String code, int qtdEmployee){
        this.name = name;
        this.code = code;
        this.qtdEmployee = qtdEmployee;
        //this.employee = new Employee[qtdEmployee];
        this.cont = 0;
    }
    
    public String view(){
        String relatorio = "Codigo: " + code + "\n" + "Nome: " + name + "\n";
        return relatorio;
    }
}
