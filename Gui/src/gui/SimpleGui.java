package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SimpleGui implements ActionListener {
    JButton button;
    JFrame window;
    private  DrawPanel panel;
    public static void main(String[] args) {
        new SimpleGui().run();

    }

    private  void run() {
        window = new JFrame();

        //button= new JButton("Click me");
        button= new JButton("Change color");

        button.addActionListener(this);
        panel = new DrawPanel();

        window.getContentPane().add(BorderLayout.SOUTH,button);
        window.getContentPane().add(BorderLayout.CENTER,panel);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300,300);
        window.setVisible(true);
        moveCircle();
    }

    public  void changeText(){
        button.setText("Click");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        changeText();
        changeColor();
        moveCircle();

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
}
