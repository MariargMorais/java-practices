package exceptions.exercise;

//The DataProcessor class currently uses a custom exception (CustomException) for error handling in the processData() method.
//This exception is actually not needed as the parameter validation could use some standard exception classes.
//
//Your task is to refactor the exception handling by replacing CustomException with standard Java exceptions (IllegalArgumentException and IllegalStateException) in the following way:
//--Replace the throw new CustomException(...) statements with throw new IllegalArgumentException(...) (for argument checking) or with throw new IllegalStateException("Data processing is not enabled") (for checking against the object's internal state) where appropriate.
//--Ensure that the error message provided when throwing IllegalArgumentException includes the value of the specific data that caused the problem.
public class DataProcessor {

    private boolean isProcessingEnabled;

    public DataProcessor(boolean isProcessingEnabled) {
        this.isProcessingEnabled = isProcessingEnabled;
    }

    public void processData(String data) {
        if (data == null || data.trim().isEmpty()) {
            throw new CustomException("Invalid data provided");
        }

        if (!isProcessingEnabled) {
            throw new CustomException("Data processing is not enabled");
        }

        // Original logic for processing data
        // ...
    }

    // Custom exception class
    static class CustomException extends IllegalArgumentException {
        public CustomException(String message) {
            super(message);
        }
    }
}