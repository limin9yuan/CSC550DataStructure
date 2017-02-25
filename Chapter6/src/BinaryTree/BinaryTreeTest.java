package BinaryTree;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * Created by Mingyuan Li on 2015/12/2.
 * Package: BinaryTree
 * Project: Chapter6
 */
public class BinaryTreeTest
{
    public static void main(String[] args)
    {
        BinaryTree<String> bt;
        Scanner scan;
        try
        {
            scan = new Scanner(new FileInputStream("input.txt"));
            bt = BinaryTree.readBinaryTree(scan);
            System.out.println("Pre order string.");
            System.out.println(bt.preOrderToString());
            System.out.println("In order string.");
            System.out.println(bt.inOrderToString());
            System.out.println("Post order string.");
            System.out.println(bt.postOrderToString());
            BinaryTree<String> leftTree = bt.getLeftSubtree();
            System.out.println("Pre order string.");
            System.out.println(leftTree.preOrderString());
            BinaryTree<String> rightTree = bt.getRightSubtree();
            System.out.println("In order string.");
            System.out.println(rightTree.inOrderString());
            System.out.println("Post order string.");
            System.out.println(bt.postOrderString());
            System.out.println("Is leaf?");
            if (bt.isLeaf())
                System.out.println("True");
            else
                System.out.println("False");
            BinaryTree<String> leftTreeCopy = bt.getLeftSubtree();
            if (leftTreeCopy.equals(leftTree))
                System.out.println("Two tree are equal.");
            else
                System.out.println("Two tree are not equal.");
            if (leftTree.equals(rightTree))
                System.out.println("Two tree are equal.");
            else
                System.out.println("Two tree are not equal.");
            scan.close();
        }
        catch (Exception e)
        {
            System.out.println("File not found");
        }
    }
}
