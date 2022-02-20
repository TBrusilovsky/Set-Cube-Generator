public class SetRules {

    private String set;
    private boolean allbasics;
    private double percentNonbasic;
    private int commons;
    private int rares;
    private int uncommons;
    private int specialCards;

	

    public SetRules(String set)
    {
        this.set = set;
        switch (this.set)
        {
            case "KND":
                commons = 9;
                rares = 1;
                uncommons = 3;
                specialCards = 1;
                allbasics = false;
                percentNonbasic = .4; //might be wrong
                break;
            
        }
    }

    public String getSet() {
		return this.set;
	}

	public boolean isAllbasics() {
		return this.allbasics;
	}

	public double getPercentNonbasic() {
		return this.percentNonbasic;
	}

	public int getCommons() {
		return this.commons;
	}

	public int getRares() {
		return this.rares;
	}

	public int getUncommons() {
		return this.uncommons;
	}

	public int getSpecialCards() {
		return this.specialCards;
	}
    
}
