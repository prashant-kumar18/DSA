// public class LinkedListQues {
//     public static void main(String[] args) {
//         Node head1 = new Node();
//         // Node head2 = new Node();
//         // for (int i = 1; i < 4; i++) {
//         // addToList(i, head1);

//         // }

//         // Node n = reverse(head1);
//         addToList(1, head1);
//         addToList(2, head1);
//         addToList(4, head1);
//         addToList(3, head1);
//         // addToList(3, head1);
//         // addToList(2, head1);
//         // addToList(1, head1);
//         // addToList(1, head2);
//         // addToList(2, head2);
//         // addToList(4, head2);
//         // addToList(8, head2);
//         // addToList(7, head2);
//         // mergeTwoSortedList(head1, head2);
//         // intersection(head1, head2);
//         print(head1);
//         Node n = rotate(head1, 2);
//         System.out.println();
//         print(n);
//         // mid(head);
//     }

//     static void addToList(int val, Node head) {
//         Node node = new Node();
//         if (head.next == null) {

//             head.next = node;
//             node.data = val;
//         } else {
//             Node temp = head;
//             while (temp.next != null) {
//                 temp = temp.next;

//             }
//             temp.next = node;
//             node.data = val;

//         }

//     }

//     static void print(Node head) {
//         Node temp = head;

//         while (temp != null) {
//             System.out.print(temp.data);
//             temp = temp.next;
//         }

//     }

//     static Node reverseRecursion(Node head) {

//         if (head.next == null) {

//             return head;
//         }

//         Node last = reverseRecursion(head.next);

//         head.next.next = head;
//         head.next = null;
//         return last;
//     }

//     static void mid(Node head) {
//         Node slow = head.next;
//         Node fast = head.next;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         System.out.println(slow.data);

//     }

//     static void mergeTwoSortedList(Node head1, Node head2) {
//         Node temp1 = head1.next;
//         Node temp2 = head2.next;

//         while (temp1 != null && temp2 != null) {

//             if (temp2.data < temp1.data) {

//                 while (temp2.next != null && temp2.next.data <= temp1.data) {
//                     temp2 = temp2.next;
//                 }
//                 Node storeAdd = temp2.next;
//                 temp2.next = temp1;
//                 temp2 = storeAdd;
//             } else {
//                 while (temp1.next != null && temp1.next.data <= temp2.data) {
//                     temp1 = temp1.next;
//                 }
//                 Node storeAdd = temp1.next;
//                 temp1.next = temp2;
//                 temp1 = storeAdd;
//             }

//         }
//         if (head1.next.data < head2.next.data) {
//             print(head1);
//         } else

//             print(head2);

//     }

//     static void intersection(Node head1, Node head2) {
//         Node temp1 = head1.next;
//         Node temp2 = head2.next;
//         int c1 = 0;
//         int c2 = 0;

//         while (temp1 != null) {
//             temp1 = temp1.next;
//             c1++;
//         }
//         while (temp2 != null) {
//             temp2 = temp2.next;
//             c2++;
//         }
//         System.out.println(c1 + " " + c2);
//         temp1 = head1.next;
//         temp2 = head2.next;
//         int i = 0;
//         if (c1 > c2) {
//             while (i != c1 - c2) {
//                 temp1 = temp1.next;
//                 i++;
//             }
//         } else {
//             while (i != c2 - c1) {
//                 temp2 = temp2.next;
//                 i++;
//             }
//         }

//         while (temp1 != null) {
//             if (temp1 == temp2) {
//                 System.out.println(temp1.data);
//             }
//             temp1 = temp1.next;
//             temp2 = temp2.next;
//         }
//     }

//     static void palin(Node head) {
//         Node temp = head.next;
//         Node slow = head.next;
//         Node fast = head.next;
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         System.out.println();
//         slow.next = reverse(slow);
//         slow = slow.next;

//         while (slow != null && temp != null) {

//             if (slow.data != temp.data) {
//                 System.out.println("not equal");
//                 break;
//             }
//             System.out.println(temp.data + " " + slow.data);
//             slow = slow.next;
//             temp = temp.next;

//         }

//     }

//     static Node reverse(Node head) {
//         Node current = head.next;
//         Node next = head;
//         Node pre = null;
//         while (current != null) {
//             next = current.next;
//             current.next = pre;
//             pre = current;
//             current = next;

//         }
//         return pre;
//     }

//     static Node rotate(Node head, int k) {
//         Node temp = head.next;
//         int n = 0;
//         while (temp.next != null) {
//             temp = temp.next;
//             n++;
//         }
//         k = k % n;
//         int count = 1;
//         Node temp2 = head.next;

//         while (count <= (n - k)) {
//             temp2 = temp2.next;
//             count++;
//         }
//         Node newhead = temp2.next;
//         temp2.next = null;
//         temp.next = head.next;
//         return newhead;
//     }
// }

// class Node {
//     int data;
//     Node next;

//     Node() {
//         next = null;
//     }
// }