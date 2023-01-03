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
        boolean checkForInput = true;
        try {
            FileInputStream inputStream = new FileInputStream("rpgData.txt");
            ObjectInputStream is = new ObjectInputStream(inputStream);

            Object readObject = is.readObject();
            Charactor readInChar = (Charactor) readObject;
            System.out.println("Welcome back, " + readInChar.getName() +"!");

            is.close();
        }catch (Exception e){
            checkForInput = false;
        }

        if (!checkForInput) {
            try {
                FileOutputStream outputStream = new FileOutputStream("rpgData.txt");
                ObjectOutputStream os = new ObjectOutputStream(outputStream);
                System.out.println("|----------------------|");
                System.out.println("| Welcome to Kiwi RPG! |------------------------------------------------------------|");
                System.out.println("| There are ten bosses you are required to beat and each boss gives you exp + coins |");
                System.out.println("| You can do bosses multiple of items, and they can DROP items                      |----------------------------|");
                System.out.println("| The more you level up, the higher stats you have, and you can purchase equipment from the shop for extra stats |");
                System.out.println("|----------------------------------------------------------------------------------------------------------------|");
                //create character
                System.out.print("Enter a username to continue, USERNAME: ");
                String usernameInput = scanner.nextLine();
                Charactor newUserCharacter = new Charactor(usernameInput);
                System.out.println("Charactor created: " + newUserCharacter);
                System.out.println("|-----------------------------|");
                System.out.println("What would you like to choose?");
                //Print classes
                System.out.println("[1]Assassin");
                System.out.println("[2]Swordsman");
                System.out.println("[3]Mage");
                System.out.println("[4]Necromancer");
                newUserCharacter.setCharacterClass(scanner.nextInt());
                System.out.println(newUserCharacter.getCharacterClass() + " HAS BEEN SELECTED AS YOUR CLASS!");
                os.writeObject(newUserCharacter);
                //INTRO DONE ADD OPTIONS
                System.out.println("|-------------|");
                System.out.println("| Commands!   |");
                System.out.println("| [1] Play    |");
                System.out.println("| [2] Bosses  |");
                System.out.println("| [3] Shop    |");
                System.out.println("| [4] Log out |");
                System.out.println("|-------------|");

                os.close();

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
