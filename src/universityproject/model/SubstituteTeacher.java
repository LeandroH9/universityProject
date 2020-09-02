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
public class SubstituteTeacher extends Teacher{
    private int workload;
    private String type;
 
    public SubstituteTeacher(String code, String name, double wage, String level, String titration, int workload){
        super(code, name, wage, level, titration);
        this.workload = workload;
        type = "Professor Substituto";
    }
    
    @Override
    public double calculateWage(){
        return 2.15;
    }
    
    @Override
    public String data(){
        String relatorio = "Professor Substituto : " + getCode() + "\n" 
                         + "Nome: " + getName() + "\n" + "Salário: " 
                          + getWage() + "\n" + "Nível: " + getLevel() + "\n"
                          + "Titulação: " + getTitration() + "\n" + "Carga Horária: " + getWorkload() + "\n\n";
        return relatorio;
    }

    public int getWorkload() {
        return workload;
    }

    public String getType() {
        return type;
    }
    
    
}
