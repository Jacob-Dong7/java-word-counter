import java.util.Scanner;

public class analyze {

    public void count() {
        String userText;
        int word = 0, characters = 0, sentence = 0;
        System.out.println("-----------------");
        System.out.println("Enter -1 to exit");
        System.out.println("-----------------");
        while (true) {
            System.out.println("Enter your text:");
            System.out.println("-----------------");
            System.out.println();
            Scanner scnr = new Scanner(System.in);

            userText = scnr.nextLine();

            if (userText.equals("-1")) {
                System.out.println("Exiting...");
                return;
            }

            characters = charCount(userText);
            word = wordCount(userText);
            sentence = sentenceCount(userText);

            System.out.println("-----------------");
            System.out.print("Character count: ");
            System.out.println(characters);
            System.out.println("-----------------");

            System.out.print("Word count: ");
            System.out.println(word);
            System.out.println("-----------------");

            System.out.print("Sentence count: ");
            System.out.println(sentence);
            System.out.println("-----------------");

        } 
    }

    public int charCount(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); ++i) {
            ++count;
        }
        return count;
    }

    public int wordCount(String input) {
        int count = 0;
        char curr;
        boolean check = false;

        if (input.isEmpty()) {
            return 0;
        }

        for (int i = 0; i < input.length(); ++i) {
            curr = input.charAt(i);

            if (Character.isWhitespace(curr)) {
                ++count;
                check = true;
            }

        }

        if (check == true) {
            ++ count;
        } else {
            count = 1;
        }

        return count;
    }

    public int sentenceCount(String input) {
        int count = 0;
        char curr;
        boolean check = false;

        for (int i = 0; i < input.length(); ++i) {
            curr = input.charAt(i);

            if (curr == '.') {
                check = true;
                ++count;
            }

            if (i == input.length() - 1 && curr != '.') {
                check = false;
            }
        }

        if (check == false) ++count;
        return count;
    }

}


//jowan. dong