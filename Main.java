package tugaspertemuan6;
/**
 *
 * @author Jidan Ainul Mutaqin
 */

class Segitiga {
    double alas;
    double tinggi;
    double sisi;

    // Konstruktor
    public Segitiga(double alas, double tinggi, double sisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    // Method luas
    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    // Method keliling
    public double getKeliling() {
        return 3 * sisi;
    }
}

public class Main {
    public static void main(String[] args) {
        // Inisialisasi nilai untuk alas, tinggi, dan sisi segitiga
        double alas1 = 1;
        double tinggi1 = 1;
        double sisi1 = 1;

        double alas2 = 30;
        double tinggi2 = 10;
        double sisi2 = 90;

        double alas3 = 20;
        double tinggi3 = 30;
        double sisi3 = 60;

        // Membuat tiga objek segitiga
        Segitiga segitiga1 = new Segitiga(alas1, tinggi1, sisi1);
        Segitiga segitiga2 = new Segitiga(alas2, tinggi2, sisi2);
        Segitiga segitiga3 = new Segitiga(alas3, tinggi3, sisi3);

        // Menghitung luas dan keliling menggunakan method getLuas dan getKeliling
        double luas1 = segitiga1.getLuas();
        double keliling1 = segitiga1.getKeliling();

        double luas2 = segitiga2.getLuas();
        double keliling2 = segitiga2.getKeliling();

        double luas3 = segitiga3.getLuas();
        double keliling3 = segitiga3.getKeliling();

        // Menampilkan output luas dan keliling segitiga
        System.out.println("Segitiga 1:");
        System.out.println("Luas segitiga: " + luas1);
        System.out.println("Keliling segitiga: " + keliling1);

        System.out.println("\nSegitiga 2:");
        System.out.println("Luas segitiga: " + luas2);
        System.out.println("Keliling segitiga: " + keliling2);

        System.out.println("\nSegitiga 3:");
        System.out.println("Luas segitiga: " + luas3);
        System.out.println("Keliling segitiga: " + keliling3);
    }
}
