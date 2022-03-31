/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vector;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*vector de 10 numeros cargarlo, mostrarlo numero mayor numero menor la suma de todos }
        promedio de todos sus numeors */
        
        int num[] = new int[10];
       
        Scanner entrada=new Scanner(System.in);
                
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el numero numero"+(i+1));
            num[i]=entrada.nextInt();
            
        }
        
        
    }
    
}
