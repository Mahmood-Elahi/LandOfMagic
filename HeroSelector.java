package heroSelector;
import java.util.Scanner;


	import java.util.Random;
	import java.util.Scanner;

	public class HeroSelector {
		static Scanner keyb = new Scanner(System.in);
		static Scanner keya = new Scanner(System.in);

		public static void main(String[] args) {
			int user = 0;
			int userr = 0;
			int win = 0;
			String power = "";
			String boss = "";
			String checkAttack = "";
			int random = 0;
			int last = 0;
			Hero[] hero = new Hero[8];
			hero[0] = new Hero();
			hero[0].setHeroName("Flugel The Grand Mage");
			hero[0].setAge(65);
			hero[0].setHealth(50);
			hero[0].setMorality("Neutral Good");
			hero[0].setPowers("Ice Bolt");
			hero[0].setDamageDealt(80);

			hero[1] = new Hero();
			hero[1].setHeroName("Momon The Warrior God");
			hero[1].setAge(20);
			hero[1].setHealth(100);
			hero[1].setMorality("Lawful Good");
			hero[1].setPowers("Divine Axe");
			hero[1].setDamageDealt(70);

			hero[2] = new Hero();
			hero[2].setHeroName("Elytra The Archer");
			hero[2].setAge(29);
			hero[2].setHealth(70);
			hero[2].setMorality("Lawful Neutral");
			hero[2].setPowers("Godly Arrow");
			hero[2].setDamageDealt(50);

			hero[3] = new Hero();
			hero[3].setHeroName("Lisky The Rat");
			hero[3].setAge(16);
			hero[3].setHealth(40);
			hero[3].setMorality("Neutral Evil");
			hero[3].setPowers("Steal");
			hero[3].setDamageDealt(40);

			hero[4] = new Hero();
			hero[4].setHeroName("Skeleton");
			hero[4].setHealth(35);
			hero[4].setPowers("Devour");
			hero[4].setDamageDealt(50);

			hero[5] = new Hero();
			hero[5].setHeroName("Ornstein");
			hero[5].setHealth(90);
			hero[5].setPowers("Thunder Strike");
			hero[5].setDamageDealt(30);

			hero[6] = new Hero();
			hero[6].setHeroName("Smough");
			hero[6].setHealth(90);
			hero[6].setPowers("Might Of The Dragon");
			hero[6].setDamageDealt(30);

			hero[7] = new Hero();
			hero[7].setHeroName("Smaugh");
			hero[7].setHealth(100);
			hero[7].setPowers("Breath Of Extinction");
			hero[7].setDamageDealt(35);

			print(user, userr, power, win, hero, boss, checkAttack, random, last); // Call to print method

		}

		public static void print(int user, int userr, String power, int win, Hero[] hero, String boss, String checkAttack,
				int random, int last) {

			win = 0;
			do {

				System.out.println(
						"---Welcome to the Land Of Magic!--- \n ---Choose your Character to see their details--- \n 1. Mage \n 2. Warrior \n 3. Archer \n 4. Theif \n 0. Quit");
				user = keyb.nextInt();
				if (user > 0) {
					System.out.println(hero[user - 1].toString());
					System.out.println(
							"As you explore the vast plains you come across 2 crossroads. \n (1). leads to the Deathly Plains   (2). leads to the Fields of Excess. "
									+ "\n Which do you choose?");
					userr = keyb.nextInt();
				} else {
					break;
				}
				if (userr == 1) {
					win = deathlyPlains(userr, hero, user, power, win, last);
				}

				if (userr == 2) {
					win = fieldsOfExcess(userr, hero, user, power, win, last);
				}

				if (win == 1) {
					last = win(userr, hero, user, power, win, boss, checkAttack, random, last);

				}

				if (last == 1) {
					last(userr, hero, user, power, win, boss, checkAttack, random, last);
				}

			} while (true);
		}

		public static int deathlyPlains(int userr, Hero[] hero, int user, String power, int win, int last) {

			System.out.print(
					"As you traverse the Deathly Plains you observe the surroundings, you see a landscape painted by dead trees and skeletons from unfortunate travellers."
							+ "\n as you explore, a skeleton runs up to you! ");
			if (userr > 0) {
				System.out.print("As " + hero[user - 1].getHeroName() + " You have the ability to use A "
						+ hero[user - 1].getPowers() + " or " + "B run");
				power = keya.nextLine();
			}

			if (power.equals("B") || power.equals("b")) {
				System.out.println(
						"You ran like a coward and your journey as " + hero[user - 1].getHeroName() + " has ended.");
			}

			if (hero[user - 1].getDamageDealt() > hero[4].getHealth() && power.equals("A")
					|| hero[user - 1].getDamageDealt() > hero[4].getHealth() && power.equals("a")) {
				System.out.println("You used " + hero[user - 1].getPowers());
				System.out.println("You defeated the Skeleton!");

				return 1;
			} else if (hero[user - 1].getDamageDealt() < hero[4].getHealth()) {
				System.out.println("Your " + hero[user - 1].getPowers() + " was too weak and  "
						+ "The skeleton rushed up to you and used " + hero[4].getPowers() + " You died and your journey"
						+ " is over");

			}
			return 0;
		}

		public static int fieldsOfExcess(int userr, Hero[] hero, int user, String power, int win, int last) {

			System.out.print(
					"As you traverse the Fields of excess you observe the surroundings, you see a landscape painted by blooming flowers and a river lined with mysterious bulbs."
							+ "\n as you explore, one of the bulbs runs up to you! ");
			if (userr > 0) {
				System.out.print("As " + hero[user - 1].getHeroName() + " You have the ability to use A. "
						+ hero[user - 1].getPowers() + " or " + "B. run");
				power = keya.nextLine();
			}
			if (power.equals("B") || power.equals("b")) {
				System.out.println(
						"You ran like a coward and your journey as " + hero[user - 1].getHeroName() + " has ended.");

			}
			if (hero[user - 1].getDamageDealt() > hero[4].getHealth() && power.equals("A")
					|| hero[user - 1].getDamageDealt() > hero[4].getHealth() && power.equals("a")) {
				System.out.println("You used " + hero[user - 1].getPowers());
				System.out.println("You defeated the bulb!");

				return 1;
			} else if (hero[user - 1].getDamageDealt() < hero[4].getHealth()) {
				System.out.println(
						"Your " + hero[user - 1].getPowers() + " was too weak and  " + "The bulb rushed up to you and used "
								+ hero[4].getPowers() + " You died and your journey" + " is over");
			}

			return 0;
		}

		public static int win(int userr, Hero[] hero, int user, String power, int win, String boss, String checkAttack,
				int random, int last) {
			System.out.println("After defeating the monster you keep on traversing until you reach a ruined castle. "
					+ "You open the door leading in and you encounter the twin demons Ornstein and Smough. They begin to charge at you.");
			System.out.println(" As " + hero[user - 1].getHeroName() + " You have the ability to use A. "
					+ hero[user - 1].getPowers() + " or B. Run");
			power = keya.nextLine();
			if (power.equals("B") || power.equals("b")) {
				System.out.println(
						"You ran like a coward and your journey as " + hero[user - 1].getHeroName() + " has ended.");
			} else if (power.equals("A") || power.equals("a")) {
				System.out.println("Who do you wish to attack first? A. Ornstein B. Smough");
				boss = keya.nextLine();
			}

			if (boss.equals("A") || boss.equals("a")) {

//				if (hero[user - 1].getDamageDealt() > hero[5].getHealth() && power.equals("A")
//						|| hero[5].getHealth() > hero[user - 1].getHealth() && power.equals("a")) 
				if (power.equals("A") || power.equals("a")) {
					System.out.println("You used " + hero[user - 1].getPowers());
					hero[5].setHealth(hero[5].getHealth() - hero[user - 1].getDamageDealt());
					System.out.println(hero[5].getHeroName() + " Now has a health of " + (hero[5].getHealth()));
					System.out.println(hero[5].getHeroName() + " countered with " + hero[5].getPowers());
					hero[user - 1].setHealth((hero[user - 1].getHealth() - hero[5].getDamageDealt()));
					System.out.println("Your health is now " + (hero[user - 1].getHealth()));
					System.out.println(hero[user - 1].getHeroName() + " Countered with " + hero[user - 1].getPowers());
					hero[5].setHealth(hero[5].getHealth() - hero[user - 1].getDamageDealt());
					System.out.println(hero[5].getHeroName() + " has a health of " + (hero[5].getHealth()));
				}
				if (hero[user - 1].getHealth() == 0) {
					System.out.println(" You died");
				} else {
					System.out.println(hero[user - 1].getHeroName() + " Countered with " + hero[user - 1].getPowers());
					hero[5].setHealth(hero[5].getHealth() - hero[user - 1].getDamageDealt());
					System.out.println(hero[5].getHeroName() + " has a health of " + (hero[5].getHealth()));
				}
				if (hero[5].getHealth() == 0) {
					Random rand = new Random();
					random = rand.nextInt(0, 20);
					hero[user - 1].setHealth((hero[user - 1].getHealth() + random));
					System.out.println(hero[user - 1].getHeroName() + " now has " + hero[user - 1].getHealth() + " health");
					System.out.println(
							" Only " + hero[6].getHeroName() + " remains, Do you wish to A. Attack or B. Stay your hand?");
					checkAttack = keya.nextLine();
					if (checkAttack.equals("A") || checkAttack.equals("a")) {
						System.out.println("You used " + hero[user - 1].getPowers());
						hero[6].setHealth(hero[6].getHealth() - hero[user - 1].getDamageDealt());
						System.out.println(hero[6].getHeroName() + " Now has a health of " + (hero[6].getHealth()));
						System.out.println(hero[6].getHeroName() + " countered with " + hero[6].getPowers());
						hero[user - 1].setHealth((hero[user - 1].getHealth() - hero[6].getDamageDealt()));
						System.out.println("Your health is now " + (hero[user - 1].getHealth()));
						if (hero[user - 1].getHealth() == 0) {
							System.out.println(" You died");
						} else {
							System.out.println(
									hero[user - 1].getHeroName() + " Countered with " + hero[user - 1].getPowers());
							hero[6].setHealth(hero[6].getHealth() - hero[user - 1].getDamageDealt());
							System.out.println(hero[6].getHeroName() + " has a health of " + (hero[6].getHealth()));
						}

					} else if (checkAttack.equals("B") || checkAttack.equals("b")) {
						System.out.println(hero[6].getHeroName() + " used " + hero[6].getPowers());
						hero[user - 1].setHealth(hero[user - 1].getHealth() - hero[6].getDamageDealt());
						System.out.println(
								hero[user - 1].getHeroName() + " Now has a health of " + (hero[user - 1].getHealth()));
						System.out.println(hero[user - 1].getHeroName() + " countered with " + hero[user - 1].getPowers());
						hero[user - 1].setHealth((hero[user - 1].getHealth() - hero[6].getDamageDealt()));
						System.out.println("Your health is now " + (hero[user - 1].getHealth()));
						if (hero[user - 1].getHealth() == 0) {
							System.out.println(" You died");
						} else {
							System.out.println(
									hero[user - 1].getHeroName() + " Countered with " + hero[user - 1].getPowers());
							hero[6].setHealth(hero[6].getHealth() - hero[user - 1].getDamageDealt());
							System.out.println(hero[6].getHeroName() + " has a health of " + (hero[6].getHealth()));
						}

					}
				}

			} else if (boss.equals("B") || boss.equals("b")) {
				if (power.equals("A") || power.equals("a")) {
					System.out.println("You used " + hero[user - 1].getPowers());
					hero[6].setHealth(hero[6].getHealth() - hero[user - 1].getDamageDealt());
					System.out.println(hero[6].getHeroName() + " Now has a health of " + (hero[6].getHealth()));
					System.out.println(hero[6].getHeroName() + " countered with " + hero[6].getPowers());
					hero[user - 1].setHealth((hero[user - 1].getHealth() - hero[6].getDamageDealt()));
					System.out.println("Your health is now " + (hero[user - 1].getHealth()));
					System.out.println(hero[user - 1].getHeroName() + " Countered with " + hero[user - 1].getPowers());
					hero[6].setHealth(hero[6].getHealth() - hero[user - 1].getDamageDealt());
					System.out.println(hero[6].getHeroName() + " has a health of " + (hero[6].getHealth()));

					if (hero[6].getHealth() == 0) {
						Random rand = new Random();
						random = rand.nextInt(0, 20);
						hero[user - 1].setHealth((hero[user - 1].getHealth() + random));
						System.out.println(
								hero[user - 1].getHeroName() + " now has " + hero[user - 1].getHealth() + " health");
						System.out.println(" Only " + hero[5].getHeroName()
								+ " remains, Do you wish to A. Attack or B. Stay your hand?");
						checkAttack = keya.nextLine();
						if (checkAttack.equals("A") || checkAttack.equals("a")) {
							System.out.println("You used " + hero[user - 1].getPowers());
							hero[5].setHealth(hero[5].getHealth() - hero[user - 1].getDamageDealt());
							System.out.println(hero[5].getHeroName() + " Now has a health of " + (hero[5].getHealth()));
							System.out.println(hero[5].getHeroName() + " countered with " + hero[5].getPowers());
							hero[user - 1].setHealth((hero[user - 1].getHealth() - hero[5].getDamageDealt()));
							System.out.println("Your health is now " + (hero[user - 1].getHealth()));
							if (hero[user - 1].getHealth() == 0) {
								System.out.println(" You died");
							} else {
								System.out.println(
										hero[user - 1].getHeroName() + " Countered with " + hero[user - 1].getPowers());
								hero[5].setHealth(hero[5].getHealth() - hero[user - 1].getDamageDealt());
								System.out.println(hero[5].getHeroName() + " has a health of " + (hero[5].getHealth()));
							}

						} else if (checkAttack.equals("B") || checkAttack.equals("b")) {
							System.out.println(hero[5].getHeroName() + " used " + hero[5].getPowers());
							hero[user - 1].setHealth(hero[user - 1].getHealth() - hero[5].getDamageDealt());
							System.out.println(
									hero[user - 1].getHeroName() + " Now has a health of " + (hero[user - 1].getHealth()));
							System.out.println(
									hero[user - 1].getHeroName() + " countered with " + hero[user - 1].getPowers());
							hero[user - 1].setHealth((hero[user - 1].getHealth() - hero[5].getDamageDealt()));
							System.out.println("Your health is now " + (hero[user - 1].getHealth()));
							if (hero[user - 1].getHealth() == 0) {
								System.out.println(" You died");
							} else {
								System.out.println(
										hero[user - 1].getHeroName() + " Countered with " + hero[user - 1].getPowers());
								hero[5].setHealth(hero[5].getHealth() - hero[user - 1].getDamageDealt());
								System.out.println(hero[5].getHeroName() + " has a health of " + (hero[5].getHealth()));
							}

						}
					}
				}
			}
			if (hero[5].getHealth() == 0 && hero[6].getHealth() == 0) {
				return 1;
			}
			return 0;
		}

		public static void last(int userr, Hero[] hero, int user, String power, int win, String boss, String checkAttack,
				int random, int last) {
			Random rand = new Random();
			random = rand.nextInt(10, 20);
			hero[user - 1].setHealth((hero[user - 1].getHealth() + random));
			System.out.println(hero[user - 1].getHeroName() + " now has " + hero[user - 1].getHealth() + " health");
			System.out.println(
					" As you walk past the bodies of Ornstein and Smough you see a great hall, littered with the charred remains of countless bodies. \n"
							+ "You hear a deafining rumble as a towering figure approaches you. \"Who dares enter my lair? Ahh it is the legendary\" \""
							+ hero[user - 1].getHeroName() + "\"\n" + ""
							+ "\"You will perish as all the others have and your bones will forge my next toothpick!\" ");
			System.out.println(" As " + hero[7].getHeroName() + " prepares his " + hero[7].getPowers()
					+ " You have the option to A. Dodge or B. Surrender and become a servant to " + hero[7].getHeroName());
			checkAttack = keya.nextLine();
			if (checkAttack.equals("B") || checkAttack.equals("b")) {
				System.out.println(
						"\\\"You wish to submit to my will? Very well, You shall serve me for eternty and your new name shall be\\\" "
								+ hero[user - 1].getHeroName() + " Hand of " + hero[7].getHeroName());
			}
			if (checkAttack.equals("A") || checkAttack.equals("a")) {
				System.out.println(hero[user - 1].getHeroName() + " dodged the deathly flames and now readies their attack"
						+ "\n" + " You used " + hero[user - 1].getPowers());
				hero[7].setHealth(hero[7].getHealth() - hero[user - 1].getDamageDealt());
				System.out.println(hero[7].getHeroName() + " Now has a health of " + (hero[7].getHealth()));
				System.out.println(hero[7].getHeroName() + " countered with " + hero[7].getPowers());
				hero[user - 1].setHealth((hero[user - 1].getHealth() - hero[7].getDamageDealt()));
				System.out.println("Your health is now " + (hero[user - 1].getHealth()));
				if (hero[user - 1].getHealth() == 0) {
					System.out.println(" You died");
				} else {
					System.out.println(hero[user - 1].getHeroName() + " Countered with " + hero[user - 1].getPowers());
					hero[7].setHealth(hero[7].getHealth() - hero[user - 1].getDamageDealt());
					System.out.println(hero[7].getHeroName() + " has a health of " + (hero[7].getHealth()));
				}
				if (hero[7].getHealth() == 0) {
					System.out.println(
							" After defeating the great danger of the valley you bask in the overwhelming feeling of completion and you retire your weapons"
									+ "\n" + "---GAME OVER---");
				}
			}
		}

	}