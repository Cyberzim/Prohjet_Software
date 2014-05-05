package projektplanner.app;

public class OperationNotAllowedException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private String operation;
	
	public OperationNotAllowedException(String operation) {
		super(operation + " operation not allowed if not admin.");
		this.operation = operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getOperation() {
		return operation;
	}
}
