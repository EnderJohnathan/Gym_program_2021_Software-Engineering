import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CoachPage extends JFrame implements ActionListener{
    private JFrame j = new JFrame("Coach home page");
    private JTextField t1 = new JTextField();
    private JTextField t2 = new JTextField();
    private JButton WriteButton1 =new JButton("Write");
    private JButton WriteButton2 =new JButton("Write");
    public static void main(String[] args) {
        CoachPage CoachPage = new CoachPage();
    }

    public CoachPage(){
        j.setBounds(200,200,900,700);
        j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
        j.setLayout(null);

        JPanel panel = new JPanel();    
        j.add(panel);
        panel.setBounds(0, 10, 900,360);
        placeComponents(panel);
        j.setLayout(null);
        j.setVisible(true); 
       
        Image image=new ImageIcon("img/kuang.jpg").getImage();
        JPanel p = new BackgroundPanel(image);
        p.setBounds(20,370,850,242);
        p.setLayout(null);
        t1.setBounds(40,40,600,76);
        p.add(t1);
        t2.setBounds(40,130,600,76);
        p.add(t2);
        j.add(p);
        WriteButton1.setBounds(650, 60, 100, 29);
        p.add(WriteButton1);
        WriteButton1.addActionListener(this);
        WriteButton2.setBounds(650, 150, 100, 29);
        p.add(WriteButton2);
        WriteButton2.addActionListener(this);
        

        j.setVisible(true);
    }

    private static void placeComponents(JPanel panel){
    	panel.setLayout(null);

        ImageIcon Coach = new ImageIcon("img/coach.png");       
        JLabel CoachLabel = new JLabel(Coach);
        CoachLabel.setBounds(20,20,110,100);
        panel.add(CoachLabel);

    	JLabel coachLabel = new JLabel("Coachname:");
        coachLabel.setBounds(160,30,120,25);
        panel.add(coachLabel);

    	JLabel scheduleLabel = new JLabel("Class schedule");
        scheduleLabel.setBounds(20,140,268,25);
        panel.add(scheduleLabel);

        JLabel Mystudent = new JLabel("My student");
        Mystudent.setBounds(600,140,100,25);
        panel.add(Mystudent);

        JTextField t3 = new JTextField("11111");
        t3.setBounds(600,180,260,160);
        panel.add(t3);

        ImageIcon Schedule = new ImageIcon("img/schedule.png");
        JLabel ScheduleLabel = new JLabel(Schedule);
        ScheduleLabel.setBounds(20,180,561,163);
        panel.add(ScheduleLabel);
    }

    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == WriteButton1){
            new commend();
  
        }

        if(e.getSource() == WriteButton2){
            new commend();
        }
    }
}
