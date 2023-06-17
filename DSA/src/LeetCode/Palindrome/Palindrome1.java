package LeetCode.Palindrome;

class SoluPalindrome1tion {
    public boolean isPalindrome (String s) {
        StringBuilder builder = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                builder.append(Character.toLowerCase(ch));
            }
        }

        String filteredString = builder.toString();
        String reversedString = builder.reverse().toString();

        return filteredString.equals(reversedString);
    }

    /**
     * An alternate solution using Java 8 Streams
     */
    public boolean isPalindromeUsingStreams (String s) {
        StringBuilder builder = new StringBuilder();

        s.chars()
                .filter(c -> Character.isLetterOrDigit(c))
                .mapToObj(c -> Character.toLowerCase((char) c))
                .forEach(builder::append);

        return builder.toString().equals(builder.reverse().toString());
    }


    public static void main (String[] args) {
        SoluPalindrome1tion  obj = new SoluPalindrome1tion();

       // boolean value1= obj.isPalindrome("MachineLearning");
        //System.out.println(value1);
        boolean value2= obj.isPalindrome("1Malayalam1");
        System.out.println(value2);



    }
}
