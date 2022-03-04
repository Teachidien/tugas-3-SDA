import java.util.LinkedList;

public class tugaslagi {
    public static void main(String[] args) {
        LinkedList<String> nama_mahasiswa = new LinkedList<String>();
        LinkedList<String> nim = new LinkedList<String>();
        LinkedList<String> alamat = new LinkedList<String>();

        nama_mahasiswa.add("Muhammad Satria Gemilang Lubis");
        nim.add("2111522008");
        alamat.add("Jalan Imam Bonjol ");
        System.out.println("Nama Mahasiswa : " + nama_mahasiswa);
        System.out.println("NIM : " + nim);
        System.out.println("Alamat : " + alamat);
        System.out.println("");

        System.out.println("Menambahkan Data Mahasiswa : ");
        // menambahkan nama mahasiswa
        nama_mahasiswa.addFirst("Ilham");
        nama_mahasiswa.add("Amin");
        nama_mahasiswa.add("Zaki");
        nama_mahasiswa.addLast("Ariq");
        System.out.println("Nama Mahasiswa : " + nama_mahasiswa);

        // menambahkan nomor induk mahasiswa
        nim.addFirst("2111521021");
        nim.add("2111523006");
        nim.add("2111523015");
        nim.addLast("2111522009");
        System.out.println("NIM : " + nim);

        // menambahkan alamat mahasiswa
        alamat.addFirst("Jalan Sendirian");
        alamat.add("Jalan Bareng Dia");
        alamat.add("Jalan Bareng Kamu");
        alamat.addLast("Jalan Jalan");
        System.out.println("Alamat : " + alamat);
        System.out.println("");

        System.out.println("Menghapus Data Mahasiswa : ");
        // menghapus nama mahasiswa
        nama_mahasiswa.removeFirst();
        nama_mahasiswa.remove();
        nama_mahasiswa.removeLast();
        System.out.println("Nama Mahasiswa : " + nama_mahasiswa);

        // menghapus nomor induk mahasiswa
        nim.removeFirst();
        nim.remove();
        nim.removeLast();
        System.out.println("NIM : " + nim);

        // menghapus alamat mahsiswa
        alamat.removeFirst();
        alamat.remove();
        alamat.removeLast();
        System.out.println("Alamat : " + alamat);
        System.out.println("");

        System.out.println("Menyisipkan Data Mahasiswa : ");
        // menyisipkan nama mahasiswa
        nama_mahasiswa.set(0, "Ikhlas");
        System.out.println("Nama Mahasiswa : " + nama_mahasiswa);

        // menyisipkan nomor induk mahasiswa
        nim.set(0, "2111523014");
        System.out.println("NIM : " + nim);

        // menyisipkan alamat mahasiswa
        alamat.set(0, "Jalan Bareng Kamu");
        System.out.println("Alamat : " + alamat);
        System.out.println("");

        System.out.println("Mencari Data Mahasiswa : ");
        // mencari nama mahasiswa
        System.out.println("Nama Mahasiswa : " + nama_mahasiswa.getFirst());
        System.out.println("Nama Mahasiswa : " + nama_mahasiswa.getLast());
        System.out.println("");

        // mencari nomor induk mahasiswa
        System.out.println("NIM : " + nim.getFirst());
        System.out.println("NIM : " + nim.getLast());
        System.out.println("");

        // mencari alamat mahasiswa
        System.out.println("Alamat : " + alamat.getFirst());
        System.out.println("Alamat : " + alamat.getLast());
        System.out.println("");
    }
}