package boxingGame;

public class Main {

	public static void main(String[] args) {
		Fighter fighter1=new Fighter("Marc",100,90,15,0);
		Fighter fighter2=new Fighter("Alex",95,100,15,0);
		Ring ring=new Ring(fighter1,fighter2, 90,100);
		ring.run();

	}

}
