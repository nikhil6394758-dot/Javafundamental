import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Apna naam likho:");
        String name = sc.nextLine();
        System.out.println("Hello" + name);
    }
    
}
