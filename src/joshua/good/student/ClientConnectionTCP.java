package joshua.good.student;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;

public class ClientConnectionTCP {

    public static void main(String[] args) throws IOException {
        //Porta del server maggiore di 1024
        int port = 2000;

        //oggetto da usare per fare la connessione TCP
        Socket socket = null;

        try {

            socket = new Socket("127.0.0.1", port);
            System.out.println("client connesso con il client: "+socket.getRemoteSocketAddress());
            System.out.println("client connesso con la porta: "+socket.getLocalPort());

        } catch (ConnectException e) {
            System.err.println("Errore in connessione: "+e);
        } try {
                socket.close();
            } catch (ConnectException e) {
                System.err.println("Errore in chiusura: "+e);
            }
    }

}
