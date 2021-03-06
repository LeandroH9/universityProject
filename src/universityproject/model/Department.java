/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityproject.model;

import universityproject.controlador.Controller;

/**
 *
 * @author leand
 */
public class Department {
    private String name;
    private String code;
    private Employee employee[];
    private int qtdMaxEmployee;
    private int qtdEmployee;
    
    public Department(String name, String code, int qtdMaxEmployee){
        this.name = name;
        this.code = code;
        this.qtdMaxEmployee = qtdMaxEmployee;
        this.employee = new Employee[qtdMaxEmployee];
        this.qtdEmployee = 0;
    }
    
    public void addTechnician(Technician t){
        if (qtdEmployee < qtdMaxEmployee){
            employee[qtdEmployee] = t;
            qtdEmployee++;
        }
    }
    
    public void addEffectiveTeacher(EffectiveTeacher e){
        if (qtdEmployee < qtdMaxEmployee){
            employee[qtdEmployee] = e;
            qtdEmployee++;
        }
    }
    
    public void addSubstituteTeacher(SubstituteTeacher s){
        if (qtdEmployee < qtdMaxEmployee){
            employee[qtdEmployee] = s;
            qtdEmployee++;
        }
    }
    
    public double totalDepartmentSpend(){
        double total = 0.0;
        for(int i=0; i < qtdEmployee; i++)
            total += employee[i].calculateWage();
        return total;
    }
    
    public String allData(){
        String relatorio = "Codigo do departamento: " + code + "\n" + "Nome do departamento: " + name + "\n\n";
        relatorio += "Lista de Funcionários: \n";
        for(int i=0; i < qtdEmployee; i++){
            relatorio += employee[i].data();
        }
        relatorio += "Gasto total com funcionários: " + totalDepartmentSpend() + "\n";
        return relatorio;
    }

    public String resumeDepartment (){
        String relatorio = "Código: " + getCode() + "\n"
                         + "Nome: " +  getName() + "\n"
                         + "Quantidade de funcionários: " + getQtdEmployee() + "\n"
                         + "Gasto total com funcionários: " + totalDepartmentSpend() + "\n\n";
        return relatorio;
    }
    
    public String dataAllEmployee(){
        String relatorio = "";
        for(int i=0; i < qtdEmployee; i++){
            relatorio += employee[i].data();
        }
        return relatorio;
    }
    
    public String dataAllTechnician(){
        String data = "";
        for(int i=0; i < qtdEmployee; i++){
            if(employee[i] instanceof Technician)
                data += employee[i].data();
        }
        return data;
    }
    
    public String dataAllTeacher(){
        String data = "";
        for(int i=0; i < qtdEmployee; i++){
            if(employee[i] instanceof Teacher )
                data += employee[i].data();
        }
        return data;
    }
    
    public String dataAllSubstituteTeacher(){
        String data = "";
        for(int i=0; i < qtdEmployee; i++){
            if(employee[i] instanceof SubstituteTeacher)
                data += employee[i].data();
        }
        return data;
    }
    
    public String dataAllEffectiveTeacher(){
        String data = "";
        for(int i=0; i < qtdEmployee; i++){
            if(employee[i] instanceof EffectiveTeacher)
                data += employee[i].data();
        }
        return data;
    }
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getQtdEmployee() {
        return qtdEmployee;
    }
    
    public Employee[] getAllEmployee(){
        return this.employee;
    }
    
    public Employee searchEmployeeByCode(String code) {
        Controller control = new Controller();
        Department departments[] = control.getUniversity().getDepartments();
        Employee empList[];
        int deptMax = control.getUniversity().getContDepart();
        int empMax;
        
        for(int i = 0; i < deptMax; i++) {
            empList = departments[i].getAllEmployee();
            empMax = departments[i].getQtdEmployee();
            for (int j = 0; j < empMax; j++) {
                if (empList[j].getCode().equals(code)) {
                    return empList[j];
                }
            }
        }
        return null;
    }
    
    public String searchEmployeeByName(String code) {
        Controller control = new Controller();
        Department departments[] = control.getUniversity().getDepartments();
        Employee empList[];
        int deptMax = control.getUniversity().getContDepart();
        int empMax;
        String relatorio = "";
        
        for(int i = 0; i < deptMax; i++) {
            empList = departments[i].getAllEmployee();
            empMax = departments[i].getQtdEmployee();
            for (int j = 0; j < empMax; j++) {
                if (empList[j].getName().equals(code)) {
                    relatorio += empList[j].getAllData();
                }
            }
        }
        return relatorio;
    }
    
    public String searchEmployeeByInterval(double from, double to) {
        Controller control = new Controller();
        Department departments[] = control.getUniversity().getDepartments();
        Employee empList[];
        int deptMax = control.getUniversity().getContDepart();
        int empMax;
        String relatorio = "";
        
        for(int i = 0; i < deptMax; i++) {
            empList = departments[i].getAllEmployee();
            empMax = departments[i].getQtdEmployee();
            for (int j = 0; j < empMax; j++) {
                if (empList[j].getWage() >= from && empList[j].getWage() <= to) {
                    relatorio += empList[j].getAllData();
                }
            }
        }
        return relatorio;
    }
}
