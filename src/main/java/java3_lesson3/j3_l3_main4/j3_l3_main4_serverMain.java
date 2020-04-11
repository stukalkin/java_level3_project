package java3_lesson3.j3_l3_main4;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class j3_l3_main4_serverMain {

    public static void main(String[] args) {
        Socket socket;
        try {
            ServerSocket serverSocket = new ServerSocket(8189);
            System.out.println("Сервер запущен, ожидаем подключения...");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            ObjectInputStream OIpS = new ObjectInputStream(socket.getInputStream());
            sameObject sameObject = (sameObject) OIpS.readObject();
            sameObject.info();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}