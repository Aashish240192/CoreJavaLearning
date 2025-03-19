public class StringMethods5
{
    public static void main(String[] args)
    {


        String name1 = "Aashish";
        String newname1 = name1.replace("s","o");
        System.out.println(newname1);

        CharSequence newname2 = name1.replace("ash","o");
        System.out.println(newname2);

        String newname3 = name1.replaceFirst("h","p");
        System.out.println(newname3);

        String newname4 = name1.replaceAll("h","p");
        System.out.println(newname4);



        

    }


}
