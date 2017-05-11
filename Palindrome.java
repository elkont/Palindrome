
public class Palindrome {

    public static void main(String[] args) {
    	
        String stringExample = "savvass";
        int count = stringExample.length();
        String[] splitExample = stringExample.split("");//Pass the given string to an array
        int j = count - 1; // j = Is being used as a pointer to the end of the string

        for (int i = 0; i <= count / 2; i++) {
            if (splitExample[i].equals(splitExample[j])) { //Compare the first and the last char

                //If all the checks, up to the half given string are true, print out the message
                if (i == (count - 1) / 2) {
                    System.out.print("Given word is a palindrome!");
                }
            } else {
                System.out.print("Given word is not a palindrome.");
                break;
            }
            j--; //Reduce the pointer as the end of the string
        }
    }
}