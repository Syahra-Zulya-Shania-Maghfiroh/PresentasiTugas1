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
public class KomisiSalesman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pembeli;
        int jasa, komisi, upah = 0, jual;
        Scanner input = new Scanner(System.in);
        
        System.out.println("---<<<Penjualan Laptop>>>---");
        jual = input.nextInt();
        
        if (jual <= 200000){
            System.out.println(jasa = 10000);
            System.out.println(komisi = jual *10/100);
            System.out.println("jadi upah yang didapatkan =" );
            System.out.println(upah = jasa + komisi); }
        
        else if (jual > 200000){
            System.out.println(jasa = 20000);
            System.out.println(komisi = jual *15/100);
            System.out.println("jadi upah yang didapatkan =" );
            System.out.println(upah = jasa + komisi);}
        
        else if (jual > 500000){
            System.out.println(jasa = 30000);
            System.out.println(komisi = jual *20/100);
            System.out.println("jadi upah yang didapatkan =" );
            System.out.println(upah = jasa + komisi);{
        }   

                }
    }
    
}
