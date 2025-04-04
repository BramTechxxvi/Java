public class ToDoList {

	public String getHeader() {
		return "To-Do List Manager";
	}
	
	public String getDisplay() {
		return "\n1. Add a task \n2. View tasks \n3. Mark task as complete \n4. Exit";
    	}

    //public int selectOption() {

    //}
	public static void main(String... args) { 
	ToDoList myMethod = new ToDoList();


	System.out.print(myMethod.getDisplay());
	}
}
