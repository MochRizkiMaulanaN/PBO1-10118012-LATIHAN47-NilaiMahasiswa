/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaimahasiswa;

/**
 *
 * @author LENOVO
 */
public class Mahasiswa {
    public double NilaiUts;
    public double NilaiUas;
    public double quiz;
    public double Na;
  
    public double hitungNa(double quiz,double nilaiUts,double nilaiUas){
         Na = ((20*quiz)/100) + ((30*nilaiUts)/100) + ((50*nilaiUas)/100);
         return Na;
    }
    
    public void cetak(double Na){
       
        
        if ((Na >= 80) && (Na <=100)) {
            
             System.out.println("Indeks = A");
             System.out.println("Keterangan = Sangat Baik");
        }else
         if ((Na >= 68) && (Na <=80.0)) {
            
            System.out.println("Indeks = B");
            System.out.println("Keterangan = Baik"); 
        }else
         if ((Na >= 56.0) && (Na <=68.0)) {
            
            System.out.println("Indeks = C");
            System.out.println("Keterangan = Cukup ");
        }else
         if ((Na >= 45.0) && (Na <=56.0)) {
            
            System.out.println("Indeks = D");
            System.out.println("Keterangan = Kurang ");
        }else{
             
            System.out.println("Indeks = E");
            System.out.println("Keterangan = Sangat Kurang ");
         }
    }
}
