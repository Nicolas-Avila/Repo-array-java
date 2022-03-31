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
        int total=0;
       
        Scanner entrada=new Scanner(System.in);
                
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese el numero en la posicion: "+(i+1));
            num[i]=entrada.nextInt();
            total=num[1]+num[0];
        }
        System.out.println("el total es: "+total);
        
        
        
        
}
}