package APP_UI;

import javax.swing.*;
import java.awt.*;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Appframe extends JFrame {
    // defining data types
    private Titlebar title;
    private ButtonPanel btnpnl;
    private List list;
    private JButton addtask;
    private JButton cleartask;
    private  JButton done;

    ImageIcon icon = new ImageIcon("todo.png");

    Appframe() {
        this.setTitle("To Do List");
        this.setVisible(true);
        this.setSize(600,800);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // creating and storing objects
        title = new Titlebar();
        btnpnl = new ButtonPanel();
        list = new List();
        this.setIconImage(icon.getImage());

        // panel add
        this.add(title, BorderLayout.NORTH);
        this.add(btnpnl,BorderLayout.SOUTH);
        this.add(list,BorderLayout.CENTER);
      //  this.add(task,BorderLayout.CENTER);
        addtask = btnpnl.getAddtask();
        cleartask = btnpnl.getCleartask();
        addlistener();



       // this.pack();
    }

    private void addlistener() {
       addtask.addMouseListener(new MouseAdapter() {
           @Override
           public void mousePressed(MouseEvent e) {
               Task task = new Task();
               list.add(task);
               list.updatedNumbers();



        task.getDone().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                task.changeState();
                revalidate();
            }
        });
                revalidate();
           }
       });
        cleartask.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                list.removeCompletedTasks();
                repaint();
            }
        });

    }
    }



