package boxingGame;

public class Fighter {
	String name;
	int health;
	int weight;
	int damage;
	int startUp=50;
	int dodge;
	public Fighter(String name, int health, int weight, int damage, int dodge) {
		
		this.name = name;
		this.health = health;
		this.weight = weight;
		this.damage = damage;
		this.dodge= dodge;
	}
	public int hit(Fighter foe) {
		System.out.println("---------");
		System.out.println(this.name+ " ==> "+foe.name+ " " +this.damage+ " hasar vurdu! ");
		if(foe.dodge()) {
			System.out.println(foe.name + " gelen hasarý savurdu!");
			return foe.health;
			
		}
		if(foe.health-this.damage<0) {
			return 0;
		}
		return foe.health-this.damage;
	}
	public boolean startUp() {
		double randomNumber=Math.random()*100;
		return randomNumber<=this.startUp;
	}
	public boolean dodge() {
		double randomNumber=Math.random()*100;
		return randomNumber<=this.dodge;
	}

}
