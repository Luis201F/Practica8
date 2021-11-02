/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis
 */
public class Aguila extends Animal {
     public Aguila(String name, String breed, int age) {
        super(name,age);
    }
    @Override
    public void eat(){
        System.out.println(name+" is eating");
    }
    public void chillar(){
        System.out.println(name+" :cssssss");
    }
}
