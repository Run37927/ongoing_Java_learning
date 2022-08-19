
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class NewBox implements Serializable {
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void main(String[] args) {
        NewBox myBox = new NewBox();
        myBox.setHeight(20);
        myBox.setWidth(50);

        try {
            FileOutputStream fs = new FileOutputStream("foo.ser");  // connect to a file names foo.ser if it exists. If it doesn't make a new file called foo.ser
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(myBox);
            os.close();
        } catch (Exception ex) {ex.printStackTrace();}
    }
}
