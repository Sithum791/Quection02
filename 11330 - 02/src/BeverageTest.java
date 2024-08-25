import java.util.Scanner;

public class BeverageTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tea preparation
        Tea tea = new Tea();
        System.out.println("Do you want extras with your tea (yes/no)?");
        String teaExtras = scanner.nextLine();
        tea.setWantsExtras(teaExtras.equalsIgnoreCase("yes"));
        System.out.println("\nPreparing tea...");
        tea.finalTemplateMethod();

        // Coffee preparation
        Coffee coffee = new Coffee();
        System.out.println("\nDo you want extras with your coffee (yes/no)?");
        String coffeeExtras = scanner.nextLine();
        coffee.setWantsExtras(coffeeExtras.equalsIgnoreCase("yes"));
        System.out.println("\nPreparing coffee...");
        coffee.finalTemplateMethod();

        scanner.close();
    }
}