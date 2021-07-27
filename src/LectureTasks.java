import java.util.Arrays;

public class LectureTasks {
    public static void main(String[] args) {

        //STRINGS IN JAVA. STRING MANAGEMENT

        String firstString = "abc";
        String secondString = "abc";

        //Length of a string

        String someParagraphIChose = "Lorem is a long established fact that a reader lorem Lorem will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like)";
        System.out.println("Length of my paragraph is: " + someParagraphIChose.length());

        //Get the needed character out of a string
        System.out.println("Character in position 159 is: " + someParagraphIChose.charAt(159));

        //Verify if two string variables are the same
        //comparing one string to the other
        System.out.println("These two variables are identical: " + firstString.equals(someParagraphIChose));
        System.out.println("These two variables are identical: " + firstString.equals(secondString));

        //Compare variables ignoring the CASE of the characters
        String lowerCaseName = "liza";
        String capitalCaseName = "Liza";

        //tHIS WILL BE FALSE (NOT IDENTICAL)
        System.out.println("Case sensitive equals method: " + lowerCaseName.equals(capitalCaseName));
        //THIS WILL BE TRUE (IDENTICAL)
        System.out.println("Case INSENSITIVE equals method: " + lowerCaseName.equalsIgnoreCase(capitalCaseName));


        //REGEX + MATCHES (case senstive)
        //matches = Verify if the string corresponds to a specific mask. e.g., bank account, email, name, etc.
        //Its for finding a specific type?? of string..
        //works with regex (regular expressions) - how different patterns are defined

        //See if lorem ipsum String starts with the word "LOREM" (true or false)
        someParagraphIChose.matches("lorem.*"); // .* means after this word we expect to have any characters after that word
        System.out.println("This should match a word - Lorem.. - " + someParagraphIChose.matches("Lorem.*"));

        //REGEX start of string "^Lorem.*"
        //REGEX ends with this text "Lorem$"
        //REGEX word Lorem is starting in third character like "ABLorem ipsum" - "\w\wLorem"


        //Wrapper class
        //Converting String to Primitive (numeric)
        //example: System a sends data to system b for example

        String measurmentA = "10";
        //can't do math with this number because its a string

        //so we use PARSING
        byte parsedMeasurmentA = Byte.parseByte(measurmentA);
        //now the string is changed to a byte with value 10

        System.out.println("Measurment was: " + parsedMeasurmentA);
        System.out.println("Doubled measurment is: " + parsedMeasurmentA * 2);

        String measurementB = "105.214567";
        double parsedMeasurementB = Double.parseDouble(measurementB);

        System.out.println("Parsed double is: " + measurementB);


//        //WHAT IF THERES A NUMBER AND SOME TEXT?
//        String measurementD = "105.1234 Error. Error. Something is wrong";
//        double erroredMeasurement = Double.parseDouble(measurementD);
//
//        System.out.println("Is this a number? " + erroredMeasurement);
//        //IT WONT WORK


        if (firstString.charAt(0) == 'a') {
            System.out.println("Variable starts with a letter A");
        } else {
            System.out.println("Variable does not start with a letter A");
        }


        //Converting from string to a boolean value = true or false

        String trueVariable = "true";
        if (Boolean.parseBoolean(trueVariable)) {
            System.out.println("Variable trueVariable consists of TURE");
        }

        String falseVariable = "false";
        if (Boolean.parseBoolean(falseVariable)) {
            System.out.println("This condition will never execute");
        } else {
            System.out.println("This condition will execute!");
        }

        //Formatting the String
        // %f is a placeholder for the float number
        System.out.println(String.format("This is a simple text. And this is a floating number %f. Cool, right?", 108.2345f));
        // same number but with 2 digits after comma - %.2f
        System.out.println(String.format("This is a simple text. And this is a floating number %.2f. Cool, right?", 108.2345f));
        //same number with 3 digits after comma - %.3f and so on

        float float2Digits = 2123.458961254f;
        System.out.println(String.format("Another example of a parsed floating number %.2f. Cool, right?", float2Digits));



        //Replacing/adding multiple things at once with String format method
        // %s - string
        // %c - char
        // %d - decimal (int, byte, short, long)
        // %f - float
        char myChar = 'Z';
        short myShort = 1900;
        String myString = "My string";

        System.out.println(String.format("String: %s, Decimal: %d, Char: %c", myString, myShort, myChar));



        //NULL and REFERENCES
        String myName = "Liza";
        //to remove it you just have to rewrite it with NULL
        myName = null;
        //Now the variable myName is pointing to an empty memory cell in RAM because its content has been removed.
        //This will print the word NULL (point the variable to a null)
        //used to clear variables in between multiple uses
        //(for example cash machine asking to write your PIN. it needs to be erased inbetween uses)




        //REGEX defines how text should look like
        //usually used when using standardized input - website, e-mail, bank account validation, etc

        //REGEX EXPRESSION EXAMPLE FOR BANK CODE

        String bankIBAN1 = "LV30UNLA0987654321231";
        String bankIBAN2 = "LV300UNLA098765432123";

        //true
        if (bankIBAN1.matches("[A-Z]{2}[0-9]{2}[A-Z]{4}[0-9]{13}")) {
            System.out.println("Bank IBAN1 is correct");
        }

        //false
        if (bankIBAN2.matches("[A-Z]{2}[0-9]{2}[A-Z]{4}[0-9]{13}")) {
            System.out.println("Bank IBAN2 is correct");
        } else {
            System.out.println("Bank IBAN 2 is incorrect");
        }









    }
}
