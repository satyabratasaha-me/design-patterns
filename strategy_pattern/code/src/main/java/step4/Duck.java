package step4;

public class Duck {
	
	public FlyBehaviour flyBehaviour;
	public SwimBehaviour swimBehaviour;
	public String duckType;
	
	
    public void quack(){
        System.out.println(String.format("DuckType : %1$s can perform %2$s", this.duckType, "Quack"));
    }
    
    public void swim() {
    	swimBehaviour.swim();
    }
    
    public void fly() {
    	flyBehaviour.fly();
    }

    
}
