package basics_03202025;

public class ArrayDemo1
{

    public static void main(String[] args)
    {

        int[] numbers = {10,20,30,40,60};

        System.out.println(numbers.length);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        String[] items = {"Milk","Bread","Butter","Cheese","Chips"};

        for (int i = 0; i < items.length; i++)
        {
            System.out.println(items[i]);

        }


        String[] students = new String[5];
        students[0]="Aashish";
        students[1]="Avinash";
        students[2]="Ayush";
        students[3]="Abhishek";
        students[4]="Aryan";
        System.out.println(students.length);

        for (String student : students)
        {
            System.out.println(student);
        }





    }
}
