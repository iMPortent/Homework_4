
import java.util.Scanner;
import java.util.Stack;

public class Commands {

    private static String lastRemoved;
    private static Stack<String> myString = new Stack<>();

//}    public void initilize() {
//        myString.push("d");
//

    public void delete() {
        //When user enters delete. it should delete.
        lastRemoved = myString.pop();

    }

    public void copy() {
        //copies an item
        String tail = myString.peek();
        myString.push(tail);

    }

    public void undo() {

        myString.push(lastRemoved);

    }

    public void quit() {
        System.exit(0);
    }

    public void add() {
        Scanner scanner = new Scanner(System.in);
        myString.push(scanner.nextLine());
    }


}



