import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Hello, %s. Lovely to see you.", name);
    }

    public String guessGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        java.util.Date date = new java.util.Date();
        return String.format("It is currently %s.", date);
    }
    int numOfAlfredCalls;
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if(numOfAlfredCalls == 3) {
            numOfAlfredCalls += 1;
            String annoyed = "can i get a break! just for five minutes!";
            return annoyed.toUpperCase();
        }
        else if(numOfAlfredCalls > 3) {
            numOfAlfredCalls += 1;
            String irritated = "PLEASE... PLEASE JUST LEAVE ME ALONE...";
            return irritated.toLowerCase();
        }
        else if(conversation.indexOf("Alexis") != -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if(conversation.indexOf("Alfred") != -1) {
            numOfAlfredCalls += 1;
            return "At your service. Right away.";
        }
        else {
            return "Right. And with that I shall retire.";
        }
    }
    public String bestMovie(String conversation) {
        if(numOfAlfredCalls <= 3) {
            if(conversation.indexOf("best") != -1 && conversation.indexOf("movie") != -1) {
                return "The best movie undoubtedly is The Dark Knight.";
            }
            else {
                return "At your service. Right away.";
            }
        }
        else {
            return "The best movie ever is Superman, he's also a better hero...";
        }
    }
}