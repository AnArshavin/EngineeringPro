package Client.Controller;


/***
 * Main klass för att starta klienten
 * @author Alban Islami
 */
public class StartClient {
    public static void main(String[] args) {
                new ClientController("localhost", 2323);
    }
}
