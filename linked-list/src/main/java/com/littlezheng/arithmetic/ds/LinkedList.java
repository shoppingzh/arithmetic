package com.littlezheng.arithmetic.ds;

public class LinkedList<E> implements List<E> {

    private int size;
    private Node<E> first;
    private Node<E> last;

    public LinkedList() {
        super();
        this.size = 0;
    }

    @Override
    public boolean add(E e) {
        Node<E> l = last;
        Node<E> node = new Node<E>(e, l, null);
        last = node;
        if (l == null) {
            first = node;
        } else {
            l.next = node;
        }

        size++;
        return true;
    }

    @Override
    public boolean remove(E e) {
        int idx = indexOf(e);
        if (idx == -1) {
            return false;
        }
        return remove(idx);
    }

    @Override
    public boolean remove(int index) {
        checkRange(index);
        Node<E> node = node(index);
        if (node.prev == null) {
            first = node.next;
            first.prev = null;
        } else if (node.next == null) {
            last = node.prev;
            last.next = null;
        } else {
            Node<E> prev = node.prev;
            Node<E> next = node.next;
            prev.next = next;
            next.prev = prev;
        }
        node.prev = null;
        node.next = null;
        node.item = null;
        size--;
        return true;
    }

    protected LinkedList<E>.Node<E> node(int index) {
        Node<E> n;
        if (index < size / 2) { // 索引在链表的前半部分，从前向后遍历
            n = first;
            for (int i = 0; i < index; i++) {
                n = n.next;
            }
        } else {
            n = last;
            for (int i = size - index - 1; i > 0; i--) {
                n = n.prev;
            }
        }
        return n;
    }

    @Override
    public E get(int index) {
        if (index < 0) {
            index = size + index;
        }
        checkRange(index);
        Node<E> node = node(index);
        return node == null ? null : node.item;
    }

    @Override
    public int indexOf(E e) {
        Node<E> f = first;
        int idx = 0;
        while (f != null) {
            if ((e == null && f.item == null) || f.item.equals(e)) {
                return idx;
            }
            f = f.next;
            idx++;
        }

        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size > 0;
    }

    @Override
    public void forEach(Consumer<E> consumer) {
        Node<E> f = first;
        int idx = 0;
        while (f != null) {
            consumer.on(idx++, f.item);
            f = f.next;
        }
    }

    @Override
    public String toString() {
        if (size <= 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        Node<E> f = first;
        while (f != null) {
            E e = f.item;
            sb.append(e == this ? "(this collection)" : f.item).append(", ");
            f = f.next;
        }
        int len = sb.length();
        sb.delete(len - 2, len).append("]");
        return sb.toString();
    }

    private void checkRange(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index");
        }
    }

    @SuppressWarnings("hiding")
    private class Node<E> {
        E item;
        Node<E> prev;
        Node<E> next;

        public Node(E item, Node<E> prev, Node<E> next) {
            super();
            this.item = item;
            this.prev = prev;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node [item=" + item + ", prev=" + prev + ", next=" + next + "]";
        }

    }

}
