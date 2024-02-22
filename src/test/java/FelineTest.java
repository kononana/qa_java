import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    Feline feline = new Feline();

   @Test
    public void checkGetFamily(){
       Assert.assertEquals("Кошачьи", feline.getFamily());
   }
    @Test
    public void checkEatMeat() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }
    @Test
    public void checkGetKittensParametrized(){
       Assert.assertEquals(3, feline.getKittens(3));
    }
    @Test
    public void checkGetKittensWithoutParams(){
       feline.getKittens();
       Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }

}




