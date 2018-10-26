package com.baeldung.springmvcforms.controller.decisions.residency;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.baeldung.springmvcforms.domain.DecisionTable;

public class DecisionControlUtilsUnitTest {

	@Test
	public void testRule1() {
		DecisionTable decisionTable = new DecisionTable();
		decisionTable.setIndianResident(false);
		assertFalse(DecisionControlUtils.issueMemberShip(decisionTable));
		assertFalse(DecisionControlUtils.offer10PercentDiscount(decisionTable));
	}

	@Test
	public void testRule2_1() {
		DecisionTable decisionTable = new DecisionTable();
		decisionTable.setIndianResident(true);
		decisionTable.setAge(74);
		decisionTable.setMarried(true);
		assertFalse(DecisionControlUtils.issueMemberShip(decisionTable));
		assertFalse(DecisionControlUtils.offer10PercentDiscount(decisionTable));
	}
	
	@Test
	public void testRule2_2() {
		DecisionTable decisionTable = new DecisionTable();
		decisionTable.setIndianResident(true);
		decisionTable.setAge(74);
		decisionTable.setMarried(false);
		assertFalse(DecisionControlUtils.issueMemberShip(decisionTable));
		assertFalse(DecisionControlUtils.offer10PercentDiscount(decisionTable));
	}

	@Test
	public void testRule3() {
		DecisionTable decisionTable = new DecisionTable();
		decisionTable.setIndianResident(true);
		decisionTable.setAge(35);
		decisionTable.setMarried(false);
		assertTrue(DecisionControlUtils.issueMemberShip(decisionTable));
		assertTrue(DecisionControlUtils.offer10PercentDiscount(decisionTable));
	}
	
	@Test
	public void testRule4() {
		DecisionTable decisionTable = new DecisionTable();
		decisionTable.setIndianResident(true);
		decisionTable.setAge(35);
		decisionTable.setMarried(true);
		assertTrue(DecisionControlUtils.issueMemberShip(decisionTable));
		assertFalse(DecisionControlUtils.offer10PercentDiscount(decisionTable));
	}

}
