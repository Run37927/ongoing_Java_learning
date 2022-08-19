import javax.sound.midi.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;


public class MiniMusicPlayer3 {
    static JFrame f = new JFrame("My first music video");  // create a new static JFrame instance?
    static MyDrawPanel ml;  // declare a static instance variable (but is an object)

    // main method
    public static void main(String[] args) {
        MiniMusicPlayer3 mini = new MiniMusicPlayer3();  // create an instance of itself
        mini.go();  // invoke its go method
    }


    // one of class behaviour/methods
    public void setUpGui() {
        ml = new MyDrawPanel();  // instantiate the DrawPanel object and assign it to ml
        f.setContentPane(ml);
        f.setBounds(30,30, 300,300);
        f.setVisible(true);
    }


    // another class method
    public void go() {
        setUpGui();  // calling setUpGui method first to set up the frame?
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addControllerEventListener(ml, new int[] {127});
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();
            int r = 0;
            for (int i = 0; i < 60; i+= 4) {
                r = (int) ((Math.random() * 50) + 1);
                track.add(makeEvent(144,1,r,100,i));
                track.add(makeEvent(176,1,127,0,i));
                track.add(makeEvent(128,1,r,100,i + 2));
            } // end loop
            sequencer.setSequence(seq);
            sequencer.start();
            sequencer.setTempoInBPM(120);
        } catch (Exception ex) {ex.printStackTrace();}
    }


    // wrap the note on and off procedures in one method so we don't have to repeat so many lines
    public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch(Exception e) {e.printStackTrace();}
        return event;
    }


    // MyDrawPanel is a listener
    class MyDrawPanel extends JPanel implements ControllerEventListener {
        boolean msg = false;  // set a flag and change it to true only when we get an event

        public void controlChange(ShortMessage event) {
            msg = true;
            repaint();
        }

        public void paintComponent(Graphics g) {
            // if there is a controller event
            if (msg) {
                // generate some random rgb code
                int r = (int) (Math.random() * 250);
                int gr = (int) (Math.random() * 250);
                int b = (int) (Math.random() * 250);

                g.setColor(new Color(r,gr,b));

                // generate random parameters for rectangle
                int height = (int) ((Math.random() * 120) + 10);
                int width = (int) ((Math.random() * 120) + 10);
                int x = (int) ((Math.random() * 40) + 10);
                int y = (int) ((Math.random() * 40) + 10);

                // paint a rectangle
                g.fillRect(x,y,width,height);
                msg = false;
            } // close if
        } // close method
    } // close inner class
}
