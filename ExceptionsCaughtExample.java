public class ExceptionsCaughtExample {
    public static void main(String[] args) {
        String[] myStrings = {"Hello", "", "Hola", "Hafa adai", "Kamusta", ""};
        for (String message : myStrings) {
            String m;
            try {
                m = ExceptionThrownExample.exceptionThrown(message);
            } catch (IllegalArgumentException e) {
                // save the message to an error log file
                System.out.println(e.getMessage());
                continue; // go back to start of loop
            }

            // Do this other thing if no exceptions caught
            System.out.println(m + " No exceptions: " + message);
        }
        
        
    }
}
