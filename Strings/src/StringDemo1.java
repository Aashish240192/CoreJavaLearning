public class StringDemo1
{
    public static void main(String[] args)
    {

        String str1 = new String("Aashish");

        String str2 = "Aashish";

        System.out.println(str1);
        System.out.println(str1.hashCode());

        System.out.println(str2);
        System.out.println(str2.hashCode());


        System.out.println(str1==str2);

        System.out.println(str1.equals(str2));



    }


}
