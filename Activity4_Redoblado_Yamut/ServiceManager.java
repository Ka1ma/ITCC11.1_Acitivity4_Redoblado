import java.sql.Connection;
import java.util.Scanner;

public class ServiceManager {
    private Connection connection;
    private Scanner scanner;

    public ServiceManager(Connection connection, Scanner scanner) {
        this.connection = connection;
        this.scanner = scanner;
    }

    // Your methods for managing services go here
}
