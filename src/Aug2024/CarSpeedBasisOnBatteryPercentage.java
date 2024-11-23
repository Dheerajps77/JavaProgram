package Aug2024;

public class CarSpeedBasisOnBatteryPercentage {
	
	
	public static void findElectricCarSpeedCalculator()
	{
		try {
			
			int maxSpeed = 150; // Max speed at 100% battery in km/h
	        int minSpeed = 50;  // Min speed at 20% battery in km/h
	        int batteryPercent = 50; // Example battery percentage

	        if (batteryPercent > 100 || batteryPercent < 20) {
	            System.out.println("Battery percentage must be between 20 and 100.");
	        } else {
	            // Calculate speed directly
	            double speed = minSpeed + ((maxSpeed - minSpeed) / 80.0) * (batteryPercent - 20);
	            System.out.println("The car's speed at " + batteryPercent + "% battery is: " + speed + " km/h");
	        }
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void findCarSpeed()
	{
		int n=70;
		int temp=0;
		try {
			
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					temp=temp+i;					
				}
			}
			System.out.println("Speed of Car is : "+temp+", basis on batter percentage is : " +n);
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void main(String[] args) {
	
		findElectricCarSpeedCalculator();
	}

}
