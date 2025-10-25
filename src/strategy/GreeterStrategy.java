package strategy;

/**
 * @author Adrià Salat
 * Strategy: contract for different "greeting" algorithms.
 * Each implementation decides how to produce the greeting text.
 */
public interface GreeterStrategy {
    /**
     * Formats a greeting for the given name.
     * @param name person name (non-null)
     * @return formatted greeting
     */
    String greet(String name);
}
