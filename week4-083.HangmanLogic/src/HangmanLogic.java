
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if (this.guessedLetters.contains(letter)) {
        } else {
            if (this.word.contains(letter)) {
                this.guessedLetters += letter;
            } else {
                this.numberOfFaults++;
                this.guessedLetters += letter;
            }
        }
        // if the letter has already been guessed, nothing happens
        // it the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters
    }

    public String hiddenWord() {
        String hiddenWord = "";
        int i = 0;
        while (i < this.word.length()) {
            String a = this.word.charAt(i) + "";
            if (this.guessedLetters.contains(a)) {
                hiddenWord = hiddenWord + a;
            } else {
                hiddenWord = hiddenWord + "_";
            }
            i++;
        }
        return hiddenWord;
    }
}
