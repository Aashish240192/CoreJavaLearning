import javax.swing.*;

public class MainApp2
{
    public static void main(String[] args)
    {


        JFrame jFrame = new JFrame("Login Frame");
        jFrame.setSize(600,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);


        JLabel jLabel = new JLabel("Enter Name : ");
        jLabel.setBounds(100,100,100,40);
        jFrame.add(jLabel);

        JTextField jTextField = new JTextField();
        jTextField.setBounds(200,100,200,40);
        jFrame.add(jTextField);




        jFrame.setVisible(true);

    }
}
