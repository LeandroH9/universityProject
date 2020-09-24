/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityproject.controlador;

import universityproject.model.Department;
import universityproject.model.Employee;
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
     
    public String resumeDepartment(){
        return university.resumeDepartment();
    }
    
    public String dataAllEmployee(){
        return university.dataAllEmployee();
    }
    
    public String dataAllTechnician(){
        return university.dataAllTechnician();
    }
    
    public String dataAllSubstituteTeacher(){
        return university.dataAllSubstituteTeacher();
    }
    
    public String dataAllEffectiveTeacher(){
        return university.dataAllEffectiveTeacher();
    }
    
    public String dataAllTeacher(){
        return university.dataAllTeacher();
    }
    
    public String searchDepartment(String code) {
        Department department = university.searchDepartment(code);
        if(department != null){
            return (department).allData();
        }
        return "";
    }
    
    public String searchEmployeeByCode(String code) {
        Employee employee = (new Department("","",0)).searchEmployeeByCode(code);
        if(employee != null) {
            return(employee.getAllData());
        }
        return "";
    }
    
    public String searchEmployeeByName(String code) {
        return (new Department("","",0)).searchEmployeeByName(code);
    }
    
    public University getUniversity() {
        return university;
    }
    
    public String searchDepartmentByInterval(double from, double to){
        return university.searchDepartmentByInterval(from, to);
    }
    
    public String searchEmployeeByInterval(double from, double to) {
        return university.searchEmployeeByInterval(from, to);
    }
}

