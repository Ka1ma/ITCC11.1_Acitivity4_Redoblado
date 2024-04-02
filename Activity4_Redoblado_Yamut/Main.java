import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DatabaseManager databaseManager = new DatabaseManager();
        ClientManager clientManager = new ClientManager(databaseManager.getConnection(), scanner);
        ServiceManager serviceManager = new ServiceManager(databaseManager.getConnection(), scanner);
        InvoiceManager invoiceManager = new InvoiceManager(databaseManager.getConnection(), scanner);

        // Your menu and application logic can go here
    }
}
