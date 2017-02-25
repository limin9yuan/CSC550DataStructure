package BinaryTree;

import java.io.Serializable;
import java.util.Scanner;

/**
 * Created by Mingyuan Li on 2015/12/2.
 * Package: BinaryTree
 * Project: Chapter6
 */
public class BinaryTree<E> implements Serializable
{
    protected static class Node<E>
    {
        protected Node<E> left;
        protected Node<E> right;
        protected E data;

        public Node(E newData)
        {
            data = newData;
            left = null;
            right = null;
        }
        public String toString()
        {
            return data.toString();
        }
    }
    protected Node<E> root;

    public BinaryTree()
    {
        root = null;
    }
    protected BinaryTree(Node<E> root)
    {
        this.root = root;
    }
    public BinaryTree(E data, BinaryTree<E> leftTree, BinaryTree<E> rightTree)
    {
        root = new Node<E>(data);
        if (leftTree != null)
            root.left = leftTree.root;
        else
            root.left = null;
        if (rightTree != null)
            root.right = rightTree.root;
        else
            root.right = null;
    }
    public BinaryTree<E> getLeftSubtree()
    {
        if (root != null && root.left != null)
            return new BinaryTree<E>(root.left);
        else
            return new BinaryTree<E>(null);
    }
    public BinaryTree<E> getRightSubtree()
    {
        if (root != null && root.right != null)
            return new BinaryTree<E>(root.right);
        else
            return new BinaryTree<E>(null);
    }
    public boolean isLeaf()
    {
        return root == null || (root.left == null && root.right == null);
    }
    public boolean equals(Object other)
    {
        if (other == null)
            return false;
        else if (getClass() != other.getClass())
            return false;
        else
        {
            BinaryTree<E> otherTree = (BinaryTree<E>) other;
            return equals(root, otherTree.root);
        }
    }
    private boolean equals(Node<E> rootA, Node<E> rootB)
    {
        if (rootA == rootB)
            return true;
        else if (rootA == null || rootB == null)
            return false;
        else if (!rootA.data.equals(rootB.data))
            return false;
        else
            return equals(rootA.left, rootB.left) && equals(rootA.right, rootB.right);
    }
    public String preOrderToString()
    {
        StringBuilder sb = new StringBuilder();
        preOrderTraverse(root, 1, sb);
        return sb.toString();
    }
    private void preOrderTraverse(Node<E> node, int depth, StringBuilder sb)
    {
        if (node == null)
        {
            for (int i = 1; i < depth; i++)
                sb.append(".");
            sb.append("null\n");
        }
        else
        {
            for (int i = 1; i < depth; i++)
                sb.append(".");
            sb.append(node.toString());
            sb.append("\n");
            preOrderTraverse(node.left, depth + 1, sb);
            preOrderTraverse(node.right, depth + 1, sb);
        }
    }
    public String inOrderToString()
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
    public String postOrderToString()
    {
        StringBuilder sb = new StringBuilder();
        postOrderTraverse(root, 1, sb);
        return sb.toString();
    }
    private void postOrderTraverse(Node<E> node, int depth, StringBuilder sb)
    {
        if (node == null)
        {
            for (int i = 1; i < depth; i++)
                sb.append(".");
            sb.append("null\n");
        }
        else
        {
            postOrderTraverse(node.left, depth + 1, sb);
            postOrderTraverse(node.right, depth + 1, sb);
            for (int i = 1; i < depth; i++)
                sb.append(".");
            sb.append(node.toString());
            sb.append("\n");
        }
    }
    public static BinaryTree<String> readBinaryTree(Scanner scan)
    {
        String data = scan.next();
        if (data.equals("null"))
            return null;
        else
        {
            BinaryTree<String> leftTree = readBinaryTree(scan);
            BinaryTree<String> rightTree = readBinaryTree(scan);
            return new BinaryTree<String>(data, leftTree, rightTree);
        }
    }
    public String preOrderString()
    {
        StringBuilder sb = new StringBuilder();
        preOrderTraverseString(root, sb);
        return sb.toString();
    }
    private void preOrderTraverseString(Node<E> node, StringBuilder sb)
    {
        sb.append(node.toString());
        if (node.left != null)
        {
            sb.append(" ");
            preOrderTraverseString(node.left, sb);
        }
        if (node.right != null)
        {
            sb.append(" ");
            preOrderTraverseString(node.right, sb);
        }
    }
    public String inOrderString()
    {
        StringBuilder sb = new StringBuilder();
        inOrderTraverseString(root, sb);
        return sb.toString();
    }
    private void inOrderTraverseString(Node<E> node, StringBuilder sb)
    {
        if (node.left != null)
        {
            inOrderTraverseString(node.left, sb);
            sb.append(" ");
        }
        sb.append(node.toString());
        if (node.right != null)
        {
            sb.append(" ");
            inOrderTraverseString(node.right, sb);
        }
    }
    public String postOrderString()
    {
        StringBuilder sb = new StringBuilder();
        postOrderTraverseString(root, sb);
        return sb.toString();
    }
    private void postOrderTraverseString(Node<E> node, StringBuilder sb)
    {
        if (node.left != null)
        {
            postOrderTraverseString(node.left, sb);
            sb.append(" ");
        }
        if (node.right != null)
        {
            postOrderTraverseString(node.right, sb);
            sb.append(" ");
        }
        sb.append(node.toString());
    }
}
