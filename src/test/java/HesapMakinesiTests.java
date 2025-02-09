import org.example.HesapMakinesi;
import org.junit.jupiter.api.*;

public class HesapMakinesiTests {

    HesapMakinesi hesapMakinesi;// nesne olusturuldu

             @BeforeAll // bu annotations ile yazilan methodun hepsi static olmalidir. ayni sekilde @afterall annotations nida static olmalidir
                        // bu kelime ile testelerden once 1 kez calistirilir
             public static void setupClass(){
                 System.out.println("setupClss metodu calistirildi");

             }

             @BeforeEach  // her testten once bu metodun ilk calistirilmasi gerektigini belirtir

                  public void setup(){

                 hesapMakinesi = new HesapMakinesi();

                 System.out.println("setup metodu calistirildi");

    }


         @Test     // annotations // bunun bir test oldugunu belirtir

              public void toplamaTesti() {

            // hesapMakinesi = new HesapMakinesi();

             double toplamaSonucu = hesapMakinesi.toplama(1.5, 3.6);
             Assertions.assertEquals(5.1, toplamaSonucu);

         }
        // @Disabled("cikarma isleminde bug mevcut duzeltme olduktan sonra aktif hale getirilecektir") // bu kelime ile bu test gecici olarak pasif hale getirilmistr
         @Test
             public void cikarmaTesti() {

            // hesapMakinesi = new HesapMakinesi();

             double cikarmaSonucu = hesapMakinesi.cikarma(10, 5);
             Assertions.assertEquals(5, cikarmaSonucu);


         }

         @Test

              public void carpmaTesti() {

             // hesapMakinesi = new HesapMakinesi();

              double carpmaSonucu = hesapMakinesi.carpma(10, 5);
              Assertions.assertEquals(50, carpmaSonucu);
    }

         @Test

              public void bolmeTesti() {

             // hesapMakinesi = new HesapMakinesi();

              double bolmeSonucu = hesapMakinesi.bolme(10, 5);
              Assertions.assertEquals(2, bolmeSonucu);
    }


    @AfterEach // her testen sonra 1 kez calisirilir

    public void teardown (){ // teardown ismi kapatmak anlamina gelir kapanis genelde bu isimle adlandirilir

        System.out.println("teardown metodu calistirildi");
    }


   @AfterAll // tum testlker kosulduktan sonra 1 kez calistirili

    public static void teardownClass(){
       System.out.println("teardownClass metodu calistirildi");
   }


    // debug = hata ayiklamasi= breakpoint kullanarak orayi calistirip ordaki hatayi bulabiliriz.

}
