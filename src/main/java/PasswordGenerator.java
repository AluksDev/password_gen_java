import java.util.Random;

public class PasswordGenerator {
    public static final String LOWERCASE_CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    public static final String UPPERCASE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String NUMBERS = "0123456789";
    public static final String SYMBOLS = "!@#$%^&*()-_=+[]{}|;:',.<>?/~";

    private final Random randomNumber;

    public PasswordGenerator(){
        randomNumber = new Random();
    }

    public String generatePassword(int length, boolean includeUpper, boolean includeLower, boolean includeNumbers, boolean includeSymbols){
        StringBuilder passwordBuilder = new StringBuilder();

        String validCharacters = "";
        if (includeLower) validCharacters += LOWERCASE_CHARACTERS;
        if (includeUpper) validCharacters += UPPERCASE_CHARACTERS;
        if (includeNumbers) validCharacters += NUMBERS;
        if (includeSymbols) validCharacters += SYMBOLS;

        for (int i=0; i<length; i++){
            int randomIndex = randomNumber.nextInt(validCharacters.length());
            char randomChar = validCharacters.charAt(randomIndex);
            passwordBuilder.append(randomChar);
        }
        return passwordBuilder.toString();
    }
}
