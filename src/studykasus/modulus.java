/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studykasus;

import java.util.Scanner;

/**
 *
 * @author MOKLET-01
 */
public class modulus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int b;
        
        Scanner input=new Scanner (System.in);
        
        System.out.println("Masukkan nilai a =");
        a = input.nextInt();
        System.out.println("Masukkan nilai b =");
        b = input.nextInt();
        int c = a%b;
        
        System.out.println("Hasil modulus =" + c);
       
        // TODO code application logic here
    }
    
}
