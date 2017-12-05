package com.exercises.maven.week11_exercise03;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class ConversorDegreesRadianTest {
	private static final Logger LOG = Logger.getLogger(ConversorDegreesRadian.class.getName());
	ConversorDegreesRadian c = new ConversorDegreesRadian();
	Random random = new Random();
	
	public double degrees2Radians(double valueInDegrees) {
		double radians = valueInDegrees * (Math.PI / 180);
		return radians;
	}
	public double radians2Degrees(double valueInRadians) {
		double degrees = valueInRadians * (180 / Math.PI);
		return degrees;
	}
	
	@Test
	public void testDegreesToRadian() {
		
		for(int i = 0;i<10;i++) {
			double degrees = Double.valueOf(random.nextDouble()*100);
			//double resultDegreesToRadians = degrees2Radians(degrees);
			//c.degreesToRadians(degrees);
			
			LOG.info("Testing the method with: "+ degrees);
			assertEquals(degrees2Radians(degrees),c.degreesToRadians(degrees),0.1);
			
		}
		
	}
	@Test
	public void testRadianToDegrees() {
		
		for(int i = 0;i<10;i++) {
			double radians = Double.valueOf(random.nextDouble()*100);
			//double resultRadiansToDegrees = radians2Degrees(radians);
			//c.radiansToDegrees(radians);
			
			LOG.info("Testing the method with: "+ radians);
			assertEquals(radians2Degrees(radians),c.radiansToDegrees(radians),0.1);
			
		}
		
	}
	
	
}
