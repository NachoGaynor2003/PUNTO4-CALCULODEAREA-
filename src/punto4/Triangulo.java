/*im
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4;

import java.util.Scanner;

/**
 *
 * @author Ignacio Gaynor
 */
public class Triangulo {
    public float calcularArea (){
        float a,b;
        Scanner leer;
        leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de la altura");
        a=leer.nextFloat();
        System.out.println("Ingrese el valor de la base");
        
        b=leer.nextFloat();
        float area= (a*b)/2;
        
        return area;
    }
}
