import com.example.AlexLion;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

public class AlexLionTest {

    @Mock
    Feline feline;
    private AlexLion alexLion;

    @Before
    public void setAlexLion() throws Exception {
        alexLion = new AlexLion(feline);
    }
    @Test
    public void checkGetPlaceOfLiving() throws Exception {
        Assert.assertEquals("Нью-Йоркский зоопарк", alexLion.getPlaceOfLiving());
    }

    @Test
    public void checkGetFriends() {
        Assert.assertEquals(List.of("зебра Марти", "бегемотиха Глории", "жираф Мелман"), alexLion.getFriends());
    }

    @Test
    public void checkGetKittens() throws Exception {
        Assert.assertEquals(0, alexLion.getKittens());
    }
}



