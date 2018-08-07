/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheretance;

/**
 *
 * @author lenovo
 */
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
//        instance of class
        Game gameA = new Game("", "", "");
        Game gameB = new Game("", "", "");
//        menu
        while(true) {
        System.out.println("======================");
        System.out.println("MENU GAMES");
        System.out.println("======================");
        System.out.println("1. Input Game A");
        System.out.println("2. Input Game B");
        System.out.println("3. Lihat data Game");
        System.out.println("4. Keluar");
        System.out.println("======================");
//        input
        System.out.print("Masukkan pilihan = ");
        int pilih = Integer.parseInt(br.readLine());
        
        System.out.println();
//        proses + output
        switch(pilih) {
            case 1 :
                System.out.println("======================");
                System.out.println("INPUT GAME A");
                System.out.println("======================");
                System.out.print("Masukkan kode = ");
                String kode = br.readLine();
                System.out.print("Masukkan nama = ");
                String nama = br.readLine();
                System.out.print("Masukkan lisensi = ");
                String lisensi = br.readLine();
                
                gameA = new Game(kode, nama, lisensi);
                
                System.out.println();
                
                System.out.println("### Data Game A telah disimpan ###");
                break;
            case 2 :
                System.out.println("======================");
                System.out.println("INPUT GAME B");
                System.out.println("======================");
                System.out.print("Masukkan kode = ");
                kode = br.readLine();
                System.out.print("Masukkan nama = ");
                nama = br.readLine();
                System.out.print("Masukkan lisensi = ");
                lisensi = br.readLine();
                
                gameB = new Game(kode, nama, lisensi);
                
                System.out.println();
                
                System.out.println("### Data Game B telah disimpan ###");
                break;
            case 3 :
                System.out.println("======================");
                System.out.println("DATA GAMES");
                System.out.println("======================");
                
                
                System.out.println("GAME A");
                System.out.println("Kode Game A = " + gameA.getKode());
                System.out.println("Nama Game A = " + gameA.getNama());
                System.out.println("Lisensi Game A = " + gameA.getLisensi());
                System.out.println("Jenis Game A = " + gameA.getJenis());
                System.out.println("Tipe Game A = " + gameA.getTipe());
                
                System.out.println();
                
                System.out.println("GAME B");
                System.out.println("Kode Game B = " + gameB.getKode());
                System.out.println("Nama Game B = " + gameB.getNama());
                System.out.println("Lisensi Game B = " + gameB.getLisensi());
                System.out.println("Jenis Game B = " + gameB.getJenis());
                System.out.println("Tipe Game B = " + gameB.getTipe());
                
                System.out.println("======================");
                break;
            default :
                System.exit(0);
        }
    }   
}
}