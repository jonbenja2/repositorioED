/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1;
import java.util.Scanner;
/**
 *
 * @author ik_1dw3
 */
public class ejer2 {
     public static void main(String[] args) {
         int n;
    Scanner teclado;
		teclado = new Scanner(System.in);
                System.out.println("Introduce un valor:");
     n = teclado.nextInt();
		teclado.close();
     
     if (n>0)
     System.out.println("es positivo");
     else{
        if (n==0)
     System.out.println("es cero");
        
         else 
          System.out.println("negativo ");   }
     }
        }
      
        
        
     
     
     
     
     
       
     
     
     
     
     
