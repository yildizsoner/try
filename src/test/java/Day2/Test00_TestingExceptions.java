package Day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test00_TestingExceptions {

    //Test ettigimiz kodun bizim bekledigimiz exception i firlatma durumunu kontrol ediyoruz.

    @Test
    void testException () {
        String str ="Merhaba JUnit";

        assertThrows(NullPointerException.class, ()->{
            System.out.println("testException calisti");
            str.length();
        });
    }

    //Example: Bolme islemi
    @Test
    void testException2(){
        int sayi1 = 5;
        int sayi2 = 0;
        // parent i olan runtimeException i koysak da calisir.
        assertThrows(ArithmeticException.class,()->{
            System.out.println(sayi1/sayi2);
        });
    }

    @Test
    void testException3() {
        int sayi1 =1;
        int sayi2 =0;
        assertThrows(ArithmeticException.class, ()->divide(sayi1,sayi2));

    }

    //test exception3 de kullanilacak
    private int divide (int sayi1,int sayi2) {
        return sayi1/sayi2;

    }







}
