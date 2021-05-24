package B_1991;

import java.io.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(char data){this.data=data;}
}
class Tree{
    Node root;
    public void create(char data, char left, char right){
        if(root == null){
            root = new Node(data);
            if(left != '.'){
                root.left = new Node(left);
            }
            if(right != '.') {
                root.right = new Node(right);
            }
        }
        else{
            search(root,data,left,right);
        }
    }

    public void search(Node root,char data,char left,char right){
        if(root==null){
            return;
        }
        else if(root.data==data){
            if(left != '.'){
                root.left = new Node(left);
            }
            if(right != '.'){
                root.right = new Node(right);
            }
        }
        else{
            search(root.left,data,left,right);
            search(root.right,data,left,right);
        }
    }
    public void preOrder(Node root){
        System.out.print((char)root.data);
        if(root.left != null)preOrder(root.left);
        if(root.right!=null)preOrder(root.right);
    }
    public void inOrder(Node root){
        if(root.left!=null)inOrder(root.left);
        System.out.print((char)root.data);
        if(root.right!=null)inOrder(root.right);
    }
    public void postOrder(Node root){
        if(root.left!=null)postOrder(root.left);
        if(root.right!=null)postOrder(root.right);
        System.out.print((char)root.data);
    }
}

public class B_1991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Tree tree = new Tree();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            char[] data;
            data = br.readLine().replaceAll(" ","").toCharArray();
            tree.create(data[0],data[1],data[2]);
        }
        tree.preOrder(tree.root);
        System.out.println();
        tree.inOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);

    }
}
