import java.util.ArrayList;
import java.util.Random;

public class SingletonProject {
    private static SingletonProject instance;
    private ArrayList<String> list;
    private Random random = new Random();

    private SingletonProject() {

    }

    public static synchronized SingletonProject getInstance() {
        if (instance == null) {
            instance = new SingletonProject();
        }
        return instance;
    }

    public void populate() {
        if (list == null) {
            list = new ArrayList<String>();
            for (int i = 0; i < 100; i++) {
                list.add(random.nextInt() % 2 == 0 ? "Pass" : "Fail");
            }
        }
    }

    public String get() {
        return list.get(random.nextInt(100));
    }

    public String change(int index, String value) {
        list.add(index, value);
        return list.get(index);
    }

}
