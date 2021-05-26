import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Customization extends JFrame implements ActionListener{
    private JFrame j = new JFrame("London Fitness");
    private JButton HomePageButton = new JButton("HomePage");
    private JButton LiveButton = new JButton("Live");
    private JButton CustomizationButton = new JButton("Customization");
    private ImageIcon imageT = new ImageIcon("img/tou1.jpg");
    private JButton Tou = new JButton(imageT);
    private JTextField tishi = new JTextField("You can click on the button below to put forward your needs, and the coach will customize the fitness plan for you.");
    private JButton target = new JButton("Target");

    private ImageIcon image = new ImageIcon("img/target.png");
    private JLabel logoLabel = new JLabel(image);

    private JTextField t1 = new JTextField();
    private JTextField t2 = new JTextField();


    public static void main(String[] args) {
        Customization login = new Customization();
    }

    public Customization(){
        j.setBounds(200,200,900,700);
        
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setLayout(null);

        HomePageButton.setBounds(10, 10, 100, 29);
        j.add(HomePageButton);
        HomePageButton.addActionListener(this);

        LiveButton.setBounds(110, 10, 100, 29);
        j.add(LiveButton);
        LiveButton.addActionListener(this);

        CustomizationButton.setBounds(210, 10, 150, 29);
        j.add(CustomizationButton);
        CustomizationButton.addActionListener(this);

        Tou.setBounds(800, 10, 50, 50);
        j.add(Tou);
        Tou.addActionListener(this);

        tishi.setFont(new java.awt.Font("Dialog", 0, 15));
        tishi.setEditable(false); 
        tishi.setBounds(20,90,780,30);
        logoLabel.setBounds(20,140,40,40);
        target.setBounds(70,140,90,40);
        target.addActionListener(this);

        j.add(logoLabel);
        j.add(target);
        j.add(tishi);

        Image image=new ImageIcon("img/plan.jpg").getImage();
        JPanel p = new BackgroundPanel(image);
        p.setBounds(18,260,850,367);
        p.setLayout(null);
        t1.setBounds(40,80,600,100);
        t2.setBounds(40,230,600,100);
        p.add(t1);
        p.add(t2);


        j.add(p);

        CustomizationButton.setForeground(Color.blue);
        LiveButton.setForeground(Color.black);
        HomePageButton.setForeground(Color.black);

        j.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == HomePageButton){
            j.dispose();
            new HomePage();
        }
        
        if(e.getSource() == LiveButton){
            j.dispose();
            new Live();
        }

        if(e.getSource() == Tou){
            j.dispose();
            new User();
        }

        if(e.getSource() == target){
            new target();
        }

    }

}
