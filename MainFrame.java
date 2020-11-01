import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class  MainFrame extends JFrame{
    private Container cp;
    private JTextField jtf = new JTextField("0");
    private JPanel jpanl1 = new JPanel(new GridLayout(4,4,3,3));
    private JButton jbtns[] = new JButton[16];
    private String btnLabel[] = {"7","8","9","-","4","5","6","+","1","2","3",".","0","*","/","="};
    private float v1,v2;

    public MainFrame(){ 
        init();
    }
    private void init(){

        this.setBounds(200,200,250,300);
        cp = this.getContentPane();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp.setLayout(new BorderLayout(5,5));
        jtf.setEditable(false);
        jtf.setHorizontalAlignment(JTextField.RIGHT);
        // jtf.setFont(new Font("Times New Roman"Font.BOLD,20));
        cp.add(jtf,BorderLayout.NORTH);

        jpanl1.setLayout(new GridLayout(5,4,3,3));

        cp.add(jpanl1,BorderLayout.CENTER);

        for(int i=0;i<16;i++){
            jbtns[i]= new JButton(btnLabel[i]);
            jpanl1.add(jbtns[i]);
            jbtns[i].addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    JButton tmpBtn = (JButton)ae.getSource();
                    // jlb.setText(tmpBtn.getText());
                }

            });

        }

    }

}