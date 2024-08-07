import java.util.Scanner;

public class BST_Print_In_Range{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //left subtree
            root.left = insert(root.left,val);
        }

        else{
            root.right = insert(root.right,val);
        }

        return root;
    }

    public static void printInRange(Node root,int X, int Y){
        if(root == null){
            return;
        }

        if(root.data >= X && root.data <= Y){
            printInRange(root.left,X,Y);
            System.out.print(root.data + " " );
            printInRange(root.right,X,Y);
        }

        else if(root.data >= Y){
            printInRange(root.left,X,Y);
        }

        else{
            printInRange(root.right,X,Y);
        }
    }



    public static void inorder(Node root){
        if(root == null){
            return;
        }
        
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void main(String args[]){
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        
        for(int i = 0; i < values.length; i++){
            root = insert(root,values[i]);
        }

        inorder(root);
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Lower Limit: ");
        int x = sc.nextInt();
        System.out.println("Enter The Upper Limit: ");
        int y = sc.nextInt();
        System.out.println("Nodes In Range " + x + " and " + y + ": ");
        printInRange(root,x,y);
    }     
}
