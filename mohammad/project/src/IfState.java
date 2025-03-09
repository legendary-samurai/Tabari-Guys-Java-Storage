public class IfState {
        public static void main(String[] args) {

                boolean isAlive = false;

                // if isAlive is true
                if (isAlive == true) {
                        System.out.println("You are alive");
                }

                // if isAlive isn't true
                if (isAlive == false) {
                        System.out.println("You are not alive!");
                }

                // if isAlive is true
                if (isAlive) {
                        System.out.println("You are alive!");
                }

                // if isAlive isn't true.
                if (!isAlive) {
                        System.out.println("You are not alive!");
                }


                int score = 93;

                if (score >= 80 && score <= 100) {
                        System.out.println("Your score is good enough");
                }

                boolean isKeyPressed = true;
                boolean isKeyLongPressed = false;

                if (isKeyPressed || isKeyLongPressed) {
                        System.out.println("key pressed");
                }


                // Ternary operator
                // if player reached to 10 points, this flag change to true.
                boolean isReached = true;
                String text = "He reached to %s and isReached flag is: %b";

                String out = isReached ? String.format(text, "10", isReached)
                        : String.format(text, "less than 10", isReached);
                System.out.println(out);

        }
}