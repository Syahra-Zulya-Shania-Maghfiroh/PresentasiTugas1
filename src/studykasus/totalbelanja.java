/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studykasus;


import java.util.Scanner;
public class totalbelanja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String NomorTransaksi, Tanggal;
        Double HargaSapu, TotalPembayaran,Kembalian;
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("<<<__Toko Serbaguna__>>>");
        System.out.println("Nomor Traksaksi = ");
        NomorTransaksi = input.nextLine();
        
        System.out.println("Tanggal = ");
        Tanggal = input.nextLine();
        System.out.println("Sapu =");
        HargaSapu = input.nextDouble();        
        
        
       
        HargaSapu = 13.000;
       
        
        
        System.out.println("Total Harga =");
        TotalHarga = input.nextDouble();
       
        System.out.println("Total Pembayaran =");
        TotalPembayaran = input.nextDouble();
        
        TotalPembayaran = (HargaSapu) *HargaSapu;
        
        System.out.println("Kembalian =");
        Kembalian = input.nextDouble();
        
        Kembalian = TotalPembayaran - TotalHarga;
        
        System.out.println("<<<__Nota Pembayaran__>>>");
        System.out.println("Nomor Transaksi = " + NomorTransaksi);
        System.out.println("Tanggal = " + Tanggal);
        System.out.println("Total Harga = " + TotalHarga);
        System.out.println("Total Pembayaran = " + TotalPembayaran);
        System.out.println("Kembalian = " + Kembalian);
        
        
        
        // TODO code application logic here
    }
    
}
