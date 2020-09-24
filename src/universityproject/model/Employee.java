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
public abstract class Employee {
    protected String code;
    protected String name;
    protected double wage; //salario
    protected String level;
    protected String type;
    
    public Employee(String code, String name, double wage, String level){
        this.code = code;
        this.name = name;
        this.wage = wage;
        this.level = level;
    }
    
    
    public abstract double calculateWage();
    
    public abstract String data();

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getWage() {
        return wage;
    }

    public String getLevel() {
        return level;
    }

    public String getType() {
        return type;
    }
    
    public String getAllData() {
        return "Nome: " + getName()
               + "\nCódigo: " + getCode()
               + "\nSalário Base: " + Double.toString(getWage())
               + "\nSalário Total: " + Double.toString(calculateWage())
               + "\nNivel: " + getLevel()
               + "\nTipo: " + getType() + "\n\n";
    }
    
    
}
