public class GuesserSolution extends Guesser {

  public int getNumber() {
        int max = 1000;
        int min = 0;
        
        for (int i = 0; i < 10; i++) {
            int number = (max + min) / 2;
            
            switch (guess(number)) {
                case "Correct!":
                    return number;
                case "Too high!":
                    max = number;
                    break;
                case "Too low!":
                    min = number;
                    break;
            }
        }
        return 0;
    }
}