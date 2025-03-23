package Operation_2;
public class ContohDeletion {
    public static int[] deleteAtPosition(int[] arr, int pos) {
        // Membuat array baru dengan ukuran lebih kecil
        int[] newArr = new int[arr.length - 1];
        
        // Menyalin elemen sebelum posisi
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        
        // Menyalin elemen setelah posisi
        for (int i = pos + 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }
        
        return newArr;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int position = 2;

        // Memanggil fungsi penghapusan
        numbers = deleteAtPosition(numbers, position);

        // Menampilkan array setelah penghapusan
        System.out.print("Array setelah penghapusan: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}