public class StringDemo2
{
    public static void main(String[] args)
    {

        String str1 = new String("Aashish");

        String str2 = "Avinash";

        String str3 = new String("Aashish");

        String str4 = "Avinash";

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

        System.out.println(str1==str3);
        System.out.println(str2==str4);







    }


}
