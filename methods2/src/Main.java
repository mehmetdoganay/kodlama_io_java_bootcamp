public class Main {
    public static void main(String[] args) {

        int toplam = topla(5,8);
        System.out.println(toplam);

        int toplam2 = topla2(2,4,6,7,4,2,6,8,1231,1312,567,567);
        System.out.println("Topla2 : "+ toplam2);

        String sehir = sehirGetir();
        System.out.println(sehir);
    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle(){
        System.out.println("Güncellendi");
    }

    public static int topla(int num1, int num2) {

        return num1 + num2;
    }

    // int'ın yanına üç nokta (...) koyduğunda bu sayılar değişkenini bir diziye çevirir.
    // Ve istediğiniz kadar değer verilebilir.
    public static int topla2(int... sayilar){
        int toplam = 0;
        for (int sayi :sayilar)
        {
            toplam += sayi;
        }
        return toplam;
    }

    public static String sehirGetir()
    {
        return "Ankara";
    }
}
