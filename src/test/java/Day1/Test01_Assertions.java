package Day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test01_Assertions {

    @Test
    public void test() { //main methodu olmadan  nasil calisti?
        //Junit icinde gomulu gelen main metodu kullaniliyor.
        //junit 5 ile beraber methodlarin public olarak belirtilme zorunlulugu kalkti.

    }

    // Genel test isimlendirmesinde --> "test" ile baslar.

    @Test
    public void testLength() { //String.length()
        String kelime = "Merhaba Dunya";   //13 karakter
        int anlikDeger = kelime.length();
        int beklenenDeger = 13;
        assertEquals(beklenenDeger,anlikDeger);

    }

    //Baska bir ornek:
    @Test
    public void testUpperCase() { //String.toUpperCase();
       String anlikDeger = "Merhaba".toUpperCase();
       String beklenenDeger ="MERHABA";
       //assertEquals(beklenenDeger,anlikDeger);
        //hata aninda kullaniciya mesaj gondermek icin:
        assertEquals(beklenenDeger,anlikDeger,"UpperCase() methodu duzgun calismadi");

    }
    //Diger ornek
    @Test
    void testToplama() { //Math.addExact()
        int sayi1 =10;
        int sayi2 =5 ;
        int anlikDeger = Math.addExact(sayi1,sayi2);
        int beklenenDeger = 15;
        assertEquals(beklenenDeger,anlikDeger);

    }

    //Ornek:
    @Test
    void testContains() {  // String.contains()
        assertEquals(false,"Mirac".contains("z"));

    }







}
