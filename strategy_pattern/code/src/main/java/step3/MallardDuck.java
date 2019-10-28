package step3;

public class MallardDuck extends Duck implements Flyable{


	public MallardDuck() {
		super.duckType = "Mallard Duck";
	}
	
	public void fly() {
		System.out.println(String.format("DuckType : %1$s can perform %2$s", this.duckType, " Regular Fly"));
	}

}
