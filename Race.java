class Race{
	public int atk;
	public int atkBoost;
	public int healthBoost;
	public int totHealth;
	public int mana;
	public int manaBoost;
	public Race(String rc){
		switch(rc){
			case "Orc":
				atk=20;
				atkBoost=15;
				totHealth=10;
				healthBoost=8;
				mana=10;
				manaBoost=0;
				break;
			
		}
	}
}