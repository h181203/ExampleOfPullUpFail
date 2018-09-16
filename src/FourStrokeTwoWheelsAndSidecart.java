
public class FourStrokeTwoWheelsAndSidecart extends TwoWheelMotorcycle {
	FourStrokeTwoWheelsAndSidecart(){
		bikeWheels = 2;
	}
	
	@Override
	public int countWheels(){
		return super.countWheels() + 1;
	}
}
