/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().

 */
package java1_dia2;

import java.util.Scanner;

/**
 *
 * @author Sol
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero:");
        num = leer.nextInt();
        int doble;
        int triple;
        int raiz;
        doble = num*num;
        triple = num*num*num;
        raiz=(int) Math.sqrt(num);
        System.out.println("El doble del numero ingresado es: " + doble);
        System.out.println("El triple del numero ingresado es: " + triple);
        System.out.println("La raiz cuadrada del numero ingresado es: " + raiz);
        
    }
    
}
