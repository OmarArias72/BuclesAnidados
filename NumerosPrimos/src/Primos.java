
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */

 
public class Primos {
    static Scanner entrada = new Scanner(System.in);
    
    public static void FactoresPrimos(int n)
    {
        
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
 
        
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // While i divides n, print i and divide n
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
 
        
        if (n > 2)
            System.out.print(n);
    }
 
    public static void main(String[] args){
        System.out.println("Ingrese un numero: ");
        int n =entrada.nextInt();
        FactoresPrimos(n);
    }
}
