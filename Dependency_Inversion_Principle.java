/**
 * @author Mohaiminul Islam Shaad; Student ID : 
 * @version 1.0
 * @since 2024-04-22
 */
// Abstraction for notification service
interface INotificationService {
    /**
     * Sends a notification message.
     * 
     * @param message The message to be sent.
     */
    void sendNotification(String message);
}

// Concrete implementation of notification service using email
class EmailNotificationService implements INotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email notification: " + message);
    }
}

// Abstraction for ticket management system
interface ITicketManagementSystem {
    /**
     * Creates a new ticket with the provided description.
     * 
     * @param description The description of the ticket.
     */
    void createTicket(String description);
}

// Concrete implementation of ticket management system using a database
class DatabaseTicketManagementSystem implements ITicketManagementSystem {
    @Override
    public void createTicket(String description) {
        // Code to create ticket in the database
        System.out.println("Creating ticket in the database: " + description);
    }
}

// High-level module for ticket creation and notification
class TicketService {
    private final ITicketManagementSystem ticketSystem;
    private final INotificationService notificationService;

    /**
     * Constructs a TicketService with the specified ticket system and notification service.
     * 
     * @param ticketSystem The ticket management system to use.
     * @param notificationService The notification service to use.
     */
    public TicketService(ITicketManagementSystem ticketSystem, INotificationService notificationService) {
        this.ticketSystem = ticketSystem;
        this.notificationService = notificationService;
    }

    /**
     * Creates a ticket using the ticket system and sends a notification using the notification service.
     * 
     * @param description The description of the ticket to create.
     * @param message The notification message to send.
     */
    public void createTicketAndNotify(String description, String message) {
        ticketSystem.createTicket(description);
        notificationService.sendNotification(message);
    }
}

// Main class to demonstrate the Dependency Inversion Principle for ticket management system
public class Dependency_Inversion_Principle {
    public static void main(String[] args) {
        // Create an instance of DatabaseTicketManagementSystem
        ITicketManagementSystem ticketSystem = new DatabaseTicketManagementSystem();

        // Create an instance of EmailNotificationService
        INotificationService notificationService = new EmailNotificationService();

        // Create an instance of TicketService using DatabaseTicketManagementSystem and EmailNotificationService
        TicketService ticketService = new TicketService(ticketSystem, notificationService);

        // Create a ticket and send a notification
        ticketService.createTicketAndNotify("Issue with login", "Please review and resolve.");
    }
}
