import org.testng.Assert;
import org.testng.annotations.*;

public class SingletonProjectChangeTest extends Assert {
    private static SingletonProject st;


    @BeforeTest
    public static void setSt() {
        st = SingletonProject.getInstance();
        st.populate();
    }

    @Test
    @Parameters({"index", "value"})
    public static void testChange(int index, @Optional("test") String value) {
        assertEquals(st.change(index, value), "test");
    }
}
