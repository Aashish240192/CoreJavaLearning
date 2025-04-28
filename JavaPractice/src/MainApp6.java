
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MainApp6
{
    public static void main(String[] args) throws InterruptedException
    {

        Set<String> set = new TreeSet<>();
        set.add("EEE");
        set.add("GGG");
        set.add("BBB");
        set.add("DDD");
        set.add("CCC");
        set.add("AAA");
        set.add("FFF");
        set.add("HHH");

        Iterator itr = set.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
            Thread.sleep(1000);
        }



        System.out.println(set);

    }

}
