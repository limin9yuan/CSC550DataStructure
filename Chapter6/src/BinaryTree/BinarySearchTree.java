package BinaryTree;

import SearchTreeInterface.SearchTree;

/**
 * Created by Mingyuan Li on 2015/12/3.
 * Package: BinaryTree
 * Project: Chapter6
 */
public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E> implements SearchTree<E>
{
    protected boolean addReturn;
    protected E deleteReturn;

    public E find(E obj)
    {
        return find(root, obj);
    }
    private E find(Node<E> localRoot, E obj)
    {
        if (localRoot == null)
            return null;
        int comResult = obj.compareTo(localRoot.data);
        if (comResult == 0)
            return localRoot.data;
        else if (comResult < 0)
            return find(localRoot.left, obj);
        else
            return find(localRoot.right, obj);
    }
    public boolean add(E obj)
    {
        root = add(root, obj);
        return addReturn;
    }
    private Node<E> add(Node<E> localRoot, E obj)
    {
        if (localRoot == null)
        {
            addReturn = true;
            return new Node<E>(obj);
        }
        int comResult = obj.compareTo(localRoot.data);
        if (comResult == 0)
        {
            addReturn = false;
            return localRoot;
        }
        else if (comResult < 0)
        {
            localRoot.left = add(localRoot.left, obj);
            return localRoot;
        }
        else
        {
            localRoot.right = add(localRoot.right, obj);
            return localRoot;
        }
    }
    public E delete(E obj)
    {
        root = delete(root, obj);
        return deleteReturn;
    }
    private Node<E> delete(Node<E> localRoot, E obj)
    {
        if (localRoot == null)
        {
            deleteReturn = null;
            return localRoot;
        }
        int comResult = obj.compareTo(localRoot.data);
        if (comResult < 0)
        {
            localRoot.left = delete(localRoot.left, obj);
            return localRoot;
        }
        else if (comResult > 0)
        {
            localRoot.right = delete(localRoot.right, obj);
            return localRoot;
        }
        else
        {
            deleteReturn = localRoot.data;
            if (localRoot.left == null)
                return localRoot.right;
            else if (localRoot.right == null)
                return localRoot.left;
            else
            {
                if (localRoot.left.right == null)
                {
                    localRoot.data = localRoot.left.data;
                    localRoot.left = localRoot.left.left;
                    return localRoot;
                }
                else
                {
                    localRoot.data = findLargestChild(localRoot.left);
                    return localRoot;
                }
            }
        }
    }
    private E findLargestChild(Node<E> localRoot)
    {
        if (localRoot.right.right == null)
        {
            E returnValue = localRoot.right.data;
            localRoot.right = localRoot.right.left;
            return returnValue;
        }
        else
            return findLargestChild(localRoot.right);
    }
    public boolean contain(E obj)
    {
        E value = find(obj);
        if (value == null)
            return false;
        else
            return true;
    }
    public boolean remove(E obj)
    {
        E value = delete(obj);
        if (value == null)
            return false;
        else
            return true;
    }
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        inOrderTraverse(root, 1, sb);
        return sb.toString();
    }
    private void inOrderTraverse(Node<E> node, int depth, StringBuilder sb)
    {
        if (node == null)
        {
            for (int i = 1; i < depth; i++)
                sb.append(".");
            sb.append("null\n");
        }
        else
        {
            inOrderTraverse(node.left, depth + 1, sb);
            for (int i = 1; i < depth; i++)
                sb.append(".");
            sb.append(node.toString());
            sb.append("\n");
            inOrderTraverse(node.right, depth + 1, sb);
        }
    }
    public E delete1(E obj)
    {
        root = delete1(root, obj);
        return deleteReturn;
    }
    private Node<E> delete1(Node<E> localRoot, E obj)
    {
        if (localRoot == null)
        {
            deleteReturn = null;
            return localRoot;
        }
        int comResult = obj.compareTo(localRoot.data);
        if (comResult < 0)
        {
            localRoot.left = delete1(localRoot.left, obj);
            return localRoot;
        }
        else if (comResult > 0)
        {
            localRoot.right = delete1(localRoot.right, obj);
            return localRoot;
        }
        else
        {
            deleteReturn = localRoot.data;
            if (localRoot.left == null)
                return localRoot.right;
            else if (localRoot.right == null)
                return localRoot.left;
            else
            {
                if (localRoot.right.left == null)
                {
                    localRoot.data = localRoot.right.data;
                    localRoot.right = localRoot.right.right;
                    return localRoot;
                }
                else
                {
                    localRoot.data = findSmallestChild(localRoot.right);
                    return localRoot;
                }
            }
        }
    }
    private E findSmallestChild(Node<E> localRoot)
    {
        if (localRoot.left.left == null)
        {
            E returnValue = localRoot.left.data;
            localRoot.left = localRoot.left.right;
            return returnValue;
        }
        else
            return findLargestChild(localRoot.left);
    }
}
