
package ldcpaul.TextRPG;

public class Character {

	// name , hp , level attack_p , postion
	
	private String name;
	private int X,Y;
	private int hp;
	private int attackPoint;
	private int level;
	
	public Character() {
		System.out.print("캐릭터생성");
	}

	public Character(String name, int x, int y, int hp, int attackPoint, int level) {
		super();
		this.name = name;
		X = x;
		Y = y;
		this.hp = hp;
		this.attackPoint = attackPoint;
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttackPoint() {
		return attackPoint;
	}

	public void setAttackPoint(int attackPoint) {
		this.attackPoint = attackPoint;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	
}
