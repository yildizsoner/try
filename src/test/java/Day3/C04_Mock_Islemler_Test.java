package Day3;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class C04_Mock_Islemler_Test {

    @Test
    void islemler(){
        C04_Mock_Islemler dummyObject = Mockito.mock(C04_Mock_Islemler.class);

        dummyObject.guncelleOgrenci("Ahmet");
        dummyObject.silOgrenci("Mehmet");
        dummyObject.ekleOgrenci("Yasir");

        //metodlar cagrilmis mi kontrol edelim
        verify(dummyObject).ekleOgrenci("Yasir");
        verify(dummyObject).guncelleOgrenci("Ahmet");
        verify(dummyObject).guncelleOgrenci("Mehmet");


    }
    // methodun kac kere cagrildigini test edelim
    @Test
    void testKacDefaCagrildi() {
        C04_Mock_Islemler dummyObject2 = Mockito.mock(C04_Mock_Islemler.class);

        dummyObject2.ekleOgrenci("Ahmet");
        dummyObject2.ekleOgrenci("Ahmet");
        //dummyObject2.ekleOgrenci("Mehmet");

        verify(dummyObject2,times(2)).ekleOgrenci("Ahmet");
        // kemal parametresi ile ekleOgrenci() metodu ile hic cagrilmama durumunu kontrol etmek istiyorsak
        verify(dummyObject2,times(0)).ekleOgrenci("Kemal");
        //herhangi bir parametre ile hic cagrilmayan method :
        verify(dummyObject2,never()).silOgrenci(anyString());
        //metodun en az 2 defa cagrildigi durumu test edelim.
        verify(dummyObject2, atLeast(2)).ekleOgrenci("Ahmet");

    }

    //metodlarin cagrilma sirasini test edebiliriz.
    @Test
    void testSirasiniKontrol() {
        C04_Mock_Islemler dummyObject3 =Mockito.mock(C04_Mock_Islemler.class);

        dummyObject3.ekleOgrenci("Ahmet");
        dummyObject3.ekleOgrenci("Huseyin");
        dummyObject3.silOgrenci("Ahmet");

        InOrder inOrder = inOrder(dummyObject3);

        inOrder.verify(dummyObject3).ekleOgrenci("Ahmet");
        inOrder.verify(dummyObject3).ekleOgrenci("Huseyin"); // sirali olmazsa hata verir.
        inOrder.verify(dummyObject3).silOgrenci("Ahmet");

    }

}
