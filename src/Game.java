
import java.util.Scanner;

import static java.lang.System.exit;

public class Game {
    private String word ;
    private String hiddenWord;
    private String guessedLetters;
    private WordList wl = new WordList ();
    private Scanner reader = new Scanner (System.in);
    private int wrongPrediction=0;
    private PrintBoard board = new PrintBoard ();
    public static boolean endOf = false;

    public void Play () {
        System.out.println ("---------HANGMAN---------" +
                "\nOyun basliyor...");

        setWord ();
        sethiddenWord ();
        while (!endOfGame ()) {
            showHiddenWord ();
            makePrediction ();
            sethiddenWord ();
        }
        endOf=endOfGame ();
        if (this.wrongPrediction < 11) {
            System.out.println(new String(new char[50]).replace("\0", "\r\n"));
            System.out.println (this.hiddenWord );
            board.draw (this.wrongPrediction);
            System.out.println (" KAZANDIN \\o/" );
        }
    }

    public void setWord () {       //setter
        System.out.println ("Rastgele bir kelime uretilsin mi ? (y/n/q)" );
        String choice = reader.nextLine ();
        if (choice.equals ("y")) {                               // r = "y" ise rastgele bir kelime secilir ,
            this.word = wl.getWord ();                           // r = "n" ise kullanicidan el ile kelime girdirilir .
        }

        else if (choice.equals ("n")){
            System.out.println ("Bir kelime giriniz :" );
            this.word= reader.nextLine ();
        }
        else if (choice.equals ("q")) {
            exit(0);
        }
        else {
            System.out.println ("Gecersiz giris..." );
            setWord ();
        }

        this.guessedLetters ="";
    }

    public void sethiddenWord() {
        this.hiddenWord = "";
        for (int i=0 ; i<word.length () ; i++) {
            if (guessedLetters.indexOf (this.word.charAt(i)) >= 0 )
                this.hiddenWord+=" "+this.word.charAt (i);
            else
                this.hiddenWord+=" _";
        }

    }

    public void showHiddenWord () {
        System.out.println( this.hiddenWord );

    }

    public void makePrediction () {
        System.out.print ("Bir tahminde bulunun : ");
        String predict = reader.nextLine ( );
        if (predict.length () != 1) {
            System.out.println ("Tahmininiz bir harf olmalidir" );
            makePrediction ();
        }

        if ( !this.guessedLetters.contains (predict) ) {   // harf daha once tahmin edilmemis ise
            if ( this.word.contains (predict) ) { // eger tahminimiz kelimenin icinde geciyorsa
                System.out.println(new String(new char[50]).replace("\0", "\r\n"));
                System.out.println ("Dogru tahmin!");
                board.draw (this.wrongPrediction);

            }
            else { /// tahminimiz kelimenin icinde gecmiyorsa
                this.wrongPrediction++;
                System.out.println(new String(new char[50]).replace("\0", "\r\n"));
                System.out.println ("Yanlis tahmin!\n");
                board.draw (this.wrongPrediction);
            }
        }
        else {  /// harf daha once tahmin edilmis ise

            System.out.println(new String(new char[50]).replace("\0", "\r\n"));
            System.out.println ("Daha once tahmin edilmis bir harf girdiniz." );
            board.draw (this.wrongPrediction);
        }
        this.guessedLetters += predict;
    }

    public boolean endOfGame () {
        if (this.wrongPrediction > 10 )
            return true;

        boolean eog =true;
        for(int i=1 ; i<this.hiddenWord.length () ; i=i+2) {
            if (this.hiddenWord.charAt (i) != this.word.charAt (((i+1)/2)-1))
                eog = false;
        }
        return eog;
    }



}
