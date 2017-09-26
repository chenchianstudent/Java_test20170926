import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame {
    private Button bt1=new Button("Add");
    private Label lab1=new Label("poi");
    private int count=0;
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
        bt1.setBounds(50,50,100,30);
this.add(bt1);
lab1.setBounds(50,100,100,30);
this.add(lab1);
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                MainFrame.this.setTitle(Integer.toString(count));
                lab1.setText(Integer.toString(count));
            }
        });
    }
}
