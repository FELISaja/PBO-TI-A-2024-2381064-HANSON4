public class contohOverLoading {
    public static double hitungLuas(double sisi){
        return sisi * sisi;
    }
    public static double hitungLuas(double panjang, double lebar){
        return panjang * lebar;
    }
    public static double hitungluas(double jarijari, boolean islisngkaran){
        if (islisngkaran){
            return Math.PI * jarijari * jarijari;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        double luasPersegi = hitungLuas(5);
        System.out.println("luas persegi : " + luasPersegi);

        double luasPersegiPanjang = hitungLuas(4, 6);
        System.out.println("luas persegi panjang : " + luasPersegiPanjang);

        double luasLingkaran = hitungluas(4, true);
        System.out.println("luas lingkaran : " + luasLingkaran);
    }

}
