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
public class EffectiveTeacher extends Teacher{
    private String area;
    
    public EffectiveTeacher(String code, String name, double wage, String level, String titration, String area){
        super(code, name, wage, level, titration);
        this.area = area;
    }
    
    @Override
    public double calculateWage(){
        double total;
        double salario = getWage();
        if(getLevel().equals("D1"))
            total = (salario * Constant.D1) + salario;
        else if(getLevel().equals("D2"))
            total = (salario * Constant.D2) + salario;
        else total = (salario * Constant.D2) + salario;
        return total + (total * 0.05);
    }
    
    @Override
    public String data(){
        String relatorio = "Código do Professor Efetivo : " + getCode() + "\n" 
                         + "Nome: " + getName() + "\n" + "Salário Base: " + getWage() + "\n" 
                         + "Salário Total: " + calculateWage() + "\n" + "Nível: " + getLevel() + "\n"
                          + "Titulação: " + getTitration() + "\n" + "Area: " + getArea() + "\n\n";
        return relatorio;
    }


    public String getArea() {
        return area;
    }
    
    
}
