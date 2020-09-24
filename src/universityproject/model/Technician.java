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
public class Technician extends Employee{
    private String occupation;
    
    
    public Technician(String code, String name, double wage, String level, String occupation){
        super(code, name, wage, level);
        type = "Tecnico";
        this.occupation = occupation;
    }
    
    @Override
    public double calculateWage(){
        double total;
        double salario = getWage();
        if(getLevel().equals("T1"))
            total = (salario * Constant.T1) + salario;
        else total = (salario * Constant.T2) + salario;
        return total;
    }
    
    public String data(){
        String relatorio = "Código do técnico : " + getCode() + "\n" 
                         + "Nome: " + getName() + "\n" + "Salário Base: " + getWage() + "\n" 
                         + "Salário Total: " + calculateWage() + "\n" + "Nível: " + getLevel() + "\n"
                          + "Função: " + getOccupation() + "\n\n";
        return relatorio;
    }

    public String getOccupation() {
        return occupation;
    }

    
    
}
