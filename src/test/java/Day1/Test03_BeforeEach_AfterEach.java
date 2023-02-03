package Day1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Test03_BeforeEach_AfterEach {

    //Baslangicta testin ihtiyac duydugu dataya ilk degerlerini vermek icin kullanilir.
    String str ;

    @BeforeEach
    void beforeEach() {
        str= "Junit5 ile test yazmak cok kolay";
        System.out.println("beforeEach() calisti");
    }

    @AfterEach
    void afterEach() {
        str="";
        System.out.println("afterEach() calisti");
    }

    @Test
    void testArrays(TestInfo info) {
        String[]  anlikDizi =str.split(" ");
        String[] beklenenDizi = {"Junit5","ile","test","yazmak","cok","kolay"};
        System.out.println(info.getDisplayName() + " calisti");
        assertTrue(Arrays.equals(beklenenDizi,anlikDizi));
    }

    @Test
    void testStringLength (TestInfo info) {
        int anlikDeger = str.length();
        int beklenenDeger = 32;
        assertEquals(beklenenDeger,anlikDeger);
        System.out.println(info.getDisplayName() +" calisti ");
    }

}
