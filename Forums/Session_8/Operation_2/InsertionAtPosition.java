package Operation_2;
public class InsertionAtPosition {
    public static int[] insertAtPosition(int[] arr, int newElement, int pos) {
        int[] newArr = new int[arr.length + 1];
        
        // Menyalin elemen sebelum posisi
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        
        // Menyisipkan elemen baru
        newArr[pos] = newElement;
        
        // Menyalin elemen setelah posisi
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        
        return newArr;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        int newElement = 15;
        int position = 1;

        numbers = insertAtPosition(numbers, newElement, position);

        System.out.print("Array setelah penyisipan: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}