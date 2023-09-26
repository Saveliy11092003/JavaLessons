package Generic1;

import java.util.Arrays;
import java.util.List;

public class Test_SomeTypes {
    public static void main(String[] args) {
        SomeTypes<?> someTypes = new SomeTypes<>();
        List<String> list = Arrays.asList("value","dva");
        someTypes.test(list);
    }
}
