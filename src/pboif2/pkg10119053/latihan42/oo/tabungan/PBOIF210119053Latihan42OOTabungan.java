/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan42.oo.tabungan;

import data.Tabungan;
import java.util.Scanner;
/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program tabungan
 */
public class PBOIF210119053Latihan42OOTabungan {

    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal      : ");
        int saldoAwal = input.nextInt();
        Tabungan tabungan = new Tabungan(saldoAwal);
        
        System.out.print("Jumlah uang yang diambil : ");
        int ambil = input.nextInt();
        
        System.out.println("Saldo Anda Sekarang      : " + tabungan.ambilUang(ambil));
                
    }
    
}
