// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    /*
    In this kata you have to write a simple Morse code decoder. While the Morse code is now mostly
    superseded by voice and digital data communication channels, it still has its use in some
     around the world.
    The Morse code encodes every character as a sequence of "dots" and "dashes".
    For example, the letter A is coded as ·−, letter Q is coded as −−·−,
    and digit 1 is coded as ·−−−−. The Morse code is case-insensitive,
    traditionally capital letters are used. When the message is written in Morse code,
    a single space is used to separate the character codes and 3 spaces are used to separate words.
    For example, the message HEY JUDE in Morse code is ···· · −·−−   ·−−− ··− −·· ·.

    NOTE: Extra spaces before or after the code have no meaning and should be ignored.

    In addition to letters, digits and some punctuation, there are some special service codes,
    the most notorious of those is the international distress signal SOS (that was first issued by Titanic),
    that is coded as ···−−−···. These special codes are treated as single special characters, and usually are
    transmitted as separate words.

    Your task is to implement a function that would take the morse code as input and return a decoded
    human-readable string.

    For example:

    MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. .")
    //should return "HEY JUDE"

    NOTE: For coding purposes you have to use ASCII characters . and -, not Unicode characters.
    Java: MorseCode.get(".--")
     */
    }
    public static String decode(String morseCode) {
        String[] morseCodeArray = morseCode.split("\\s{3,}"); // Split by three or more spaces (word separator)
        StringBuilder sb = new StringBuilder();

        for (String word : morseCodeArray) {
            String[] letters = word.split("\\s+"); // Split by one or more spaces (letter separator)
            for (String letter : letters) {
                if (!letter.isEmpty()) {
                    sb.append(getCharacter(letter));
                }
            }
            sb.append(" "); // Add space between words
        }

        return sb.toString().trim();
    }
    public static char getCharacter(String morseCode) {
        return switch (morseCode) {
            case ".-" -> 'A';
            case "-..." -> 'B';
            case "-.-." -> 'C';
            case "-.." -> 'D';
            case "." -> 'E';
            case "..-." -> 'F';
            case "--." -> 'G';
            case "...." -> 'H';
            case ".." -> 'I';
            case ".---" -> 'J';
            case "-.-" -> 'K';
            case ".-.." -> 'L';
            case "--" -> 'M';
            case "-." -> 'N';
            case "---" -> 'O';
            case ".--." -> 'P';
            case "--.-" -> 'Q';
            case ".-." -> 'R';
            case "..." -> 'S';
            case "-" -> 'T';
            case "..-" -> 'U';
            case "...-" -> 'V';
            case ".--" -> 'W';
            case "-..-" -> 'X';
            case "-.--" -> 'Y';
            case "--.." -> 'Z';
            case ".----" -> '1';
            case "..---" -> '2';
            case "...--" -> '3';
            case "....-" -> '4';
            case "....." -> '5';
            case "-...." -> '6';
            case "--..." -> '7';
            case "---.." -> '8';
            case "----." -> '9';
            case "-----" -> '0';
            default -> ' ';
        };
    }
}