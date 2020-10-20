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
public class PotonganHarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] laptop = {"ASUS","MACBOOK","ACER","HP"};
        int [] harga = {6500000, 12000000, 8000000, 9500000};
        String nama, tanggal;
        int totalbelanja, hargadiskon, totalbayar, kembalian, bayar;
        int pilihan;
        Scanner input = new Scanner(System.in);
        System.out.println("---<<<Laptop Store>>>---");
        System.out.println("===Rincian===");
        for (int a=0; a<harga.length;a++){
            System.out.println(a + ". " +laptop[a] + " = Rp, " +harga[a]);
        }
        System.out.println("===Nota Pembelian===");
        System.out.println("Nama = ");
        nama = input.nextLine();
        System.out.println("Tanggal = ");
        tanggal = input.nextLine();
        System.out.println("Pilihanku adalah ");
        pilihan = input.nextInt();
        System.out.println("Laptop yang Dipilih = " +laptop[pilihan]);
        
        System.out.println("Total Belanja = Rp; " );
        totalbelanja = input.nextInt();
        System.out.println("Total Belanja = Rp; " +harga[pilihan]);
        System.out.println("Masukkan Uang anda = ");
        bayar = input.nextInt();
        
        if (totalbelanja >= 9000000) {
            System.out.println("Selamat Anda Mendapat Diskon Sebesar 8%");
            hargadiskon = harga[pilihan]*8/100;
            System.out.println("Anda Mendapat Diskon ");
            kembalian = bayar - (harga[pilihan]-hargadiskon);
            System.out.println("Kembalian Anda Sebesar = " + kembalian);
        }
        else {
            kembalian = bayar-harga[pilihan];
            System.out.println("Kembalian Anda Sebesar = " + kembalian);
    }
       
       System.out.println("----------------");
       System.out.println("Terima Kasih");
       System.out.println("Silahkan Datang Kembali");
    }
   
        }
    
    

