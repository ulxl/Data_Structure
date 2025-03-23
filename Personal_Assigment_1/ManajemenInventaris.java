class Barang {
    String nama;
    int jumlahStok;
    double harga;
    
    // Konstruktor
    public Barang(String nama, int jumlahStok, double harga) {
        this.nama = nama;
        this.jumlahStok = jumlahStok;
        this.harga = harga;
    }
    
    // Method untuk menampilkan detail barang
    public void tampilkanDetail() {
        System.out.println("Nama: " + nama + ", Jumlah Stok: " + jumlahStok + 
                          ", Harga: " + harga);
    }
}

public class ManajemenInventaris {
    public static void main(String[] args) {
        // Membuat array dengan kapasitas 10
        Barang[] inventaris = new Barang[10];
        int jumlahBarang = 0; // Menyimpan jumlah barang yang sudah ditambahkan
        
        // Menambahkan 3 barang ke dalam inventaris
        inventaris[0] = new Barang("Pensil", 50, 200);
        inventaris[1] = new Barang("Buku", 30, 15000);
        inventaris[2] = new Barang("Penghapus", 20, 500);
        jumlahBarang = 3;
        
        // Menampilkan inventaris
        System.out.println("Inventaris Toko:");
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.print((i + 1) + ". ");
            inventaris[i].tampilkanDetail();
        }
    }
}