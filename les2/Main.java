import java.util.Scanner;

/**
 * Created by java on 29.12.2017.
 */
public class Main {
    public static void main(String[] args) {
//        String str = "Был и я среди донцов...\n"+
//        "Была пора: наш праздник молодой...\n"+
//        "В альбом (Гонимый рока самовластьем...)\n"+
//        "В альбом (Долго сих листов заветных...)\n"+
//        "В альбом А. О. Смирновой\n"+
//        "В альбом княжны А. Д. Абамалек\n"+
//        "В альбом Павлу Вяземскому\n"+
//        "В еврейской хижине лампада...\n"+
//        "В крови горит огонь желанья...\n"+
//        "В мои осенние досуги...\n"+
//        "В начале жизни школу помню я...\n"+
//        "В поле чистом серебрится Снег...\n";
//        System.out.println(str.replace("В",":-)"));
//        String str1 = "Был и я среди донцов...\n"+
//                "Была пора: наш праздник молодой...\n"+
//                "В альбом (Гонимый рока самовластьем...)\n"+
//                "В альбом (Долго сих листов заветных...)\n"+
//                "В альбом А. О. Смирновой\n"+
//                "В альбом княжны А. Д. Абамалек\n"+
//                "В альбом Павлу Вяземскому\n"+
//                "В еврейской хижине лампада...\n"+
//                "В крови горит огонь желанья...\n"+
//                "В мои осенние досуги...\n"+
//                "В начале жизни школу помню я...\n"+
//                "В поле чистом серебрится Снег...\n";
//        char ch1[] = str1.toCharArray();
//        for (int i = 0; i <= ch1.length; i++) {
//            if (i%2 == 0  ) System.out.print(ch1[i]);
//        }
//        String str2 = "Был и я среди донцов...\n"+
//                "Была пора: наш праздник молодой...\n"+
//                "В альбом (Гонимый рока самовластьем...)\n"+
//                "В альбом (Долго сих листов заветных...)\n"+
//                "В альбом А. О. Смирновой\n"+
//                "В альбом княжны А. Д. Абамалек\n"+
//                "В альбом Павлу Вяземскому\n"+
//                "В еврейской хижине лампада...\n"+
//                "В крови горит огонь желанья...\n"+
//                "В мои осенние досуги...\n"+
//                "В начале жизни школу помню я...\n"+
//                "В поле чистом серебрится Снег...\n";
//        String [] strMass = str2.split(" ");
//        int num = 0;
//        String alb = "альбом";
//        for (String strMas : strMass) {
//            if (strMas.equals(alb)) num ++;
//        }
//        System.out.println(str1);
//        System.out.println(num);

        for (int i = 0; i <= 10; i++)
        {
            System.out.println("Type any number - ");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int o = n % 2;
            switch (o) {
                case 0:
                    System.out.println("Четное число");
                    break;
                default:
                    System.out.println("Нечетное число");

            }
        }

    }

}
