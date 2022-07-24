package com.greatLearning.binarySearchTreePair.main;

import java.util.HashSet;
import java.util.Set;
import com.greatLearning.binarySearchTreePair.model.*;
import com.greatLearning.binarySearchTreePair.service.*;

class Main
{
    public static void main(String[] args)
    {
        int[] keys = { 40, 20, 50, 10, 30, 70, 60 };
 
        BinarySearchTree bst=new BinarySearchTree();
        Node root = null;
        
        for (int key: keys) 
            root = bst.insert(root, key);
 
        // find pair with the given sum
        int target = MyConsole.getIntegerValue("Enter the Sum:");
 
        // create an empty set
        Set<Integer> set = new HashSet<>();
 
        if (!bst.findPair(root, target, set)) 
            System.out.println("Pair does not exist");
    }
}