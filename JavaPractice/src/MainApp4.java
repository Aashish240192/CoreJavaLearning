
import java.util.HashSet;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class MainApp4
{
    public static void main(String[] args)
    {

        MainApp4 obj = new MainApp4();
        System.out.println(obj);
        System.out.println(obj.hashCode());


        Set set = new HashSet<>();
        set.add(20);
        set.add(50);
        set.add("Aashish");
        set.add(null);
        set.add(40);
        set.add(70);
        set.add(60);
        set.add(80);
        set.add(80);

        System.out.println(set);


        Queue queue = new PriorityQueue();
        queue.offer(null);
        queue.offer(10);

        System.out.println(queue);

    }

}
