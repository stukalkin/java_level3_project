package java3_lesson3.j3_l3_main4;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class j3_l3_main4_clientMain {

    public static void main(String[] args) throws IOException {
        sameObject sameObject = new sameObject("Object", 42);
        String SERVER_ADDR = "localhost";
        int SERVER_PORT = 8189;
        Socket socket = new Socket(SERVER_ADDR, SERVER_PORT);
        ObjectOutputStream OOpS = new ObjectOutputStream(socket.getOutputStream());
        OOpS.writeObject(sameObject);
        OOpS.close();
    }

}