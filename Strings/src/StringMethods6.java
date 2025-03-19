public class StringMethods6
{
    public static void main(String[] args)
    {


        String name1 = "Aashish Anand";

        int index1  = name1.indexOf('s');
        System.out.println(index1);

        int index2 = name1.indexOf('p');
        System.out.println(index2);

        int index3 = name1.lastIndexOf('h');
        System.out.println(index3);

        boolean b = name1.contains("shi");
        System.out.println(b);

        boolean n = name1.contains("hsa");
        System.out.println(n);

        char ch1= name1.charAt(6);
        System.out.println(ch1);

        boolean m = name1.startsWith("Aa");
        System.out.println(m);

        boolean j = name1.endsWith("ph");
        System.out.println(j);


    }


}
