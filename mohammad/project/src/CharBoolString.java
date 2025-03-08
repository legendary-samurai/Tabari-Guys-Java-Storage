public class CharBoolString {
        public static void main(String[] args) {

                // Char
                // Three char variable point to '!' character.
                char myChar = '!';
                char myUnicodeChar = '\u0021';
                char myDecimalChar = 33;

                System.out.printf("My Characters are: %s, %s, %s%n", myChar, myUnicodeChar, myDecimalChar);


                // Boolean
                // use prefix [is | has] when want to declarative a boolean variable for readability.
                boolean myTrueBoolean = true;
                boolean myFalseBoolean = false;
                boolean isOpen = true;
                boolean hasItems = false;

                String myString = String.format("My booleans are %b %b %b %b", myTrueBoolean, myFalseBoolean, isOpen, hasItems);
                System.out.println(myString);


                // String
                // When String plus something, that expression will change to String and does append to that string.
                // Strings are immutable. This means you can't change one of its character.
                // If you'll want to change a String, you should decelerate a StringBuilder. because StringBuilder is mutable and you can change it.

                int numberOfCow = 10;
                String cow = "Cow " + numberOfCow;
                System.out.println(cow);

                String str_name = "kelvin";
                // str_name[0] = ' ';

                // StringBuilder. it's mutable.

                StringBuilder builder_name = new StringBuilder(str_name);
                System.out.println(builder_name.toString());
                // [ OUTPUT ] -> kelvin

                // delete values of index from 2 to (4 - 1) = l,v are deleting
                builder_name.delete(2, 4);

                System.out.println(builder_name.toString());
                // [ OUTPUT ] -> kein

        }
}
