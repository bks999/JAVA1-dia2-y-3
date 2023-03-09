/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package java1_dia2;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Sol
 */
public class ejercicio3 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase;
        frase = leer.nextLine();
        String fraseMay;
        fraseMay = frase.toUpperCase();
        String fraseMin;
        fraseMin = frase.toLowerCase();
        System.out.println(fraseMay);      
        System.out.println(fraseMin);  
    }
    
}
