package net.mcreator.trademineitemrandom.procedures;

public class RandomCropStage0BoneMealSuccessConditionProcedure {
	public static boolean execute() {
		if (Math.random() <= 0.65) {
			return true;
		}
		return false;
	}
}