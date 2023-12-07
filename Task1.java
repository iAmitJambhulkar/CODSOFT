package TUTORIAL_JAVA;
import java.util.*;
class Game{
    int ComputerInput;int UserInput;int noOFGuesses=0;
    public void setNoOFGuesses(int guess){
        this.noOFGuesses=guess;
    }

    public int getNoOFGuesses() {
        return noOFGuesses;
    }
    Game(){
        Random random = new Random();
        this.ComputerInput=random.nextInt(100);
    }
    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        this.UserInput=sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOFGuesses++;
        if (UserInput==ComputerInput){
            System.out.printf("Congrats\nYou guessed the number" +
                    " which is %d\n& no. of guesses:%d",ComputerInput,noOFGuesses);
            return true;
        }
        else if (UserInput>ComputerInput) {
                System.out.println("The number you guessed is greater...try small one");
        }
        else if(UserInput<ComputerInput){
                System.out.println("The number you guessed is smaller...try big one");
        }
        return false;
    }

}
public class Task1 {
    public static void main(String[] args) {
        Game g = new Game();
        boolean a= false;
        while(!a) {
            g.takeUserInput();
            a= g.isCorrectNumber();
        }
    }
}
