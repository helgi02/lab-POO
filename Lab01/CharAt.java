public class Main {
    public static void main(String[] args) {
        String[] words = {"pippo", "pluto", "alice", "bob"};

        for (String word : words) {
            char middleChar;
            //Selezionare il carattere centrale usando CharAt
            middleChar = word.charAt(word.length() / 2);
            System.out.println(middleChar);
        }

        String[] words2 = {"John", "Fitzgerald", "Kennedy"};
        String initials = "";
        //Selezionare le tre iniziali e concatenarle usando CharAt
        for (String word1 : words2) {
            char w = word1.charAt(0);
            initials += w;
        }
            System.out.println(initials);
    }
}