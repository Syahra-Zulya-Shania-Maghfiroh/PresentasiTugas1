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
public class Grade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nama, kelas;
        int NIS;
        char grade;
        final double quiz1, quiz2, quiz3, tugas1, tugas2, uts, nilaiakhir;
        Scanner input = new Scanner(System.in);
        
        System.out.println("---<<<Perhitungan Nilai>>>---");
        System.out.println("Nama    : ");
        nama = input.nextLine();
        System.out.println("Kelas   : ");
        kelas = input.nextLine();
        System.out.println("NIS : ");
        NIS = input.nextInt();
        
        System.out.println("====Masukkan Nilai====");
        System.out.println("Quiz 1 = ");
        quiz1 = input.nextInt();
        System.out.println("Quiz 2 = ");
        quiz2 = input.nextInt();
        System.out.println("Quiz 3 = ");
        quiz3 = input.nextInt();
        System.out.println("Tugas 1 = ");
        tugas1 = input.nextInt();
        System.out.println("Tugas 2 = ");
        tugas2 = input.nextInt();
        System.out.println("UTS = ");
        uts = input.nextInt();
        
        nilaiakhir=(0.15 * quiz1 + 0.15 * quiz2 + 0.15 * quiz3 + 0.20 * tugas1 + 0.20 * tugas2 + 0.15 * uts);
        if (nilaiakhir > 90) {
            grade = 'A';
        }
        else if (nilaiakhir > 80) {
            grade = 'B';
        }
        else if (nilaiakhir > 70) {
            grade = 'C';
        }
        else if (nilaiakhir > 60) {
            grade = 'D';
        }
        else {
            grade = 'E';
        }
        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println("Siswa Atas Nama " + nama + " Kelas " + kelas + " dengan NIS " + NIS + " Memiliki nilai akhir " + nilaiakhir + "(" + grade + ")" + " Dinyatakan Naik Kelas");
        }
        else {
            System.out.println("Siswa Atas Nama " + nama + " Kelas " + kelas + " dengan NIS " + NIS + " Memiliki nilai akhir " + nilaiakhir + "(" + grade + ")" + " Dinyatakan Tidak Naik Kelas");
        }
        }
        
        }
   
        
    

    

