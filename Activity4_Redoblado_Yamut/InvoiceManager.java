import java.sql.Connection;
import java.util.Scanner;

public class InvoiceManager {
    private Connection connection;
    private Scanner scanner;

    public InvoiceManager(Connection connection, Scanner scanner) {
        this.connection = connection;
        this.scanner = scanner;
    }

    // Your methods for managing invoices go here
}
