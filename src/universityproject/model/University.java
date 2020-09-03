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
    
    public void addTechnician(String codeDepart, String code, String name, double wage, String level, String occupation){
        Department d = searchDepartment(codeDepart);
        if (d != null){
            Technician t = new Technician(code, name, wage, level, occupation);
            d.addTechnician(t);
        } else System.out.println("Não foi possível adicionar este técnico");
        
    }
    
    public void addEffectiveTeacher(String codeDepart, String code, String name, double wage, String level, String titration, String area){
        Department d = searchDepartment(codeDepart);
        if (d != null){
            EffectiveTeacher e = new EffectiveTeacher(code, name, wage, level, titration, area);
            d.addEffectiveTeacher(e);
        } else System.out.println("Não foi possível adicionar este professor efetivo");
    }
    
    public void addSubstituteTeacher(String codeDepart, String code, String name, double wage, String level, String titration, int workload){
        Department d = searchDepartment(codeDepart);
        if (d != null){
            SubstituteTeacher s = new SubstituteTeacher(code, name, wage, level, titration, workload);
            d.addSubstituteTeacher(s);
        } else System.out.println("Não foi possível adicionar este professor substituto");   
    }
    
    public double totalDepartmentSpend(String codeDepart){
        Department d = searchDepartment(codeDepart);
        double total = d.totalDepartmentSpend();
        return total;
    }
    
    public Department searchDepartment(String codeDepart){
        Department d = database.searchDepartment(codeDepart);
        if(d != null){
            return d;
        } else return null;
    }
    
    public String allData(){
        String data = "Universidade: " + name + "\n" ;
        Department departments[] = database.getDepartments();
        int qtdDepart = database.getContDepart();
        for(int i=0; i < qtdDepart; i++){
            data += departments[i].allData();
            data += "================================\n";
        }
        return data;
    }
    
    public String resumeDepartment(){
        String data = "";
        Department departments[] = database.getDepartments();
        int qtdDepart = database.getContDepart();
        for(int i=0; i < qtdDepart; i++)
            data += departments[i].resumeDepartment();
        return data;
    }
    
    public String dataAllEmployee(){
        String data = "";
        Department departments[] = database.getDepartments();
        int qtdDepart = database.getContDepart();
        for(int i=0; i < qtdDepart; i++)
            data += departments[i].dataAllEmployee();
        return data;
    }
    
    public String dataAllTechnician(){
        String data = "";
        Department departments[] = database.getDepartments();
        int qtdDepart = database.getContDepart();
        for(int i=0; i < qtdDepart; i++)
            data += departments[i].dataAllTechnician();
        return data;
    }
    
    public String dataAllTeacher(){
        String data = "";
        Department departments[] = database.getDepartments();
        int qtdDepart = database.getContDepart();
        for(int i=0; i < qtdDepart; i++)
            data += departments[i].dataAllTeacher();
        return data;
    }
    
    public String dataAllSubstituteTeacher(){
        String data = "";
        Department departments[] = database.getDepartments();
        int qtdDepart = database.getContDepart();
        for(int i=0; i < qtdDepart; i++){
            data += departments[i].dataAllSubstituteTeacher();
        }
        return data;
    }
    
    public String dataAllEffectiveTeacher(){
        String data = "";
        Department departments[] = database.getDepartments();
        int qtdDepart = database.getContDepart();
        for(int i=0; i < qtdDepart; i++){
            data += departments[i].dataAllEffectiveTeacher();
        }
        return data;
    }
    
    public String getName() {
        return name;
    }
    
    
}
