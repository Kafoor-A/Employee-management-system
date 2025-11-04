import java.sql.*;
import java.util.Scanner;

public class Main {
    static final String DB_URL = "jdbc:sqlite:employees.db";

    public static void main(String[] args) {
        try {
            // Load the SQLite JDBC driver manually
            Class.forName("org.sqlite.JDBC");

            // Establish connection
            Connection conn = DriverManager.getConnection(DB_URL);
            createTable(conn);

            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("\n===== Employee Management System =====");
                System.out.println("1. Add Employee");
                System.out.println("2. View Employees");
                System.out.println("3. Delete Employee");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1 -> addEmployee(conn, sc);
                    case 2 -> viewEmployees(conn);
                    case 3 -> deleteEmployee(conn, sc);
                    case 4 -> {
                        System.out.println("Exiting...");
                        conn.close();
                        System.exit(0);
                    }
                    default -> System.out.println("Invalid choice!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void createTable(Connection conn) throws SQLException {
        String sql = """
            CREATE TABLE IF NOT EXISTS employees(
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                name TEXT NOT NULL,
                role TEXT,
                salary REAL
            )
            """;
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        }
    }

    static void addEmployee(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter role: ");
        String role = sc.next();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        String sql = "INSERT INTO employees(name, role, salary) VALUES(?,?,?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setString(2, role);
            ps.setDouble(3, salary);
            ps.executeUpdate();
            System.out.println("Employee added successfully!");
        }
    }

    static void viewEmployees(Connection conn) throws SQLException {
        String sql = "SELECT * FROM employees";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("\nID\tName\tRole\tSalary");
            System.out.println("----------------------------------");
            while (rs.next()) {
                System.out.printf("%d\t%s\t%s\t%.2f%n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("role"),
                        rs.getDouble("salary"));
            }
        }
    }

    static void deleteEmployee(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter employee ID to delete: ");
        int id = sc.nextInt();
        String sql = "DELETE FROM employees WHERE id=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            if (rows > 0)
                System.out.println("Employee deleted!");
            else
                System.out.println("Employee ID not found.");
        }
    }
}
