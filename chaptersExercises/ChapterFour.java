public class ChapterFour{
	public static void main(String[] args){

	System.out.println("""

4.1 (a) iteration, sequence, selection.
    (b) if else.
    (c) definite control
    (d) sentinel
    (e) sequence structure
    (f) zero
    (g) prefix 
    (h) 8
""");
	
	System.out.println("""

4.2 (a) true
    (b) true
    (c) false, a selection statement is used to decide if a condition is true or false
    (d) true
    (e) true
    (f) false, java is platform independent
    (g) true
    (h) false, it converts its operand to a double type not an integer type
    (i) false, boolean is given the value false by defalt
    (j) true
""");

	System.out.println("""

4.3 (a) x += 1
    (b) x = x + 1
    (c) x++
    (d) x = Math.addExact(x, 1)
""");

	System.out.println("""

4.4 (a) z = x++ + y
    (b) if(count > 10){
	System.out.println("Count is greater than 10")
}
    (c) total -= x--
    (d) q = q % divisor
	q %= divisor
""");

	System.out.println("""

4.5 (a) int sum = 0
    (b) int x = 1
    (c) sum = sum + x
    (d) System.out.print("the sum is:" + sum)
""");


	System.out.println("""

4.6  public class Sum{
	public static void main(String[] args){

     int sum = 0;
     int x = 1;
	while(x <= 10){
	sum += x;
	x++;
}
	System.out.println("the sum is:" + sum);
}
}
""");


	System.out.println("""

4.7 (a) 5 *= 5 = 25
    (b) 5++ = 6
""");


	System.out.println("""

4.8 (a) no closing brace for while loop.
    (b) remove semicolon after else statement.
""");

	System.out.println("""

4.9  if the condition is true, the loop wont't stop unless z is decremented.
""");



	}


}