package Operation_1;
public class ContohTraversal {
    public static void main(String[] args) {
        int[] numbers = {7, 14, 23, 8, 16, 9};
        int evenCount = 0;

        // Traversal untuk menghitung elemen genap
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("Jumlah elemen genap: " + evenCount);
    }
}