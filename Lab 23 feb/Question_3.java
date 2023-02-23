package Lab_23_feb;
// Question 3

class Sports{  // parent class
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }}
class Soccer extends Sports{  // child class extends from parent class
    String getName(){
        return "Soccer Class";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }}
public class Question_3 {
	public static void main(String[] args) {
		// object for parent class
		Sports game=new Sports(); 
		System.out.println(game.getName());
		game.getNumberOfTeamMembers();
		// object for child class
		Soccer game2=new Soccer(); 
		System.out.println(game2.getName());
		game2.getNumberOfTeamMembers();	
	}
}	
