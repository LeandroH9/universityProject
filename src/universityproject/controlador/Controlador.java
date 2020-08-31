/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityproject.controlador;

import universityproject.model.University;

/**
 *
 * @author leand
 */
public class Controlador {
    private University university = new University("UNESP");
    
    public void addDepartment(String name, String code, int quantEmployee){
        university.addDepartment(name, code, quantEmployee);
    }
    
    public String viewDepartments(){
        return university.viewDepartments();
    }
}
