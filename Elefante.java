/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis
 */
public class Elefante extends Animal {
     public Elefante(String name, String breed, int age) {
        super(name,age);
    }
    @Override
    public void eat(){
        System.out.println(name+"  estaa comiendo manzana");
    }
    public void barritan(){
        System.out.println(name+" :buuuud");
    }
}
