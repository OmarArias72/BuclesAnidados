/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
import java.util.Scanner;

public class Factorial {
        int N;
        double factorial;
        Scanner sc = new Scanner(System.in);
        
        public void Calcular(){
        
        do{
            System.out.print("Introduce un número > 0: ");
            N = sc.nextInt();
        }while(N<0);

        for(int i = 0; i <= N ; i++){                                             
           
         
            factorial = 1;
            for(int j = 1; j <= i; j++){
                factorial = factorial * j;
            }

           
            System.out.printf("%2d! = %.0f %n", i, factorial);

        }
        }
    public static void main(String[] args) {
        Factorial numer1 = new Factorial();
        numer1.Calcular();
       
    }
   
}
