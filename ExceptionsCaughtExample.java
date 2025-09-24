public class ExceptionsCaughtExample {
    public static void main(String[] args) {
        String[] myStrings = {"Hello", "", "Hola", "Hafa adai", "Kamusta", ""};
        for (String message : myStrings) {
            try {
                ExceptionThrownExample.exceptionThrown(message);
            } catch (IllegalArgumentException e) {
                // save the message to an error log file
                System.out.println(e.getMessage());
                continue;
            }

            // Do this other thing if no exceptions caught
            System.out.println("No exceptions: " + message);
        }
        
        
    }
}
