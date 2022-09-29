public class Main {
    public static void main(String[] args) {

        int toplam = topla(5,8);
        System.out.println(toplam);

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

    public static String sehirGetir()
    {
        return "Ankara";
    }
}
