package com.gl.denominationsCalculator;

public class Driver {
	public static void main(String[] args) {

		DenominationsCalculator calculator = new DenominationsCalculator();

		calculator.collectDenominations();
		calculator.collectPaymentAmount();

		calculator.calculate();

	}

}
