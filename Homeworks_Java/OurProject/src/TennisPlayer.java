
public class TennisPlayer {
	private String fname;
	private String lname;
	private int ranking;
	private int points;
	private short tournaments;

	public TennisPlayer() {
		super();
	}

	public TennisPlayer(String fname, String lname, int ranking, int points, short tournaments) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.ranking = ranking;
		this.points = points;
		this.tournaments = tournaments;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		if (ranking <= 0) {
			return;
		}
		this.ranking = ranking;
	}

	public int getPoints() {

		return points;
	}

	public void setPoints(int points) {
		if (points < 0) {
			return;
		}
		this.points = points;
	}

	public short getTournaments() {
		return tournaments;
	}

	public void setTournaments(short tournaments) {
		if (tournaments < 0) {
			return;
		}
		this.tournaments = tournaments;
	}
}