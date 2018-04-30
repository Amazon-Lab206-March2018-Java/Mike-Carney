
public class Calculator implements java.io.Serializable{
	private Double OperandOne;
	private Character Operation;
	private Double OperandTwo;
	private Double results = 0.00;
	
	
	public void performOperation() {
		if (Operation == '+') {
			results = OperandOne + OperandTwo;
		}
		else if (Operation == '-') {
			results = OperandOne - OperandTwo;
		}
	}
	public Double getOperandOne() {
		return OperandOne;
	}
	public void setOperandOne(Double operandOne) {
		OperandOne = operandOne;
	}
	public Character getOperation() {
		return Operation;
	}
	public void setOperation(char c) {
		Operation = c;
	}
	public Double getOperandTwo() {
		return OperandTwo;
	}
	public void setOperandTwo(Double operandTwo) {
		OperandTwo = operandTwo;
	}
	public Double getResults() {
		return results;
	}
	public void setResults(Double results) {
		this.results = results;
	}
	
}
