package Forum.encapsulation;

public class Main {
    public static void main(String[] args) {
        // Membuat objek AkunBank
        AkunBank akun = new AkunBank("12345", "Budi", 1000000);

        // Mengakses data melalui getter
        System.out.println("Nomor Rekening: " + akun.getNomorRekening());
        System.out.println("Nama Pemilik: " + akun.getNamaPemilik());
        System.out.println("Saldo Awal: " + akun.getSaldo());

        // Menggunakan method untuk mengubah data
        akun.deposit(500000);
        akun.withdraw(200000);
    }
}