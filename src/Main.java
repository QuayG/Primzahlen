import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hier werden alle Primzahlen bis zum eingegeben Endwert ausgegeben. Bitte Endwert eingeben: ");
        Scanner scanner = new Scanner(System.in);
        int ende = scanner.nextInt();
        for (int i = 1; i < ende; i++) {
            for (double j = 2; j < i; j++) {
                if (i%j == 0) {
                    if (i < ende -1) {
                        i++;
                        j = 2;
                    }
                }
            }
            System.out.println(i);
        }
    }
}
