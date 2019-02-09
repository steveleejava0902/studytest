package ldcpaul.TextRPG;

public class Monster extends Character{

	private int attackDistance;

	
	
	
	public int getAttackDistance() {
		return attackDistance;
	}

	public void setAttackDistance(int attackDistance) {
		this.attackDistance = attackDistance;
	}
	
	/** =====================================
	 	- Note : 몬스터  공격 메소드
	========================================*/
	public void attack(Character real) {
		int hp = real.getHp();
		hp = hp - this.getAttackPoint();
		real.setHp(hp);
	}	
	
	/** =====================================
 		- Note : 몬스터 자동이동  메소드
	========================================*/
	public void autoMoving() {
		int xy = (int)(Math.random() * 2 ) + 1;
		//int sign 
	}
	
	
}
