/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3fibonacci;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Practica3Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a = 0, b = 1, c, n;
        System.out.print("Ingresa la cantidad de numeros para la serie: ");
        n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
            scanner.close();
        }
    }
    
}
