package Gas_och_fluids_och_materials;
public class Pro_och_Fys {
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		
		return (fahrenheit -32)/1.8;
		
	}
	
	public static double kelvinToCelsius(double kelvin) {
		
		return kelvin + -273.15;
 	}
	
	public static double fluidPressure(Fluids fluid, double deep) {
	double fluidpressure = fluids.density*9,82*deep;
	return fluidpressure;
	
	}
	
	public static double PressureUnderWater(double deep) {
	double PressureUnderWater;
	return PressureUnderWater = 997*9,82*deep;
			
   }
	
	public static double kineticEnergy(double mass, double velocity) {
	double kineticenergy = mass*velocity;
	return kineticenergy;
		
	}
	
	public static double potentialEnergy(double mass, double height) {
	double potentialenergy = mass*height;
	return potentialenergy;
		
	}
	
	public static double fallSpeed(double height)
	
	
	
}
 