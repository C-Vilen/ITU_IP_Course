public class GasOverFlowException extends RuntimeException {

    public GasOverFlowException() {
       super("invalid gas amount to fill!");
    }

}