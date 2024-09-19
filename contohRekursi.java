public class contohRekursi {
    public static int faktorial(int nilaiFaktorial){
        if (nilaiFaktorial == 0 ){
            return 1;
        } else {
            return nilaiFaktorial * faktorial( nilaiFaktorial - 1);
        }
    }

    public static void main(String[] args) {
        int hasil = faktorial(5);
        System.out.println("faktorial dari 5 adalah : " + hasil);
    }
}
