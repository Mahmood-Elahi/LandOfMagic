package heroSelector;
public class Hero {
	private String heroName;
	private String morality;
	private String powers;
	private int age;
	private int health;
	private int damageDealt;

//Hero(String heroName, String mortality, String power, int age, int health) {
//	 
//}

	@Override // Overrides to string method to actually convert everything to a string instead
				// of printing out their memory location
	public String toString() {
		String hero; 
		hero = " Name: " + heroName + ":" + " Age: " + age + ";" + " Powers: " + powers +";" +  " Morality: " + morality +";" + " Health: " + health + ";";
		return hero;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public String getMorality() {
		return morality;
	}

	public void setMorality(String morality) {
		this.morality = morality;
	}

	public String getPowers() {
		return powers;
	}

	public void setPowers(String powers) {
		this.powers = powers;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if(health <0) {
			this.health = 0; 
		} else {
		this.health = health;
	}
		}

	public int getDamageDealt() {
		return damageDealt;
	}

	public void setDamageDealt(int damageDealt) {
		this.damageDealt = damageDealt;
	}

}