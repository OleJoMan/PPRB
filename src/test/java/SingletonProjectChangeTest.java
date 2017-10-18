import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.*;

import static org.testng.AssertJUnit.assertEquals;

public class SingletonProjectChangeTest extends TestNG {
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
