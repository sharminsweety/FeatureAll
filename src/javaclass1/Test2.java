package javaclass1;

public class Test2 {

    // Static variables to hold employee details
    private static String employeeName;
    private static int employeeId;

    // Static method to set employee details
    public static void setEmployeeDetails(String name, int id) {
        employeeName = name;
        employeeId = id;
    }

    // Static method to get employee name
    public static String getEmployeeName() {
        return employeeName;
    }

    // Static method to get employee ID
    public static int getEmployeeId() {
        return employeeId;
    }

    // Static method to display employee details
    public static void displayEmployeeDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
    }

    // Main method to run the application
    public static void main(String[] args) {
        // Set employee details using static method
        setEmployeeDetails("Sweety", 10242066);

        // Display employee details using static method
        displayEmployeeDetails();
    }
}
