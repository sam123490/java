import java.io.*;
import java.util.*;

public class PuzzleJava {
    Random randMachine = new Random();

    public int[] getTenRolls() {
        int[] randArray;
        randArray = new int[10];
        for (int i=0; i<10; i++) {
            randArray[i] = randMachine.nextInt(1, 21);
            System.out.print(randArray[i] + ", ");
        }
        return randArray;
    }

    public char getRandomLetter() {
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int randInt = randMachine.nextInt(0, 25);
        return alphabet[randInt];
    }

    public String generatePassword() {
        String randPassword = "random password: ";
        for (int i=0; i<8; i++) {
            String randChar = Character.toString(getRandomLetter());
            // randPassword.concat(randChar);
            randPassword = (randPassword + randChar);
        }
        return randPassword;
    }
}

