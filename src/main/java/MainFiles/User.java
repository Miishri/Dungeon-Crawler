package MainFiles;

import MainFiles.character.Charactor;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class User {
    private Scanner scanner;

    public User () {
        this.scanner = new Scanner(System.in);
    }
    public void userStartGame() {
        try {
            FileOutputStream outputStream = new FileOutputStream("rpgData.json");
            ObjectOutputStream os = new ObjectOutputStream(outputStream);

            Path checkPath = Paths.get("rpgData.json");
            if (!checkPath.toFile().exists()){
                System.out.println("|----------------------|");
                System.out.println("| Welcome to Kiwi RPG! |------------------------------------------------------------|");
                System.out.println("| There are ten bosses you are supposed to beat and each boss gives you exp + coins |");
                System.out.println("| You can do bosses multiple of items, and they can DROP items                      |----------------------------|");
                System.out.println("| The more you level up, the higher stats you have, and you can purchase equipment from the shop for extra stats |");
                System.out.println("|----------------------------------------------------------------------------------------------------------------|");

                System.out.print("Enter a username to continue, USERNAME: ");
                String usernameInput = scanner.nextLine();
                Charactor newUserCharacter = new Charactor(usernameInput);

            }else {
                FileInputStream inputStream = new FileInputStream("rpgData.json");
                ObjectInputStream is = new ObjectInputStream(inputStream);
                Object loadCharacter = is.readObject();
                Charactor loadedCharactor = (Charactor) loadCharacter;
                System.out.println("|------------------------------|");
                System.out.println("Welcome back," + loadedCharactor.getName() + "!");
                System.out.println("|------------------------------|");

                is.close();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
