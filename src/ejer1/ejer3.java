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
public class ejer3 {
   public static void main(String[] args) {
         int n, par=0 , impar=0 ;
    Scanner teclado;
		teclado = new Scanner(System.in);
               
                
                System.out.println("Introduce un valor:");
                
  do{              
                
     n = teclado.nextInt();
		teclado.close();
     
     if (n==0){
     System.out.println ("impar %d, Par %d" +impar  +par);
   
        if (n%2==0){
    par++;}
        
         else {
         impar++; }
     }
     
  } while(n!=0);

   }}

    
       