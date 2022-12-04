import com.example.Cat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Cat cat;

    @Test
    public void getFoodTest() throws Exception {
        List<String> list;
        list = cat.getFood();
        Mockito.verify(cat).getFood();
    }
}
