package Forum.inheritance;
// Superclass
class PerangkatRumahTangga {
    String merek;
    int dayaListrik; // dalam watt

    // Constructor
    public PerangkatRumahTangga(String merek, int dayaListrik) {
        this.merek = merek;
        this.dayaListrik = dayaListrik;
    }

    // Method untuk menampilkan informasi dasar
    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Daya Listrik: " + dayaListrik + " watt");
    }
}

// Subclass
class KipasAngin extends PerangkatRumahTangga {
    int jumlahBilah; // jumlah bilah kipas

    // Constructor
    public KipasAngin(String merek, int dayaListrik, int jumlahBilah) {
        super(merek, dayaListrik); // Memanggil constructor superclass
        this.jumlahBilah = jumlahBilah;
    }

    // Method tambahan khusus untuk KipasAngin
    public void tampilkanInfoKipas() {
        tampilkanInfo(); // Memanggil method dari superclass
        System.out.println("Jumlah Bilah: " + jumlahBilah);
    }
}

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        KipasAngin kipas = new KipasAngin("Panasonic", 50, 3);
        kipas.tampilkanInfoKipas();
    }
}