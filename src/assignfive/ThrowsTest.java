package assignfive;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsTest {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("myfiledoesnotexist.txt"); // should throw exception
        FileInputStream stream = new FileInputStream(file);
    }
}
