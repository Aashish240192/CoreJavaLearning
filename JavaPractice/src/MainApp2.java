import java.util.Arrays;
import java.util.Scanner;

public class MainApp2
{
    public static void main(String[] args)
    {


        String[] students = {"Yash","Bishal","Aashish","Sneha","Ayushman","Pooja"};
        Arrays.sort(students);
        for (String stu : students)
        {
            System.out.println(stu);
        }


    }

}
