package Forum.encapsulation;

public class AkunBank {
    private String nomorRekening;
    private double saldo;
    private String namaPemilik;

    public AkunBank(String nomorRekening, String namaPemilik, double saldoAwal) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        if (saldoAwal >= 0) {
            this.saldo = saldoAwal;
        } else {
            this.saldo = 0;
        }
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        if (namaPemilik != null && !namaPemilik.trim().isEmpty()) {
            this.namaPemilik = namaPemilik;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposit(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Deposit berhasil. Saldo sekarang: " + saldo);
        } else {
            System.out.println("Jumlah deposit harus positif!");
        }
    }

    public void withdraw(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil. Saldo sekarang: " + saldo);
        } else {
            System.out.println("Penarikan gagal: Jumlah tidak valid atau saldo kurang!");
        }
    }
}