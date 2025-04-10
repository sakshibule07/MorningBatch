package Exception;

// Custom exception class extending RuntimeException (unchecked exception)
public class TestVote extends RuntimeException {
    public TestVote(String desc) {
        super(desc);
    }
}
