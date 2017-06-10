import java.util.ArrayList;

public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> votes) {
		int snowden = 0;
		int francis = 0;
		String winner;
		for (String vote : votes) {
			if (vote.equalsIgnoreCase("edward snowden")) {
				snowden++;
			} else if (vote.equalsIgnoreCase("pope francis")) {
				francis++;
			}
		}
		if (snowden > francis) {
			winner = "edward snowden";
		} else if (francis > snowden) {
			winner = "pope francis";
		} else {
			winner = "TIE";
		}
		return winner;
	}

}
