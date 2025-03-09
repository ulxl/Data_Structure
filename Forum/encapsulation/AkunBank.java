package Forum.encapsulation;

public class AkunBank {
    // Atribut private untuk enkapsulasi
    private String nomorRekening;
    private double saldo;
    private String namaPemilik;

    // Constructor
    public AkunBank(String nomorRekening, String namaPemilik, double saldoAwal) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        if (saldoAwal >= 0) {
            this.saldo = saldoAwal;
        } else {
            this.saldo = 0;
        }
    }

    // Getter untuk nomor rekening
    public String getNomorRekening() {
        return nomorRekening;
    }

    // Getter untuk nama pemilik
    public String getNamaPemilik() {
        return namaPemilik;
    }

    // Setter untuk nama pemilik dengan validasi
    public void setNamaPemilik(String namaPemilik) {
        if (namaPemilik != null && !namaPemilik.trim().isEmpty()) {
            this.namaPemilik = namaPemilik;
        }
    }

    // Getter untuk saldo
    public double getSaldo() {
        return saldo;
    }

    // Method untuk deposit
    public void deposit(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Deposit berhasil. Saldo sekarang: " + saldo);
        } else {
            System.out.println("Jumlah deposit harus positif!");
        }
    }

    // Method untuk withdraw
    public void withdraw(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil. Saldo sekarang: " + saldo);
        } else {
            System.out.println("Penarikan gagal: Jumlah tidak valid atau saldo kurang!");
        }
    }
}