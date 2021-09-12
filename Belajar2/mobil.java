package Belajar2;

public class mobil {
    String merek = "BMW";
    String warna;
    int harga;
    int jarak;
    int waktu;

    void jalan(){
        System.out.println("Berjalan dengan " +merek);
        System.out.println("Berwarna " +warna);
        System.out.println("Harga nya "+harga);
    }
    int JarakTempuh(){
        int JarakTempuh = jarak *waktu;
        return JarakTempuh;

    }

    int berat(int tinggi,int besar){
        return tinggi * besar;
    }
}
