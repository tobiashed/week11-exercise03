package com.exercises.maven.week11_exercise03;

public class ConversorDegreesRadian {
	private double degrees = 0;
	private double radians = 0;
	private double resultRadiansToDegrees = 0;
	private double resultDegreesToRadians = 0;
	
	
	public void DegreesToRadians() {
		resultDegreesToRadians = Math.toRadians(degrees);
	}
	public void RadiansToDegrees() {
		resultRadiansToDegrees = Math.toDegrees(radians);
	}
		
	public double getDegrees() {
		return degrees;
	}
	public void setDegrees(double degrees) {
		this.degrees = degrees;
	}
	public double getRadians() {
		return radians;
	}
	public void setRadians(double radians) {
		this.radians = radians;
	}
	public double getResultRadiansToDegrees() {
		return resultRadiansToDegrees;
	}
	public void setResultRadiansToDegrees(double resultRadiansToDegrees) {
		this.resultRadiansToDegrees = resultRadiansToDegrees;
	}
	public double getResultDegreesToRadians() {
		return resultDegreesToRadians;
	}
	public void setResultDegreesToRadians(double resultDegreesToRadians) {
		this.resultDegreesToRadians = resultDegreesToRadians;
	}
	
	
	
}
