/**
 * @author Mohaiminul Islam Shaad; Student ID : 
 * @version 1.0
 * @since 2024-04-22
 */
import java.util.Scanner;

/**
 * Represents a Worker with basic information such as ID, name, and salary.
 */
class Worker {
    private int id;
    private String name;
    private double salary;

    /**
     * Constructs a new Worker object.
     *
     * @param id     The ID of the worker.
     * @param name   The name of the worker.
     * @param salary The salary of the worker.
     */
    public Worker(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * Gets the ID of the worker.
     *
     * @return The ID of the worker.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the name of the worker.
     *
     * @return The name of the worker.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the salary of the worker.
     *
     * @return The salary of the worker.
     */
    public double getSalary() {
        return salary;
    }
}

/**
 * Handles input operations to create a Worker object.
 */
class WorkerInput {
    private Scanner scanner;

    /**
     * Constructs a new WorkerInput object.
     */
    public WorkerInput() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Creates a new Worker object based on user input.
     *
     * @return The created Worker object.
     */
    public Worker createWorker() {
        System.out.println("Enter worker ID:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.println("Enter worker name:");
        String name = scanner.nextLine();

        System.out.println("Enter worker salary:");
        double salary = scanner.nextDouble();

        return new Worker(id, name, salary);
    }

    /**
     * Closes the scanner used for input.
     */
    public void closeScanner() {
        scanner.close();
    }
}

/**
 * Handles output operations to display Worker information.
 */
class WorkerOutput {
    /**
     * Displays the information of a Worker object.
     *
     * @param worker The Worker object to display information for.
     */
    public void displayWorker(Worker worker) {
        System.out.println("Worker ID: " + worker.getId());
        System.out.println("Worker Name: " + worker.getName());
        System.out.println("Worker Salary: $" + worker.getSalary());
    }
}

/**
 * The main class to run the Worker management application.
 */
public class Single_Responsibility_Principle {
    public static void main(String[] args) {
        WorkerInput workerInput = new WorkerInput();
        WorkerOutput workerOutput = new WorkerOutput();

        Worker worker = workerInput.createWorker();

        workerOutput.displayWorker(worker);

        workerInput.closeScanner();
    }
}
