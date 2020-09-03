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
    private String type;
    private String area;
    
    public EffectiveTeacher(String code, String name, double wage, String level, String titration, String area){
        super(code, name, wage, level, titration);
        this.area = area;
        type = "Professor Efetivo";
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
                          + "Titulação: " + getTitration() + "\n" + "Area: " + getArea() + "\n\n";
        return relatorio;
    }

    public String getType() {
        return type;
    }

    public String getArea() {
        return area;
    }
    
    
}
