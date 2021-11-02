
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis
 */
public class Zoo {
    ArrayList<Animal> animales=new ArrayList<>();
     Veterinarian vet = new Veterinarian(CapturaEntrada.capturarCadena("Nombre del veterinario"),CapturaEntrada.capturarDoble("Salario"));
   public void agregar(){
       int op=0;
       
       do{
            System.out.println("\tMenu para agregar un animal:\n"
                    + "1.Perro.\n"
                    + "2.Gato.\n"
                    + "3.Leon.\n"
                    + "4.Elefante.\n"
                    + "5.Aguila.\n"
                    + "6.Salir.");
            op=CapturaEntrada.capturarEntero("Ingrese la opcion");
            Animal a=null;
             switch(op){
                 case 1:{
                    a=new Dog(CapturaEntrada.capturarCadena("Nombre"),CapturaEntrada.capturarCadena("Raza"), CapturaEntrada.capturarEntero("Edad"));
                    break;
                 }
                 case 2:{
                    a=new Cat(CapturaEntrada.capturarCadena("Nombre"),CapturaEntrada.capturarCadena("Raza"), CapturaEntrada.capturarEntero("Edad"));
                    break;
                 }
                 case 3:{
                    a=new Elefante(CapturaEntrada.capturarCadena("Nombre"),CapturaEntrada.capturarCadena("Raza"), CapturaEntrada.capturarEntero("Edad"));
                    break;
                 }
                 case 4:{
                    a=new Leon(CapturaEntrada.capturarCadena("Nombre"),CapturaEntrada.capturarCadena("Raza"), CapturaEntrada.capturarEntero("Edad"));
                    break; 
                 }
                 case 5:{
                    a=new Aguila(CapturaEntrada.capturarCadena("Nombre"),CapturaEntrada.capturarCadena("Raza"), CapturaEntrada.capturarEntero("Edad"));
                    break;
                 }
                 case 6:{
                     System.out.println("Adios...");
                 }
                 default:{
                     System.out.println("Ingreso una opcion incorrecta");
                 }
             }
             if(a != null){
            animales.add(a);
        }
       }while(op!=6);
   }
   public void eliminar(){
        int i = 1, numEliminar;
        
        for(Animal ani: animales){
            
            System.out.println("Numero del animal: " + i);
            System.out.print(ani.name + "\n");
            i++;
        }
        numEliminar= CapturaEntrada.capturarEntero("Numero del animal que desea eliminar");
        animales.remove((numEliminar-1));
        System.out.println("Animal borrado exitosamente");
   }
   public void mostrar_lista(){
       for(Animal a: animales){
           a.eat();
           a.sleep();
           vet.DarMedicina();
           if(a instanceof Dog ){
               ((Dog) a).bark();
           }
            else if(a instanceof Cat ){
               ((Cat) a).Maulla();
           }
           else if(a instanceof Elefante ){
               ((Elefante) a).barritan();
           }
           else if(a instanceof Leon ){
               ((Leon) a).rugir();
           }
           else if(a instanceof Aguila ){
               ((Aguila) a).chillar();
           }
       }
   }
}
