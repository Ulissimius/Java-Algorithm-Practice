import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//6.5 Implement a recursive approach to showing all the teams that can be created from a group (n things taken k at a time). Write the recursive showTeams() method and a main() method to prompt the user for the group size and the team size to provide arguments for showTeam() , which then displays all the possible combinations.

public class ShowTeamsApp {

	static int total = 0; //Keeps count of the # of combinations, no need to reset since the program doesn't loop.
		
	public static void main(String[] args) throws IOException 
	{
		int groupSize; //Total # of people to pick from
		int teamSize; //Absolute size of the team
		char teamMember = 'A'; //Represents team members by letter
		String display = ""; //The displayed output
		
		System.out.print("Please enter size of the Group: ");
		groupSize = getInt();
		System.out.print("Please enter size of the Team: ");
		teamSize = getInt();
		
		//Run the method
		showTeam(display, teamMember, groupSize, teamSize);
		//Display the count of combinations
		System.out.println("Total combinations: " + total);
    }

    public static void showTeam(String display, char teamMember, int n, int k) //n = groupSize, k = teamSize
    {
    	if (n==0||k==0||k>n) {
			if (k == 0) {
				total++;
				System.out.println("'" + display + "'" + " is Team " + total);
				return;
			}
			return;
		}
    	else {
			showTeam(display+teamMember,(char)(teamMember+1),n-1,k-1);
			showTeam(display,(char)(teamMember+1),n-1,k);
		}
    }
    
	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

	public static int getInt() throws IOException {
		String s = getString();
		return Integer.parseInt(s);
	}

}
