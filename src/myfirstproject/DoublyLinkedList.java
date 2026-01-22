package myfirstproject;

/**
 * Doubly Linked List لتخزين الموظفين
 */
public class DoublyLinkedList {

    // ================= Node =================
    private class Node {
        Employee data;
        Node next;
        Node prev;

        Node(Employee data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;

    // إضافة عنصر في النهاية
    public void add(Employee employee) {
        Node newNode = new Node(employee);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // عرض من البداية للنهاية
    public void displayForward() {
        Node current = head;
        while (current != null) {
            current.data.displayInfo();
            current = current.next;
        }
    }

    // عرض من النهاية للبداية
    public void displayBackward() {
        Node current = tail;
        while (current != null) {
            current.data.displayInfo();
            current = current.prev;
        }
    }
}
