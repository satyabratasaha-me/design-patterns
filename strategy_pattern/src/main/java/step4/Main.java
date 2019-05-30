package step4;

public class Main {

		public static void main(String [] args) {
			
			MallardDuck mallardDuck = new MallardDuck("Mallard Duck");
			mallardDuck.setFlyBehaviour(new MarioFly());
			mallardDuck.setSwimBehaviour(new MarioSwim());
			
			mallardDuck.quack();
			
			mallardDuck.swim();
			
			mallardDuck.fly();
			
			mallardDuck.setSwimBehaviour(new RegularSwim());
			
			mallardDuck.swim();
			
		}
}
