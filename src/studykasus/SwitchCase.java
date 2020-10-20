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
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int angka;
        Scanner input = new Scanner(System.in);
        
        System.out.println("masukkan angka =");
        angka = input.nextInt();
        
        switch(angka){
            case 1:
                System.out.println("alat olahraga");
                break;
            case 2:
                System.out.println("alat elektronik");
                break;
            case 3:
                System.out.println("alat masak");
                break;
            default:
                System.out.println("anda salah memasukkan kode");
        }
        // TODO code application logic here
    }
    
}
