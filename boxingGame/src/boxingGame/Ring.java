package boxingGame;

public class Ring {
	Fighter fighter1;
	Fighter fighter2;
	int minWeight;
	int maxweight;
	
	
	public Ring(Fighter fighter1, Fighter fighter2, int minWeight, int maxweight) {
		
		this.fighter1 = fighter1;
		this.fighter2 = fighter2;
		this.minWeight = minWeight;
		this.maxweight = maxweight;
	}
	
	public boolean checkWeight() {
		return (fighter1.weight>=minWeight && fighter1.weight<=maxweight) && (fighter2.weight>=minWeight && fighter2.weight<=maxweight); 
			
	}
	public void run() {
		if(checkWeight()) {
			while(fighter1.health>0 && fighter2.health>0) {
				System.out.println( "--YENÝ ROUND--");
				if(fighter1.startUp()) {
					System.out.println(fighter1.name+ " Baþlýyor!");
					fighter2.health= fighter1.hit(fighter2);
					if(isWin()) {
					break;
				}
				}
				
				else if(fighter2.startUp()) {
					System.out.println(fighter2.name+ " Baþlýyor!");
					fighter1.health= fighter2.hit(fighter1);
					if(isWin()) {
					break;
				}
				
				}
				printScore();
			}
			
		}
		else {
			System.out.println("Sporcularýn aðýrlýklarý uyuþmuyor! ");
		}
	}
	public boolean isWin() {
		if(fighter1.health==0) {
			System.out.println(fighter2.name+" Kazandý!");
			return true;
		}
		if(fighter2.health==0) {
			System.out.println(fighter1.name+" Kazandý!");
			return true;
		}
		return false;
	}
	public void printScore() {
		System.out.println("------");
		System.out.println(fighter1.name+" Kalan can: "+ fighter1.health);
		System.out.println(fighter2.name+" Kalan can: "+ fighter2.health);
	}

}
