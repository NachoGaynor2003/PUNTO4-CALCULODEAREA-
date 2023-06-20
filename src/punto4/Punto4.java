/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4;

/**
 *
 * @author Ignacio Gaynor
 */
public class Punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido Usuario");
        Triangulo nuevo= new Triangulo();
        System.out.println("El area del triangulo es:"+ nuevo.calcularArea());
    }
    
}
