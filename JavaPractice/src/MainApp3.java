import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MainApp3
{
    public static void main(String[] args)
    {

        List list = new ArrayList();
        list.add(50);
        list.add(10);
        list.add("Aashish");
        list.add(2,40);
        System.out.println(list);

        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }





    }

}
