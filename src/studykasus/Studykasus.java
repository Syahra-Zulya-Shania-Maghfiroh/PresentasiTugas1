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
public class Studykasus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int BungaMawar, BungaMelati, BungaMatahari;
        Double HargaBunga, TotalBayar;
        Scanner input=new Scanner (System.in);
        
        
        System.out.println("<<<___Toko Bunga___>>>");
        System.out.println("Total Bunga Mawar = ");
        BungaMawar=input.nextInt();
        System.out.println("Total Bunga Melati = ");
        BungaMelati=input.nextInt();
        System.out.println("Total Bunga Matahari = ");
        BungaMatahari=input.nextInt();
        
        HargaBunga=4500.0;
        TotalBayar= (BungaMawar+BungaMelati+BungaMatahari) *HargaBunga;
        
        System.out.println("<<<___Nota pembelian___>>>");
        System.out.println("Total yang Harus Dibayar = " + TotalBayar);
        
       boolean hasil1 = BungaMawar>BungaMelati;
       System.out.println("Bunga Mawar > Bunga Melati " + hasil1);
       System.out.println("pembelian bunga mawar lebih banyak dari bunga melati " + hasil1);
       boolean hasil2 = BungaMawar>BungaMatahari;
       System.out.println("Bunga Mawar > Bunga Matahari " + hasil2);
       System.out.println("pembelian bunga mawar lebih banyak dari bunga matahari " + hasil2);
       boolean hasil3 = BungaMelati<BungaMatahari;
       System.out.println("Bunga melati < Bunga Matahari " + hasil3);
       System.out.println("pembelian bunga melati lebih sedikit dari bunga matahari " + hasil3);
       
        // TODO code application logic here
    }
    
}
