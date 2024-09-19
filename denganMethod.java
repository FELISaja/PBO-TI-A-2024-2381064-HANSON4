public class denganMethod {
    public static void main(String[] args) {
        int gajipokok = 5000000;
        int tunjangaTransport = 500000;
        int tunjanganMakan = 300000;
        int bonus = 1000000;

        int totalpenghasilan = hitungtotalpenghasilan(gajipokok,tunjangaTransport,tunjanganMakan, bonus);
        int pajak = hitungpajak(totalpenghasilan);
        int gajiBersih = hitungGajiBersih(totalpenghasilan, pajak);

        tampilkandetailgaji(gajipokok, tunjangaTransport, tunjanganMakan, bonus,pajak, gajiBersih);
    }
    public static int hitungtotalpenghasilan(int gajipokok, int tunjanganTransport, int tunjanganMakan, int bonus){
        return gajipokok+ tunjanganTransport + tunjanganMakan + bonus;
    }
    public static int hitungpajak(int totalpenghasilan){
        return totalpenghasilan * 10 / 100;

    }
    public static int hitungGajiBersih(int gajipokok, int tunjanganTransport, int tunjanganMakan, int bonus, int pajak, int gajibersih){
        System.out.println("gaji pokok : " + gajipokok);
        System.out.println("tunjangan Transport :" + tunjanganTransport);
        System.out.println("tunjangan Makan : " + tunjanganMakan);
        System.out.println("bonus : " + bonus);
        System.out.println("pajak : " + pajak);
        System.out.println("Gaji bersih : " + gajibersih);
    }
}
