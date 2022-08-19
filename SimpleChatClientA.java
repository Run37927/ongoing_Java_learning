
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;

public class SimpleChatClientA {
    JTextArea incoming;
    BufferedReader reader;
    JTextField outgoing;
    PrintWriter writer;
    Socket sock;

    public void go() {
        // build GUI
        JFrame frame = new JFrame("Ludicriously simple chat client");
        JPanel mainPanel = new JPanel();

        incoming = new JTextArea(15, 50);
        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(false);

        JScrollPane qScroller = new JScrollPane(incoming);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        outgoing = new JTextField(20);
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());

        mainPanel.add(qScroller);
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);

        setUpNetworking(); // setting up network before displaying GUI

        // using inner class IncomingReader as the Runnable (the job) for the thread
        // the thread's job is to read from the server's socket system, displaying any incoming msg in the text area
        Thread readerThread = new Thread(new IncomingReader());
        readerThread.start();

        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setVisible(true);
        frame.setSize(800, 500);
    }

    private void setUpNetworking() {
        try {
            sock = new Socket("127.0.0.1", 5000);  // using locahost IP address so i can test client and server on one machine
            InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
            reader = new BufferedReader(streamReader);
            writer = new PrintWriter(sock.getOutputStream());
            System.out.println("networking established");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public class SendButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            // get the text from textfield
            // send it to the server using print writer
            try {
                writer.println(outgoing.getText());
                writer.flush();
            } catch (Exception ex) {ex.printStackTrace();}

            outgoing.setText("");
            outgoing.requestFocus();
        }
    }

    public class IncomingReader implements Runnable {
        public void run() {
            String message;
            try {
                while ( (message = reader.readLine()) != null) {
                    System.out.println("read " + message);
                    incoming.append(message + "\n");
                }
            } catch (Exception ex) {ex.printStackTrace();}
        }
    }

    public static void main(String[] args) {
        new SimpleChatClientA().go();
    }
}
