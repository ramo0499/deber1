
import tarea.JavaApplication9;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ISTLOJA1
 */
public class carros {
    //declaro mialquilercarros atributos 
    private int año;
    private String modelo;
    private String marca; 
    private int capacidadepersonas;
    private boolean camioneta;
    private double costo;
    //declaro metodos 
    public void guardarInformacion() {
        System.out.println("el carro esta en buena condicion");
        
    }     
    public void leerInformacion(String info){
        System.out.println("el carro esta estable ");
    }
    public void imprimirInformacion (String info){
        System.out.println(info);
        
    }
    public static void main(String[] args) {
        carros primerobjeto =  new carros ();//he creado mi primer objeto
        primerobjeto.guardarInformacion();//llama a un objeto
        primerobjeto.imprimirInformacion("carrodemarca");
        primerobjeto.imprimirInformacion("carro sin frenos");
}
}
