import java.util.ArrayList;
import java.util.Collection;

class CollectionUtils {

    public static Collection<Integer> pow2(Collection<Integer> numbers) {
        Collection<Integer> pow = new ArrayList<>();
        for (Integer value : numbers) {
            int power = value * value;
            pow.add(power);
        }
        return numbers;
    }
}