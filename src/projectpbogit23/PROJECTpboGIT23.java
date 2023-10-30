/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
NAMA : FAJAR KRISDIANTORO 
NIM  : 22205004
PRODI: TI REG SORE
*/
package projectpbogit23;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class PROJECTpboGIT23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa====");
        
        System.out.print("Masukan Nama Petugas: ");
        String namapetugas = input.nextLine();
        
        System.out.print("Masukkan Banyaknya nilai Mahasiswa: ");
        int banyakMahasiswa = input.nextInt();
        
        int[] nilaiMahasiswa = new int[banyakMahasiswa];
       
        // Meminta nilai-nilai mahasiswa
        for (int i = 0; i < banyakMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = input.nextInt();
        }


         // Mencari nilai terbesar dan terkecil
        int nilaiTerbesar = nilaiMahasiswa[0];
        int nilaiTerkecil = nilaiMahasiswa[0];

        for (int i = 1; i < banyakMahasiswa; i++) {
            if (nilaiMahasiswa[i] > nilaiTerbesar) {
                nilaiTerbesar = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerkecil) {
                nilaiTerkecil = nilaiMahasiswa[i];
            }
        }
        // Menampilkan hasil
        System.out.println("====Hasil Nilai Mahasiswa====");
        for (int i = 0; i < banyakMahasiswa; i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i + 1) + ": " + nilaiMahasiswa[i]);
        }
        
        System.out.println("Nilai terkecil: " + nilaiTerbesar);
        System.out.println("Nilai terbesar: " + nilaiTerkecil);

        System.out.println("Petugas: "+ namapetugas);
        input.close();
    }
    
}
