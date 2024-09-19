public class contoMethodStasticDanNonStatic {
    public static double hitungLuasPersegi(double sisi){
        return sisi*sisi;
    }

    public static void main(String[] args) {
        double luasPersegi = contoMethodStasticDanNonStatic.hitungLuasPersegi(20);
        System.out.println("laus persegi: " + luasPersegi);

        contoMethodStasticDanNonStatic object = new contoMethodStasticDanNonStatic();
        object.tampilkanPesanSelamatdatang("Felicia Anastasya Ketaren");

    }

    public void tampilkanPesanSelamatdatang(String nama) {
        System.out.println("SelamatDatang,  " + nama + "!");

    }
}
