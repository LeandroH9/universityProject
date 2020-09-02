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
    
    public String data(){
        String relatorio = "Codigo do departamento: " + code + "\n" + "Nome do departamento: " + name + "\n\n";
        relatorio += "Lista de Funcionários: \n";
        for(int i=0; i < qtdEmployee; i++){
            relatorio += employee[i].data();
        }
        relatorio += "\n\n";
        return relatorio;
    }

    public String getCode() {
        return code;
    }
    
    
    
    
    
    
}
