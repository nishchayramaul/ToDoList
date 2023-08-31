package APP_UI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.time.temporal.Temporal;

public class ButtonPanel extends JPanel {
    private JButton addtask;
    private JButton cleartask;
      Border emtbdr = BorderFactory.createEmptyBorder();

    // Constructor
    ButtonPanel (){


        addtask = new JButton("ADD TASK");
        cleartask = new JButton("CLEAR TASK");
        this.setPreferredSize(new Dimension(800,100));


        // add task
        addtask.setPreferredSize(new Dimension(100, 40));
        addtask.setForeground(Color.BLACK);
        addtask.setBorder(emtbdr);
        this.add(addtask);
        this.add(Box.createHorizontalStrut(50));

        // clear task functionality
         cleartask.setPreferredSize(new Dimension(100, 40));
        cleartask.setForeground(Color.BLACK);
        cleartask.setBorder(emtbdr);
         this.add(cleartask);
    }
    // return methods of buttons

    public JButton getAddtask(){
        return addtask;
    }

    public JButton getCleartask(){
        return cleartask;
    }


}
