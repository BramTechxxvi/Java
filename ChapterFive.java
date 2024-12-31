import java.util.Scanner;
	public class ChapterFive{

	public static void main(String[] args){	
	Scanner userInput = new Scanner(System.in);

	System.out.println("""
5.1 (a)	for statements are used for counter controlled iteration and while statement are used for setinel controlles iteration

    (b) After
    (c) Switch statement
    (d) Continue
    (e) &&
    (f) False
    (g) Static

""");
	
	System.out.println("""
5.2 (a) False, default case is optional
    (b) False, it is used to exit each switch statement
    (c) False, both expressions must be true when using && operator 
    (d) True
    (e) True
    (f) False, switch statement does test range of values, each value will be in a seperate case.
    (g) True

""");

	System.out.println("""
5.3 (a) int sum = 0;
	for(int count = 1; count <= 99; count++){
	if(count % 2 != 0)
	sum += total;
}
	System.out.println("sum");

    (b) double value = Math.pow(2.5, 3)
    (c) int count = 1;
	while(count <= 20){
	count++;
	if (count % 5 == 0)
	System.out.println();
	else{
	System.out.println('\t');
}
}

    (d) for(int count = 1; count <= 20; count++){
	if (count % 5 == 0)
	System.out.println();
	else{
	System.out.println('\t');
}
}

""");

	System.out.println("""
5.4 (a) i = 1;
	while(i <= 10){
	++i;
}
    (b) for( int k = 1; k != 10; k++){
	System.out.println((double)k / 10);
}
    (c) switch(n){
		case 1: System.out.println("The number is 1"); break;
		case 2:	System.out.println("The number is 2"); break;
		default: System.out.println("The number is not 1 or 2"); break;
}
    (d) n = 1;
	while(n <= 10){
	System.out.println("n++");
}

""");

	System.out.println("""
5.5



""");

	System.out.println("""
5.6



""");

	System.out.println("""
5.7


""");


	System.out.println("""
5.8

""");

	System.out.println("""
5.9 (a) int i = 1;
	while (i <= 10)
	System.out.println(i++);

    (b) 
    (c) for(int i = 19; i > 1; i-=2)
	System.out.println(i);

    (d) counter = 0;
	do{
	System.out.println(counter);
	counter+=2;
}
	while(counter <= 51);
""");


       }


}