
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {
    String[] adviceList = {"take smaller bites", "go for the tight jeans. no they do not make you look fat",
            "one word: inappropriate", "just for today, be honest", "you might want to rethink that haircut",
            "that shade of green isn't really working for you"};

    public void go() {
        try {
            ServerSocket serverSock = new ServerSocket(4242);

            while (true) {
                Socket sock = serverSock.accept();

                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch (IOException ex) {ex.printStackTrace();}
    }

    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }
}
