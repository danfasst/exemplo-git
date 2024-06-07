import java.util.Scanner;

public class Console {
    
    private static Scanner leitor = new Scanner(System.in);

    public static String lerString() {
        return leitor.nextLine();
    }
}
