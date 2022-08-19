
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;

public class QuizCardBuilder {
    private JTextArea question;
    private JTextArea answer;
    private ArrayList<QuizCard> cardList;
    private JFrame frame;

    public static void main(String[] args) {
        QuizCardBuilder builder = new QuizCardBuilder();
        builder.go();
    }

    public void go() {
        // building GUI

        frame = new JFrame("Quiz Card Builder");  // the window of a GUI
        JPanel mainPanel = new JPanel();  // the glass of the window
        Font bigFont = new Font("sanserif", Font.BOLD, 24); // setting up the font
        question = new JTextArea(6,20); // area for typing question
        question.setLineWrap(true); // allow line wrap
        question.setWrapStyleWord(true);
        question.setFont(bigFont); // use that bigFont we created

        JScrollPane qScroller =  new JScrollPane(question); // make it scrollable
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);  // always have vertical scroll bar
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);  // don't show horizontal scroll bar

        // now same thing for answer box
        answer = new JTextArea(6, 20); // same size as the question box
        answer.setLineWrap(true);
        answer.setWrapStyleWord(true);
        answer.setFont(bigFont);

        JScrollPane aScroller = new JScrollPane(answer);
        aScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        aScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JButton nextButton = new JButton("Next Card");

        cardList = new ArrayList<QuizCard>();

        JLabel qLabel = new JLabel("Question: ");
        JLabel aLabel = new JLabel("Answer: ");

        // now putting those stuff onto the glass(panel)
        mainPanel.add(qLabel);
        mainPanel.add(qScroller);
        mainPanel.add(aLabel);
        mainPanel.add(aScroller);
        mainPanel.add(nextButton);

        nextButton.addActionListener(new NextCardListener());  // trigger event when click nextButton

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem saveMenuItem = new JMenuItem("Save");

        newMenuItem.addActionListener(new NewMenuListener());  // trigger appropriate event when click newMenuItem
        saveMenuItem.addActionListener(new SaveMenuListener()); // trigger appropriate event when click saveMenuItem

        // menuBar包含fileMenu，fileMenu包含选项（比如newMenu， saveMenu）
        fileMenu.add(newMenuItem);
        fileMenu.add(saveMenuItem);
        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);

        frame.getContentPane().add(BorderLayout.CENTER, mainPanel); // put mainPanel in CENTER region
        frame.setSize(500, 600); // the whole GUI size (window size)
        frame.setVisible(true);
    }



    // an event listener for when user click 'next card' button
    // when user click 'next card', we store this card in the list and start a new card
    private class NextCardListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            // add the current card to the list and clear the text areas
            QuizCard card = new QuizCard(question.getText(), answer.getText());
            cardList.add(card);
            clearCard();
        }
    }

    // when user click 'save' from file menu, we save all the cards in the current list as a set
    private class SaveMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            // bring up a file dialog box, let the user name and save the set
            QuizCard card = new QuizCard(question.getText(), answer.getText());
            cardList.add(card);

            JFileChooser fileSave = new JFileChooser();
            fileSave.showSaveDialog(frame);
            saveFile((fileSave.getSelectedFile()));
        }
    }


    // when user click 'new' from file menu, we start a brand new set for user
    private class NewMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            // clear out the card list, and clear out the text areas
            cardList.clear();
            clearCard();
        }
    }

    public void clearCard() {
        question.setText("");
        answer.setText("");
        question.requestFocus();
    }

    public void saveFile(File file) {
        // iterate thru the list of cards, write each one out to a text file in a parseable way
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            for (QuizCard card: cardList) {
                writer.write(card.getQuestion() + "/");
                writer.write(card.getAnswer() + "\n");
            }
            writer.close();

        } catch (IOException ex) {
            System.out.println("couldn't write the cardList out");
            ex.printStackTrace();
        }
    }
}
