import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class myFrame extends JFrame implements ActionListener {

    JButton bNewGame;
    JButton bExit;
    JLabel apple;
    JLabel head;
    JLabel body;
    JPanel panel;

    public myFrame() {
        setSize(600, 640);
        setTitle("SNAKE_GAME");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setBackground(Color.black);

        //Removing java icon from left corner
        ImageIcon img = new ImageIcon("ikona.png");
        setIconImage(img.getImage());

        setLayout(null);
        bNewGame = new JButton("NEW GAME");
        bNewGame.setBounds(0, 0, 600, 20);
        add(bNewGame);
        bNewGame.addActionListener(this);

        bExit = new JButton("EXIT");
        bExit.setBounds(0, 20, 600, 20);
        add(bExit);
        bExit.addActionListener(this);

        apple=new JLabel();
        ImageIcon appImage=new ImageIcon("apple1.png");
        apple.setIcon(appImage);

        panel=new JPanel(null);
        panel.add(apple);
        apple.setLocation(200,200);
        apple.setSize(10,10);

        panel.setBounds(0,40,600,600);
        panel.setBackground(Color.black);


        head=new JLabel();
        ImageIcon headImage=new ImageIcon("head.png");
        head.setIcon(headImage);
        panel.add(head);
        head.setLocation(430,300);
        head.setSize(10,10);

        body=new JLabel();
        ImageIcon bodyImage=new ImageIcon("dot.png");
        body.setIcon(bodyImage);
        panel.add(body);
        body.setLocation(440,300);
        body.setSize(10,10);

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        myFrame frame = new myFrame();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == bNewGame) {
            System.out.println(new Date());
        } else if (source == bExit) {
            dispose();
        }
    }
}
