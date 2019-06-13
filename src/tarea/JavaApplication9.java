/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

/**
 *
 * @author ISTLOJA1
 */
public class JavaApplication9 {
    private static Object primerobjeto;
    private static Object Primerobjeto;
    //declaro atributos 
    private int año;
    private String modelo;
    private String marca; 
    private double capacidaprocesador;
    private boolean portatail;
    // declaro metodos 
    public  void guardarInformacion (){
        System.out.println("Hola soy la computadora y guardo informacion ");
      
    }
    public void leerIformacion(){
        System.out.println("Hola soy la computadora y  guardo informacion");
        
    }
    public void imprimirInformacion (String info){
        System.out.println(info);
        
    }
    public static void main(String[] args) {
        JavaApplication9 primerobjeto =  new JavaApplication9 ();//he creado mi primer objeto
        primerobjeto.guardarInformacion();//llama a un objeto
        primerobjeto.imprimirInformacion("HolA");
        primerobjeto.imprimirInformacion("CHAO");
        
        
        
                
                
              
                
        
    }
    
}
