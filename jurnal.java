import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class jurnal {
    public static void main(String[] args) {
        Map<String, Double> nilaiMahasiswa = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Input Nilai Mahasiswa");
            System.out.println("4. Tampilkan Nilai Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            int menu = scanner.nextInt();
            scanner.nextLine(); 

            if (menu == 1) {
                System.out.print("Masukkan NIM: ");
                String nim = scanner.nextLine();
                System.out.print("Masukkan kelas: ");
                String kelas = scanner.nextLine();
                System.out.print("Masukkan nama mahasiswa: ");
                String nama = scanner.nextLine();
                nilaiMahasiswa.put(nim + " " + kelas + " " + nama, 0.0);
            } else if (menu == 2) {
                System.out.print("Masukkan NIM mahasiswa yang akan dihapus: ");
                String nim = scanner.nextLine();
                System.out.print("Masukkan kelas mahasiswa yang akan dihapus: ");
                String kelas = scanner.nextLine();
                System.out.print("Masukkan nama mahasiswa yang akan dihapus: ");
                String nama = scanner.nextLine();
                nilaiMahasiswa.remove(nim + " " + kelas + " " + nama);
            } else if (menu == 3) {
                System.out.print("Masukkan NIM mahasiswa: ");
                String nim = scanner.nextLine();
                System.out.print("Masukkan kelas mahasiswa: ");
                String kelas = scanner.nextLine();
                System.out.print("Masukkan nama mahasiswa: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan nilai mahasiswa: ");
                double nilai = scanner.nextDouble();
                scanner.nextLine(); 
                nilaiMahasiswa.put(nim + " " + kelas + " " + nama, nilai);
            } else if (menu == 4) {
                if (nilaiMahasiswa.isEmpty()) {
                    System.out.println("Belum ada data mahasiswa.");
                } else {
                    System.out.println("Nilai Mahasiswa:");
                    double totalNilai = 0;
                    for (Map.Entry<String, Double> entry : nilaiMahasiswa.entrySet()) {
                        System.out.println(entry.getKey() + " - Nilai: " + entry.getValue());
                        totalNilai += entry.getValue();
                    }
                    double rataRata = totalNilai / nilaiMahasiswa.size();
                    System.out.println("Rata-rata Nilai Mahasiswa: " + rataRata);
                }
            } else if (menu == 5) {
                break;
            } else {
                System.out.println("Menu tidak valid.");
            }
        }

        scanner.close();
    }
}