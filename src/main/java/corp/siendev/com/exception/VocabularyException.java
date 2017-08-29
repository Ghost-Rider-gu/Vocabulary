package corp.siendev.com.exception;

/**
 * General exception for application.
 *
 * @author Golubnichenko Yuriy
 */
public class VocabularyException extends Exception {

    public VocabularyException(String message) {
        super(message);
    }

    public VocabularyException(String message, Throwable cause) {
        super(message, cause);
    }

}
