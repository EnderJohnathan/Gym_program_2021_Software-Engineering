import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class commend extends JFrame implements ActionListener{
    private JFrame j = new JFrame("Commend");

    private JTextArea t = new JTextArea();

    private JButton ensure = new JButton("Ensure");
    private JButton back = new JButton("Back");

    public commend(){
        j.setBounds(200,200,500,400);
        j.setLayout(null);
        
        t.setBounds(20,30,430,220);
        j.add(t);

        ensure.setBounds(75,280,150,50);
        j.add(ensure);
        ensure.addActionListener(this);
        
        back.setBounds(245,280,150,50);
        back.addActionListener(this);
        j.add(back);

        j.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == ensure){
            JOptionPane.showMessageDialog(null,"Commit complete!","Attention",
				JOptionPane.INFORMATION_MESSAGE);

            j.dispose();
        }

        if(e.getSource() == back){
            j.dispose();
        }
    }
}