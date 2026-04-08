package com.strategypattern;

interface CalculateTimeDist
{
	void calculateTime(int time);
	void calculateDist(int distance);
	
	default void Dist(int dist)
	{
		System.out.println("All time taken are "+dist);
	}
	
	static void allTotalTime(int time)
	{
		System.out.println("Specific distance are "+time);
	}
}

class Car implements CalculateTimeDist
{

	@Override
	public void calculateTime(int time) {
		System.out.println("Car taken time are "+time);
		
	}

	@Override
	public void calculateDist(int distance) {
		System.out.println("Car taken distance are "+distance);
		
	}
	
}

class Bike implements CalculateTimeDist
{

	@Override
	public void calculateTime(int time) {
		System.out.println("Bike taken time are "+time);
		
	}

	@Override
	public void calculateDist(int distance) {
		System.out.println("Bike taken distance are "+distance);
		
	}
	
}

class Bus implements CalculateTimeDist
{

	@Override
	public void calculateTime(int time) {
		System.out.println("Bus taken time are "+time);
		
	}

	@Override
	public void calculateDist(int distance) {
		System.out.println("Bus taken distance are "+distance);
		
	}
	
}

class CalculateContext
{
	CalculateTimeDist calTD;
	
	public CalculateContext(CalculateTimeDist calTD) {
		this.calTD=calTD;
		this.calTD=calTD;
	}
	
	void CalculateTimeDist(int Time,int Dist)
	{
		//2nd call this both method and pass the value and then call go to the interface method
//		System.out.println("Taken the Time are "+Time+" and Distance are "+Dist);
		calTD.calculateTime(Time);
		calTD.calculateDist(Dist);
		calTD.Dist(Dist);
		CalculateTimeDist.allTotalTime(Time);
	}
}

public class ClientCode {
	public static void main(String[] args) {
//		Bus b=new Bus();
		
		CalculateTimeDist c=new CalculateTimeDist() {
			
			@Override
			public void calculateTime(int time) {
				System.out.println("Cover Time "+time);
				
			}
			
			@Override
			public void calculateDist(int distance) {
				System.out.println("Cover Distance "+distance);
				
			}
		};
		CalculateContext cal=new CalculateContext(c); 
		cal.CalculateTimeDist(20, 100); //1stly call the method 
	}
}
