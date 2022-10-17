import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame {
    final private Font mainfont=new Font("Segoe print",Font.BOLD,18);
    JTextField First_data,Sec_data;
    JLabel Show_data;
    public void initialize(){
        JLabel lblFirstName=new JLabel("Data1");
        lblFirstName.setFont(mainfont);
        
        First_data=new JTextField();
        First_data.setFont(mainfont);
        
        JLabel lblLastName=new JLabel("Data 2");
        lblLastName.setFont(mainfont);

        Sec_data=new JTextField();
        Sec_data.setFont(mainfont);

        JPanel formJPanel=new JPanel();
        formJPanel.setLayout(new GridLayout(4,1,5,5));
        formJPanel.add(lblFirstName);
        formJPanel.add(First_data);
        formJPanel.add(lblLastName);
        formJPanel.add(Sec_data);

        Show_data =new JLabel();
        Show_data.setFont(mainfont);

        JButton btnOK=new JButton("Generate Result");
        btnOK.setFont(mainfont);
        btnOK.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String FirstName=First_data.getText();
                String lastName=Sec_data.getText();
                Show_data.setText("This is the result "+FirstName+" "+lastName);
            }
            
        });

        JButton btnClear=new JButton("Clear");
        btnClear.setFont(mainfont);
        btnClear.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                First_data.setText("");
                Sec_data.setText("");
                Show_data.setText("");
            }
            
        });

        JPanel buttonsPanel=new JPanel();
        buttonsPanel.setLayout(new GridLayout(1,2,5,5));
        buttonsPanel.add(btnOK);
        buttonsPanel.add(btnClear);



        JPanel mainpanel = new JPanel();
        mainpanel.setLayout(new BorderLayout());
        mainpanel.setBackground(new Color(128,128,255));
        mainpanel.add(formJPanel,BorderLayout.NORTH);
        mainpanel.add(Show_data,BorderLayout.CENTER);
        mainpanel.add(buttonsPanel,BorderLayout.SOUTH);

        add(mainpanel);




        setTitle("First project");
        setSize(500,600);
        setMinimumSize(new Dimension(300,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
        
    }
    
}
