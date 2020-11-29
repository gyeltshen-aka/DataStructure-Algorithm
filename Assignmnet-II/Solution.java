import java.util.*;

public class Solution<Key extends Comparable<Key>, Value>  {
    private Node root;
    int size = 0;             // root of BST

    private class Node {
        private Key key;           // sorted by key
        private Value val;         // associated data
        private Node left, right;  // left and right subtrees

        public Node(Key key, Value val) {
            this.key = key;
            this.val = val;
        }
    }

    public boolean isEmpty() {
        if(size == 0){
        	return true;
        }
        return false;
    }

    public int size() {
      return size;
    }

    public boolean contains(Key key) {
    	Node curNode = root;
       if(key == null){
       		throw new IllegalArgumentException("There is not key conatin in the root");
       }
       else{
       		while(curNode.key != key){
       			int cmp = key.compareTo(curNode.key);
       			if(cmp < 0){
       				curNode = curNode.left;
       			}
       			else{
       				curNode = curNode.right;
       			}
       		}
       		return true;
       }
    }

    public Value get(Key key) {
    	if(key == null){
	        throw new IllegalArgumentException("argument to get value() is null");
	    }
        Node curNode = root;
        while(curNode.key != key){
        	int cmp = key.compareTo(curNode.key);
        	if(cmp < 0){
        		curNode = curNode.left;
        	}
	        else if(cmp > 0){
	        	curNode = curNode.right;
	        }
        }
        if(curNode.key == key){
        	System.out.println(curNode.val);
        }
        return curNode.val;
    }

    public void put(Key key, Value val) {
        Node newNode = new Node(key,val);
        if(root == null){
        	root = newNode;
        }
        else{
        	Node curNode = root;
        	Node parent;
        	while(true){
        		parent = curNode;
        		int cmp = key.compareTo(curNode.key);
        		if(cmp < 0){
        			curNode = curNode.left;
        			if(curNode == null){
        				parent.left = newNode;
        				size = size + 1;
        				return;
        			}
        			else if(curNode.key == key){
        				curNode.val = val;
        				return;
        			}
        		}
        		else if(cmp > 0){
        			curNode = curNode.right;
        			if(curNode == null){
        				parent.right = newNode;
        				size = size + 1;
        				return;
        			}
        			else if(curNode.key == key){
        				curNode.val = val;
        				return;
        			}
        		}
        	}
        }
        size = size + 1;
    }

    public Key min() {
       if(isEmpty()){
       	throw new NoSuchElementException("There is no element in the tree");
       }
       else{
       		Node curNode = root;
       		while(curNode.left != null){
       			curNode = curNode.left;
       		}
       		return curNode.key;
       }
    } 

    public Key max() { 
        if(isEmpty()){
       		throw new NoSuchElementException("There is no element in the tree");
       }
       else{
       		Node curNode = root;
       		while(curNode.right != null){
       			curNode = curNode.right;
       		}
       		return curNode.key;
       }
    } 

    public Key floor(Key key){
        if(isEmpty()){
            throw new NoSuchElementException("calls floor() with empty symbol table");
        }
        Node curNode = root;
        Node parent = null;
        while(curNode != null){
            parent = curNode;
            int cmp = key.compareTo(parent.key);
            if(key == null){
                throw new IllegalArgumentException("calls floor() with a null key");
            }
            if(cmp == 0){
                return parent.key;
            }
            if(cmp < 0){
                curNode = parent.left;
            }
            //This condition is for checking floor of given key in right side
            else if(cmp > 0){
                curNode = parent.right;
                //This condition returns previous parent as floor of given key as it is less the right parent
                int cm = key.compareTo(curNode.key);
                if(cm < 0 ){
                    return parent.key;
                }
                //This is for if the key is still greater then right parent
                else{
                    curNode = parent.right;
                } 
            }
        }
        return parent.key;
    }


    public void inOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {

			// Traverse the left node

			inOrderTraverseTree(focusNode.left);

			// Visit the currently focused on node

			System.out.println(focusNode);

			// Traverse the right node

			inOrderTraverseTree(focusNode.right);

		}

	}
  
    public static void main(String[] args) { 
        Solution <String, Integer> theTree = new Solution <String, Integer>();
        theTree.put("ABDUL",1);
        theTree.get("ABDUL");
        theTree.put("HRITHIK",2);
        theTree.put("SAI",3);
        theTree.put("SAMAL",6);
        theTree.get("SAI");
        theTree.put("TASHI",4);
        System.out.println("Size : " + theTree.size());
        System.out.println("Min key : " + theTree.min());
        // System.out.println("Floor key : " + theTree.floor("HRITHIK"));
        theTree.put("CHIMI",5);
        theTree.put("SAMAL",4);
        theTree.get("SAMAL");
        theTree.put("NIMA",7);
        System.out.println("Size : " + theTree.size());
         theTree.put("SONAM",8);
    }
}