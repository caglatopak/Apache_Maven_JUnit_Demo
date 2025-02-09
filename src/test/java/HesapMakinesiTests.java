import org.example.HesapMakinesi;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HesapMakinesiTests {


         @Test     // annotaions

              public void toplamaTesti() {

             HesapMakinesi hesapMakinesi = new HesapMakinesi();

             double toplamaSonucu = hesapMakinesi.toplama(1.5, 3.6);
             Assertions.assertEquals(5.1, toplamaSonucu);

         }
         @Test

             public void cikarmaTesti() {

             HesapMakinesi hesapMakinesi = new HesapMakinesi();

             double cikarmaSonucu = hesapMakinesi.cikarma(10, 5);
             Assertions.assertEquals(5, cikarmaSonucu);


         }

         @Test

              public void carpmaTesti() {

               HesapMakinesi hesapMakinesi = new HesapMakinesi();

               double carpmaSonucu = hesapMakinesi.carpma(10, 5);
               Assertions.assertEquals(50, carpmaSonucu);
    }

         @Test

              public void bolmeTesti() {

              HesapMakinesi hesapMakinesi = new HesapMakinesi();

              double bolmeSonucu = hesapMakinesi.bolme(10, 5);
              Assertions.assertEquals(2, bolmeSonucu);
    }


}
