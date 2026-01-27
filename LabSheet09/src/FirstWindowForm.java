import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstWindowForm {
    private JPanel winform;
    private JLabel lbl_firstname;
    private JLabel lbl_lastname;
    private JTextField txt_firstname;
    private JTextField txt_lastname;
    private JButton btn_submit;
    private JButton btn_reset;
    private JFrame jFrame;

    public FirstWindowForm(){
        jFrame = new JFrame();
        jFrame.setContentPane(winform);
        jFrame.setTitle("My First Window");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(300,200);

        //ตั้งค่าตำแหน่งปรากฏเวลากดเปิดโปรแกรม null = กลางจอ
        jFrame.setLocationRelativeTo(null);

        jFrame.setVisible(true);

        btn_submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (txt_firstname.getText().isEmpty() || txt_lastname.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please fill in your First Name or Last Name","WARNING",JOptionPane.WARNING_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(null,"Hello! " + txt_firstname.getText() + " " + txt_lastname.getText());
                }

            }
        });
        btn_reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_firstname.setText(null);
                txt_lastname.setText(null);

            }
        });
    }

    public static void main(String[] args) {

        new FirstWindowForm();

    }

}
