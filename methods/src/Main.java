public class Main {
    public static void main(String[] args) {
        // called sayiBulmaca's method
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1,4,6,8,4,8,9};
        int aranacak = 10;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak){
                varMi = true;
                break;
            }
        }

        if (varMi){
            mesajVer(aranacak);
        }
        else {
            System.out.println("Sayı mevcu değil " + aranacak);
        }
    }

    public static void mesajVer(int mesaj) {
        System.out.println("Sayı mevcuttur : " + mesaj);
    }
}
