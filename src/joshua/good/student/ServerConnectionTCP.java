package joshua.good.student;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerConnectionTCP {

    public static void main(String[] args) throws IOException {
        //Porta del server maggiore di 1024
        int port = 2000;
        //tempo in millisecondi in attesa
        int time = 2000;
        //oggetto sServerSocket necessario per accettare la richiesta del client
        ServerSocket sSocket = null;
        //oggetto da usare per fare la connessione TCP
        Socket socket = null;

        try {
            //apro una porta nel server socket (appena istanziato)
            sSocket = new ServerSocket(port);
            System.out.println("In attesa di connessione");

            //accetto la connessione
            socket = sSocket.accept();
            System.out.println("Accettata la connessione: "+socket.getRemoteSocketAddress());

            //Scambio di dati
            socket.getInputStream();
        } catch (IOException e) {
            System.err.println("Errore di I/O nell'istanza del server: "+e);
        }
    }

}
