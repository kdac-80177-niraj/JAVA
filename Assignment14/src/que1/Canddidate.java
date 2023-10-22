package que1;

import java.util.Scanner;

public class Canddidate {
		private int id;
		private String name;
		private String party;
		private int votes;
		Scanner sc = new Scanner(System.in);
		
		public Canddidate() {
			super();
		}

		public Canddidate(int id, String name, String party, int votes) {
			super();
			this.id = id;
			this.name = name;
			this.party = party;
			this.votes = votes;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
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
			System.out.println("Enter name: ");
			this.name = sc.next();
			System.out.println("Enter party: ");
			this.party = sc.next();
			System.out.println("Enter votes: ");
			this.votes = sc.nextInt();
		}

		@Override
		public String toString() {
			return "Canddidate [id=" + id + ", name=" + name + ", party=" + party + ", votes=" + votes + "]";
		}
		
		
		
}
