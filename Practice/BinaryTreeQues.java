import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.management.Query;
import javax.xml.crypto.Data;

public class BinaryTreeQues {
    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(4);
        root.right.right = new Node(4);
        // preorder(root);
        // System.out.println();
        // inorder(root);
        // System.out.println();
        // postorder(root);
        // for (Integer i : leftView(root, new HashMap<>(), 0).values()) {
        // System.out.println(i);
        // }
        // levelOrderTravAlt(root);
        // System.out.println(height(root) - 1);
        // System.out.println(lca(root, 2, 4).data);

        // for (Integer i : h
        // .keySet()) {
        // System.out.print(i + " ");
        // for (int j : h.get(i)) {
        // System.out.print(+j + " ");
        // }
        // System.out.println();
        // }
        // topView(root);
        // bottomView(root);
        System.out.println(mirrorOrNot(root, root));

    }

    static void topView(Node root) {

        LinkedList<Node> q = new LinkedList<>();
        Map<Integer, Integer> l = new TreeMap<>();
        q.add(root);
        int size = 1;
        while (size != 0) {
            size = q.size();
            for (int i = 0; i < size; i++) {
                Node temp = q.removeFirst();
                if (!l.containsKey(temp.level)) {

                    l.put(temp.level, temp.data);
                }
                if (temp.left != null) {
                    temp.left.level = temp.level + 1;

                    q.addLast(temp.left);
                }
                if (temp.right != null) {
                    temp.right.level = temp.level - 1;
                    q.addLast(temp.right);
                }
            }
        }

        l.entrySet().forEach(i -> System.out.println(i.getValue()));

    }

    static void inPrePOstSingleTrav(Node root) {
    }

    static void bottomView(Node root) {
        LinkedList<Node> q = new LinkedList<>();
        Map<Integer, Integer> l = new TreeMap<>();
        q.add(root);
        int size = 1;
        while (size != 0) {
            size = q.size();
            for (int i = 0; i < size; i++) {
                Node temp = q.removeFirst();

                l.put(temp.level, temp.data);

                if (temp.left != null) {
                    temp.left.level = temp.level + 1;

                    q.addLast(temp.left);
                }
                if (temp.right != null) {
                    temp.right.level = temp.level - 1;
                    q.addLast(temp.right);
                }
            }
        }

        l.entrySet().forEach((i -> System.out.println(i.getValue())));

    }

    static void rootToNode() {
    }

    static void maxWidth() {
    }

    static void twoTreeIdentical() {
    }

    static void zigZag() {
    }

    static void boundaryTrav() {
    }

    static void maxPathSum() {
    }

    static void constructTreeFromInAndPre() {
    }

    static void constructTreeFromInAndPost() {
    }

    static void symmetricBinaryTree() {
    }

    static void flattenBinaryTreeToLinkedList() {
    }

    static boolean mirrorOrNot(Node root1, Node root2) {
        if (root1 == null || root2 == null) {

            return root1 == root2;
        }
        if (root1.data != root2.data) {
            return false;
        }

        return (mirrorOrNot(root1.left, root2.right) &&
                mirrorOrNot(root1.right, root2.left));

    }

    static void childrenSumProperty() {
    }

    static void preorder(Node root) {

        if (root == null) {
            return;
        }
        System.out.print(root.data);
        preorder(root.left);

        preorder(root.right);
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }

    static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);

        postorder(root.right);
        System.out.print(root.data);
    }

    static Map<Integer, Integer> leftView(Node root, Map<Integer, Integer> m, int level) {

        if (root == null) {

            return m;
        }
        m.putIfAbsent(level, root.data);
        leftView(root.left, m, level + 1);
        leftView(root.right, m, level + 1);
        return m;

    }

    static Map<Integer, LinkedList<Integer>> verticalOrderTrav(Node root, Map<Integer, LinkedList<Integer>> m,
            int level) {

        if (root == null) {
            return m;

        }
        LinkedList<Integer> l = m.getOrDefault(level, new LinkedList<>());
        l.add(root.data);
        m.put(level, l);
        verticalOrderTrav(root.left, m, level - 1);
        verticalOrderTrav(root.right, m, level + 1);
        return m;
    }

    static Map<Integer, LinkedList<Integer>> levelOrderTrav(Node root, Map<Integer, LinkedList<Integer>> m,
            int level) {

        if (root == null) {
            return m;

        }
        LinkedList<Integer> l = m.getOrDefault(level, new LinkedList<>());
        l.add(root.data);
        m.put(level, l);
        levelOrderTrav(root.left, m, level + 1);
        levelOrderTrav(root.right, m, level + 1);
        return m;
    }

    static void levelOrderTravAlt(Node root) {

        LinkedList<Node> q = new LinkedList<>();

        q.add(root);

        while (q.size() != 0) {
            int size = q.size();

            for (int i = 0; i < size; i++) {

                Node temp = q.remove();
                System.out.print(temp.data);
                if (temp.left != null) {
                    q.add(temp.left);

                }
                if (temp.right != null) {
                    q.add(temp.right);

                }

            }
            System.out.println();
        }

    }

    static int height(Node root) {

        if (root == null) {
            return 0;
        }

        return Math.max(1 + height(root.left), 1 + height(root.right));

    }

    static void diameter(Node root) {

    }

    static void isBalancedHeight(Node root) {

    }

    static Node lca(Node root, int n1, int n2) {

        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node x = lca(root.left, n1, n2);
        Node y = lca(root.right, n1, n2);

        if (x != null && y != null) {
            return root;
        } else if (x != null) {
            return x;
        } else {
            return y;
        }

    }

}

class Node {
    Node left;
    Node right;
    int data;
    int level;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
        level = 0;
    }

    Node(int data, int level) {
        this.data = data;
        left = null;
        right = null;
        level = 0;
    }
}