public class EncapsulationDemo1
{

    private String username;
    private String email;
    private String password;
    private int emp_id;
    private String city;

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public int getEmp_id()
    {
        return emp_id;
    }

    public void setEmp_id(int emp_id)
    {
        this.emp_id = emp_id;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getUserName(String username)
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username=username;
    }







    public static void main(String[] args)
    {

        EncapsulationDemo1 ensc = new EncapsulationDemo1();

        String user_name = ensc.getUserName("aashish24019");




    }



}
