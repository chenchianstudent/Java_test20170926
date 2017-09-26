import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MainFrame extends Frame {
    private Button bt1 = new Button("Add");
    private Button bt2 = new Button("Run");
    private Label lab1 = new Label("poi");
    private int count = 0;
    private Timer t1;
    private Timer t2;
    private int labx = 50, laby = 100;

    public MainFrame() {
        init();
    }

    private void init() {
        this.setBounds(100, 100, 500, 400);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
        this.setLayout(null);
        bt1.setBounds(50, 50, 100, 30);
        this.add(bt1);
        lab1.setBounds(labx, laby, 100, 30);
        this.add(lab1);
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                MainFrame.this.setTitle(Integer.toString(count));
                lab1.setText(Integer.toString(count));
            }
        });
        bt2.setBounds(50, 150, 100, 30);
        this.add(bt2);
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

         t1.start();
            }
        });
        t1 = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labx += 5;
                lab1.setLocation(labx, laby);
                if(labx>=500){
                 t1.stop();
                 t2.start();
                }

            }
        });
        t2 = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labx -= 5;
                lab1.setLocation(labx, laby);
                if(labx<=0){
                 t2.stop();
                 t1.start();
                }

            }
        });
        System.out.print(this.getWidth() + " " + this.getHeight());
    }
}
