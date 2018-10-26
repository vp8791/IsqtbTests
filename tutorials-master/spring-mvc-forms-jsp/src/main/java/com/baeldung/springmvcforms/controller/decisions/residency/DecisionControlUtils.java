package com.baeldung.springmvcforms.controller.decisions.residency;

import com.baeldung.springmvcforms.domain.DecisionTable;

public class DecisionControlUtils {
	
	private static final int MIN_AGE = 18;
	private static final int MAX_AGE = 55;

	public static boolean issueMemberShip(DecisionTable decisionTable) {
		// Rule1
		if (!decisionTable.isIndianResident()) {
			return false;
		}

		boolean ageBetwee18And55 = isNumberBetween18And55(decisionTable.getAge());

		// Rule2
		if (decisionTable.isIndianResident() && !ageBetwee18And55) {
			return false;
		}

		// Rule3
		if (decisionTable.isIndianResident() && ageBetwee18And55 && !decisionTable.isMarried()) {
			return true;
		}

		// Rule4
		if (decisionTable.isIndianResident() && ageBetwee18And55 && decisionTable.isMarried()) {
			return true;
		}

		// None of the Rule Matched
		return false;

	}

	public static boolean offer10PercentDiscount(DecisionTable decisionTable) {
		// Rule1
		if (!decisionTable.isIndianResident()) {
			return false;
		}

		boolean ageBetwee18And55 = isNumberBetween18And55(decisionTable.getAge());

		// Rule2
		if (decisionTable.isIndianResident() && !ageBetwee18And55) {
			return false;
		}

		// Rule3
		if (decisionTable.isIndianResident() && ageBetwee18And55 && !decisionTable.isMarried()) {
			return true;
		}

		// Rule4
		if (decisionTable.isIndianResident() && ageBetwee18And55 && decisionTable.isMarried()) {
			return false;
		}

		// None of the Rule Matched
		return false;

	}

	public static boolean isNumberBetween18And55(int age) {
		if (age >= MIN_AGE && age <= MAX_AGE) {
			return true;
		}

		return false;
	}

}
