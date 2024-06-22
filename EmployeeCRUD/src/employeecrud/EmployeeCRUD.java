package employeecrud;
import java.sql.*;

public class EmployeeCRUD {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static final String DB_URL = "jdbc:mysql://localhost:3306/";
    private static final String USER = "root"; // your MySQL username
    private static final String PASS = "";    // your MySQL password

    private static Connection connect(String database) throws SQLException {
        return DriverManager.getConnection(DB_URL + database, USER, PASS);
    }

    private static void createDatabaseAndTable() {
        String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS Company";
        String useDatabaseSQL = "USE Company";
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Employee (" +
                                "Eid INT PRIMARY KEY, " +
                                "Ename VARCHAR(50), " +
                                "Salary DECIMAL(10, 2), " +
                                "Department VARCHAR(50))";
        
        try (Connection conn = connect("");
             Statement stmt = conn.createStatement()) {
            // Create database
            stmt.executeUpdate(createDatabaseSQL);
            // Use the created database
            stmt.executeUpdate(useDatabaseSQL);
            // Create table
            stmt.executeUpdate(createTableSQL);
            System.out.println("Database and table created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insertEmployees() {
        String[] names = {"Gagan", "Hari", "Shyam", "Ram", "Sita"};
        double[] salaries = {50000, 60000, 55000, 58000, 53000};
        String[] departments = {"Sales", "IT", "Sales", "HR", "Sales"};
        
        try (Connection conn = connect("Company");
             PreparedStatement pstmt = conn.prepareStatement("INSERT INTO Employee (Eid, Ename, Salary, Department) VALUES (?, ?, ?, ?)")) {
            for (int i = 0; i < 5; i++) {
                pstmt.setInt(1, i + 1);
                pstmt.setString(2, names[i]);
                pstmt.setDouble(3, salaries[i]);
                pstmt.setString(4, departments[i]);
                pstmt.executeUpdate();
            }
            System.out.println("Employees inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void displaySalesEmployees() {
        String query = "SELECT * FROM Employee WHERE Department = 'Sales'";
        try (Connection conn = connect("Company");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                System.out.println("Eid: " + rs.getInt("Eid") + ", Ename: " + rs.getString("Ename") +
                        ", Salary: " + rs.getDouble("Salary") + ", Department: " + rs.getString("Department"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void updateEmployee(int eid, String newName, double newSalary, String newDepartment) {
        String query = "UPDATE Employee SET Ename = ?, Salary = ?, Department = ? WHERE Eid = ?";
        try (Connection conn = connect("Company");
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, newName);
            pstmt.setDouble(2, newSalary);
            pstmt.setString(3, newDepartment);
            pstmt.setInt(4, eid);
            pstmt.executeUpdate();
            System.out.println("Employee updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void deleteEmployee(int eid) {
        String query = "DELETE FROM Employee WHERE Eid = ?";
        try (Connection conn = connect("Company");
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, eid);
            pstmt.executeUpdate();
            System.out.println("Employee deleted successfully.");
        } catch (SQLException e) {
        }            e.printStackTrace();

    }

    public static void main(String[] args) {
        createDatabaseAndTable();
        insertEmployees();

        System.out.println("Displaying Sales employees:");
        displaySalesEmployees();

        // Updating an employee with Eid 3
        updateEmployee(3, "James", 60000, "Marketing");

        // Deleting an employee with Eid 4
        deleteEmployee(4);

        System.out.println("Displaying Sales employees after update and delete:");
        displaySalesEmployees();
    }
}
