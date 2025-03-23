package Operation_1;
public class ContohLinearSearch {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 7, 15, 9, 20};
        int threshold = 10;
        int resultIndex = -1;

        // Linear search untuk menemukan elemen > 10
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > threshold) {
                resultIndex = i;
                break; // Berhenti setelah menemukan yang pertama
            }
        }

        if (resultIndex != -1) {
            System.out.println("Elemen pertama > 10 ditemukan pada indeks: " + resultIndex + " dengan nilai " + numbers[resultIndex]);
        } else {
            System.out.println("Tidak ada elemen yang lebih besar dari 10.");
        }
    }
}