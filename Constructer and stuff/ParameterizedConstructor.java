// Defining a class named 'Anime'
// This class will have attributes and a constructor to initialize anime details
class Anime {
    String AnimeName;  // Attribute to store the name of the anime
    String Genre;      // Attribute to store the genre of the anime
    float Rating;      // Attribute to store the rating of the anime
    int NumberOfEpsiode; // Attribute to store the number of episodes

    // Parameterized constructor to initialize the attributes
    Anime(String AnimeName, String Genre, float Rating, int NumberOfEpsiode) {
        this.AnimeName = AnimeName;  // Assigning constructor parameter to class attribute
        this.Genre = Genre;          // Assigning constructor parameter to class attribute
        this.Rating = Rating;        // Assigning constructor parameter to class attribute
        this.NumberOfEpsiode = NumberOfEpsiode; // Assigning constructor parameter to class attribute
    }
    
    // Method to display anime details
    public void call() {
        System.out.println("Anime Name: " + AnimeName);  // Printing the name of the anime
        System.out.println("Genre: " + Genre);          // Printing the genre of the anime
        System.out.println("Rating: " + Rating);        // Printing the rating of the anime
        System.out.println("Number of episodes: " + NumberOfEpsiode); // Printing the number of episodes
    }
}

// Main class where execution begins
public class ParameterizedConstructor {
    public static void main(String[] args) {
        // Creating an object of the 'Anime' class and initializing it using the constructor
        Anime Anime1 = new Anime("One Piece", "Adventure", 10, 1000);
        
        // Calling the 'call' method to display the details of 'Anime1'
        Anime1.call();
    }
}

