package que1;
import java.util.Scanner;
public class PartyVotes {
	private String party;
	private int votes;
	Scanner sc = new Scanner(System.in);
	public PartyVotes() {
		super();
	}

	public PartyVotes(String party, int votes) {
		super();
		this.party = party;
		this.votes = votes;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	public void accept() {
		System.out.println("Enter party: ");
		this.party = sc.next();
		System.out.println("Enter votes: ");
		this.votes = sc.nextInt();
	}
	@Override
	public String toString() {
		return "PartyVotes [party=" + party + ", votes=" + votes + "]";
	}
	
	
	
	
}
