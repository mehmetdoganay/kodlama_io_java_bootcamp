public class Main {
    public static void main(String[] args) {
        //Bellekte Stack ve Heap adında 2 alan bulnur.
        // Stack Değer Tipleri tutar.
        //Heap ise referans Tipleri tutar.

        // claslar referans tiptir
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2= new CustomerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();


        // Diziler referans tiptir.
        int[] sayilar1 = new int[] {1,2,3};
        int[] sayilar2 = new int[] {4,5,6};
        //sayilar1 ve sayılar2 referans değerler alır.
        //sayılar1 stack alanda 101 referansındadır.
        //sayılar2 stack alanda 102 referansındadır.
        // aynı şekilde değerlerin tutulduğu heap alanda da bu referans numarası bilinir.
        // Bu değerlerden biri çağırılmak istenirse referans numarasına bakılırak çağırılır.
        // örn
        //sayılar1'in değerleri {1,2,3} heap alanda tutulur
        //sayılar1'in  ilk değeri çağırılırken kendi referansına ve heap alanda tutulan referansın aynı alup olmadığına bakar
        // Ve değer bu duruma göre çekilir.
        sayilar2 = sayilar1;
        //Burada sayılar2 sayılar1'in referans değerini almış oldu.
        //sayıalar2 102 idi sayılar1 101 idi
        //artık sayılar2 de 101 referansında sayılar1 de 101 referansında
        //artık sayılar2 yi çağırdığında 101 referansında bulunan {1,2,3} değerleri çağırılacak
        //Ee 102 referansındaki {4,5,6} ya neler oldu ?
        // O değerleri tutan başka bir referans olmadığı için heap bellekten silindiler.(GarbageCollaction)
        sayilar1[0] = 100;
        // Burada sayılar1 yani 101 referansındaki heap alanda tutulan {1,2,3}
        // değerlerinin ilk değerini 100 ile değiştir dedik son durum {100,2,3} oldu
        System.out.println(sayilar2[0]);
        //Burada da sayılar2 nin ilk değerini çağırdık.
        //Ee sayılar 2 de referans değeri olarak 101'i tutuyor.
        //Yani heap alanda tutulan 101'in son durumu bu idi {100,2,3}
        //sonuç olarakta çıktı 100 oluyor.

        // int değer tiptir stacte tutulur.
        // yani heap alanla bir işi yoktur.
        // sayi1 in değeri 10sa direk heap alanda 10 değeri tutulur.
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        //sayı2 sayı 1 in değerine eşitlenir ve sayı2 de artık 10 dur.
        sayi1 = 30;
        //sayı1 30 a eşitlenir.
        //Ama !!! sayı2ye hiç bir etkisi yoktur çünkü referans alanda değillerdir
        // ve programlama yuakrıdan aşşağıya doğru çalışır.
        //sayı2'nin değerini değiştirmek isterseniz
        // tekrardan sayı2 = sayı1 demen gerek
        System.out.println(sayi2);
        // çıktı 10
    }
}

