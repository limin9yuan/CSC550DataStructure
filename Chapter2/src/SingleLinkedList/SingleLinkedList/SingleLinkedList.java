package SingleLinkedList;

/**
 * Created by Victor on 11/17/2015.
 */
public class SingleLinkedList<E>
{
    private static class Node<E>
    {
        private E data;
        private Node<E> next;

        public Node(E newData)
        {
            data = newData;
        }
        public Node(E newData, Node<E> nodeRef)
        {
            data = newData;
            next = nodeRef;
        }
    }
    private Node<E> head;
    private int size;

    public SingleLinkedList()
    {
        head = null;
        size = 0;
    }
    public SingleLinkedList(SingleLinkedList<E> other)
    {
        head = other.head;
        size = other.size;
    }
    public void addFirst(E obj)
    {
        head = new Node<E>(obj, head);
        size++;
    }
    private void addAfter(Node<E> node, E obj)
    {
        node.next = new Node<E>(obj, node.next);
        size++;
    }
    public void add(int index, E obj)
    {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        if (index > 0)
        {
            Node<E> node = getNode(index - 1);
            addAfter(node, obj);
        }
        else
            addFirst(obj);
    }
    public boolean add(E obj)
    {
        add(size, obj);
        return true;
    }
    private Node<E> getNode(int index)
    {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        Node<E> node = head;
        for (int i = 0; i < index && node != null; i++)
        {
            node = node.next;
        }
        return node;
    }
    private E removeFirst()
    {
        Node<E> temp = head;
        if (head != null)
        {
            head = head.next;
            size--;
        }
        if (temp != null)
            return temp.data;
        else
            return null;

    }
    private E removeAfter(Node<E> node)
    {
        Node<E> temp = node.next;
        if (temp != null)
        {
            node.next = temp.next;
            size--;
            return temp.data;
        }
        else
            return null;
    }
    public E remove(int index)
    {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        if (index > 0)
        {
            Node<E> node = getNode(index - 1);
            return removeAfter(node);
        }
        else
            return removeFirst();
    }
    public boolean remove(E obj)
    {
        Node<E> temp = head;
        if (temp == null)
            return false;
        else
        {
            for (int i = 0; i < size; i++)
            {
                if (temp.data.equals(obj))
                {
                    remove(i);
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
    }
    public String toString()
    {
        Node<E> temp = head;
        StringBuilder sb = new StringBuilder();
        while (temp != null)
        {
            sb.append(temp.data);
            if (temp.next != null)
                sb.append(" ");
            temp = temp.next;
        }
        return sb.toString();
    }
    public E get(int index)
    {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        Node<E> node = getNode(index);
        return node.data;
    }
    public E set(int index, E newObj)
    {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        Node<E> node = getNode(index);
        E returnValue = node.data;
        node.data = newObj;
        return returnValue;
    }
    public int size()
    {
        return size;
    }
    public boolean equals(Object other)
    {
        if (other == null)
            return false;
        if (getClass() != other.getClass())
            return false;
        else
        {
            SingleLinkedList<E> newList = (SingleLinkedList<E>) other;
            if (size != newList.size)
                return false;
            Node<E> temp = head;
            Node<E> newTemp = newList.head;
            for (int i = 0; i < size; i++)
            {
                if (!temp.data.equals(newTemp.data))
                    return false;
                temp = temp.next;
                newTemp = newTemp.next;
            }
            return true;
        }
    }
}
