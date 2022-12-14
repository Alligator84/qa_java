import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionExceptionTest {

    @Mock
    Feline feline;

    @Test
    public void lionTest() {
        Exception exception = Assertions.assertThrows(Exception.class, () -> new Lion("", feline));
        Assertions.assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
    }
}