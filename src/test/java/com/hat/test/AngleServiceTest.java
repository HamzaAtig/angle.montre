package com.hat.test;



import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.hat.data.Heure;
import com.hat.service.AngleService;

public class AngleServiceTest {

	public final static Logger logger = Logger
			.getLogger(AngleServiceTest.class);

	@Test
	public void testAngleServiceAssertTrue() {
		AngleService angleService = new AngleService();
		Heure heure = new Heure("1","20");
		assertTrue(angleService.detreminerAngle(heure).equals("90 °"));
	}
	
	@Test
	public void testAngleServiceAssertFalse() {
		AngleService angleService = new AngleService();
		Heure heure = new Heure("1","20");
		assertFalse(angleService.detreminerAngle(heure).equals("30 °"));
	}
	
	@Test
	public void testAngleService2AssertTrue() {
		AngleService angleService = new AngleService();
		Heure heure = new Heure("13","50");
		assertTrue(angleService.detreminerAngle(heure).equals("270 °"));
	}
	
	@Test
	public void testAngleService2AssertFalse() {
		AngleService angleService = new AngleService();
		Heure heure = new Heure("13","50");
		assertFalse(angleService.detreminerAngle(heure).equals("210 °"));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testAngleServiceHeureIndexOutOfBoundsException() {
		AngleService angleService = new AngleService();
		Heure heure = new Heure("24","20");
		angleService.detreminerAngle(heure);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testAngleServiceMinuteIndexOutOfBoundsException2() {
		AngleService angleService = new AngleService();
		Heure heure = new Heure("12","60");
		angleService.detreminerAngle(heure);
	}

}
