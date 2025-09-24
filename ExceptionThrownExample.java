public class ExceptionThrownExample {

    public static String exceptionThrown(String input) {
        if (input.isEmpty()) {
            throw new IllegalArgumentException("Should not be empty string: " + input);
        } else {
            return "Sucess!";
        }
    }
}
