


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis
 */
public class Main {
    public static void main(String [] args){
        int op;
      Zoo zoo = new Zoo();
      do{
        System.out.println("Que desea hacer: ");
        System.out.println("1) Añadir animal");
        System.out.println("2) Eliminar animal");
        System.out.println("3) Mostrar animales");
        System.out.println("4) Salir");
        op = CapturaEntrada.capturarEntero("Opcion");
        switch(op){
         case 1:{
             zoo.agregar();
            break;
            }
         case 2:{
                zoo.eliminar();
             break;
            }
         case 3:{
             zoo.mostrar_lista();
             break;
            }
         default:{
             System.out.println("Ingresaste  una opcion incorrecta.");
         }
        }
        }while(op!=4);       
       
    }
}
