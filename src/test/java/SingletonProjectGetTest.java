import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class SingletonProjectGetTest extends TestNG {
    private static SingletonProject st;

    @BeforeTest
    public static void setSt() {
        st = SingletonProject.getInstance();
        st.populate();
    }

    @Test
    public static void testGet() throws Exception {
        assertTrue(st.get().contains("ass"));

    }
}
