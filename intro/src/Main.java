public class Main {
    // Kod başlangıcı anlamında.
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // değişken isimlendirmeleri java'da camelCase yazılır !!
        String kucukVeri  = "Metin verisi tutar.";
        String buyukMetin = "Vade Süresi";

        System.out.println(buyukMetin);

        //integer
        int vade = 12;

        double dolarDun = 15.3232;
        double dolarBugun = 16.80;

        boolean dolarDustumu = true;

        String okYonu = "down.svg";

        if (dolarBugun < dolarDun)
        {
            dolarDustumu = true;
        } else {
            dolarDustumu = false;
        }

        if (dolarDustumu){
            System.out.println("down.svg");
        }else {
            System.out.println("up.svg");
        }

        //array

        String[] krediler = {"Hızlı kredi","Maaşı halkbankta olanlar","Mutlu Emekli"};

        for (int i = 0; i < krediler.length; i++)
        {
            System.out.println(krediler[i]);
        }
    }
}
