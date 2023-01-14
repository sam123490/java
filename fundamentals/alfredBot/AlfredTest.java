public class AlfredTest {
    /*
    * This main method will always be the launch point for a Java application
    * For now, we are using the main to test all our 
    * AlfredQuotes methods.
    */
    public static void main(String[] args) {
        // Make an instance of AlfredQuotes to access all its methods.
        AlfredQuotes alfredBot = new AlfredQuotes();
        
        // Make some test greetings, providing any necessary data
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane");
        String testGuestGreetingOverloaded = alfredBot.guessGreeting("Samuel Rodriguez", "evening");
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        
        String alexisTest = alfredBot.respondBeforeAlexis(
                            "Alexis! Play some low-fi beats."
                            );
        String alfredTest = alfredBot.respondBeforeAlexis(
            "I can't find my yo-yo. Maybe Alfred will know where it is.");
        String notRelevantTest = alfredBot.respondBeforeAlexis(
            "Maybe that's what Batman is about. Not winning. But failing.."
        );
        
        // Print the greetings to test.
        System.out.println(testGreeting);
        
        // Uncomment these one at a time as you implement each method.
        System.out.println(testGuestGreeting);
        System.out.println(testGuestGreetingOverloaded);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
        System.out.println(alfredBot.respondBeforeAlexis("Alfred, what is in my Amazon shopping kart?"));
        System.out.println(alfredBot.respondBeforeAlexis("I can't find my sunglasses... Alfred, where are they?"));
        System.out.println(alfredBot.bestMovie("Alfred, What is the best movie of all time?"));
        System.out.println(alfredBot.respondBeforeAlexis("Hey Alfred. Where does the sun go at night?"));
        System.out.println(alfredBot.respondBeforeAlexis("Alfred!"));
        System.out.println(alfredBot.bestMovie("Alfred, What is the best movie of all time?"));
    }
}