public class Main {
    public static void main(String[] args) {
        String[] words = new String[]{"aba","aabb","abcd","bac","aabc"};
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length ; j++) {
                if (areSimilar(words[i], words[j])) counter++;
            }
        }
        System.out.println(counter);
    }
    private static boolean areSimilar(String a, String b){
        char[] aCh = a.toCharArray();
        char[] bCh = b.toCharArray();
        boolean exists = false;
        for (char ch : bCh) {
            for (char c : aCh) {
                if (ch == c) {
                    exists = true;
                    break;
                }
            }
            if (!exists) return false;
            exists = false;
        }
        for (char ch : aCh) {
            for (char c : bCh) {
                if (ch == c) {
                    exists = true;
                    break;
                }
            }
            if (!exists) return false;
            exists = false;
        }
        return true;
    }
}
