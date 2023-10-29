/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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

        System.out.print("Masukkan jumlah nilai: ");
        int jumlahNilai = input.nextInt();

        if (jumlahNilai <= 0) {
            System.out.println("Tidak ada nilai yang dimasukkan.");
            return;
        }

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 1; i <= jumlahNilai; i++) {
            System.out.print("Masukkan nilai ke-" + i + ": ");
            int nilai = input.nextInt();

            if (nilai < minValue) {
                minValue = nilai;
            }

            if (nilai > maxValue) {
                maxValue = nilai;
            }
        }

        System.out.println("Nilai terkecil: " + minValue);
        System.out.println("Nilai terbesar: " + maxValue);

        input.close();
    }
    
}
