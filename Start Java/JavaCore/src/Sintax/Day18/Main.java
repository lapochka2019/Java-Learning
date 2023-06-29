package Day18;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(Ex1(numbers,0));
        System.out.println(Ex2(71277727 ));
        System.out.println("\n  TREE");
        Node root = new Node(20);
        int [] num = {14,23,11,16,22,27,5,15,18,24,150,8};
        for(int i=0;i<num.length;i++){
            Ex3(root,num[i]);
        }
        Print_Ex3(root);

    }
    public static int Ex1 (int[] arr, int i){
        if (i==arr.length) return 0;
        return arr[i]+Ex1(arr,i+1);
    }
    public static int Ex2 (int num){
        if (num==0)return 0;
        if (num%10==7) return 1+Ex2(num/10);
        else return 0+Ex2(num/10);
    }

    public static void Ex3 (Node root, int value) throws IllegalAccessException {
        if (root ==null) throw new IllegalAccessException("Root is null!");

        Node nextNode = root;
        Node current = null;
        while (nextNode!=null){
            current = nextNode;
            if (value<current.getValue()){
                nextNode=current.getLeft();
            }else{
                nextNode=current.getRight();
            }
        }

        if (value<current.getValue()){
            current.setLeft(new Node(value));
        }else{
            current.setRight(new Node(value));
        }
    }

    public static void Print_Ex3(Node node){
        if (node==null) return;

        Print_Ex3(node.getLeft());
        System.out.print(node.getValue() + " ");
        Print_Ex3(node.getRight());
    }

    static class Node{
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }
}
