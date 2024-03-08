import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PruebaTest {
    @Test
    public void test01(){
        var list = new ArrayList<>();
        list.add("Hola");
        list.add("Mundo");
        assertTrue(list.contains("Hola"));
    }
}
