package maps;

import java.util.HashMap;
import java.util.Map;

public class MainApp1
{
    public static void main(String[] args)
    {

        Map<Integer,String> map = new HashMap<>();

        map.put(101,"Aashish");
        map.put(102,"Alok");
        map.put(103,"Avinash");
        map.put(104,"Balram");
        map.put(105,"Klaus");



        for (Map.Entry entry : map.entrySet())
        {
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }



        System.out.println(map);


        System.out.println(map.size());

        System.out.println(map.get(102));

        System.out.println(map.isEmpty());

        System.out.println(map.values());

        System.out.println(map.keySet());






    }
}
