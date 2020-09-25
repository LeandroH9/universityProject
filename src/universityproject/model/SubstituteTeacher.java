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
 
    public SubstituteTeacher(String code, String name, double wage, String level, String titration, int workload){
        super(code, name, wage, level, titration);
        this.workload = workload;
    }
    
    @Override
    public double calculateWage(){
        double total;
        double salario = getWage();
        if(getLevel().equals("S1"))
            total = (salario * Constant.S1) + salario;
        else total = (salario * Constant.S2) + salario;
        return total;
    }
    
    @Override
    public String data(){
        String relatorio = "Código do Professor Substituto : " + getCode() + "\n" 
                         + "Nome: " + getName() + "\n" + "Salário Base: " + getWage() 
                         + "\n" + "Salário Total: " + calculateWage() + "\n" + "Nível: " + getLevel() + "\n"
                         + "Titulação: " + getTitration() + "\n" + "Carga Horária: " + getWorkload() + "\n\n";
        return relatorio;
    }

    public int getWorkload() {
        return workload;
    }

    
    
}
