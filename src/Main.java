import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rengi daxil edin");
        String isiq = scanner.nextLine();

        switch (isiq) {
            case "sari":
                System.out.println("Hazirlasin");
                break;

            case "qirmizi":
                System.out.println("Dayanin");
                break;

            case "yasil":
                System.out.println("Hereket edin");
                break;

            default:
                System.out.println("Sfetefor islemir");
        }
    }
}













