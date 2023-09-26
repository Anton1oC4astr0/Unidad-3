/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n;
        System.out.println("Por favor ingrese el numero entero: ");
        n = scanner.nextInt();
        
        if (n % 2 == 0){
            System.out.println(n+" es un numero par.");
        }else{
            System.out.println(n+" es un numero impar.");
        }
    }
    
}
