import java.util.*;

public class BinaryTreeQues {
    static boolean isBal = true;

    public static void main(String[] args) {
//        Node root = new Node(1);
//
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.right.left = new Node(4);
//        root.right.right = new Node(5);
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
//        System.out.println(mirrorOrNot(root, root));
//        buringTree(root, 3);
//        String s = "1+2";
//        diameter(root);
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.left.left.right = new Node(8);
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);
//isBalancedHeight(root);
//        System.out.println(isBal);

        System.out.println(twoTreeIdentical(root, root2));
    }

    static int isBalancedHeight(Node root) {
        if (root == null) return 0;

        int l = 1 + isBalancedHeight(root.left);
        int r = 1 + isBalancedHeight(root.right);

        if (l - r > 1) isBal = false;
        return Math.max(l, r);

    }

    public static Node populatenbr(Node root) {
        if (root == null || root.left == null) {
            return root;
        }
        root.left.nbr = root.right;
        if (root.nbr != null) {

            System.out.println("hell");
            root.right.nbr = root.nbr.left;
        }
        populatenbr(root.left);
        populatenbr(root.right);
        return root;

    }


    static void rootToNode() {
    }

    static void maxWidth() {
    }

    static boolean twoTreeIdentical(Node root1, Node root2) {

        if (root1 == null || root2 == null) {
            return root1 == root2;
        }
        if (root1.data != root2.data) return false;

        return twoTreeIdentical(root1.left, root2.left) && twoTreeIdentical(root1.right, root2.right);

    }

    static void zigZag(Node root) {
        Deque<Node> q = new LinkedList<>();
        q.add(root);
        boolean goingRight=true;
        while (q.size() != 0) {

            int size=q.size();
            for (int i = 0; i < size; i++) {

                if(goingRight)
                Node temp=q.ad;

                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);

            }
        }

    }

    static void boundaryTrav() {
    }

    static void maxPathSum() {
    }

    static void constructTreeFromInAndPre() {
    }

    static void constructTreeFromInAndPost() {
    }

    static void flattenBinaryTreeToLinkedList() {
    }

    static void childrenSumProperty() {
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

    static void buringTree(Node root, int target) {

        LinkedList<Node> l = new LinkedList<>();
        Node targetNode = buringTreeUtil(root, target);
        l.add(targetNode);
        int size = l.size();

        targetNode.v = true;
        int time = 0;
        while (size != 0) {

            size = l.size();
            for (int i = 0; i < size; i++) {

                Node temp = l.remove();

                if (temp.left != null && !temp.left.v) {
                    temp.left.v = true;
                    l.add(temp.left);
                }
                if (temp.right != null && !temp.right.v) {
                    temp.parent.v = true;
                    l.add(temp.right);
                }

                if (temp.parent != null && !temp.parent.v) {
                    temp.parent.v = true;
                    l.add(temp.parent);
                }

            }
            time++;
        }

        System.out.println(time);
    }

    static Node buringTreeUtil(Node tree, int target) {
        LinkedList<Node> l = new LinkedList<>();

        l.add(tree);
        int size = l.size();
        Node targetNode = null;
        while (size != 0) {

            size = l.size();
            for (int i = 0; i < size; i++) {

                Node temp = l.removeFirst();

                if (temp.left != null) {
                    temp.left.parent = temp;
                    l.add(temp.left);
                }
                if (temp.right != null) {
                    temp.right.parent = temp;
                    l.add(temp.right);
                }

                if (temp.data == target) {
                    targetNode = temp;

                }
            }


        }

        return targetNode;
    }

    static boolean mirrorOrNot(Node root1, Node root2) {
        if (root1 == null || root2 == null) {

            return root1 == root2;
        }
        if (root1.data != root2.data) {
            return false;
        }

        return (mirrorOrNot(root1.left, root2.right) && mirrorOrNot(root1.right, root2.left));

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

    static Map<Integer, LinkedList<Integer>> verticalOrderTrav(Node root, Map<Integer, LinkedList<Integer>> m, int level) {

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

    static Map<Integer, LinkedList<Integer>> levelOrderTrav(Node root, Map<Integer, LinkedList<Integer>> m, int level) {

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
        String s = "[1234]*";

        return Math.max(1 + height(root.left), 1 + height(root.right));

    }

    static void diameter(Node root) {
        System.out.println(diemeterUtil(root.left, 0) + diemeterUtil(root.right, 0));
    }

    static int diemeterUtil(Node root, int sum) {
        if (root == null) {
            return sum;
        }

        return Math.max(diemeterUtil(root.left, sum + 1), diemeterUtil(root.right, sum + 1));

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

class Node extends NodeExtention {
    Node left;
    Node right;
    int data;
    int level;

    Node nbr;

    Node(int data) {

        this.data = data;
        left = null;
        right = null;
        nbr = null;
        level = 0;

    }

    Node(int data, int level) {
        this.data = data;
        left = null;
        right = null;
        level = 0;
    }
}

class NodeExtention {

    Node parent;
    boolean v;

    NodeExtention() {
        v = false;
        parent = null;
    }
}