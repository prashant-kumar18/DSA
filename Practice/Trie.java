public class Trie {
    static Node root = new Node('/');

    public static void main(String[] args) {
        // insert("ababa");

        // System.out.println(countDistinctString("ccfdf"));

        // System.out.println(search("appp"));
        neg();
    }

    static void neg() {
        System.out.println(0 ^ 0);
    }

    static void insert(String word) {// apple

        Node temp = root;
        for (int i = 0; i < word.length(); i++) {
            int charindex = getNumValue(word.charAt(i));
            if (temp.children[charindex] == null) {
                Node node = new Node(word.charAt(i));
                temp.children[charindex] = node;
                temp = node;
            } else {
                temp = temp.children[charindex];
            }
        }
        temp.last = true;

    }

    static boolean search(String word) {
        Node temp = root;
        for (int i = 0; i < word.length(); i++) {
            int charindex = getNumValue(word.charAt(i));
            if (temp.children[charindex] == null) {
                return false;
            }
            temp = temp.children[charindex];

        }
        return temp.last;

    }

    static boolean startsWith(String prefix) {
        Node temp = root;
        for (int i = 0; i < prefix.length(); i++) {
            int charindex = getNumValue(prefix.charAt(i));
            if (temp.children[charindex] == null) {
                return false;
            }
            temp = temp.children[charindex];

        }
        return true;
    }

    static int getNumValue(char c) {
        return c - 'a';
    }

    static int countDistinctString(String word) {

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            Node temp = root;
            for (int j = i; j < word.length(); j++) {
                int charindex = getNumValue(word.charAt(j));
                if (temp.children[charindex] == null) {
                    Node node = new Node(word.charAt(j));
                    temp.children[charindex] = node;
                    temp = node;
                    count++;
                } else {
                    temp = temp.children[charindex];
                }

            }
            temp.last = true;
        }

        return count + 1;

    }

}

class Node {
    char character;
    boolean last;
    Node children[] = new Node[26];

    Node(char c) {
        this.character = c;
    }

}