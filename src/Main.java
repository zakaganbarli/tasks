import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("reqemi daxil et");
//            int fesi = scanner.nextInt();
//
//            switch (fesi) {
//                case 1,2,3:
//                    System.out.println("qis");
//                    break;
//                case 4,5,6:
//                    System.out.println("yaz");
//                    break;
//                case 7,8,9:
//                    System.out.println("yay");
//                    break;
//                case 10,11,12:
//                    System.out.println("payiz");
//                    break;
//                default:
//                    System.out.println("Yanlış giriş!");
//            }
//        }
//    }


        // 1-den n-dek ededler verilib n-i inputdan alin. O ededler icerisinde switch-case ile yoxlayin, 1-5
        //arasinda olanlari taapdiqda, capa "5-10 arasindadir" yazin. Default-da da eded 10-dan boyukdur cixsin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("reqemi daxil edin");
        int n = scanner.nextInt();

        switch (n) {
            case 1, 2, 3, 4, 5:
                System.out.println("1-5 arasindadir");
                break;
            case 6,7,8,9,10:
                System.out.println("5-10 arasindadir");
                break;
            default:
                System.out.println("eded 10-dan boyukdur");
        }


    }
}

