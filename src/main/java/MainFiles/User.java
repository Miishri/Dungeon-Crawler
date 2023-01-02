package MainFiles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Objects;
import java.util.Scanner;

public class User {
    private Scanner scanner;

    public User () {
        this.scanner = new Scanner(System.in);
    }
    public void userStartGame() {
        try {
            FileOutputStream fileStream = new FileOutputStream("rpgData.json");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);

            System.out.println("|----------------------|");
            System.out.println("| Welcome to Kiwi RPG! |------------------------------------------------------------|");
            System.out.println("| There are ten bosses you are supposed to beat and each boss gives you exp + coins |");
            System.out.println("| You can do bosses multiple of items, and they can DROP items                      |----------------------------|");
            System.out.println("| The more you level up, the higher stats you have, and you can purchase equipment from the shop for extra stats |");
            System.out.println("|----------------------------------------------------------------------------------------------------------------|");

            System.out.println("Select a username to continue!");
            String usernameInput = scanner.nextLine();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
