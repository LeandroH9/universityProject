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
public class Controller {
    private University university = new University("UNESP");
    
    public void addDepartment(String name, String code, int quantEmployee){
        university.addDepartment(name, code, quantEmployee);
    }
    
    public void addTechnician(String codeDepart, String code, String name, double wage, String level, String occupation){
        university.addTechnician(codeDepart, code, name, wage, level, occupation);
    }
    
    public void addEffectiveTeacher(String codeDepart, String code, String name, double wage, String level, String titration, String area){
        university.addEffectiveTeacher(codeDepart, code, name, wage, level, titration, area);
    }
    
    public void addSubstituteTeacher(String codeDepart, String code, String name, double wage, String level, String titration, int workload){
        university.addSubstituteTeacher(codeDepart, code, name, wage, level, titration, workload);
    }
    
     public String allData(){
        return university.allData();
    }
    /*
    public String dataDepartments(){
        return university.dataDepartments();
    }*/
}
