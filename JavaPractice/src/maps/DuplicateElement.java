package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateElement
{


    public static void main(String[] args)
    {

        int[] arr = {3,5,4,3,2,2,1};

        Map<Integer,Integer> hm = new HashMap<>();


        for(int no: arr)
        {

            Integer count = hm.get(no);
            if(count==null)
            {
                hm.put(no,1);
            }
            else
            {
                count++;
                hm.put(no,count);
            }

        }

        System.out.print("Duplicate elements are : " );


        Set<Map.Entry<Integer,Integer>> entrySet = hm.entrySet();
        for(Map.Entry<Integer,Integer> entry : entrySet)
        {

            if(entry.getValue() > 1)
            {
                System.out.print(entry.getKey()+ " ");
            }
        }


    }
}
