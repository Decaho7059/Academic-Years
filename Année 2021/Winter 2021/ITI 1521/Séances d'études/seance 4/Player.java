public class Player implements Hand {

	public enum Option {rock, paper, scissors};

	public static final String ROCK = "ROCK";
	public static final String PAPER = "PAPER";
	public static final String SCISSORS = "SCISSORS";
	
	private String name;
	private Option option = Option.rock;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setOption(String o) throws Exception {
		if (o.compareToIgnoreCase(ROCK) == 0) {
			option = Option.rock;
		} else if (o.compareToIgnoreCase(PAPER) == 0) {
			option = Option.paper;
		} else if (o.compareToIgnoreCase(SCISSORS) == 0) {
			option = Option.scissors;
		} else {
			throw new Exception("invalid hand");
		}
	}

	public Option getOption() {
		return option;
	}


	public boolean isRock() {
		return option == Option.rock;
	}

	public boolean isScissor() {
		return option == Option.scissors;
	}
	
	public boolean isPaper() {
		return option == Option.paper;
	}

	public int compareTo(Player p2) {
		// return 0 si c'est draw
		// return 1 si this gagne
		// return -1 si p2 gagne
		if (this.option == p2.option) {
			return 0;
		} else if(this.isScissor() && p2.isPaper() 
				|| this.isRock() && p2.isScissor()
				|| this.isPaper() && p2.isRock()) {
			return 1;
		} else {
			return -1;
		}
	}

	public static int compareTo(Player p1, Player p2) {
		// return 0 si c'est draw
		// return 1 si p1 gagne
		// return -1 si p2 gagne
		if (p1.option == p2.option) {
			return 0;
		} else if(p1.isScissor() && p2.isPaper() 
				|| p1.isRock() && p2.isScissor()
				|| p1.isPaper() && p2.isRock()) {
			return 1;
		} else {
			return -1;
		}
	}
}
