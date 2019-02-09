package ldcpaul.TextRPG;



public class Hero extends Character {
	
	/*
	public Hero(int hp , String name, int attackPoint) {
		
		this.setHp(hp);
		this.setName(name);
		this.setAttackPoint(attackPoint);
	}
	
	
	public String toString(){
		return "\n hp:"+this.getHp()+"\n name:"+this.getName()+"\n attackPoint:"+this.getAttackPoint();
	}
	*/
	

	private int a_distance = 6;
	private int s_distance = 3;
	private int a_attackPoint;
	private int s_attackPoint;
	
	public int getA_distance() {
		return a_distance;
	}

	public void setA_distance(int a_distance) {
		this.a_distance = a_distance;
	}

	public int getS_distance() {
		return s_distance;
	}

	public void setS_distance(int s_distance) {
		this.s_distance = s_distance;
	}

	public int getA_attackPoint() {
		return a_attackPoint;
	}

	public void setA_attackPoint(int a_attackPoint) {
		this.a_attackPoint = a_attackPoint;
	}

	public int getS_attackPoint() {
		return s_attackPoint;
	}

	public void setS_attackPoint(int s_attackPoint) {
		this.s_attackPoint = s_attackPoint;
	}

	public Hero(String name) {
		super(name,50,1,3,15,9);
		a_attackPoint = super.getAttackPoint();
		s_attackPoint = super.getAttackPoint() * 2;
	}
	/*
	public static void main(String [] arg) {
		
		Hero h1 = new Hero(50,"Hero",3);
		System.out.print(h1);
		
	}*/
	
	/** =====================================
		 - Note: 근거리 공격 메소드
	========================================*/
	public void attack(Character real) {
		int hp = real.getHp();
		hp = hp - this.getA_attackPoint();
		real.setHp(hp);
	}
	
	/** =====================================
	 		- Note: 장거리 공격 메소드
	========================================*/
	public void attack2(Character real) {
		int hp = real.getHp();
		hp = hp - this.getS_attackPoint();
		real.setHp(hp);
	}
}
