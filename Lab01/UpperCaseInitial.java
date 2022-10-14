public class UpperCaseInitial {
    public static void main(String[] args) {
        String[] words = {"", "a", "alice", "bob", "pippo", "pluto"};

        for (String word : words) {
            String s = "";

            if(!word.isEmpty()) {
                String initial = word.substring(0, 1);
                String rest = word.substring(1);
                s = initial.toUpperCase() + rest;
            }
            System.out.println(s);
        }
    }
}