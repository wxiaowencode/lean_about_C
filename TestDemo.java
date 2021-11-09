package 重新学习线性表;

public class TestDemo {
    public static void main(String[] args) {
//        MyArrayList myArrayList=new MyArrayList();
//        myArrayList.add(0,1);
//        myArrayList.add(1,2);
//        myArrayList.add(2,3);
       MyLinkedList myLinkedList=new MyLinkedList();
       //myLinkedList.creatList();
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);

       myLinkedList.display();
        System.out.println(myLinkedList.size());

    }



}
