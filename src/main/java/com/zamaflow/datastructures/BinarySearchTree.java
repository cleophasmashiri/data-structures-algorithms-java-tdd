package com.zamaflow.datastructures;

public class BinarySearchTree {

    class Node  
    { 
        int key; 
        Node left, right; 
  
        public Node(int item) 
        { 
            key = item; 
            left = right = null; 
        } 
    }

     // Root of BST 
     Node root; 
  
     // Constructor 
     BinarySearchTree()  
     {  
          root = null;  
     } 
   
     // This method mainly calls insertRec() 
     void insert(int key)  
     {  
          root = insertRec(root, key);  
     } 
   
     /* A recursive function to  
        insert a new key in BST */
     Node insertRec(Node root, int key) 
     { 
   
         /* If the tree is empty, 
            return a new node */
         if (root == null)  
         { 
             root = new Node(key); 
             return root; 
         } 
   
         /* Otherwise, recur down the tree */
         if (key < root.key) 
             root.left = insertRec(root.left, key); 
         else if (key > root.key) 
             root.right = insertRec(root.right, key); 
   
         /* return the (unchanged) node pointer */
         return root; 
     } 

     // This method mainly calls InorderRec() 
    String inorder()  
    {  
         return inorderRec(root);  
    } 
  
    // A utility function to  
    // do inorder traversal of BST 
    String inorderRec(Node root) 
    { 
        if (root != null) { 
            StringBuilder b = new StringBuilder();
            b.append(inorderRec(root.left)); 
            b.append(root.key);
            b.append(inorderRec(root.right)); 
            return b.toString();
        } 
        return "";
    }

	public boolean isSubTree(BinarySearchTree t1) {
		return t1.inorder().contains(this.inorder());
	} 
   

}
