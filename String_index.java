package apna_college;

public class String_index {
    public static void main(String[] args) {
        String name = "harshal";
        System.out.println(name.charAt(4));  // Output: s

        // indexOf(String str)
        System.out.println(name.indexOf("s"));  // Output: 3

        // substring(int beginIndex, int endIndex)
        System.out.println(name.substring(0, 3));  // Output: har

        // length()
        System.out.println(name.length());  // Output: 7

        // toUpperCase()
        System.out.println(name.toUpperCase());  // Output: HARSHAL

        // toLowerCase()
        System.out.println(name.toLowerCase());  // Output: harshal

        // trim()
        String text = "  hello        ";
        System.out.println(text.trim());  // Output: hello

        // equals(String anotherString)
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));  // Output: false

        // equalsIgnoreCase(String anotherString)
        System.out.println(str1.equalsIgnoreCase(str2));  // Output: true

        // startsWith(String prefix)
        System.out.println(name.startsWith("har"));  // Output: true

        // endsWith(String suffix)
        System.out.println(name.endsWith("al"));  // Output: true

        // contains(CharSequence sequence)
        System.out.println(name.contains("sha"));  // Output: true

        // replace(char oldChar, char newChar)
        String sentence = "I like cats.";
        System.out.println(sentence.replace('c', 'd'));  // Output: I like dats.

        // replaceAll(String regex, String replacement)
        System.out.println(name.replaceAll("a", "e"));  // Output: hershel

        // split(String regex)
        String csv = "apple,banana,orange";
        String[] fruits = csv.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // isEmpty()
        System.out.println(name.isEmpty());  // Output: false

        // compareTo(String anotherString)
        String str3 = "apple";
        String str4 = "banana";
        System.out.println(str3.compareTo(str4));  // Output: -1

        // toCharArray()
        char[] chars = name.toCharArray();
        System.out.println(chars);  // Output: harshal

        // format(String format, Object... args)
        String formatted = String.format("My name is %s and I am %d years old.", "Alice", 25);
        System.out.println(formatted);
    }
}