/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan39.objekorientednilaiterbesardanterkecil.java;

import java.util.Scanner;

/**
 *
 * @author Aero
 *NAMA     : Irman Novryansah
 *KELAS    : IF-1
 *NIM      : 10118018
 *Deskripsi Program : Program ini untuk menampilkan tampilan nilai terbesar dan 
 *                     terkecil
 */
public class Latihan39ObjekOrientedNilaiTerbesardanTerkecilJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mahasiswa mhs1 = new Mahasiswa();
        Scanner scn = new Scanner(System.in);
        
        int bykMah;
        String nama;
        System.out.println
        ("========Program Nilai Terbesar dan Terkecil nilai Mahasiswa========");
        System.out.print("Masukkan Nama Petugas : ");
        nama = scn.nextLine();
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        bykMah = scn.nextInt();
        mhs1.inputNilai(mhs1.nilai, bykMah);
        mhs1.tampilBesarKecil(mhs1.nilai, bykMah);
        
        System.out.println("\n"+"Petugas : " + nama);

    }
    
}
