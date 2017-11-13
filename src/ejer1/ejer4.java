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
public class ejer4 {
    public static void main(String[] args) {
        
        
        int n, suma=0 , cont=0;
        
        Scanner teclado;
		teclado = new Scanner(System.in);
               
                
                System.out.println("Introduce un valor:");
                 n = teclado.nextInt();
		teclado.close();
                
                while (n>cont){
                
                int a=n ;
                suma=suma+a;
                cont++;
                
                }
           System.out.println("la suma es" +suma);     
}}
