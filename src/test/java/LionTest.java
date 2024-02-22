import com.example.Lion;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

@RunWith(Parameterized.class)
public class LionTest {

    String sex;
    boolean hasMane;

    @Mock
    Feline feline;

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    public LionTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Test
    public void checkGetKittensCount() throws Exception {
        Lion lion = new Lion(sex, feline);
        Mockito.when(feline.getKittens()).thenReturn(3);
        Assert.assertEquals(3, lion.getKittens());
    }

    @Test
    public void checkDoesHaveMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        String errMessage = "Используйте допустимые значения пола животного - самец или самка";
        Assert.assertEquals(errMessage, hasMane, lion.doesHaveMane());
    }

    @Test
    public void checkGetFood() throws Exception {
        Lion lion = new Lion(sex, feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        Assert.assertEquals(expectedFood, lion.getFood());

    }

}



