package step3;

public class Duck {
	public String duckType;
	
	
    public void quack(){
        System.out.println(String.format("DuckType : %1$s can perform %2$s", this.duckType, "Quack"));
    }

    
}
