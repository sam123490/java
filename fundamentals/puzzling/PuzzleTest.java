public class PuzzleTest {
    public static void main(String[] args) {
        PuzzleJava puzzleJava = new PuzzleJava();

        // GetTenRolls
        System.out.println("-----getTenRolls test-----");
        int[] myArray = puzzleJava.getTenRolls();
        System.out.println(myArray + "\n");

        // getRandomLetter
        System.out.println("-----getRandomLetter test-----");
        char myRandLetter = puzzleJava.getRandomLetter();
        System.out.println(myRandLetter + "\n");

        // generatePassword
        System.out.println("-----randPassword test-----");
        String randPassword = puzzleJava.generatePassword();
        System.out.println(randPassword);
    }
}