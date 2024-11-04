import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, physics, chemistry, history, music, turkish;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Math score: ");
        math = scanner.nextInt();

        System.out.print("Physics score: ");
        physics = scanner.nextInt();

        System.out.print("Chemistry score: ");
        chemistry = scanner.nextInt();

        System.out.print("History score: ");
        history = scanner.nextInt();

        System.out.print("Music score: ");
        music = scanner.nextInt();

        System.out.print("Turkish score: ");
        turkish = scanner.nextInt();

        double avg = (math + physics + chemistry + history + music + turkish) / 6;
        System.out.println("Your average is: " + avg);
        System.out.println(avg > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");
    }
}
