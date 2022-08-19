import java.awt.*;
import javax.swing.*;
import javax.sound.midi.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;

public class BeatBox {
    public static void main(String[] args) {
        BeatBox gui = new BeatBox();
        gui.buildGUI();
    }
    JPanel mainPanel;
    ArrayList<JCheckBox> checkboxList;  // we need total of 256 check boxes
    Sequencer sequencer;
    Sequence sequence;
    Track track;
    JFrame theFrame;

    String[] instrumentNames = {"Bass Drum", "Closed Hi-Hat",
            "Open Hi-Hat","Acoustic Snare", "Crash Cymbal", "Hand Clap",
            "High Tom", "Hi Bongo", "Maracas", "Whistle", "Low Conga",
            "Cowbell", "Vibraslap", "Low-mid Tom", "High Agogo",
            "Open Hi Conga"}; // total 16 instruments
    int[] instruments = {35,42,46,38,49,39,50,60,70,72,64,56,58,47,67,63}; // the corresponding key# to the above instruments

    public void buildGUI() {
        theFrame = new JFrame("Cyber BeatBox"); // instantiate the frame
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // the usual
        BorderLayout layout = new BorderLayout();
        JPanel background = new JPanel(layout);
        background.setBorder(BorderFactory.createEmptyBorder(10,10,10,10)); // pure aesthetics

        checkboxList = new ArrayList<JCheckBox>(); // instantiate the JCheckBox arraylist
        Box buttonBox = new Box(BoxLayout.Y_AXIS);  // change to box layout manager for vertical layout

        JButton start = new JButton("start"); // create the start object (button)
        start.addActionListener(new MyStartListener());  // add an event listener
        buttonBox.add(start); // stick the start button onto buttonBox (whatever that is, a panel? a frame?)

        JButton stop = new JButton("stop");
        stop.addActionListener(new MyStopListener());
        buttonBox.add(stop);

        JButton upTempo = new JButton("Tempo Up");
        upTempo.addActionListener(new MyUpTempoListener());
        buttonBox.add(upTempo);

        JButton downTempo = new JButton("Tempo Down");
        downTempo.addActionListener(new MyDownTempoListener());
        buttonBox.add(downTempo);

        JButton serializeIt = new JButton("Serialize it");
        serializeIt.addActionListener(new MySendListener());
        buttonBox.add(serializeIt);

        JButton restore = new JButton("Restore");
        restore.addActionListener(new MyReadInListener());
        buttonBox.add(restore);

        Box nameBox = new Box(BoxLayout.Y_AXIS); // create another Box to put instrument names (total of 16)
        for (int i = 0; i < 16; i++) {
            nameBox.add(new Label(instrumentNames[i]));
        }

        background.add(BorderLayout.EAST, buttonBox); // stick buttonBox which stored the 4 buttons onto the panel in EAST region
        background.add(BorderLayout.WEST, nameBox);  // stick nameBox which stored the 16 instrument names onto the panel in WEST region

        theFrame.getContentPane().add(background);  // stick the panel onto the frame at last

        GridLayout grid = new GridLayout(16,16);  // ?? a new GridLayout instance I guess for 256 checkboxes
        grid.setVgap(1);
        grid.setHgap(2);
        mainPanel = new JPanel(grid); // instantiate the mainPanel, passing grid as argument
        background.add(BorderLayout.CENTER, mainPanel); //stick mainPanel onto background panel in CENTER region??

        for (int i = 0; i < 256; i++) {
            JCheckBox c = new JCheckBox();  // loop 256 times to create 256 check boxes
            c.setSelected(false); // set all of them false as default state
            checkboxList.add(c); // add all to array list (of type JCheckBox)
            mainPanel.add(c); // add each checkbox to the mainPanel which has the 16x16 grid which was inserted onto the CENTER region
        }

        setUpMidi();

        theFrame.setBounds(50,50,300,300);
        theFrame.pack();
        theFrame.setVisible(true);  // display the frame
    }

    public void setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequence = new Sequence(Sequence.PPQ,4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(120);
        } catch(Exception e) {e.printStackTrace();}
    }

    public void buildTrackAndStart() {
        int[] trackList = null;

        // get rid of old track, make a fresh one
        sequence.deleteTrack(track);
        track = sequence.createTrack();

        for (int i = 0; i < 16; i++) {
            trackList = new int[16];
            int key = instruments[i];
            for (int j = 0; j < 16; j++ ) {
                JCheckBox jc = checkboxList.get(j + 16*i);
                if ( jc.isSelected()) {
                    trackList[j] = key;
                } else {
                    trackList[j] = 0;
                }
            } // close inner loop
            makeTracks(trackList);
            track.add(makeEvent(176,1,127,0,16));
        }

        track.add(makeEvent(192,9,1,0,15));
        try {
            sequencer.setSequence(sequence);
            sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);
            sequencer.start();
            sequencer.setTempoInBPM(120);
        } catch(Exception e) {e.printStackTrace();}
    }

    public void makeTracks(int[] list) {
        for (int i = 0; i < 16; i++) {
            int key = list[i];
            if (key != 0) {
                track.add(makeEvent(144,9,key, 100, i));
                track.add(makeEvent(128,9,key, 100, i+1));
            }
        }
    }

    public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch(Exception e) {e.printStackTrace(); }
        return event;
    }

    // inner class; when i click start button, triggers the buildTrackAndStart() method
    public class MyStartListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            buildTrackAndStart();
        }
    }

    // inner class; same thing except it stops the music
    public class MyStopListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            sequencer.stop();
        }
    }

    // inner class; speeding the tempo up by 3%
    public class MyUpTempoListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            float tempoFactor = sequencer.getTempoFactor();
            sequencer.setTempoFactor((float)(tempoFactor * 1.03));
        }
    }

    // inner class; slowing the tempo down by 3%
    public class MyDownTempoListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            float tempoFactor = sequencer.getTempoFactor();
            sequencer.setTempoFactor((float)(tempoFactor * .97));
        }
    }

    public class MySendListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            boolean[] checkboxState = new boolean[256];
            for (int i =0; i<256; i++) {
                JCheckBox check = (JCheckBox) checkboxList.get(i);
                if (check.isSelected())
                    checkboxState[i] = true;
            }

            try {
                FileOutputStream fileStream = new FileOutputStream(new File("Checkbox.ser"));
                ObjectOutputStream os = new ObjectOutputStream(fileStream);
                os.writeObject(checkboxState);
            } catch (Exception ex) {ex.printStackTrace();}
        }
    }

    public class MyReadInListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            boolean[] checkboxState = null;
            try {
                FileInputStream fileIn = new FileInputStream(new File("Checkbox.ser"));
                ObjectInputStream is = new ObjectInputStream(fileIn);
                checkboxState = (boolean[]) is.readObject();
            } catch(Exception ex) {ex.printStackTrace();}

            for (int i=0; i<256; i++) {
                JCheckBox check = (JCheckBox) checkboxList.get(i);
                if (checkboxState[i])
                    check.setSelected(true);
                else
                    check.setSelected(false);
            }

            sequencer.stop();
            buildTrackAndStart();
        }
    }
}
