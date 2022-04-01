/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vector;

import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class Main2 {
    public static void main(String[] args) {
        /*vector de 10 numeros cargarlo, mostrarlo numero mayor numero menor la suma de todos }
        promedio de todos sus numeors */
        
        int num[] = new int[10];
        int total=0, mayor=0,menor=10000,promedio=0, cant=0;
       
        Scanner entrada=new Scanner(System.in);
                
        for (int i = 0; i < 3; i++) {
            
            System.out.println("Ingrese el numero en la posicion: "+(i+1));
            num[i]=entrada.nextInt();
            total+=num[i];
            
              cant++;    
            }
        promedio = total / cant;
        mayor=num[0];
        menor=num[0];
        for (int i = 0; i < 3; i++) {
                   
         if (num[i]>mayor) {
            mayor=num[i];
            }
            if(menor>num[i]){
                menor=num[i];
            }
            
            
        }
        
        
        System.out.println("el total es: "+total);
        System.out.println("el mayor es: "+mayor);
        System.out.println("el menor es: "+menor);
        System.out.println("el promedio es "+promedio);
        
        
        
         
}
}