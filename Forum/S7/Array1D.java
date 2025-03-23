public class Array1D {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi langsung
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Menampilkan isi array
        System.out.println("Isi array:");
        for(int num : numbers) {
            System.out.println(num);
        }
        
        // Menampilkan panjang array
        System.out.println("Panjang array: " + numbers.length);
    }
}