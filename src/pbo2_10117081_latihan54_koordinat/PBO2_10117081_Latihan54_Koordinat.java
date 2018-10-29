/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan54_koordinat;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Memperlihatkan koordinat warna berdasarkan koordinat x dan y
 */
public class PBO2_10117081_Latihan54_Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WarnaKoordinat warkor = new  WarnaKoordinat(0,0,"");
        warkor.setNamaWarna("Jingga");
        warkor.setX(10);
        warkor.setY(4);
        System.out.println("Warna Koordinat : " + warkor.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + warkor.getX() + ", y : " 
                            + warkor.getY());
    }
    
}
