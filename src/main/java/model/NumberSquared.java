/**
 * @author Lia Kruger - alkruger2
 * CIS175 - Spring 2023
 * Feb 7, 2023
 */
package model;

public class NumberSquared {
	private int number;
	private int result;

	public NumberSquared() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NumberSquared(int number) {
		super();
		this.number = number;
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getResult() {
		return number;
	}

	public void setResult(int result) {
		this.result = result * result;
	}


	@Override
	public String toString() {
		return "NumberSquarer [number=" + number + ", result=" + result + "]";
	}
}
