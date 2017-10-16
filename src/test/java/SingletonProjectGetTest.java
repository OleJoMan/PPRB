import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SingletonProjectGetTest extends Assert {
    private static SingletonProject st;

    @BeforeTest
    public static void setSt() {
        st = SingletonProject.getInstance();
        st.populate();
    }

    @Test
    public static void testGet() throws Exception {
        assertEquals(st.get().replaceAll("[^ass]", ""), "ass");
    }
}
