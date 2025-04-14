
public class Aritmatika {

    public void hitungPenjumlahan(int a, int b) {
        int nilai = a + b;
        System.out.println("nilai penjumlahan adalah : " + nilai);
        
        // penambahan kode
        // hitungPerkalian(a, b);
    }

    public static void hitungPerkalian(int a, int b) {
        int nilai = a * b;
        System.out.println("nilai perkalian adalah : " + nilai);

        // instansiasi agar hitungPenjumlahan dapat dijalankan
        // new Aritmatika().hitungPenjumlahan(a, b);

        // error saat ditambahkan
        // hitungPenjumlahan(a, b);
    }

    public static void hitungPengurangan(int a, int b) {
        int nilai = a - b;
        System.out.println("nilai pengurangan adalah : " + nilai);
    }

    public double hitungPembagian(String nil, String nil2) {
        double angka1 = Double.parseDouble(nil);
        double angka2 = Double.parseDouble(nil2);
        return angka1 / angka2;
    }
}
