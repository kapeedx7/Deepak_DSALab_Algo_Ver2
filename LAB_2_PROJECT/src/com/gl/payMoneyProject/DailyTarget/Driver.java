package com.gl.payMoneyProject.DailyTarget;

public class Driver {

	public static void main(String[] args) {

		DailyTargetDeterminator determinator = new DailyTargetDeterminator();

		determinator.collectTransactionValues();
		determinator.collectDailyTargets();

		determinator.determine();

	}

}
