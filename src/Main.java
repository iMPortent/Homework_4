import java.util.*;

public class Main {
    public static void main(String[] args){
        Commands editHistory = new Commands();
        Scanner scanner = new Scanner(System.in);
        //boolean run = true;
        while(true){
            System.out.println("What would you like to do ?\n\nAdd\nCopy\nRemove Last\nUndo Delete ");
            String choice = scanner.nextLine();
            switch(choice.toLowerCase()){
                case "add":
                    editHistory.add();
                    break;
                case "remove":
                    editHistory.delete();
                    break;
                case "copy":
                    editHistory.copy();
                    break;
                case "undo":
                    editHistory.undo();
                    break;
                case "quit":
                    //run = false;
                    break;
                default:
                    break;
            }
        }
    }
}
