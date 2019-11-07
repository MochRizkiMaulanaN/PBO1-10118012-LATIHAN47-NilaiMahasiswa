/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaimahasiswa;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class NIlaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();
        
        System.out.print("Quiz : ");
        double q = input.nextDouble();
        System.out.print("UTS : ");
        double uts = input.nextDouble();
        System.out.print("UAS : ");
        double uas = input.nextDouble();
        System.out.println("Nilai Akhir : "+mhs.hitungNa(q, uts, uas));
        System.out.println("");
        mhs.cetak(mhs.hitungNa(q, uts, uas));
        
    }
    
}
