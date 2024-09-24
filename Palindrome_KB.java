import java.util.Scanner;

public class Palindrome_KB {

    public static void PalindromeCheck(String word){
        //empty string
      String reverse = "";
      
      for(int i = word.length()-1; i >= 0; i--){

        reverse = reverse + word.charAt(i);

      }
       if(word.equals(reverse)){

        System.out.println("\nThe word is a palindrome.");

        System.out.println("original word: " + word);

        System.out.println("reversed word: " + reverse);

       }else{
        System.out.println("\nThe word is not a palindrome.");

        System.out.println("original word: " + word);

        System.out.println("reversed word: " + reverse);

       }
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word to check if it is a Palindrome: ");

        String response = scan.nextLine().toLowerCase();

        //call method

        PalindromeCheck(response);

        scan.close();

    }
}
