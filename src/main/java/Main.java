import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> number = new ArrayList<>(Arrays.asList(1,3,2,4,5,6));

        Iterator<Integer> iterator = number.iterator();
        while (iterator.hasNext()){
            int i = iterator.next();
            if (i%2 == 0)
                System.out.println(i);
            else
                iterator.remove();
        }


    }
}
