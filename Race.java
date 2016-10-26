class Race{
	public int atk;
	public int atkBoost;
	public int healthBoost;
	public int totHealth;
	public int mana;
	public int manaBoost;
	public int healthRegen;
	public int manaRegen;
	public Race(String rc){
		switch(rc){
			case "Orc": //Orcs have high attack but low health, low mana, low regen
				atk=20;
				atkBoost=15;
				totHealth=10;
				healthBoost=8;
				mana=7;
				manaBoost=3;
				healthRegen=1;
				manaRegen=1;
				break;
			case "Human": //Humans have medium attack, health, mana, regen
				atk=14;
				atkBoost=12;
				totHealth=15;
				healthBoost=10;
				mana=12;
				manaBoost=5;
				healthRegen=2;
				manaRegen=2;
				break;
			case "Hobbit": //Hobbits have low attack, health, but high mana and regen
				atk=10;
				atkBoost=14;
				totHealth=12;
				healthBoost=12;
				mana=15;
				manaBoost=7;
				healthRegen=6;
				manaRegen=4;
				break;
			case "Elf": //Elves have low attack, low health, medium mana, and medium regen, but their mana grows VERY quickly as they level
				atk=11;
				atkBoost=11;
				totHealth=11;
				healthBoost=11;
				mana=11;
				manaBoost=11;
				manaRegen=3;
				healthRegen=3;
				break;
			default:
				break;
		}
	}
}