public class StringLoops
{
    // default constructor; no instance variables
    public StringLoops() { }

    /* Returns the number of times "character" appears in "searchString"
       This should be NON-case sensitive!

       Examples:
       - if character = "a" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "A" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "!" and searchString = "Hello! Nice day!",
         this method returns 2

        DO THIS WITH A FOR LOOP!
      */

    public int countCharacters(String character, String searchString) {
        int found =0;
        for (int count = 0; count < searchString.length(); count++){
            String chara = searchString.substring(count, count+1);
            if (chara.equals(character.toUpperCase())){
                found ++;
            }
            else if (chara.equals(character.toLowerCase())){
                found ++;
            }
        }
        return found;
    }

    /* Returns the original string reversed

     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
    public String reverseString(String origString) {
        String word = "";
        for (int count = 0; count < origString.length(); count++){
            String chara = origString.substring((origString.length()-1)-count,((origString.length()-1)-count)+1);
            word += chara;
        }
        return word;
    }
}
