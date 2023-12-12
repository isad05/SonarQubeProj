import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class CommandInjectionExample {
 
    public static void main(String[] args) {
        try {
            // Vulnerable code: taking user input without proper validation
            System.out.println("Enter a command to execute:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String userInput = reader.readLine();
 
            // Executing the user input as a command (vulnerability)
            Process process = Runtime.getRuntime().exec("ping " + userInput);
            BufferedReader processOutputReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
 
            // Reading and printing the output of the command
            String outputLine;
            while ((outputLine = processOutputReader.readLine()) != null) {
                System.out.println(outputLine);
            }
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
