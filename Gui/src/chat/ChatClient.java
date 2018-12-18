package chat;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
    JTextField outputTextField;
    JTextArea inputTextArea;
    Socket socket;
    public static void main(String[] args) {
        new ChatClient().run();
    }
    public  void run(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        outputTextField = new JTextField(50);
        JButton send = new JButton("Send");
        send.addActionListener(new sendListener());
        inputTextArea = new JTextArea(20,60);
        inputTextArea.setEditable(false);
        inputTextArea.setLineWrap(true);
        inputTextArea.setWrapStyleWord(true);
        JScrollPane scroll = new JScrollPane(inputTextArea);
        scroll .setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll .setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        panel.add(inputTextArea);
        panel.add(outputTextField);
        panel.add(send);
        frame.add(panel);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,420);
        frame.setVisible(true);

        connect();

    }
    public void  connect(){
        try {
            socket = new Socket("10.20.41.36",5000);
        } catch (IOException e) {
            e.printStackTrace();
        }
        new Thread(new ServerReader()).start();
    }
    class ServerReader implements Runnable {

        @Override
        public void run() {
            try {
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));
                String message;
                while ((message = reader.readLine()) != null) {
                    System.out.println("Message received" + message);
                    inputTextArea.append(message+ '\n');

                }

            } catch (IOException e) {
                e.printStackTrace();

            }
        }
    }

    class sendListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                writer.println(outputTextField.getText());
                writer.flush();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

}
