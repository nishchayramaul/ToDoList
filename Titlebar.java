package APP_UI;

import javax.swing.*;
import java.awt.*;

public class Titlebar extends JPanel {
    Titlebar(){
        this.setPreferredSize(new Dimension(600,80));
        this.setBackground(new Color(	250, 249, 246));

        //adding lable
        JLabel text = new JLabel("MY TO DO LIST");
        text.setPreferredSize(new Dimension(200,80));
        text.setForeground(Color.BLACK);
        text.setFont(new Font("Sans-Serif",Font.BOLD,20));
        text.setHorizontalAlignment(JLabel.CENTER);

        this.add(text);
    }

}
