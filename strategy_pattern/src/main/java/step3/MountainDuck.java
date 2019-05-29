package step3;

public class MountainDuck extends Duck implements Swimable {
	public MountainDuck() {
		
		super.duckType = "Mountain Duck";
	}
	
	public void swim() {
		System.out.println(String.format("DuckType : %1$s can perform %2$s", this.duckType, "Regular Swim"));
	}
    
}
