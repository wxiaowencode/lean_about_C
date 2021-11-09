package 重新学习线性表;




class Node{
    public Node prev;
    public Node next;
    public int val;



    public Node(){

    }
    public  Node(int val){
        this.val=val;
    }
        }
public class TwowayLinkedList {
    public Node head;
    public Node last;
    public static void main(String[] args) {
    }

    //尾插
   public void addLast(int data){
        Node node=new Node(data);
        if(this.head==null){
            this.head=node;
            this.last=node;
        }else{
            last.next=node;
            node.prev=last;
            last=node;
        }
   }
    public void display(){
        Node cur=this.head;
        while (cur!=null){
            System.out.print(cur+" ");
            cur=cur.next;
        }

    }
}

