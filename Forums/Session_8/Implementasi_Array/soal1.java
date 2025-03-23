package Implementasi_Array;
public class soal1 {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array integer dengan elemen
        int[] angka = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Menampilkan elemen array
        for (int i = 0; i < angka.length; i += 2) {
            System.out.println("Indeks " + i + ": " + angka[i]);
        }
    }
}