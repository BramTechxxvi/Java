import java.util.Scanner;
public class MbtiPersonality {

	public static void main(String... args) {
	Scanner userInput = new Scanner(System.in);

	String[][] myersBriggs = {
				{" expend energy, enjoy groups ", " conserve energy, enjoy one one one "},
				{" interpret literally ", " look for meaning and possibilities "},
				{" logical, thinking, questioning ", " empathetic, feeling, accommodation "},
				{" organized, orderly ", " flexible, adaptable "},
				{" more outgoing, think out loud ", " more reserved, think to yourself "},
				{" practical, realistic, experiential ", " imaginative, innovative, theorectical "},
				{" candid, straight forward, frank ", " tactful, kind,  encouraging "},
				{" plan, schedule ", " unplanned, spontaneous "},
				{" seek many tasks, public activities, interaction with others ", " seek private, solitary activities with quiet to concentrate "},
				{" standard, usual, conventional ", " differenr, novel, unique "},
				{" firm, tend to critize, hold the line ", " gentle, tend to appreciate, conciliate "},
				{" regulated structured ", " easy going, live and let live "},
				{" external communicative, express yourself ", " internal, reticent, keep to yourself "},
				{" focus on here-and-now ", " look to the future, global perspective, big picture "},
				{" tough-minded, just ", " tender-hearted, merciful "},
				{" preparation plan ahead ", " go with the flow, adapt as you go "}, 
				{" active, initiate ", " reflective, deliberate "},
				{" facts, things, 'what is' ", " ideas, dreams 'what could be', philosophical "},
				{" matter of fact, issue-oriented ", " sensitive, people-oriented compassionate "},
				{" control, govern ", " latitude, freedom "},
				};


		System.out.print("Enter Your Name: ");
		String testParticipant = userInput.nextLine();

for (int row = 0; row < myersBriggs.length; row++) {   
	//for (int index = row; index < personality.length; index+4) {       
	System.out.printf("%s%d%c%n", "Question", row + 1, ':'); 
		System.out.printf("%s%s%6s%s%s%n", "a", myersBriggs[row][0], "        ", "b", myersBriggs[row][1]);
		String options = userInput.next();

if (options.equalsIgnoreCase("a")) { 
		//answerA[0] =

} else if (options.equalsIgnoreCase("b")) { 
		//answerB[s] =

} else {
	System.out.println("wrong option, kindly enter again");
	row--;
}

    // }
     }

		





					}


}