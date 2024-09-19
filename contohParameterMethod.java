public class contohParameterMethod {
    public static int kaliDua(int angka ){
        return angka * 2;
    }
    public static double hitungLuasSegiTiga(double alas, double tinggi){
        return 0.5 * alas * tinggi;
    }

    public static void main(String[] args) {
        int hassilKaliDua = kaliDua(5);
        System.out.println("5 x 2 = " + hassilKaliDua);

        double luasSegiTiga = hitungLuasSegiTiga(5, 2);
        System.out.println("luas sigitiga = " + luasSegiTiga);
    }
}
