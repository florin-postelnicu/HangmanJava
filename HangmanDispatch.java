


import java.util.Scanner;
import java.lang.*;

class HangmanDispatch {
    Scanner scan = new Scanner(System.in);

    public char Invite_play() {
        System.out.println("Do you want to play one more game y\\n");

        char invite = scan.next().charAt(0);
        return invite;
    }
    public HangmanDispatch() {
        if(Invite_play()!='y'){
            System.out.println("Thank you for playing HangmanJ  !");
            System.exit(0);
        }
        else{
            HangmanEngine hangman_game = new HangmanEngine();
            hangman_game.Hange();
        }
    }
}

class PlayDaGameHM{
    public static void main(String[] args) {
        new HangmanDispatch();
    }}
