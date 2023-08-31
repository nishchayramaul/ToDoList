package APP_UI;

import javax.swing.*;
import java.awt.*;


public class Task extends JPanel {
    private JLabel index;
    private JButton done;
    private  JTextField taskname;

    private boolean check;

    //constructor
    Task(){
        check = false;
        this.setPreferredSize(new Dimension(60,30));
        this.setBackground(Color.BLUE);
        BorderLayout brdr = new BorderLayout();

        // Jlabel index

        index = new JLabel();
        index.setPreferredSize(new Dimension(40,40));
        index.setForeground(Color.green);
        index.setHorizontalAlignment(JLabel.CENTER);
        this.add(index,BorderLayout.WEST);


        //Jtextfield

       taskname = new JTextField(" ");
        taskname.setBackground(Color.WHITE);
        taskname.setPreferredSize(new Dimension(350,30));
        index.setBorder(BorderFactory.createEmptyBorder());
        this.add(taskname,BorderLayout.CENTER);



       // button
        done = new JButton("Done");
        done.setPreferredSize(new Dimension(80,30));
        done.setBorder(BorderFactory.createEmptyBorder());
        this.add(done,BorderLayout.WEST);


    }

public void changeIndex(int num){
        this.index.setText(num+" ");
        this.revalidate();
}


public JButton getDone(){ return done ;}

    public boolean getState() {
        return check;
    }
public void changeState(){
        this.setBackground(Color.green);
        taskname.setBackground(Color.green);
        check = true;
}




}
