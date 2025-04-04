import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class NotepadEditor implements ActionListener
{

    JFrame jf;
    JMenuBar menuBar;
    JMenu file,edit,format,view, help;
    JMenuItem neww, open, save, saveAs, exit ,undo,cut,copy,paste,delete,searchwithbing,
            find,findNext,findPrevious,replace,gotto,selectAll,timedate,wordwrap,font;
    JTextArea jTextArea;
    JScrollPane jScrollPane;
    ImageIcon icon;

    public NotepadEditor()
    {

        try
        {
            // Set cross-platform Java L&F (also called "Metal")
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }


         jf = new JFrame("Untitled - Notepad");

         icon = new ImageIcon("src/images.png");
         jf.setIconImage(icon.getImage());
         jf.setSize(500,500);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jf.setLocationRelativeTo(null);


         menuBar = new JMenuBar();

         file = new JMenu("File");
         neww = new JMenuItem("New");
         neww.addActionListener(this);
         file.add(neww);

         open = new JMenuItem("Open");
         open.addActionListener(this);
         file.add(open);

         save = new JMenuItem("Save");
         save.addActionListener(this);
         file.add(save);


         saveAs = new JMenuItem("SaveAs");
         saveAs.addActionListener(this);
         file.add(saveAs);

         file.addSeparator();

         exit = new JMenuItem("Exit");
         exit.addActionListener(this);
         file.add(exit);

         menuBar.add(file);

         edit = new JMenu("Edit");
         undo = new JMenuItem("Undo");
         undo.addActionListener(this);
         edit.add(undo);

         edit.addSeparator();

         cut = new JMenuItem("Cut");
         cut.addActionListener(this);
         edit.add(cut);


         copy = new JMenuItem("Copy");
         copy.addActionListener(this);
         edit.add(copy);


         paste = new JMenuItem("Paste");
         paste.addActionListener(this);
         edit.add(paste);

         delete = new JMenuItem("Delete");
         delete.addActionListener(this);
         edit.add(delete);

         edit.addSeparator();

         searchwithbing = new JMenuItem("Search with Bing...");
         searchwithbing.addActionListener(this);
         edit.add(searchwithbing);


         find = new JMenuItem("Find...");
         find.addActionListener(this);
         edit.add(find);

         findNext = new JMenuItem("Find Next");
         findNext.addActionListener(this);
         edit.add(findNext);

         findPrevious = new JMenuItem("Find Previous");
         findPrevious.addActionListener(this);
         edit.add(findPrevious);

         replace = new JMenuItem("Replace");
         replace.addActionListener(this);
         edit.add(replace);

         gotto = new JMenuItem("Go To...");
         gotto.addActionListener(this);
         edit.add(gotto);

         edit.addSeparator();

         selectAll = new JMenuItem("SelectAll");
         selectAll.addActionListener(this);
         edit.add(selectAll);

         timedate = new JMenuItem("Time/Date");
         timedate.addActionListener(this);
         edit.add(timedate);

         menuBar.add(edit);

         format = new JMenu("Format");
         wordwrap = new JMenuItem("Word Wrap");
         wordwrap.addActionListener(this);
         format.add(wordwrap);

         font = new JMenuItem("Font...");
         font.addActionListener(this);
         format.add(font);



         menuBar.add(format);


         view = new JMenu("View");
         menuBar.add(view);

         help = new JMenu("Help");
         menuBar.add(help);

         jTextArea = new JTextArea();
         jScrollPane = new JScrollPane(jTextArea);
         jf.add(jScrollPane);







         jf.setVisible(true);

         jf.setJMenuBar(menuBar);






    }

    public static void main(String[] args)
    {

        new NotepadEditor();



    }


    @Override
    public void actionPerformed(ActionEvent e)
    {

        if(e.getSource()==neww)
        {
            newNotePadFile();
        }

        if(e.getSource()==open)
        {
            openFile();
        }

    }

    public void setTitle(String title)
    {
        jf.setTitle(title);

    }

    public void newNotePadFile()
    {
        String str = jTextArea.getText();
        if(!str.equals(""))
        {

            int i = JOptionPane.showConfirmDialog(jf,"Do you want to save this file");

            if(i==0)
            {

                System.out.println("File Saved");
            }
            else if (i==1)
            {
                jTextArea.setText("");

            }


        }
    }


    public void openFile()
    {

        JFileChooser jFileChooser = new JFileChooser();
        int i = jFileChooser.showOpenDialog(jf);

        if(i==0)
        {

              File fileio = jFileChooser.getSelectedFile();

              try
              {
                  FileInputStream fis = new FileInputStream(fileio.getAbsolutePath());
                  int data;
                  while ((data=fis.read()) != -1)
                  {
                      jTextArea.append(String.valueOf((char)data));
                  }

                  setTitle(fileio.getName());

              }



              catch (Exception e)
              {
                  e.printStackTrace();
              }



        }
        else
        {
            JOptionPane.showMessageDialog(jf,"Please select one file");

        }

    }
}
