package Common;

public class MathOperation {

    public boolean doubleOrNot(String input) {
        boolean isNumeric = input.chars().allMatch(Character::isDigit);
        return isNumeric;
    }
}
