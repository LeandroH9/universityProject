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
public abstract class Teacher extends Employee{
    protected String titration;
    
    public Teacher(String code, String name, double wage, String level, String titration){
        super(code, name, wage, level);
        this.titration = titration;
        
    }

    public String getTitration() {
        return titration;
    }
    
    
    
    @Override
    public abstract double calculateWage();
}
