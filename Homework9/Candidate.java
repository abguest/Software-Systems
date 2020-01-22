
class Candidate implements Comparable<Candidate>{
	String name;
	int votes;
	
	public String toString() {
		return this.name + ":" + this.votes;
	}
	public int compareTo(Candidate them) {
		if (this.votes > them.votes) return -1;
		else if (this.votes<them.votes) return 1;
		else return this.name.compareTo(them.name);
	}
	
	public Candidate(String name, int votes) {
		this.name=name;
		this.votes=votes;
	}
}
