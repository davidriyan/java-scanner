package com.project;
import java.util.Scanner;
public class Main{
    public static void main(String[]args) {

        //memasukkan input
        int nilai;
        String nama;
        Scanner scan = new Scanner(System.in);

        //memanggil input
        System.out.print("MASUKKAN NAMA = ");
        nama = scan.nextLine();
        System.out.print("MASUKKAN NILAI = ");
        nilai = scan.nextInt();

        //masukkan percabangan
        if (nilai >= 88){
            System.out.println(" SELAMAT " + nama + " ANDA DINYATAKAN LULUS");
        }
        else if (nilai >=50){
            System.out.println("SELAMAT " + nama + " ANDA DINYATAKAN LULUS");
            System.out.println("PI BOONG!");
        }
        else{
            System.out.println("TOLOL");
        }

        
        
    }
}