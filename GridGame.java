import java.util.Random;

class GridGame{
	//Race name= args[0]
	//Job name = args[1]
	public static void main(String[] args){
		Random rnd = new Random()
		a=rnd.nextInt(20);
		b=rnd.nextInt(20);
		grd.makeVisible(a,b);
		Race rc = new Race(args[0]);
		Job jb = new Job(args[1]);
		Character player = new Character(rc,jb,a,b);
	}
}