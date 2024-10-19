import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JenkinsExample {
    public static void main(String[] args) {
        // Print a welcome message
        System.out.println("Hello, Jenkins!");

        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        // Print the current date and time
        System.out.println("Current Date and Time: " + now.format(formatter));
    }
}
