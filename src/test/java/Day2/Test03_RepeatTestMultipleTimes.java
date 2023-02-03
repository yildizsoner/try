package Day2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test03_RepeatTestMultipleTimes {
    // Testi tekrarlatmak istiyorsam?

    @RepeatedTest(5)
    void testSubString(){
        assertEquals("Java", "Java cok guzel".substring(0,4));
        System.out.println("testSubString () calisti");
    }

    @RepeatedTest(3)
    void testRepeated(){
        assertEquals(2,Math.addExact(1,1));
    }

    //
    Random rm = new Random();
    @RepeatedTest(5)
    @Disabled   //  Class tan calistirdigimiz zaman bu metodu calistirmaz...
    void TestMathAddExact() {
        int sayi1 = rm.nextInt(10);
        int sayi2 =rm.nextInt(10);
        assertEquals(sayi1+sayi2,Math.addExact(sayi1,sayi2));
        System.out.println("sayi1 : "+sayi1 + " sayi2 :"+sayi2  );
    }


}
