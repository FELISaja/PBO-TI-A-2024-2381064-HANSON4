public class denganMethod {
    public static void main(String[] args) {
        int gajiPokok = 5000000;
        int tunjanganTransport = 500000;
        int tunjanganMakan = 300000;
        int bonus = 1000000;

        int totalPenghasilan = hitungTotalPenghasilan(gajiPokok, tunjanganTransport, tunjanganMakan, bonus);
        int pajak = hitungPajak(totalPenghasilan);
        int gajiBersih = hitungGajiBersih(totalPenghasilan, pajak);


        tampilkanDetailGaji(gajiPokok, tunjanganTransport, tunjanganMakan, bonus, pajak, gajiBersih);
    }

    public static int hitungTotalPenghasilan(int gajiPokok, int tunjanganTransport, int tunjanganMakan, int bonus) {
        return gajiPokok + tunjanganTransport + tunjanganMakan + bonus;
    }

    public static int hitungPajak(int totalPenghasilan) {
        return totalPenghasilan * 10 / 100;

    }
    public static int hitungGajiBersih(int totalPenghasilan, int pajak){
        return totalPenghasilan - pajak;
    }

    public static void tampilkanDetailGaji(int gajiPokok, int tunjanganTransport, int tunjanganMakan, int bonus, int pajak, int gajibersih) {
        System.out.println("gaji pokok : " + gajiPokok);
        System.out.println("tunjangan Transport :" + tunjanganTransport);
        System.out.println("tunjangan Makan : " + tunjanganMakan);
        System.out.println("bonus : " + bonus);
        System.out.println("pajak : " + pajak);
        System.out.println("Gaji bersih : " + gajibersih);
    }
}

