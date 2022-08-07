package main.java.binarySearchTrees;

public class ConstructingBST {

  static class BST{
      int value;
      BST left;
      BST right;

      public BST(int value){
          this.value = value;
      }

      public BST insert(int value) {
          if(value < this.value) {
              if(left == null){
                  BST newBST = new BST(value);
                  left = newBST;
              } else {
                  left.insert(value);
              }
          } else {
              if(right == null){
                  BST newBST = new BST(value);
                  right = newBST;
              } else {
                  right.insert(value);
              }
          }
          return this;
      }

      public boolean contains(int value) {
          if (value < this.value) {
              if (left == null) {
                  return false;
              } else {
                  return left.contains(value);
              }
          } else if (value > this.value) {
              if (right == null) {
                  return false;
              } else {
                  return right.contains(value);
              }
          } else {
              return true;
          }
      }
  }



    public static void main(String[] args) {

    }
}
