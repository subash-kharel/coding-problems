package main.java.binarySearchTrees;

public class ClosestValueInBST {

    static class BST {
        int value;
        BST left;
        BST right;

        public BST(int value){
            this.value = value;
        }
    }

    //Average: Time:O(log(n)) | O(log(n)) space
    //Worst: Time: O(n)  | O(n)
    public static int findClosestValueInBSTRecursion(BST tree, int target) {

        return findClosestValueInBSTRecursion(tree, target, tree.value);

    }

    public static int findClosestValueInBSTRecursion(BST tree, int target, int closestValue) {

        if(Math.abs(target - closestValue) > Math.abs(tree.value)){
            closestValue = tree.value;
        }
        if(target < tree.value && tree.left !=null){
            return findClosestValueInBSTRecursion(tree.left, target);
        } else if(target > tree.value && tree.right !=null) {
            return findClosestValueInBSTRecursion(tree.right, target);
        } else {
            return closestValue;
        }

    }

    //Average: Time:O(log(n)) | O(1) space
    //Worst: Time: O(n)  | O(1)
    public static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.
        BST currentNode = tree;
        int closestVal = currentNode.value;

        while(currentNode != null){

            if(Math.abs(target - currentNode.value) < Math.abs(target - closestVal)){
                closestVal = currentNode.value;
            }
            if (currentNode.value > target){
                currentNode = currentNode.left;
            } else if ( currentNode.value < target){
                currentNode = currentNode.right;
            } else {
                break;
            }
        }
        return closestVal;
    }


    public static void main(String[] args) {
        BST tree = new BST(10);
        tree.left = new BST(5);
        tree.left.left= new BST(2);
        tree.left.right = new BST(5);
        tree.left.left.left = new BST(1);
        tree.right = new BST(15);
        tree.right.left = new BST(13);
        tree.right.right = new BST(22);
        tree.right.left.right = new BST(14);

        System.out.println(findClosestValueInBst(tree, 12));

        System.out.println(findClosestValueInBSTRecursion(tree, 12));


    }
}
