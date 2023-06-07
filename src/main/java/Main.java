import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String passwort = userInput();
        isRange(passwort);
        isNumberInPass(passwort);
        isLowerCaseInPass(passwort);
        isUpperCaseInPass(passwort);
    }

    public static String userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Passwort eingeben:");
        String passwort = scanner.nextLine();
        System.out.println("Dein Passwort ist: " + passwort);
        return passwort;
    }

    public static boolean isRange (String passwort){
        int passLength = passwort.length();
        System.out.println("Die Länge deines Passworts ist: " + passLength);
        boolean result = (passLength >= 8) && (passLength <= 20);
        System.out.println("Die Länge des Passworts ist gültig: " + result);
        return result;
   }
   public static boolean isNumberInPass(String passwort){
       int count = 0;
       for(int i = 0; i < passwort.length(); i++) {
           if(Character.isDigit(passwort.charAt(i))) {
               count++;
           }
       }
       boolean result = count > 0;
       System.out.println("Das Passwort enthält " + ((result)? "":"keine ") + "Zahlen");
       return result;

    }
    public static boolean isLowerCaseInPass (String passwort) {
        int count = 0;
        for(int i = 0; i < passwort.length(); i++) {
            if(Character.isLowerCase(passwort.charAt(i))) {
                count++;
            }
        }
        boolean result = count > 0;
        System.out.println("Das Passwort enthält " + ((result)? "kleine":"keine kleinen") + " Buchstaben");
        return result;
    }

    public static boolean isUpperCaseInPass (String passwort) {
        int count = 0;
        for(int i = 0; i < passwort.length(); i++) {
            if(Character.isUpperCase(passwort.charAt(i))) {
                count++;
            }
        }
        boolean result=  count > 0;
        System.out.println("Das Passwort enthält " + ((result)? "":"keine ") + "Buchstaben");
        return result;
    }
    public static boolean isValidPass(String passwort) {
        int count = 0;
        String[] invalidPass = {"123456", "passwort"};

        for (String pass : invalidPass) {
            if (passwort.equals(pass)) {
                System.out.println("Das Passwort ist schlecht");
                count++;
            }
        }

        boolean result = count > 0;
        System.out.println("Das Passwort ist " + ((result)? "schlecht":"gut"));
        return result;
    }
}
