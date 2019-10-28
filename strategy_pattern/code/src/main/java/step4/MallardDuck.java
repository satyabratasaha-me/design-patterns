package step4;

public class MallardDuck extends Duck{

//	FlyBehaviour flyBehaviour;
//	SwimBehaviour swimBehaviour;
	public MallardDuck(String duckType) {
		super.duckType = duckType;
	}
	
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	
	public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
		this.swimBehaviour = swimBehaviour;
	}
	
}
