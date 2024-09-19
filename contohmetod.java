public class contohmetod {
    public static int hitungluaspersegi(int sisi){
        return sisi*sisi;
    }

    public static void main(String[] args) {
        int sisi = 10;
        int luas = hitungluaspersegi(sisi);
        System.out.println("Luas persegi dengan sisi " + sisi + "adalah" + luas);

    }
}
