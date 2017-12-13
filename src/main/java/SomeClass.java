import com.google.common.base.Strings;

/**
 * Created by Denis Berezanskiy on 13.12.17.
 */
public class SomeClass {
    public static void main(String[] args) {
        String path = "ua/dp/skillsup/";
        path = Strings.repeat(path,2);
        System.out.println(path);
    }

}
