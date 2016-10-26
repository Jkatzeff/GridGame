class Character extends Unit{
	private int atkBoost;
	private int healthBoost;
	private int totMana;
	private int currMana;
	private int manaBoost;
	private int exp;
	private int manaRegen;
	private Race race;
	private Job job;
	public static final int LEFT = 0;
	public static final int RIGHT = 1;
	public static final int UP = 2;
	public static final int DOWN = 3;
	
	public Character(Race rc, Job jb, int xLocation, int yLocation){
		atk=rc.atk;
		totHealth=rc.totHealth;
		atkBoost=rc.atkBoost;
		healthBoost=rc.healthBoost;
		totMana=rc.mana;
		manaBoost=rc.manaBoost;
		manaRegen=rc.manaRegen;
		healthRegen=rc.healthRegen;
		level=1;
		exp=0;
		currMana=0;
		race=rc;
		job=jb;
		xLoc=xLocation;
		yLoc=yLocation;
	}

	public void increaseExp(int xp){
		for(;xp>=0;xp--){
			exp++;
			if(exp==10*level){
				exp=0;
				levelUp();
			}
		}
	}

	public void levelUp(){
		level+=1;
		totMana+=manaBoost;
		currMana=totMana;
		atk+=atkBoost;
		totHealth+=healthBoost;
		currHealth=totHealth;
	}

	public void move(int dir){
		if(dir==UP && yLoc>0){
			yLoc--;
		}
		if(dir==DOWN && yLoc<19){
			yLoc++;
		}
		if(dir==LEFT && xLoc>0){
			xLoc--;
		}
		if(dir==RIGHT && xLoc<19){
			xLoc++;
		}
	}
}