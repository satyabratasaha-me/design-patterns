package step1;

public class Duck {
	public String duckType;
	
	
    public void quack(){
        System.out.println(String.format("DuckType : %1$s can perform %2$s", this.duckType, "Quack"));
    }

    public void swim(){
    	System.out.println(String.format("DuckType : %1$s can perform %2$s", this.duckType, "Swim"));
    }

    public void fly(){
    	System.out.println(String.format("DuckType : %1$s can perform %2$s", this.duckType, "Fly"));
    }
}
