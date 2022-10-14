public class Main {
    public static void main(String[] args) {
        String[] words = {"c", "ac", "pippo"};

        for (String word : words) {
            String result;

            if(word.length() < 2)   {
                result = "Stringa corta";
            }   else {
                String prima = word.substring(0, 1);
                String middle = word.substring(1, word.length() - 1);
                String fin = word.substring(word.length() - 1);

                result = fin + middle + prima;
            }

            System.out.println(result);
        }
    }
}