/*
* 1. What is the initial capacity of the following string builder?
* StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");
*  Answer: the initial capacity of sb is 16. 
*
* 2. Consider the following string:
* String hannah = "Did Hannah see bees? Hannah did.";
* a. What is the value displayed by the expression hannah.length()?
* Answer: 32.
*
* b. What is the value returned by the method call hannah.charAt(12)?
* Answer: e
*
* c. Write an expression that refers to the letter b in the string referred to by hannah.
* System.out.println("Answer 2.c.: The index of the letter \"b\" is: "+hannah.indexOf("b"));
*
* 3. How long is the string returned by the following expression? What is the string?
"Was it a car or a cat I saw?".substring(9, 12)
Answer: the string was 3 letters long and it was "car" so the new string obtained
with the substring method does not include the string positioned at the end index.

* 4.Show two ways to concatenate the following two strings together to get the string "Hi, mom.":
String hi = "Hi, ";
String mom = "mom.";
* 5. Write a program that computes your initials from your full name and displays them.
 */
package stringsAndNumbersAtWork;

/**
 *
 * @author Paiu Cosmin Aurelian
 */
public class StringsAndNumbersAtWork {
    public static void main(String args[]){
        String hannah = "Did Hannah see bees? Hannah did.";
        int nrCaractere = hannah.length();
        char charAtIndex = hannah.charAt(12);
        System.out.println("Answer 2.a. length: "+nrCaractere);
        System.out.println("Answer 2.b. Char at index 12 is: "+charAtIndex);
        System.out.println("Answer 2.c. The index of the letter \"b\" is: "+hannah.indexOf('b'));

        String sentence = "Was it a car or a cat I saw?";
        System.out.println("Answer 3. The substring is: "+sentence.substring(9, 12));

        String hi = "Hi, ";
        String mom = "mom.";
        System.out.println("Answer 4. Method one using \"+\": "+hi+mom);
        System.out.println("Answer 4. Method two using concat: "+ hi.concat(mom));
      
        String myName = "Paiu Cosmin Aurelian";
        
        for (int i = 0; i < myName.length(); i++){
        char letter = myName.charAt(i);
        System.out.println(letter);
        }
    }
}

