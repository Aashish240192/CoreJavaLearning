public class StringMethods1
{
    public static void main(String[] args)
    {

        String name1 = "Aashish";
        String name2 = "  ";

        int length = name1.length();
        System.out.println(length);

        boolean b = name1.isEmpty();
        System.out.println(b);

        boolean c = name2.isEmpty();
        System.out.println(c);

        boolean a = name1.isBlank();
        System.out.println(a);

        boolean d = name2.isBlank();
        System.out.println(d);


        String str1 = "My Name is Aashish";
        String newstr1 = str1.trim();
        System.out.println(newstr1);


        String str2 = "  My   Name   is    Aashish  ";
        String newstr2 = str2.trim();
        System.out.println(newstr2);




    }


}
