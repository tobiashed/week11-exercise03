package com.exercises.maven.week11_exercise03;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class ConversorDegreesRadianTest {
	private static final Logger LOG = Logger.getLogger(ConversorDegreesRadian.class.getName());
	ConversorDegreesRadian c = new ConversorDegreesRadian();
	Random random = new Random();
	
	@Test
	public void testGetAndSetDegrees() {
		c.setDegrees(7);
		assertEquals(c.getDegrees(), 7, 0);
		}
	@Test
	public void testGetAndSetRadians() {
		c.setRadians(7);
		assertEquals(c.getRadians(), 7, 0);
		}
	@Test
	public void testGetAndSetResultDegreesToRadians() {
		c.setResultDegreesToRadians(7);
		assertEquals(c.getResultDegreesToRadians(), 7, 0);
		}
	@Test
	public void testGetAndSetResultRadiansToDegrees() {
		c.setResultRadiansToDegrees(7);
		assertEquals(c.getResultRadiansToDegrees(), 7, 0);
		}
	@Test
	public void testDegreesToRadian() {
		
		for(int i = 0;i<10;i++) {
			double degrees = Double.valueOf(random.nextDouble()*100);
			double resultDegreesToRadians = Math.toRadians(degrees);
			c.setDegrees(degrees);
			c.DegreesToRadians();
			
			LOG.info("Testing the method with: "+ degrees);
			assertEquals(c.getResultDegreesToRadians(), resultDegreesToRadians,0);
			
		}
		
	}
	@Test
	public void testRadianToDegrees() {
		
		for(int i = 0;i<10;i++) {
			double radians = Double.valueOf(random.nextDouble()*100);
			double resultRadiansToDegrees = Math.toDegrees(radians);
			c.setRadians(radians);
			c.RadiansToDegrees();
			
			LOG.info("Testing the method with: "+ radians);
			assertEquals(c.getResultRadiansToDegrees(), resultRadiansToDegrees,0);
			
		}
		
	}
	
	
}
