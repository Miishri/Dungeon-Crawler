package MainFiles;

import MainFiles.character.Charactor;

import java.io.*;
import java.util.Scanner;

public class User {
    private Scanner scanner;

    public User () {
        this.scanner = new Scanner(System.in);
    }
    public void userStartGame() {
        try {
            FileOutputStream outputStream = new FileOutputStream("rpgData.txt");
            ObjectOutputStream os = new ObjectOutputStream(outputStream);

            System.out.println("|----------------------|");
            System.out.println("| Welcome to Kiwi RPG! |------------------------------------------------------------|");
            System.out.println("| There are ten bosses you are supposed to beat and each boss gives you exp + coins |");
            System.out.println("| You can do bosses multiple of items, and they can DROP items                      |----------------------------|");
            System.out.println("| The more you level up, the higher stats you have, and you can purchase equipment from the shop for extra stats |");
            System.out.println("|----------------------------------------------------------------------------------------------------------------|");
            //create character
            System.out.print("Enter a username to continue, USERNAME: ");
            String usernameInput = scanner.nextLine();
            Charactor newUserCharacter = new Charactor(usernameInput);
            System.out.println("Charactor created: " + newUserCharacter);
            System.out.println("|------------------|");
            System.out.println("What would you like to choose?");
            //Print classes
            System.out.println("[1]Assassin");
            System.out.println("[2]Swordsman");
            System.out.println("[3]Mage");
            System.out.println("[4]Necromancer");
            newUserCharacter.setCharacterClass(scanner.nextInt());
            System.out.println(newUserCharacter.getCharacterClass() + " \n HAS BEEN SELECTED AS YOUR CLASS!");

            os.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
