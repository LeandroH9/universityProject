/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityproject.persistencia;

import universityproject.model.Department;

/**
 *
 * @author leand
 */
public final class DataBase {
    private static final int MAX = 10000;
    private Department department[];
    private int contDepart;
    private static DataBase instance;
    
    private DataBase(){
        this.department = new Department[MAX];
        this.contDepart = 0;
        this.instance = null;
    }
    
    public static DataBase getInstance(){
        if (instance == null)
            instance = new DataBase();
        return instance;
    }
    
    
    public void addDepartment(Department d){
        if(contDepart < MAX){
            department[contDepart] = d;
            contDepart++;
        } 
    }
    
    public Department[] getDepartments(){
        Department departments[] = new Department[contDepart];
        for(int i=0; i < contDepart; i++){
            departments[i] = department[i];
        }
        return departments;
    }

    public int getContDepart() {
        return contDepart;
    }
}