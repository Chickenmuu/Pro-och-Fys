package Gas_och_fluids_och_materials;
public class Pro_och_Fys {
	static double G = 9.82;
	public static double fahrenheitToCelsius(double fahrenheit) {
		
		return (fahrenheit -32)/1.8;
		
	}
	
	public static double kelvinToCelsius(double kelvin) {
		
		return kelvin + -273.15;
 	}
	
	public static double fluidPressure(Fluids fluid, double deep) {
	double fluidpressure = fluids.density*G*deep;
	return fluidpressure;
	
	}
	
	public static double PressureUnderWater(double deep) {
	double PressureUnderWater;
	return PressureUnderWater = 997*G*deep;
			
   }
	
	public static double kineticEnergy(double mass, double velocity) {
	double kineticenergy = mass*velocity;
	return kineticenergy;
		
	}
	
	public static double potentialEnergy(double mass, double height) {
	double potentialenergy = mass*height;
	return potentialenergy;
		
	}
	
	public static double fallSpeed(double height) {
	double fallspeed = Math.sqrt(height*G*2);
	return fallspeed;
		
	}
	
	public static double delta(double first, double last) {
	double delta = first - last;
	return delta;
	
	}
	
	public static double volumeToMass(Fluids fluid, double volume) {
	double volumetomass = 	Fluids.WATER.density*1000*volume;
	return volumetomass;
		
	}
	
	
}
 