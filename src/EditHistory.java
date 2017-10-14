import java.util.*;


public class EditHistory {
    private static Stack<String> history = new Stack<>();
    private static String lastDelete = new String();
    private static Scanner scanner = new Scanner(System.in);
    public static void add(){
        String string = scanner.nextLine();
        history.push(string);
    }
    public static void removeLast(){
        if(!history.isEmpty()){lastDelete = history.pop();}else{System.out.println("Stack empty");}
    }
    public static void undo(){
        history.push(lastDelete);
    }
    public static void copy(){
        if(!history.isEmpty()){
            history.push(history.peek());
        }else{System.out.println("Stack empty");}
    }
    public static void showAll(){

        while(!history.isEmpty()){
            System.out.println(history.pop());
        }
    }
}
