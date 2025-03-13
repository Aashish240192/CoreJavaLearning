import javax.swing.*;

public class AashishTicTacToeGame
{

    public AashishTicTacToeGame()
    {
        JFrame jFrame = new JFrame("Tic Tac Toe Game");
        jFrame.setSize(300,300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);


        JButton jButton1 = new JButton("X");
        jButton1.setBounds(50,50,50,50);
        jFrame.add(jButton1);



        JButton jButton2 = new JButton("0");
        jButton2.setBounds(50,100,50,50);
        jFrame.add(jButton2);

        JButton jButton3 = new JButton("X");
        jButton3.setBounds(50,150,50,50);
        jFrame.add(jButton3);

        JButton jButton4 = new JButton("0");
        jButton4.setBounds(100,50,50,50);
        jFrame.add(jButton4);

        JButton jButton5 = new JButton("0");
        jButton5.setBounds(100,100,50,50);
        jFrame.add(jButton5);

        JButton jButton6 = new JButton("X");
        jButton6.setBounds(100,150,50,50);
        jFrame.add(jButton6);

        JButton jButton7 = new JButton("X");
        jButton7.setBounds(150,50,50,50);
        jFrame.add(jButton7);

        JButton jButton8 = new JButton("0");
        jButton8.setBounds(150,100,50,50);
        jFrame.add(jButton8);

        JButton jButton9 = new JButton("0");
        jButton9.setBounds(150,150,50,50);
        jFrame.add(jButton9);




        jFrame.setVisible(true);

    }
    public static void main(String[] args)
    {

        //MainApp3 obj = new MainApp3();
        //obj.openFrame();
        new AashishTicTacToeGame();




    }
}
