/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis
 */
public class Veterinarian {
    String name;
    double salary;

    public Veterinarian(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void vacunado(Animal animales){
        animales.setVacunacion(true);  
    }
    public void DarMedicina(){
        System.out.println("Dando medicina a los animales");
    }
    
}
