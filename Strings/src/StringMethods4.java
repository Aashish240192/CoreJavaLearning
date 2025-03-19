public class StringMethods4
{
    public static void main(String[] args)
    {

        String line = "My name is Aashish";

        String newline1 =  line.substring(3);
        System.out.println(newline1);

        String newline2 = line.substring(11,18);
        System.out.println(newline2);

        CharSequence newline3 = line.subSequence(11,18);
        System.out.println(newline3);



        

    }


}
