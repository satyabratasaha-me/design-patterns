package step2;

public class MountainDuck extends Duck {
	public MountainDuck() {
		
		super.duckType = "Mountain Duck";
	}
	
	public void swim() {
		System.out.println(String.format("DuckType : %1$s can perform %2$s", this.duckType, "Do Nothing"));
	}

    
}
