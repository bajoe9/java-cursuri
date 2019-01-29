package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SimpleGui {
   private JButton circleButton;
   private JButton labelButton;
   private JFrame window;
   private JLabel label;
    private  DrawPanel panel;

class CircleButtonListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        changeColor();
    }
}
    class LabelActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            changeLabel();
        }
    }

    public static void main(String[] args) {
        new SimpleGui().run();

    }

    private  void run() {
        window = new JFrame();

        //circleButton= new JButton("Click me");
        circleButton = new JButton("Change color");
        labelButton = new JButton("new");

        circleButton.addActionListener(new CircleButtonListener());
        labelButton.addActionListener(new LabelActionListener());
        panel = new DrawPanel();
        labelButton= new JButton("Change label");
        label= new JLabel("not clicked");


        window.getContentPane().add(BorderLayout.SOUTH, circleButton);
        window.getContentPane().add(BorderLayout.EAST,labelButton);
        window.getContentPane().add(BorderLayout.CENTER,panel);
        window.getContentPane().add(BorderLayout.WEST,label);


        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500,500);
        window.setVisible(true);

    }

    public  void changeText(){
        circleButton.setText("Click");

    }


    private void moveCircle()  {
        for(int x=0; x<=300; x++ ){
            panel.setXY(x,x);
            window.repaint();
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    private void changeColor() {
        window.repaint();
    }
    public void changeLabel() {
       label.setText("Test");
        }

}
