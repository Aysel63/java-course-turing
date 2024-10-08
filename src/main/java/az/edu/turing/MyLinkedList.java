package az.edu.turing;
import java.util.Objects;
import java.util.Optional;

public class MyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }


    public T addHead(T item) {
        Node<T> newNode = new Node<>(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
        return item;
    }


    public T addTail(T item) {
        Node<T> newNode = new Node<>(item);
        if (size == 0) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        return item;
    }


    public Optional<T> removeHead() {
        if (size == 0) return Optional.empty();
        T removedData = head.data;
        head = head.next;
        size--;
        if (size == 0) tail = null;
        return Optional.of(removedData);
    }


    public Optional<T> removeTail() {
        if (size == 0) return Optional.empty();

        if (size == 1) {
            return removeHead();
        }

        Node<T> current = head;
        for (int i = 0; i < size - 2; i++) {
            current = current.next;
        }

        T removedData = tail.data;
        tail = current;
        tail.next = null;
        size--;
        return Optional.of(removedData);
    }


    public Optional<T> insert(final int index, final T item) {
        if (index < 0 || index > size) return Optional.empty();

        if (index == 0) {
            addHead(item);
        } else if (index == size) {
            addTail(item);
        } else {
            Node<T> newNode = new Node<>(item);
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
        return Optional.of(item);
    }


    public Optional<T> update(final int index, final T item) {
        if (index < 0 || index >= size) return Optional.empty();

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = item;
        return Optional.of(item);
    }


    public Optional<T> delete(final int index) {
        if (index < 0 || index >= size) return Optional.empty();

        if (index == 0) {
            return removeHead();
        } else if (index == size - 1) {
            return removeTail();
        }

        Node<T> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        T removedData = current.next.data;
        current.next = current.next.next;
        size--;
        return Optional.of(removedData);
    }


    public Optional<T> delete(final T item) {
        if (size == 0) return Optional.empty();

        if (head.data.equals(item)) {
            return removeHead();
        }

        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(item)) {
            current = current.next;
        }

        if (current.next == null) {
            return Optional.empty();
        }

        T removedData = current.next.data;
        current.next = current.next.next;
        if (current.next == null) tail = current;
        size--;
        return Optional.of(removedData);
    }


    public void deleteAll() {
        head = null;
        tail = null;
        size = 0;
    }


    public Object[] toArray() {
        T[] array = (T[]) new Object[size];
        Node<T> current = head;
        for (int i = 0; i < size; i++) {
            array[i] = current.data;
            current = current.next;
        }
        return array;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<T> current = head;
        while (current != null) {
            result.append(current.data);
            current = current.next;
            if (current != null) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MyLinkedList<?> that = (MyLinkedList<?>) object;
        if (size != that.size) return false;
        Node<T> thisCurrent = head;
        MyLinkedList.Node<?> thatCurrent = that.head;
        while (thisCurrent != null) {
            if (!Objects.equals(thisCurrent.data, thatCurrent.data)) {
                return false;
            }
            thisCurrent = thisCurrent.next;
            thatCurrent = thatCurrent.next;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, tail, size);
    }
}
