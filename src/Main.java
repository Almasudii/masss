import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

// Kelas untuk merepresentasikan data mahasiswa
class Mahasiswa {
    String nim;
    String nama;
    int semester;

    // Konstruktor untuk inisialisasi objek Mahasiswa
    public Mahasiswa(String nim, String nama, int semester) {
        this.nim = nim;
        this.nama = nama;
        this.semester = semester;
    }

    // Override equals dan hashCode untuk membandingkan objek Mahasiswa
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Mahasiswa mahasiswa = (Mahasiswa) obj;
        return nim.equals(mahasiswa.nim) &&
                nama.equals(mahasiswa.nama) &&
                semester == mahasiswa.semester;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nim, nama, semester);
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat HashSet untuk menyimpan objek Mahasiswa (tidak mengizinkan duplikat)
        HashSet<Mahasiswa> setMahasiswa = new HashSet<>();

        // Menambahkan data mahasiswa ke dalam HashSet
        setMahasiswa.add(new Mahasiswa("11119", "Andi", 1));
        setMahasiswa.add(new Mahasiswa("11112", "Bima", 1));
        setMahasiswa.add(new Mahasiswa("11131", "Rahma", 3));
        setMahasiswa.add(new Mahasiswa("11198", "Zeno", 9));
        setMahasiswa.add(new Mahasiswa("11131", "Rahma", 3));
        setMahasiswa.add(new Mahasiswa("11119", "Andi", 1));

        // Membuat ArrayList baru dari HashSet (untuk menjaga urutan)
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>(setMahasiswa);

        // Menampilkan data mahasiswa setelah menghapus duplikat
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("NIM: " + mahasiswa.nim);
            System.out.println("Nama: " + mahasiswa.nama);
            System.out.println("Semester: " + mahasiswa.semester);
            System.out.println("--------------------");
        }
    }
}