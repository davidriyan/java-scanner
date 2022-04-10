package com.project;
import java.util.Scanner;

public class Main{
public static void main (String[]args){

    //MASUKKAN INPUT
    int nilai;
    String nama;
    Scanner scan = new Scanner(System.in);

    //MENGAMBIL INPUT
    System.out.print("MASUKKAN NAMA ANDA = ");
    nama = scan.nextLine();
    System.out.print("MASUKKAN NILAI ANDA = ");
    nilai = scan.nextInt();

    //MASUKKAN PERCABANGAN
    if (nilai >= 80){
        System.out.println("SELAMAT " + nama + " ANDA DINYATAKAN LULUS");
    }else{
        System.out.println("MOHON MAAF " + nama + " ANDA DINYATAKAN TIDAK LULUS");
    }
}
}